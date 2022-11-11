<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/2/2022
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>THONG TIN KHACH HANG</title>
    <link href="bootstrap/bootstrap.4.0.0.min.css" rel="stylesheet">
    <script type="text/javascript" src="bootstrap/bootstrap.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.2.1.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.2.1.slim.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/popper.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.6.0.js" crossorigin="anonymous"></script>
</head>
<body>
<%--<h1>PHONG: ${clickedRoom}</h1>--%>

<style>
    .table{
        width: 50%;
        margin: auto;
    }
</style>

<div class="text-center">
    <h1>Nhập thông tin khách hàng</h1>

    <form class="form-group" action="<c:url value="CustomerServlet549"/>" method="post">
        <input type="hidden" name="action" value="inputCustomer">
        <input type="hidden" name="arrivalDate" value="${arrivalDate}">
        <input type="hidden" name="clickedRoom" value="${clickedRoom}">
        <input type="hidden" name="userID" value="${userID}">
        <table border="1" class="table">
            <tr>
                <td><label>Tên khách hàng: </label></td>
                <td><input type="text" name="customerName" value="La Manh Tu"></td>
            </tr>
            <tr>
                <td><label>Ngày tháng năm sinh: </label></td>
                <td><input type="date" name="customerDob" value="2000-12-08"></td>
            </tr>
            <tr>
                <td><label>Số CMT: </label></td>
                <td><input type="text" name="customerIDCard" value="11223344"></td>
            </tr>
            <tr>
                <td><label>Điện thoại: </label></td>
                <td><input type="text" name="customerTel" value="1111111"></td>
            </tr>
            <tr>
                <td><label>Quê quán: </label></td>
                <td><input type="text" name="customerHometown" value="Hoa Binh"></td>
            </tr>
        </table>
        <button class="btn-success">Xác nhận</button>
    </form>
</div>
</body>
</html>
