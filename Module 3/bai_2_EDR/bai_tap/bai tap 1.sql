drop database if exists  quan_ly_ngan_hang;
create database quan_ly_ngan_hang;

use quan_ly_ngan_hang;

create table customers (
    customer_number int primary key,
   full_name varchar(50),
   address varchar(100),
   email varchar(50),
   phone varchar(50)
);

create table accounts (
    account_number int primary key,
    account_type varchar(50),
    `date` date,
    balance int,
    customer_number int,
    
    foreign key (customer_number) references customers(customer_number)
);

create table transactions (
    tran_number varchar(50) primary key,
    account_number int,
    `date` date,
    amounts int,
    descriptions varchar(100),
    
    foreign key (account_number) references accounts(account_number)
);