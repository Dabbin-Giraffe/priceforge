# ADR-0008: LLM explanations: provider-neutral, deadline, fallback

- **Status:** Accepted (2026-10-11)
- **Related:** SPEC F-10, §4.4, C-5, C-9, AC-8 · ARCHITECTURE §10, §11

## Context

- **Requirements:**
  - SPEC §4.4: an explanation uses only the stored snapshot. It returns `source: LLM` or
    `FALLBACK`, and it never sends the customer name to the LLM.
  - C-5: with $0 LLM spend the system must still fully work.
  - C-9: the public demo has no auth, so LLM cost must be capped there.
- **Deferred decision.** On 2026-10-11 Shashank decided to **choose the provider just before
  M9**. This ADR fixes everything that doesn't depend on the provider.
- **Facts checked on 2026-10-11:**
  - `spring.ai.model.chat=none` disables chat-model auto-configuration (Spring AI upgrade notes
    and provider reference pages).
  - **Anthropic in Spring AI 2.0.1** (https://docs.spring.io/spring-ai/reference/api/chat/anthropic-chat.html):
    - Starter `spring-ai-starter-model-anthropic`, built on the official Anthropic Java SDK.
    - `spring.ai.anthropic.timeout` defaults to 60 s and `spring.ai.anthropic.max-retries` to 2.
    - Timeouts are retried, so one call can block for up to 60 s × 3.
    - `spring.ai.anthropic.chat.model` defaults to `claude-haiku-4-5`.
  - **Google Gemini in Spring AI 2.0.1:** starter `spring-ai-starter-model-google-genai`. It takes
    a plain Gemini Developer API key through `spring.ai.google.genai.api-key`, and the docs list
    no timeout or retry properties.

## Options considered

1. **Call the LLM directly and let errors propagate.**
   - Con: violates C-5 and SPEC §4.4.
2. **Provider timeouts and retries only.**
   - Con: every provider names and defaults these differently, and some don't document them at
     all.
3. **Fallback-first, with a provider-neutral `ChatClient` and our own hard deadline.**
4. **No LLM, only template explanations.**
   - Con: drops a feature the brief requires.

## Decision

Option 3.

**How an explanation is built**
- quote-service's explanation service first builds the **deterministic fallback** text from the
  snapshot.
- If a Spring AI `ChatClient` bean exists, it calls the model with:
  - a fixed system prompt: use only the numbers provided, plain English, short;
  - the snapshot as JSON, with the customer name removed.
- **Our own deadline** (`priceforge.explanation.timeout`, 10 s) wraps the call. Provider-level
  retries are set to 0, because retries multiply the wait.
- **Any** exception, timeout or blank answer falls back. The response always carries `source`.
- **With no provider**, `spring.ai.model.chat=none`. That's the default locally, in CI and in the
  cloud.

**Tests:** `ChatModel` is mocked and never calls a real provider. CI has no API keys.

**The provider choice** happens in a new ADR before M9. It must name a hard spend cap. Candidates
verified on 2026-10-11:

| Candidate | Price | Cap mechanism |
| --- | --- | --- |
| Gemini `gemini-2.5-flash-lite`, free tier | $0 | Free-tier rate limits. Prompts may be used to improve Google's products, which is fine for fictional data. (https://ai.google.dev/gemini-api/docs/pricing) |
| Claude Haiku 5.5 (`claude-haiku-5-5`) | $0.10 in / $0.50 out per MTok, about $0.0002 per explanation | A spend limit you set on the Claude Console Billing page (https://platform.claude.com/docs/en/api/rate-limits) |
| Claude Opus 5.5 (`claude-opus-5-5`) | $4 in / $20 out per MTok, about 1–2 cents per explanation | Same |

- **Ruled out for v1:**
  - Ollama on the laptop: there isn't enough RAM or disk.
  - AWS Bedrock: the AWS account only opens shortly before M11.

## Consequences

- **The feature works at $0,** and switching providers means changing one dependency and a few
  properties.
- **Two code paths to test.** AC-8 covers both.
- **Gotchas to carry into the M9 tasks:**
  - When a Claude Console spend limit is hit, requests fail with **HTTP 400
    `invalid_request_error`, not 429**. That's why the fallback must catch *every* exception.
  - Newer Claude models reject sampling parameters: `temperature` returns a 400 on Opus 5.5, and
    non-default values return a 400 on Haiku 5.5. Don't copy `temperature` from older examples.
  - Spring AI's Anthropic default model property is `claude-haiku-4-5`, so set the model
    explicitly.
- **Revisit** at M9, by writing the provider ADR.
