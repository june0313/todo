CREATE DATABASE todo;
CREATE USER 'todouser'@'localhost' IDENTIFIED BY 'todopass';
GRANT ALL PRIVILEGES ON todo.* To 'todouser'@'localhost';