<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/2/2021
  Time: 8:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EDIT</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="userCustomers?action=userCustomers">List All Users</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit User
                </h2>
            </caption>
            <c:if test="${requestScope.customer != null}">
                <input type="hidden" name="id" value="<c:out value='${requestScope.customer.id}' />"/>
            </c:if>
            <tr>
                <th>User Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${requestScope.customer.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Ngay Sinh:</th>
                <td>
                        <input type="text" name="ngay_sinh" size="45"
                           value="<c:out value='${requestScope.customer.ngay_sinh}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>CMND:</th>
                <td>
                    <input type="text" name="so_cmtnd" size="45"
                           value="<c:out value='${requestScope.customer.cmnd}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Số điện thoại:</th>
                <td>
                    <input type="text" name="sdt" size="45"
                           value="<c:out value='${requestScope.customer.sdt}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="<c:out value='${requestScope.customer.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Địa chỉ:</th>
                <td>
                    <input type="text" name="dia_chi" size="15"
                           value="<c:out value='${requestScope.customer.dia_chi}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
