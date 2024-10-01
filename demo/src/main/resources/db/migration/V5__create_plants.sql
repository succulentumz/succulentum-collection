CREATE TABLE IF NOT EXISTS plants (
    id serial PRIMARY KEY,
    folder_id int NOT NULL,
    name varchar(255) NOT NULL,
    description varchar(255) NOT NULL,
    location varchar(255) NOT NULL,
    added_at timestamp with time zone NOT NULL,
    removed_at timestamp with time zone,
    is_dead boolean NOT NULL DEFAULT false,
    death_location varchar(255),
    death_cause varchar(255),
    death_time timestamp with time zone,
    CONSTRAINT fk_folder_id FOREIGN KEY (folder_id) REFERENCES folders(id)
);
