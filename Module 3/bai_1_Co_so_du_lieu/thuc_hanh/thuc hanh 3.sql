create database classsicmodels;

use classsicmodels;
create table customers (
customername varchar(30),
phone varchar(11),
city varchar(30),
country varchar(30)
);

alter table customers
add id int;

insert into customers
values 
('hong thanh', '0347237427', 'quang nam', 'viet nam',1),
('thanh phong','0935198920','da nang', 'viet nam',2);