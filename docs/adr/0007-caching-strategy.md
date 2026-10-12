# ADR-0007: Caching strategy for price lookups

- **Status:** Accepted (2026-10-11)
- **Related:** SPEC F-6, AC-7 · ARCHITECTURE §9 · ADR-0006

## Context

- **What's read:** a price calculation reads a product, the active list price for its SKU, and
  every active rule. These change rarely (only through admin writes) and are read on every
  calculation.
- **Requirements:** the brief requires Redis. SPEC F-6 requires that a committed change shows up
  in the next calculation, and that pricing keeps working if Redis is down.
- **Spring Data Redis 4.1.1 facts**
  (https://docs.spring.io/spring-data/redis/reference/redis/redis-cache.html, checked
  2026-10-11):
  - `RedisCacheManager` is **not** transaction-aware by default. `.transactionAware()` turns it on.
  - Clearing a cache uses `KEYS` by default; `BatchStrategies.scan(n)` switches it to `SCAN`.
  - The default value serializer is `JdkSerializationRedisSerializer`.
  - TTL is off by default and is set with `entryTtl`.

## Options considered

1. **Cache whole calculation results**, keyed by segment and lines.
   - Con: low hit rate, and it's hard to know which entries a change invalidates.
2. **Cache the inputs** (product, list price, active rules) cache-aside, with eviction on every
   change and a TTL as a safety net.
   - Pro: high hit rate and exact invalidation.
   - Con: every write path must evict.
3. **An in-process cache (Caffeine) instead of Redis.**
   - Pro: no network hop.
   - Con: no Redis learning, and it doesn't work across instances.
4. **Write-through or refresh-ahead.**
   - Con: more moving parts than this volume needs.

## Decision

Option 2, through Spring's cache abstraction backed by Redis.

**Caches**
- `products`, keyed by SKU.
- `listPrices`, keyed by SKU, for the active list only.
- `activeRules`, a single key.

**Eviction**
- A product update evicts that SKU from `products`.
- Activating a price list clears `listPrices`.
- Any rule change evicts `activeRules`.

**Configuration**
- 10-minute TTL on every entry, and the key prefix `priceforge:pricing:`.
- The cache manager is **transaction-aware**, so evictions run after the commit.
- The cache writer uses `BatchStrategies.scan(1000)` for clears.
- Values are stored as JSON. The serializer class is checked against the docs at task time.

**When Redis fails:** a custom `CacheErrorHandler` logs the error and treats it as a miss, and the
Redis command timeout is short. A dead Redis makes pricing slower, not broken.

## Consequences

- **Every write path needs an eviction,** and each one has an integration test (AC-7).
- **Evicting before the commit is a bug.** A concurrent reader would refill the cache with the old
  value. The transaction-aware cache manager prevents this.
- **One race remains.** A reader that loaded old data just before the commit can write it back
  after the eviction. The TTL bounds how long that lasts. AC-7 tests sequential read-after-write,
  which is the guarantee SPEC F-6 makes.
- **`KEYS` blocks Redis while it scans every key.** It's fine on a laptop but dangerous on a busy
  server, so we use `SCAN` from day one.
- **Revisit** if calculations ever need per-customer prices (a different key space).
