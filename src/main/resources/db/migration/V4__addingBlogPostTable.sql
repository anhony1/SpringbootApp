CREATE TABLE blogPost(
    id SERIAL NOT NULL,
    title VARCHAR,
    postAuthor VARCHAR,
    dateCreated DATE NOT NULL DEFAULT CURRENT_DATE,
    textBody VARCHAR
)