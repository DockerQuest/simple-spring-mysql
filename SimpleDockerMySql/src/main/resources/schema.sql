CREATE DATABASE IF NOT EXISTS `employee_directory`;
USE `employee_directory`;
-- DROP TABLE IF EXISTS `person`;

-- CREATE TABLE person(
--     id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
--     first_name VARCHAR(255) NOT NULL,
--     last_name VARCHAR(255) NOT NULL,
--     gender VARCHAR(255) NOT NULL,
--     hobby VARCHAR(255) NOT NULL,
--     age INT
-- )
CREATE TABLE IF NOT EXISTS person(
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    gender VARCHAR(255) NOT NULL,
    hobby VARCHAR(255) NOT NULL,
    age INT
)