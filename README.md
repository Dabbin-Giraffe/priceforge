# PriceForge

PriceForge is a B2B pricing backend that works out the exact price for each quote line from the customer's segment, the product category and the quantity tier, even when several pricing rules apply at once. Each price is calculated the same way every time, down to the cent. It comes with a full breakdown of which rules won and which lost, a plain-English explanation the rep can share with the customer, and a warning if pricing has changed since the quote was made.

### Status : WIP - V1 target 2026-11-22

- [Spec File](docs/SPEC.md)
- [Architecture](docs/ARCHITECTURE.md)
- [Architecture Decision Records](docs/adr/README.md)


## How to Run

1. Copy .env.example contents and paste into local .env file.
2. Add your secrets to corresponding variables in the .env file
3. Run the command in terminal `docker compose down -v && docker compose up -d`

---
## Design Decisions

---
## Demo

