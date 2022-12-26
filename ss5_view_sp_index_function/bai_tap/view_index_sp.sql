create database demo;

create table products(
id int auto_increment primary key ,
product_code varchar(20),
product_name varchar(20),
productPrice float ,
productAmount int,
productDescription varchar(20),
productStatus varchar(20)
)