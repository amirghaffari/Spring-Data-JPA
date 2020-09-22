--create database spring_demo_db;

CREATE TABLE PERSON (
	id INT NOT NULL AUTO_INCREMENT,
	first_name varchar(100) not null,
	last_name varchar(100) not null,
	PRIMARY KEY (id)
);

insert into PERSON (first_name, last_name)
values ('Amir', 'Ghaffari');
