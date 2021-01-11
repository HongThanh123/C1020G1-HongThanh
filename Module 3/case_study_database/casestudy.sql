use case_study;

create table nhan_vien (
	id_nhan_vien int,
    ho_ten int,
    id_vi_tri int,
    id_trinh_do int,
    id_bo_phan int,
    ngay_sinh date,
    so_cmtnd varchar (45),
    luong decimal (45),
    sdt varchar (45),
    email varchar (45),
    dia_chi varchar (45)
);

create table vi_tri (
    id_vi_tri int,
    ten_vi_tri varchar (45)
);

create table trinh_do (
   id_trinh_do int,
   trinh_do varchar (45)
);

create table bo_phan (
    id_bo_phan int,
    ten_bo_phan varchar(45)
);

create table hop_dong (
    id_hop_dong int,
    id_nhan_vien int,
    id_khach_hang int,
    id_dich_vu int,
    ngay_lam_hop_dong date,
    ngay_ket_thuc date,
    tien_dat_coc int,
    tien int
);

create table hop_dong_chi_tiet (
    id_hop_dong_chi_tiet int,
    id_hop_dong int,
    id_dich_vu_di_kem int,
    so_luong int
);

create table khach_hang (
    id_khach_hang int,
    id_loai_khach int,
    ho_ten varchar (45),
    ngay_sinh date,
    so_cmtnd varchar(45),
    sdt varchar (45),
    email varchar (45),
    dia_chi varchar (45)
);

create table loai_khach (
    id_loai_khach int,
    ten_loai_khach varchar (45)
);

create table kieu_thue (
    id_kieu_thue int,
    ten_kieu_thue varchar(45),
    gia int
);

create table dich_vu_di_kem (
    id_dich_vu_di_kem int,
    ten_dich_vu_di_kem varchar(45),
    gia int,
    don_vi int,
    trang_thai_kha_dung varchar(45)
);

create table dich_vu (
    id_dich_vu int,
    ten_dich_vu varchar(45),
    dien_tich int,
    so_tang int,
    so_nguoi_toi_da varchar(45),
    id_loai_dich_vu int,
    trang_thai varchar(45)
);

create table kieu_thue (
    id_kieu_thue int,
    ten_kieu_thue varchar(45),
    gia int
);

create table loai_dich_vu (
   id_loai_dich_vu int,
   ten_loai_dich_vu varchar(45),
   gia int
);








