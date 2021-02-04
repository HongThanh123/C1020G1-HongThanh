<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/1/2021
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<div class="row" style="border: black solid">
    <div class="col-12">
        <nav class="navbar navbar-light bg-light">
            <form class="container-fluid justify-content-start">
                <img style="height: 100px ; width: 100px" src="img/2.jpg" alt="">
                <span class="btn btn-sm btn-outline-secondary" type="button" style="margin-left: 1020px">Dang Thi Hong Thanh</span>
            </form>
        </nav>
    </div>
</div>
<div class="row" style="text-decoration: none ; border: black solid">
    <div class="col-12">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0" style="margin-left: 100px">
                        <li class="nav-item" style="margin-left: 50px">
                            <a class="nav-link active" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item " style="margin-left: 50px">
                            <a class="nav-link active" aria-current="page" href="/userCustomers?action=">Employee</a>
                        </li>
                        <li class="nav-item " style="margin-left: 50px">
                            <a class="nav-link active" aria-current="page" href="/userCustomers?action=">Customer</a>
                        </li>
                        <li class="nav-item" style="margin-left: 50px">
                            <a class="nav-link active" aria-current="page" href="#">Service</a>
                        </li>
                        <li class="nav-item" style="margin-left: 50px">
                            <a class="nav-link active" aria-current="page" href="#">Contract</a>
                        </li>
                    </ul>
                    <form class="d-flex" style="margin-left: 450px" action="/userCustomers">
                        <span>
                            <input type="text" name="id_khach_hang" >
                            <input type="hidden" name="action" value="search">
                            <input type="submit" value="Search">
                        </span>
                    </form>
                </div>
            </div>
        </nav>
    </div>
</div>
<div class="row">
    <div class="col-3">
        <div class="left" style="margin: 0">
            <p style="margin-left: 200px;">Item One</p>
            <p style="margin-left: 200px;" >Item Two</p>
            <p style="margin-left: 200px;">Item Three</p>
        </div>
    </div>
    <div class="col-9"style="border: black solid">
        <div align ="center">
            <caption><h2>Customer List</h2></caption>
            <h2>
                <a href="/userCustomers?action=create">Add New Customer</a>
            </h2>
            <table border="1" cellpadding="5">
                <tr>
                    <th>ID</th>
                    <th>Tên</th>
                    <th>Ngày sinh</th>
                    <th>CMND</th>
                    <th>SĐT</th>
                    <th>Email</th>
                    <th>Địa chỉ</th>
                </tr>
                <c:forEach var="customer" items="${listCustomer}">
                    <tr>
                        <td><c:out value="${customer.id}"/></td>
                        <td><c:out value="${customer.name}"/></td>
                        <td><c:out value="${customer.ngay_sinh}"/></td>
                        <td><c:out value="${customer.cmnd}"/></td>
                        <td><c:out value="${customer.sdt}"/></td>
                        <td><c:out value="${customer.email}"/></td>
                        <td><c:out value="${customer.dia_chi}"/></td>
                        <td>
                            <a href="/userCustomers?action=edit&id=${customer.id}">Edit</a>
                            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                                Delete
                            </button>

                        </td>
                    </tr>
                    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Bạn muốn xóa không?</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    Không hối hận nhé!
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    <button type="button" class="btn btn-secondary">
                                        <a href="/userCustomers?action=delete&id=${customer.id}">Delete</a>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
<div>
    <div style="border: black solid">
        <p style="margin-left: 800px">Dang Thi Hong Thanh C1020G1...</p>
    </div>
</div>
</body>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
</html>
