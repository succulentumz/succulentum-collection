CREATE TABLE IF NOT EXISTS users (
    id serial PRIMARY KEY,
    username varchar(255) NOT NULL,
    password_hash varchar(255) NOT NULL,
    email varchar(255) UNIQUE NOT NULL
);