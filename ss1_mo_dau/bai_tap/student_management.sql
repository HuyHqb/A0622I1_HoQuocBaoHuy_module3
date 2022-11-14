create database student_management;
create table student(
id int not null,
`name` varchar(50),
age int null,
country varchar(50),
primary key(id)
);

create table class(
class_id int,
class_name varchar(50)
);

create table teacher(
id int,
`name` varchar(50),
age int,
country varchar(50)
);
