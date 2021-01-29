<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/27/2021
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users?action=create">Add New User</a>
    </h2>
    <h3>Search</h3>
    <form action = "/users">
        <span>
            <input type="text" name="country" >
            <input type="hidden" name="action" value="search">
            <input type="submit" value="Search">
        </span>
    </form>
</center>
<div align ="center">
    <table border="1" cellpadding="5">
        <caption><h2>Leu Leu</h2></caption>
        <tr>
            <th colspan="5">
                <a href="/users?action=sortByName">Sort By Name</a>
            </th>
        </tr>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                    <a href="/users?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
