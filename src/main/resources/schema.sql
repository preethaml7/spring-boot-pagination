CREATE TABLE todo
(
    id          INTEGER PRIMARY KEY AUTO_INCREMENT,
    title       VARCHAR(255),
    description VARCHAR(500),
    created_at  TIMESTAMP,
    is_done     BOOLEAN
);