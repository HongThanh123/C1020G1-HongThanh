drop database if exists ham;
create database ham;
use ham;
create table quan_li (
   id int,
   ten varchar(50),
   tuoi int,
   khoa_hoc varchar(50),
   so_tien decimal(9,2)
);

insert into quan_li values
(1,'Hoang',21,'CNTT',400000),
(2,'Viet',19,'DTVT',320000),
(3,'Thanh',18,'KTDN',400000),
(4,'Nhan',19,'CK',450000),
(5,'Huong',20,'TCNH',500000),
(5,'Huong',20,'TCNH',200000);

select ten
from quan_li
where ten like '%Huong%';

select sum(so_tien) 'Tong tien cua Huong'
from quan_li
where ten = 'Huong';

select 
distinct quan_li.ten
from quan_li;




