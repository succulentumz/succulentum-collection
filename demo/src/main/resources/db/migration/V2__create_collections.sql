CREATE TABLE IF NOT EXISTS collections (
    id serial PRIMARY KEY,
    name varchar(255) NOT NULL,
    description varchar(255),
    is_shared boolean NOT NULL DEFAULT false,
    created_at timestamp with time zone NOT NULL
);
