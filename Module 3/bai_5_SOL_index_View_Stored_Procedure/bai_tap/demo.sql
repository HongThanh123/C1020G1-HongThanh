create database demo;
use demo;
create table products (
	id int,
    product_code varchar(50),
    product_name varchar(50),
    product_price decimal(9,2),
    product_amount int,
    product_description varchar(100),
    product_status varchar(100)
);

insert into products values
(1,'abcd','Thanh',1000,2,'Ao','Moi'),
(2,'safas','Phong',21000,1,'Dien Thoai','Cu'),
(3,'asfds','Hoa',45000,1,'Xe','Moi'),
(4,'asfdf','Tho',500,2,'Son','Moi'),
(5,'gfgfd','Vu',5000,1,'Giay','Cu');




