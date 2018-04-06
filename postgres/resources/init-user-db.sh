#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE USER admin_shop WITH PASSWORD 'admin_shop';
    CREATE USER app_shop WITH PASSWORD 'app_shop';
    CREATE DATABASE shop;
    GRANT ALL PRIVILEGES ON DATABASE shop TO admin_shop;
EOSQL

psql -v ON_ERROR_STOP=1 -U postgres  <<-EOSQL
        \connect shop;
        CREATE SCHEMA sh_app;
        GRANT ALL PRIVILEGES ON SCHEMA sh_app TO app_shop;
EOSQL
