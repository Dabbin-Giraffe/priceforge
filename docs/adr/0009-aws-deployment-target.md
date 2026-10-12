# ADR-0009: AWS deployment target and cost guardrails

- **Status:** Accepted (2026-10-11)
- **Related:** SPEC F-15, C-4, C-9, AC-10 · ARCHITECTURE §12.2, §14, §15

## Context

- **Budget (C-4):** at most $10/month while deployed, with a deploy, demo, tear-down cycle. No AWS
  account exists yet; it opens shortly before M11.
- **The stack** is five containers with about 2 GB of memory limits (ARCHITECTURE §12.2). CI
  builds x86-64 images.
- **Facts checked on 2026-10-11** (aws.amazon.com and docs.aws.amazon.com):
  - **New accounts:**
    - $100 in credits regardless of plan, and up to $100 more for completing activities.
    - The **Free plan** ends after 6 months or when the credits run out. After that the account is
      suspended, and erased after 90 days unless upgraded.
    - Free plan accounts can't use "a subset of AWS services". The FAQ doesn't list which.
  - **Lightsail:**
    - The Linux 4 GB bundle (2 vCPU, 80 GB SSD, 4 TB transfer) costs **$24/month**. It's billed
      hourly and prorated when the instance is deleted. A stopped instance is still billed.
    - Static IPs are free while attached, and **$0.005/hour if left unattached** for over an hour.
    - Snapshots cost $0.05 per GB-month.
    - The 2 GB bundle costs $12/month.
  - **EC2 in us-east-1:** `t3.medium` (4 GiB) costs $0.0416/hour on demand. A public IPv4 address
    adds $0.005/hour, and EBS storage is extra.
  - **AWS Budgets:** monitoring and alert notifications are free.
  - **GHCR:** "GitHub Packages usage is free for public packages."

## Options considered

1. **Lightsail 4 GB running the Compose stack.**
   - Pro: about $0.033/hour, everything included, and the fewest AWS concepts.
   - Con: a single box with no HA, which is a non-goal anyway.
2. **EC2 `t3.medium` running Compose.**
   - Pro: the "real" EC2 skills (VPC, security groups, EBS, IAM).
   - Con: about 40% more per hour plus EBS, and more to learn in the last week.
3. **Lightsail 2 GB.**
   - Con: too little RAM for 2 GB of container limits plus the OS, so out-of-memory kills during a
     demo are likely.
4. **Managed services** (ECS Fargate, RDS, ElastiCache, MSK).
   - Con: several separate always-on hourly charges, far past $10, and weeks of extra work.

## Decision

Option 1, in `us-east-1`.

**Deploying**
- `deploy/aws/` holds AWS CLI scripts and a cloud-init user-data script.
- The scripts create the instance, install Docker Engine and the Compose plugin, copy `.env` over
  SSH, and start the stack with images pulled from GHCR (public packages).

**Guardrails**
- **No static IP.** The instance's public IP changes on restart, which is fine for demos.
- **No snapshots.**
- **Firewall:** ports 22, 8081 and 8082 are open only to the owner's IP by default.
- **LLM off** (`SPRING_AI_MODEL_CHAT=none`) unless a capped demo turns it on.
- **Budget alerts,** created *before* the first resource. Set them as if the credits didn't exist:
  - a $10 monthly cost budget;
  - email alerts at $3, $6 and $9 actual spend;
  - a forecast alert at 100%.

**Tearing down**
- `teardown.sh` deletes the instance.
- `verify-teardown.sh` lists Lightsail instances, static IPs, disks and snapshots, and expects all
  of them to be empty.
- Check the bill again the next day.

## Consequences

- **Estimated cost:**
  - A 3-day demo window is about 72 h × $0.033, roughly $2.40.
  - Leaving it on for a whole month costs $24, which breaks the budget; the alerts are what catch
    that.
  - The new-account credits will most likely cover everything.
- **Same Compose file as local,** so cloud bugs reproduce on the laptop.
- **Free-plan eligibility for Lightsail isn't documented.** If the Free plan blocks it, upgrade to
  the Paid plan; the $100 credits still apply.
- **Confirm the CPU architecture** in the AWS learn spike with `uname -m`. We expect `x86_64`, to
  match our images. If it's `arm64`, build multi-architecture images.
- **Traps that cost money after a "teardown":**
  - an unattached static IP;
  - a stopped (not deleted) instance;
  - leftover snapshots.
  The verify script checks all three.
- **Revisit** if the demo must stay online for recruiters for weeks. That would need a different
  budget conversation.
