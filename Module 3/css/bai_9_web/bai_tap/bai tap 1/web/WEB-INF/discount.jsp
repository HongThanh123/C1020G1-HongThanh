<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/29/2021
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Discount</title>
</head>
<body>
<h1 style="color: blue">Discount Amount:
    <%=request.getAttribute("discountA")%></h1>
<h1 style="color: aqua">Discount Price:
    <%=request.getAttribute("discountP")%></h1>
</body>
</html>
