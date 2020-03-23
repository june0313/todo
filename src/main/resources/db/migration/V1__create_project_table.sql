create table `project`
(
    id BIGINT auto_increment primary key,
    title VARCHAR(256) not null,
    createdAt DATETIME not null,
    modifiedAt DATETIME not null
);