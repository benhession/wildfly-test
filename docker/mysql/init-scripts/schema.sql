CREATE DATABASE IF NOT EXISTS wildfly_test;
CREATE USER IF NOT EXISTS 'testuser'@'%' IDENTIFIED BY 'password';
GRANT CREATE, ALTER, DROP, INSERT, UPDATE, DELETE, SELECT, REFERENCES on wildfly_test.* TO 'testuser'@'%';
FLUSH PRIVILEGES;