FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=root_password
ENV MYSQL_DATABASE=employee_directory

COPY ./setup.sql /docker-entrypoint-initdb.d/