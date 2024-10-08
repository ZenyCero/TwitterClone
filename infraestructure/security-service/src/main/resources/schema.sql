CREATE TABLE IF NOT EXISTS "users" (
    id SERIAL PRIMARY KEY,
    username VARCHAR(10) NOT NULL UNIQUE,
    email VARCHAR(25) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    roles VARCHAR(25) NOT NULL,
    enabled BOOLEAN NOT NULL DEFAULT TRUE
);

SELECT * FROM users;