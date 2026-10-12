#!/usr/bin/env bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
	CREATE ROLE pricing LOGIN PASSWORD '$PRICING_DB_PASSWORD';
    CREATE DATABASE pricing OWNER pricing;
EOSQL

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
	CREATE ROLE quote LOGIN PASSWORD '$QUOTE_DB_PASSWORD';
    CREATE DATABASE quote OWNER quote;
EOSQL
