drop database if exists case_study;
create database case_study;
use case_study;
create table loai_khach (
    id_loai_khach int primary key,
    ten_loai_khach varchar (45)
);
insert into loai_khach(id_loai_khach,ten_loai_khach) values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');
drop table if exists khach_hang;
create table khach_hang (
    id_khach_hang int primary key,
    id_loai_khach int,
    ho_ten varchar (45),
    ngay_sinh date,
    so_cmtnd varchar(45),
    sdt varchar (45),
    email varchar (45),
    dia_chi varchar (45),
    
    Foreign key (id_loai_khach) references loai_khach(id_loai_khach)
);
insert into khach_hang(id_loai_khach,id_khach_hang,ho_ten,ngay_sinh,so_cmtnd,sdt,email,dia_chi) values
(1,101,'Le Thanh Phong','1990-05-08','123456789','0935198920','thanhphongle@gmail.com','Quang Nam'),
(3,102,'Le Thanh Cao','1991-06-08','167836257','0963523789','thanhcao@gmail.com','Hue'),
(5,103,'Ho Anh Dung','1989-07-09','178356276','0916273674','anhdung@gmail.com','Ha Tinh'),
(4,104,'Nguyen Hong Son','1995-10-08','093627384','0937261536','hongson@gmail.com','Phu Yen'),
(2,105,'Tran Huu Kien','1999-05-18','278914367','0917635467','huukien@gmail.com','Nghe An'),
(1,106,'Nguyen Viet Dung','2000-09-10','278351789','0909352678','vietdung@gmail.com','Da Nang'),
(3,107,'Le Quang Duong','1994-02-28','378462534','09367452168','quangduong@gmail.com','Quang Binh'),
(4,108,'Nguyen Thanh Tung','1992-01-01','983526345','0993625142','thanhtung@gmail.com','Quang Nam'),
(2,109,'Tran Trung Son','1993-05-10','367241563','0936745632','trungson@gmail.com','Hue'),
(1,110,'Tran Huu Han','1996-07-18','834621673','0945673452','huuhan@gmail.com','Binh Dinh');


create table dich_vu_di_kem (
    id_dich_vu_di_kem int primary key,
    ten_dich_vu_di_kem varchar(45),
    gia int,
    don_vi varchar(15),
    trang_thai_kha_dung varchar(45)
);
insert into dich_vu_di_kem(id_dich_vu_di_kem,ten_dich_vu_di_kem,gia,don_vi,trang_thai_kha_dung)values
(1,'thuc an',200000,'VND','Van con'),
(2,'karaoke',300000,'VND','Van con'),
(3,'massage',350000,'VND','Van con'),
(4,'nuoc uong',100000,'VND','Van con'),
(5,'thue xe',250000,'VND','Het');

create table hop_dong_chi_tiet (
    id_hop_dong_chi_tiet int primary key,
    id_hop_dong int,
    id_dich_vu_di_kem int,
    so_luong int,
    
	Foreign key (id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem)

);
insert into hop_dong_chi_tiet(id_hop_dong_chi_tiet,id_hop_dong,id_dich_vu_di_kem,so_luong)values
(2001,01,1,2),
(2002,02,2,2),
(2003,03,3,4),
(2004,04,4,4),
(2005,05,5,5);
create table vi_tri (
    id_vi_tri int primary key,
    ten_vi_tri varchar (45)
);
insert into vi_tri(id_vi_tri,ten_vi_tri)values
(1,'Nhan vien'),
(2,'Tiep Tan'),
(3,'Quan Li'),
(4,'Buong phong'),
(5,'Sale');

create table trinh_do (
   id_trinh_do int primary key,
   trinh_do varchar (45)
);
insert into trinh_do(id_trinh_do,trinh_do)values
(1,'Cao Dang'),
(2,'Dai Hoc'),
(3,'Pho thong'),
(4,'Cao Dang'),
(5,'Dai Hoc');
create table bo_phan (
    id_bo_phan int primary key,
    ten_bo_phan varchar(45)
);
insert into bo_phan(id_bo_phan,ten_bo_phan)values
(1,'Phong Nhan Su'),
(2,'Phong Maketing'),
(3,'Phong Ke Toan'),
(4,'Phong Ky thuat');
create table nhan_vien (
	id_nhan_vien int primary key,
    ho_ten varchar(50),
    id_vi_tri int,
    id_trinh_do int,
    id_bo_phan int,
    ngay_sinh date,
    so_cmtnd varchar (45),
    luong decimal (45),
    sdt varchar (45),
    email varchar (45),
    dia_chi varchar (45),
    
    Foreign key (id_vi_tri) references vi_tri(id_vi_tri),
    Foreign key (id_trinh_do) references trinh_do(id_trinh_do),
    Foreign key (id_bo_phan) references bo_phan(id_bo_phan)
);
insert into nhan_vien(id_nhan_vien,ho_ten,ngay_sinh,id_vi_tri,id_trinh_do,id_bo_phan,so_cmtnd,sdt,email,dia_chi,luong)values
(201,'Ho Dung','1999-05-18',1,3,2,'178356276','0916273674','dung@gmail.com','Quang Binh',1000000),
(202,'Nguyen Son','1989-07-09',1,5,4,'093627384','0937261536','son@gmail.com','Phu Yen',12000000),
(203,'Tran Huu ','1995-10-08',2,2,2,'278914367','0917635467','huu@gmail.com','Binh Dinh',9000000),
(204,'Tran Son','1993-05-10',3,3,4,'367241563','0936745632','son@gmail.com','Hue',15000000),
(205,'Tran Han','2000-09-10',5,4,4,'834621673','0945673452','han@gmail.com','Nghe An',1000000),
(206,'Nguyen Viet','1996-07-18',4,4,4,'278351789','0909352678','viet@gmail.com','Da Nang',11000000),
(207,'Le Duong','1992-01-01',2,5,3,'378462534','09367452168','duong@gmail.com','Ha Tinh',10500000),
(208,'Nguyen Tung','1994-02-28',1,2,2,'983526345','0993625142','tung@gmail.com','Quang Nam',7000000),
(209,'Le Phong','1991-06-08',5,1,1,'123456789','0935198920','phongle@gmail.com','Quang Nam',12000000),
(210,'Le Thanh','1990-05-08',2,3,1,'167836257','0963523789','thanh@gmail.com','Hue',11000000);

create table loai_dich_vu (
   id_loai_dich_vu int primary key,
   ten_loai_dich_vu varchar(45),
   gia int
);
insert into loai_dich_vu(id_loai_dich_vu,ten_loai_dich_vu,gia)values
(001,'Villa',2000000),
(002,'House',1500000),
(003,'Room',1000000);
create table kieu_thue (
    id_kieu_thue int primary key,
    ten_kieu_thue varchar(45),
    gia int
);
insert into kieu_thue(id_kieu_thue,ten_kieu_thue,gia)values
(1,'ngay',150000),
(2,'gio',200000),
(3,'thang',100000),
(4,'nam',50000);

create table dich_vu (
    id_dich_vu int primary key,
    ten_dich_vu varchar(45),
    dien_tich int,
    so_tang int,
    so_nguoi_toi_da int,
    id_loai_dich_vu int,
    trang_thai varchar(45),
    id_kieu_thue int,
    
    Foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu),
    Foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue)
);
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,id_loai_dich_vu,trang_thai,id_kieu_thue)values
(1,'Villa1',300,10,1000,001,'Van Con',1),
(2,'Villa2',310,11,900,001,'Van Con',3),
(3,'Villa3',300,9,950,001,'Het',2),
(4,'House1',200,5,550,002,'Het',4),
(5,'House2',220,6,450,002,'Van Con',1),
(6,'House3',210,7,500,002,'Het',3),
(7,'Room1',150,4,250,003,'Van Con',3),
(8,'Room2',100,4,200,003,'Het',1),
(9,'Room3',120,3,150,003,'Van Con',4);

create table hop_dong (
    id_hop_dong int primary key,
    id_nhan_vien int,
    id_khach_hang int,
    id_dich_vu int,
    ngay_lam_hop_dong date,
    ngay_ket_thuc date,
    tien_dat_coc int,
    id_hop_dong_chi_tiet int,
    
    Foreign key (id_khach_hang) references khach_hang(id_khach_hang),
    Foreign key (id_hop_dong_chi_tiet) references hop_dong_chi_tiet(id_hop_dong_chi_tiet),
    Foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien),
    Foreign key (id_dich_vu) references dich_vu(id_dich_vu)
);
insert into hop_dong(id_hop_dong,id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,id_hop_dong_chi_tiet) values
(0001,203,102,1,'2020-10-10','2020-12-10',1000000,2003),
(0002,204,101,3,'2020-11-23','2020-12-23',1000000,2004),
(0003,202,102,5,'2020-04-21','2020-06-21',1000000,2001),
(0004,205,104,6,'2020-02-22','2020-04-28',1000000,2002),
(0005,201,103,4,'2020-06-12','2021-06-12',1000000,2005),
(0006,209,107,8,'2020-07-25','2020-09-25',1000000,2003),
(0007,206,105,1,'2020-01-03','2020-03-03',1000000,2002),
(0008,207,108,9,'2020-08-15','2020-10-15',1000000,2001),
(0009,208,109,8,'2020-12-29','2021-02-20',1000000,2002),
(00010,204,105,7,'2020-05-07','2020-07-07',1000000,2004);
-- yêu cầu 2
select * from nhan_vien where (ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%') and length(ho_ten)<15;

-- yêu cầu 3
select * from khach_hang where dia_chi in('Quang Tri','Da Nang') and (curdate() -ngay_sinh>(18*30*365)and curdate() -ngay_sinh<(50*30*365));

-- yêu cẩu 4
select khach_hang.ho_ten, count(hop_dong.id_hop_dong) 'so lan dat phong' from khach_hang 
inner join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
inner join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
where loai_khach.id_loai_khach = 'Diamond'
group by khach_hang.id_khach_hang order by  'so lan dat phong';










