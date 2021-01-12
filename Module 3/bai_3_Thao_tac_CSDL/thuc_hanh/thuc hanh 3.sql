create database group_by;

-- câu lệnh select status from orders thì sẽ trả về toàn bộ số bản ghi trong bảng đơn hàng, kể cả những bản ghi có trạng thái trùng nhau
select status from orders 
group by status;

-- Các hàm tập hợp (SUM, MAX, MIN, COUNT, AVG)
-- muốn biết có bao nhiêu đơn đặt hàng trong mỗi trạng thái, chúng ta có thể sử dụng hàm COUNT với mệnh đề GROUP BY
select status, COUNT(*) as 'So luong status'
from orders
group by status;

-- tính tổng số tiền của các đơn hàng theo trạng thái đặt hàng. 
-- Ta sẽ sử dụng lệnh inner join để kết nối 2 bảng và sử dụng hàm sum để tính tổng số tiền, nhóm theo trường status
select status, sum(quantityOrdered * priceEach) as amount
from orders 
inner join orderdetails on orders.ordernumber = orderdetails.ordernumber
group by status;

-- tính tổng tiền của từng đơn hàng
select orderNumber, sum(quantityOrdered * priceEach) as total
from orderdetails
group by orderNumber;

-- Để lọc các nhóm được trả về bởi mệnh đề GROUP BY, chúng ta sử dụng mệnh đề HAVING
select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from orders 
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by year
having year > 2003;

