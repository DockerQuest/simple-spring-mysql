CREATE USER 'springstudent'@'localhost' IDENTIFIED BY 'springstudent';
GRANT ALL PRIVILEGES ON my_database.* TO 'springstudent'@'localhost';
FLUSH PRIVILEGES;