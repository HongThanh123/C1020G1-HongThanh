drop database if exists case_study;

create database case_study;
use case_study;

create table vai_tro (
	id_vai_tro int primary key,
    ten_vai_tro varchar(255)
);

create table su_dung (
	ten_su_dung varchar(255) primary key,
    mat_khau varchar(255)
);

create table role_user (
id_vai_tro int,
ten_su_dung varchar(255),
primary key (id_vai_tro,ten_su_dung),

foreign key (id_vai_tro) references vai_tro(id_vai_tro),
foreign key (ten_su_dung) references su_dung(ten_su_dung)

);
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
    id_khach_hang int auto_increment primary key,
    id_loai_khach int,
    ho_ten varchar (45),
    ngay_sinh date,
    so_cmtnd varchar(45),
    sdt varchar (45),
    email varchar (45),
    dia_chi varchar (45),
    
    Foreign key (id_loai_khach) references loai_khach(id_loai_khach)
    on delete cascade
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
(2,109,'Tran Trung Son','1993-05-10','367241563','0936745632','trungson@gmail.com','Quang Ngai'),
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
    ten_su_dung varchar(255),
    Foreign key (id_vi_tri) references vi_tri(id_vi_tri),
    Foreign key (id_trinh_do) references trinh_do(id_trinh_do),
    Foreign key (id_bo_phan) references bo_phan(id_bo_phan),
    foreign key (ten_su_dung) references su_dung(ten_su_dung)

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
    chi_phi_thue varchar(45),
    
    Foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu),
    Foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue)
);
insert into dich_vu(id_dich_vu,ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,id_loai_dich_vu,trang_thai,id_kieu_thue,chi_phi_thue)values
(1,'Villa1',300,10,1000,001,'Van Con',1,300000),
(2,'Villa2',310,11,900,001,'Van Con',3,350000),
(3,'Villa3',300,9,950,001,'Het',2,400000),
(4,'House1',200,5,550,002,'Het',4,200000),
(5,'House2',220,6,450,002,'Van Con',1,250000),
(6,'House3',210,7,500,002,'Het',3,220000),
(7,'Room1',150,4,250,003,'Van Con',3,150000),
(8,'Room2',100,4,200,003,'Het',1,100000),
(9,'Room3',120,3,150,003,'Van Con',4,120000);

create table hop_dong (
    id_hop_dong int primary key,
    id_nhan_vien int,
    id_khach_hang int,
    id_dich_vu int,
    ngay_lam_hop_dong date,
    ngay_ket_thuc date,
    tien_dat_coc decimal(9,2),
    id_hop_dong_chi_tiet int,
    tong_tien decimal(9,2),
    
    Foreign key (id_khach_hang) references khach_hang(id_khach_hang),
    Foreign key (id_hop_dong_chi_tiet) references hop_dong_chi_tiet(id_hop_dong_chi_tiet),
    Foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien),
    Foreign key (id_dich_vu) references dich_vu(id_dich_vu)
);
-- drop table hop_dong;
insert into hop_dong values 
(0001,203,102,1,'2020-10-10','2020-12-10',2500,2003,2000),
(0002,205,104,6,'2020-02-22','2020-04-28',1000,2002,2500),
(0003,202,102,5,'2020-04-21','2020-06-21',1000,2001,3000),
(0004,205,104,6,'2020-02-22','2020-04-28',1000,2002,2500),
(0005,201,103,4,'2020-06-12','2021-06-12',2000,2005,3200),
(0006,209,107,8,'2020-07-25','2020-09-25',1000,2003,3500),
(0007,206,105,1,'2020-01-03','2020-03-03',500,2002,4000),
(0008,207,108,9,'2020-08-15','2020-10-15',1000,2001,1200),
(0009,208,109,8,'2020-12-29','2021-02-20',1000,2002,5100),
(00010,204,105,7,'2020-05-07','2020-07-07',1000,2004,2200);






-- yêu cầu 2 Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.


select * 
from nhan_vien 
where 
(ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%') and length(ho_ten)<=15;

-- yêu cầu 3 Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * 
from khach_hang 
where dia_chi in('Quang Tri','Da Nang') and (curdate() -ngay_sinh>(18*30*365)and curdate() -ngay_sinh<(50*30*365));

-- yêu cẩu 4 Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
--  Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select khach_hang.ho_ten, count(hop_dong.id_hop_dong) 'so lan dat phong' 
from khach_hang 
inner join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
inner join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
where loai_khach.ten_loai_khach = 'Diamond'
group by khach_hang.id_khach_hang order by  'so lan dat phong';

-- yêu cầu 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng. 
-- (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select 
	khach_hang.id_khach_hang,
    khach_hang.ho_ten,
    loai_khach.ten_loai_khach,
    hop_dong.id_hop_dong,
    dich_vu.ten_dich_vu,
    hop_dong.ngay_lam_hop_dong,
    hop_dong.ngay_ket_thuc,
sum(dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia) 'Tong tien' from khach_hang
left join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
left join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
left join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
group by hop_dong.id_hop_dong;

-- yêu cầu 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được 
-- Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

select 
	dich_vu.id_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu 
from dich_vu
inner join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where not exists (
    select hop_dong.id_hop_dong 
    from hop_dong
    where (hop_dong.ngay_lam_hop_dong between '2020-01-01' and '2020-03-31') and hop_dong.id_dich_vu = dich_vu.id_dich_vu
);

-- yêu cầu 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ 
-- đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019

select 
    dich_vu.id_dich_vu,
	dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.so_nguoi_toi_da,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu,
    hop_dong.ngay_lam_hop_dong
from dich_vu 
inner join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
inner join hop_dong on dich_vu.id_dich_vu = hop_dong.id_dich_vu
where exists (
	select hop_dong.id_hop_dong
    from hop_dong
    where year(hop_dong.ngay_lam_hop_dong) = 2020 and hop_dong.id_dich_vu = dich_vu.id_dich_vu
)
    and not exists (
    select hop_dong.id_hop_dong
    from hop_dong
    where year(hop_dong.ngay_lam_hop_dong) = 2021 and hop_dong.id_dich_vu = dich_vu.id_dich_vu
);

-- yêu cầu 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
select 
distinct khach_hang.ho_ten 
from khach_hang;
select khach_hang.ho_ten 
from khach_hang 
group by khach_hang.ho_ten;
select khach_hang.ho_ten 
from khach_hang 
union 
select khach_hang.ho_ten 
from khach_hang;

-- yêu cầu 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng
select  temp.month, count(month(hop_dong.ngay_lam_hop_dong)) 'So lan khach hang dang ky' , sum(hop_dong.tong_tien) 'Tong tien' 
from
(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as temp
left join hop_dong on hop_dong.ngay_lam_hop_dong = temp.month
left join khach_hang on khach_hang.id_khach_hang = hop_dong.id_khach_hang
where year(hop_dong.ngay_lam_hop_dong) = '2020' or year(hop_dong.ngay_lam_hop_dong) is null or month(hop_dong.ngay_lam_hop_dong) is null
group by temp.month
order by temp.month;

-- yeu cau 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).

select 
hop_dong.id_hop_dong,
hop_dong.ngay_lam_hop_dong,
hop_dong.ngay_ket_thuc,
hop_dong.tien_dat_coc,
count(hop_dong_chi_tiet.id_dich_vu_di_kem) 'So luong dich vu di kem'
from hop_dong
join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
group by hop_dong.id_hop_dong;

-- yêu cầu 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select distinct
dich_vu_di_kem.ten_dich_vu_di_kem,
dich_vu_di_kem.gia,
dich_vu_di_kem.don_vi
from hop_dong
join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
join khach_hang on khach_hang.id_khach_hang = hop_dong.id_khach_hang
join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
where loai_khach.ten_loai_khach = 'Diamond' and khach_hang.dia_chi in ('Vinh','Quang Ngai');	

-- yêu cầu 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của 
-- tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

select 
hop_dong.id_hop_dong,
nhan_vien.ho_ten,
khach_hang.ho_ten,
khach_hang.sdt,
dich_vu.ten_dich_vu,
count(hop_dong_chi_tiet.id_dich_vu_di_kem) as 'so lan su dung'
from hop_dong
join nhan_vien on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
join dich_vu on dich_vu.id_dich_vu = hop_dong.id_dich_vu
join hop_dong_chi_tiet on hop_dong.id_hop_dong_chi_tiet = hop_dong_chi_tiet.id_hop_dong_chi_tiet
where not exists (
	select hop_dong.id_hop_dong
    where hop_dong.ngay_lam_hop_dong between '2020-01-01' and '2021-06-31'
)
and exists (
	select hop_dong.id_hop_dong
    where hop_dong.ngay_lam_hop_dong between '2020-09-01' and '2021-12-31'
);

-- yêu cầu 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
create temporary table temp
select dich_vu_di_kem.ten_dich_vu_di_kem as 'ten dich vu di kem' , count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_lan_su_dung
from hop_dong_chi_tiet
join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.ten_dich_vu_di_kem;

drop temporary table temp;

select * from temp;

create temporary table temp1
select max(temp.so_lan_su_dung) as 'so lan su dung nhieu nhat'
from temp;
select * from temp1;
drop temporary table temp1;

select temp.ten_dich_vu_di_kem, temp.so_lan_su_dung 
from temp
join temp1 on temp.so_lan_su_dung = temp1.so_lan_su_dung_nhieu_nhat;

-- yêu cầu 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
select 
hop_dong.id_hop_dong, 
loai_dich_vu.ten_loai_dich_vu,
dich_vu_di_kem.ten_dich_vu_di_kem,
count(hop_dong_chi_tiet.id_dich_vu_di_kem) so_lan_su_dung
from hop_dong
join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.id_loai_dich_vu
join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.id_dich_vu_di_kem 
having so_lan_su_dung = 1;

-- yêu càu 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập 
-- được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select
	nhan_vien.id_nhan_vien,
    nhan_vien.ho_ten,
    trinh_do.trinh_do,
    bo_phan.ten_bo_phan,
    nhan_vien.sdt,
    nhan_vien.dia_chi,
    count(hop_dong.id_nhan_vien) so_lan_tao_hop_dong
    from nhan_vien
    join trinh_do on nhan_vien.id_trinh_do = trinh_do.id_trinh_do
    join bo_phan on nhan_vien.id_bo_phan = bo_phan.id_bo_phan
    join hop_dong on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
    where hop_dong.ngay_lam_hop_dong between '2020-01-01' and '2020-12-31'
    group by nhan_vien.ho_ten
    having so_lan_tao_hop_dong <=3;
    
  -- yêu cầu  16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
    
delete from nhan_vien where not exists (
select nhan_vien.id_nhan_vien 
from hop_dong
where hop_dong.ngay_lam_hop_dong between '2020-01-01' and '2020-12-31' and hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien);

-- yêu cầu 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

update khach_hang, (
select hop_dong.id_khach_hang as id,
sum(hop_dong.tong_tien) as Tong_tien 
from hop_dong
where year(hop_dong.ngay_lam_hop_dong) = 2020
group by hop_dong.id_khach_hang
having Tong_tien > 5000000) as temp 
set khach_hang.id_loai_khach = (
select loai_khach.id_loai_khach
from loai_khach
where loai_khach.ten_loai_khach = 'Diamond')
where khach_hang.id_loai_khach = (
select loai_khach.id_loai_khach from loai_khach
where loai_khach.ten_loai_khach = 'Platinium')
and temp.id = khach_hang.id_khach_hang;

-- yêu cầu 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).

delete khach_hang, hop_dong, hop_dong_chi_tiet 
from khach_hang 
join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
where not exists (
select hop_dong.id_hop_dong 
where year(hop_dong.ngay_lam_hop_dong) > '2020' and khach_hang .id_khach_hang= hop_dong.id_khach_hang);

delete from khach_hang
where khach_hang.id_khach_hang not in (
select hop_dong.id_khach_hang
from hop_dong
where year(hop_dong.ngay_lam_hop_dong) < 2020
);

-- yêu cầu 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
update dich_vu_di_kem
set dich_vu_di_kem.gia = dich_vu_di_kem.gia * 2
where dich_vu_di_kem.id_dich_vu_di_kem in (
	select hop_dong_chi_tiet.id_dich_vu_di_kem
    from hop_dong_chi_tiet
    inner join hop_dong on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
    where year(hop_dong.ngay_lam_hop_dong) = "2020"
    group by hop_dong_chi_tiet.id_dich_vu_di_kem
    having count(hop_dong_chi_tiet.id_dich_vu_di_kem) > 10
    );


-- yêu cầu 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm 
-- ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select 
nhan_vien.id_nhan_vien as ID,
nhan_vien.ho_ten,
nhan_vien.email,
nhan_vien.sdt,
nhan_vien.ngay_sinh,
nhan_vien.dia_chi,'nhan vien' as Bang
from nhan_vien
union all
select
khach_hang.id_khach_hang as ID,
khach_hang.ho_ten,
khach_hang.email,
khach_hang.sdt,
khach_hang.ngay_sinh,
khach_hang.dia_chi, 'khach hang' as Bang
from khach_hang;












































