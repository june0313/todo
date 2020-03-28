DROP TABLE IF EXISTS task;

CREATE TABLE task
(
    id         BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    title      VARCHAR(256)          NOT NULL,
    createdAt  DATETIME              NOT NULL,
    modifiedAt DATETIME              NOT NULL,
    projectId  BIGINT                NOT NULL,
    FOREIGN KEY (projectId) REFERENCES project(id)
)