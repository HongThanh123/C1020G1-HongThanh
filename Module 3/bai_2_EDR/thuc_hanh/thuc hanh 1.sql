-- Tao bảng

CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT, -- Cột contact_id có kiểu dữ liệu số nguyên (với tối đa 11 chữ số) và không thể chứa giá trị NULL. Giá trị của cột này sẽ được tự động tăng dần (Giá trị đầu tiên là 1, tiếp theo là 2, 3...).
  last_name VARCHAR(30) NOT NULL, -- Cột last_name có kiểu dữ liệu VARCHAR (chuỗi - với tối đa 30 ký tự) và không thể chứa giá trị NULL.
  first_name VARCHAR(25), -- Cột first_name có kiểu dữ liệu VARCHAR (chuỗi - với tối đa 25 ký tự) và có thể chứa giá trị NULL.
  birthday DATE, -- Cột birthday có kiểu dữ liệu ngày tháng và có thể chứa giá trị NULL.
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id) -- Khoá chính của bảng này có tên là contacts_pk và được gán cho cột contact_id.
);

CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD', -- cột account_rep có kiểu dữ liệu là chuỗi (với tối đa 30 ký tự), không thể chứa giá trị NUL,sử dụng từ khoá DEFAULT để gán giá trị mặc định cho một cột.
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);

-- Xóa 2 bảng

DROP TABLE contacts,suppliers;

-- Chỉnh sửa bảng
-- thêm cột last_name vào cho bảng contacts
ALTER TABLE contacts
  ADD last_name varchar(40) NOT NULL
    AFTER contact_id;
  
-- thêm nhiều cột một lúc 

ALTER TABLE contacts
  ADD last_name varchar(40) NOT NULL
    AFTER contact_id,
  ADD first_name varchar(35) NULL
    AFTER last_name;
    
 -- chỉnh sửa mô tả của một cột
 ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;
  
  -- xoá một cột trong bảng
  
  ALTER TABLE contacts
  DROP COLUMN contact_type;
  
  -- thay đổi tên cột
  ALTER TABLE contacts
  CHANGE COLUMN contact_type ctype
    varchar(20) NOT NULL;
    
-- đổi tên bảng
ALTER TABLE contacts
  RENAME TO people;



