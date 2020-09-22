# Spring Data JPA

This example shows how to use Spring Boot to connect to multiple databases using Spring Profiles. This demonstrates no code change is required to switch between different database engines when leveraging Spring Data JPA. This example supports `MySQL` and 
`H2` databases. To use the H2 DB, you need to ensure that the active profile is set to `h2db` in the `application.properties` file. To connect to MySQL, you need to set the active profile to `mysqldb` and run the below Docker commands to setup a local instance of MySQL:

- `docker-compose up -d`
- `docker exec -it mySqlDB mysql -uroot -p` (enter root's password)
- `create database spring_demo_db;` (to create a DB required by the app)

Simple Postman requests are provided in the `Postman` folder for testing the APIs and DB connectivity.
