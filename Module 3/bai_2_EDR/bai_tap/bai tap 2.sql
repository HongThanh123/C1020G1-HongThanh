drop database if exists quan_ly_ban_hang;

create database quan_ly_ban_hang;

use quan_ly_ban_hang;


create table payments  (
    customer_number int NOT NULL primary key,
    check_number int NOT NULL,
    payment_date date NOT NULL,
    amount decimal(9,2)
);

create table orders (
   order_number int NOT NULL primary key,
   order_date date NOT NULL,
   required_date  date NOT NULL,
   shipped_date date,
   `status` varchar(15) NOT NULL,
   comments text,
   quantity_ordered int NOT NULL,
   price_each int NOT NULL
);

create table products (
    product_code varchar(15) NOT NULL primary key,
    product_name varchar(70) NOT NULL,
    product_scale varchar(10) NOT NULL,
    product_vendor varchar(50) NOT NULL,
    product_description text,
    quantity_instock int NOT NULL,
    buy_price decimal NOT NULL,
    MSRP decimal NOT NULL
);

create table productlines (
    product_line varchar(50) NOT NULL primary key,
    text_description varchar(100),
    image varchar(100),
    product_code varchar(15),
    
    Foreign key (product_code) references products(product_code)
);
create table offices  (
    office_code varchar(10) NOT NULL primary key,
    city varchar(50) NOT NULL,
    phone varchar(50) NOT NULL,
    address_line1 varchar(50) NOT NULL,
   address_line2 varchar(50),
   state varchar(50),
   postal_code varchar(15) NOT NULL,
   country varchar(50) NOT NULL
);
create table employees (
    employee_number int NOT NULL primary key,
    last_name varchar(50) NOT NULL,
    first_name varchar(50) NOT NULL,
    email varchar(100) NOT NULL,
    job_title varchar(50) NOT NULL,
    report_to int,
    office_code varchar(10),
    
    foreign key(report_to) references employees(employee_number),
    foreign key(office_code) references offices(office_code)
);

create table customers (
   customer_number int NOT NULL primary key,
   customer_name varchar(50) NOT NULL,
   contact_last_name varchar(50) NOT NULL,
   contact_first_name varchar(50) NOT NULL,
   phone varchar(50) NOT NULL,
   address_line1 varchar(50) NOT NULL,
   address_line2 varchar(50),
   city varchar(50) NOT NULL,
   state varchar(50) NOT NULL,
   postal_code varchar(15) NOT NULL,
   country varchar(50) NOT NULL,
   credit_limit varchar(50),
   order_number int,
   employee_number int,
   
   Foreign key (customer_number) references payments(customer_number),
   Foreign key (order_number) references orders(order_number),
   Foreign key (employee_number) references employees(employee_number)
);



create table products_orders (
    order_number int,
    product_code varchar(15),
    
    primary key (order_number,product_code),
    Foreign key (order_number) references orders(order_number),
    Foreign key (product_code) references products(product_code)
    
);


















