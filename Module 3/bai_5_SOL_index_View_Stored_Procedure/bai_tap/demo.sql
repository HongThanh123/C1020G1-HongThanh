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

explain select *
from products
where product_code = 'asfds';

create unique index idx_product on products (product_code);

explain select product_code
from products
where product_code = 'asfds';

create view product_view as
select
 product_code,
 product_name,
 product_price,
 product_status
 from products;
 select * 
 from product_view;
 
 create or replace view product_view as
 select 
 product_code,
 product_name,
 product_price,
 product_status
 from products
 where id = 1;
 
 drop view product_view;
 
 DELIMITER \\ 
 create procedure find_all_product ()
 begin
 select *
 from products;
 end \\
 DELIMITER ;

call find_all_product();

delimiter \\
create  procedure add_new_product (
	id int,
    product_code varchar(50),
    product_name varchar(50),
    product_price decimal(9,2),
    product_amount int,
    product_description varchar(100),
    product_status varchar(100)
)
begin 
	insert into products 
    values (id,product_code,product_name,product_price,product_amount,product_description,product_status);
    end;
\\ delimiter ;

call add_new_product(6,'dgtrh','Ngoc',15000,2,'Vay','Moi');

delimiter \\
create procedure edit_product (p_keyword varchar(50), id int)
begin
update products
set product_name = p_keyword
where products.id = id;
end;\\
delimiter ;

call edit_product ('a1', 3);
drop procedure edit_product;

delimiter \\
create procedure delete_product (id int)
begin
delete from products
where products.id = id;
end;\\
delimiter ;


















