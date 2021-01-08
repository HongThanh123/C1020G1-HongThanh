SELECT * FROM customers;

 SELECT customerName, phone, city, country FROM customers;

SELECT * FROM customers WHERE customerName = 'Atelier Graphique'; -- Hiển thị thông tin của khách hàng tên Atelier Graphique

SELECT * FROM customers WHERE customername like '%A%'; -- Hiển khách hàng có tên chứa chữ A

SELECT * FROM customers WHERE city IN ('Nantes',' Las Vegas',' Warszawa','NYC') ; -- hiển thị thông tin khách hàng có city ở một trong những vùng Nantes, Las Vegas, Warszawa, NYC

