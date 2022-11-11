<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/3/2022
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>HOP DONG</title>
    <link href="bootstrap/bootstrap.4.0.0.min.css" rel="stylesheet">
    <script type="text/javascript" src="bootstrap/bootstrap.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.2.1.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.2.1.slim.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/popper.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.6.0.js" crossorigin="anonymous"></script>
</head>
<body>
<style>
    .table {
        width: 50%;
        margin: auto;
    }
</style>

<div class="text-center">
    <h1>Hợp đồng</h1>

    <form action="<c:url value="BookingServlet549"/>" method="post">
        <table border="1" class="table">
            <tr>
                <td><label>Bên A: </label></td>
                <td><input type="text" name="contractPartyA" value="${partyA}" readonly></td>
            </tr>
            <tr>
                <td><label>Bên B: </label></td>
                <td><input type="text" name="contractPartyB" value="${customer.fullName}" readonly></td>
                <input type="hidden" name="customerIDCard" value="${customer.IDCard}" readonly>
            </tr>
            <tr>
                <td><label>Phòng: </label></td>
                <td><input type="text" name="contractRoom" value="${clickedRoom.name}" readonly></td>
            </tr>
            <tr>
                <td><label>Ngày bắt đầu ở: </label></td>
                <td><input type="date" name="contractArrivalDate" value="${arrivalDate}" readonly></td>
            </tr>
            <tr>
                <td><label>Giá thuê: </label></td>
                <td><input type="text" name="contractPrice" value="${clickedRoom.price}" readonly></td>
            </tr>
            <tr>
                <td><label>Đặt cọc: </label></td>
                <td><input type="text" name="contractDeposit" value="${clickedRoom.price}"></td>
            </tr>
            <input type="hidden" name="contractRoomID" value="${clickedRoom.ID}"/>
            <input type="hidden" name="userID" value="${userID}">
        </table>
        <br>

        <h3>Bảng giá dịch vụ</h3><br>

        <table border="1" class="table">
            <tr>
                <td><label>Tiền điện / số</label></td>
                <td><label>Tiền nước / đầu người</label></td>
                <td><label>Tiền vệ sinh / phòng</label></td>
                <td><label>Tiền gửi xe / đầu xe</label></td>
            </tr>
            <tr>
                <td>${providedServiceList.get(0).pricePerUnit}</td>
                <td>${providedServiceList.get(1).pricePerUnit}</td>
                <td>${providedServiceList.get(2).pricePerUnit}</td>
                <td>${providedServiceList.get(3).pricePerUnit}</td>
            </tr>
        </table>
        <br>
        <button class="btn-success">Xác nhận</button>
    </form>
</div>
</body>
</html>
