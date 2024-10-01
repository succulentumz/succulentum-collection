CREATE TABLE IF NOT EXISTS user_collections (
    id serial PRIMARY KEY,
    user_id int NOT NULL,
    collection_id int NOT NULL,
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_collection_id FOREIGN KEY (collection_id) REFERENCES collections(id),
    UNIQUE (user_id, collection_id)
);
