CREATE SEQUENCE hibernate_sequence START 1;

CREATE TABLE author
(
    id BIGINT,
    name VARCHAR(50)
);

CREATE TABLE blogPost
(
    id BIGINT,
    title VARCHAR(50),
    content VARCHAR(50),
    created VARCHAR(50),
    highlighted BOOLEAN,
    author_id BIGINT
);