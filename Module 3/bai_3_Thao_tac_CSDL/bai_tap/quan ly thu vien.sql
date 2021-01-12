create database quan_ly_thu_vien;
use quan_ly_thu_vien;
create table student (
   id_student int primary key,
   ho_va_ten varchar(50),
   ngay_sinh date,
   email varchar(50),
   address varchar(50),
   phone varchar(15),
   image varchar(100)
);
insert into student values
(101,'Le Thanh Phong','1990-05-08','0935198920','thanhphongle@gmail.com','Quang Nam','anh'),
(102,'Le Thanh Cao','1991-06-08','0963523789','thanhcao@gmail.com','Hue','anh'),
(103,'Ho Anh Dung','1989-07-09','0916273674','anhdung@gmail.com','Ha Tinh','anh'),
(104,'Nguyen Hong Son','1995-10-08','0937261536','hongson@gmail.com','Phu Yen','anh'),
(105,'Tran Huu Kien','1999-05-18','0917635467','huukien@gmail.com','Nghe An','anh'),
(106,'Nguyen Viet Dung','2000-09-10','0909352678','vietdung@gmail.com','Da Nang','anh'),
(107,'Le Quang Duong','1994-02-28','09367452168','quangduong@gmail.com','Quang Binh','anh'),
(108,'Nguyen Thanh Tung','1992-01-01','0993625142','thanhtung@gmail.com','Quang Nam','anh'),
(109,'Tran Trung Son','1993-05-10','0936745632','trungson@gmail.com','Hue','anh'),
(110,'Tran Huu Han','1996-07-18','0945673452','huuhan@gmail.com','Binh Dinh','anh');
create table the_loai (
   id_the_loai int primary key,
   ten_the_loai varchar(50)
);
insert into the_loai values
(1,'Van hoc'),
(2,'Khoa hoc'),
(3,'Thien Van hoc'),
(4,'Lich Su hoc'),
(5,'Nghien Cuu hoc');

create table sach (
id_sach int primary key,
chu_de varchar(50),
tac_gia varchar(50),
nha_xuat_ban varchar(100),
nam_xuat_ban int,
so_xuat_ban int,
gia decimal(9,2),
image varchar(50),
id_the_loai int,

Foreign key (id_the_loai) references the_loai(id_the_loai)
);
insert into sach values
   (1,'Toi thay hoa vang tren co xanh','Nguyen Ngoc Anh','Nhi Dong',2016,12345,169000,'anh',1),
   (2,'Dac Nhan Tam','Dale Carnegie','Tong Hop',2005,17845,485000,'anh',5),
   (3,'Di truyen hoc','Steve Jones','Alphabooks',2010,1212215,621000,'anh',2),
   (4,'Dai Viet Su Ky Toan Thu','','',2000,12334245,151000,'anh',4),
   (5,'Bach Khoa Toan Thu','','Nhi Dong',2006,12345234,421000,'anh',3);

create table phieu_thue (
    id_phieu_thue int primary key,
    ngay_thue date,
    ngay_tra date,
    tinh_trang varchar(100),
    id_student int,
    
    Foreign key (id_student) references student(id_student)
);
insert into phieu_thue values
(1,'2020-03-21','2020-04-21','Moi',104),
(2,'2020-06-22','2020-07-22','Moi',107),
(3,'2020-05-21','2020-06-21','Binh thuong',110),
(4,'2020-10-02','2020-11-02','Moi',101),
(5,'2020-11-01','2020-11-01','Binh thuong',109);

create table phieu_thue_and_sach (
id_phieu_thue int,
id_sach int,
primary key (id_sach,id_phieu_thue),

Foreign key(id_phieu_thue) references phieu_thue(id_phieu_thue),
Foreign key(id_sach) references sach(id_sach)

);



