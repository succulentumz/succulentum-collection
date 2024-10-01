CREATE TABLE IF NOT EXISTS plant_tags (
    id serial PRIMARY KEY,
    plant_id int NOT NULL,
    tag_id int NOT NULL,
    CONSTRAINT fk_plant_id FOREIGN KEY (plant_id) REFERENCES plants(id),
    CONSTRAINT fk_tag_id FOREIGN KEY (tag_id) REFERENCES tags(id),
    UNIQUE (plant_id, tag_id)
);
