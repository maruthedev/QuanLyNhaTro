<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/2/2022
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Tìm phòng trống</title>
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
        width: 40%;
        margin: auto;
    }
</style>

<script>
    sessionStorage.removeItem('room');
</script>

<div class="text-center">
    <h1>Tìm phòng trống</h1>
    <form class="form-group" action="<c:url value="/RoomServlet549"/>" method="post">
        <input type="hidden" name="action" value="searchFreeRoom">
        <input type="hidden" name="userID" value="${userID}">
        <div>
            <label>Ngày muốn bắt đầu ở: </label>
            <input type="date" name="roomDateCondition" value="2022-11-02"/>
        </div>
        <div>
            <label>Mức giá mong muốn: </label>
            <input type="text" name="roomPriceCondition" value="0"/>
        </div>
        <div>
            <button class="btn-success">Tìm kiếm</button>
        </div>
    </form>

    <table border="1" class="table">
        <thead>
        <tr>
            <td>Phòng</td>
            <td>Tầng</td>
            <td>Loại phòng</td>
            <td>Giá</td>
            <td>Trạng thái</td>
            <td>Hành động</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="i" items="${rooms}" varStatus="status">
            <tr>
                <form action="<c:url value="RoomServlet549"/>" method="post">
                    <input type="hidden" name="action" value="clickRoom">
                    <input type="hidden" name="clickedRoomID" value="${i.ID}">
                    <input type="hidden" name="arrivalDate" value="${arrivalDate}">
                    <input type="hidden" name="userID" value="${userID}">
                    <td><input type="text" name="clickedRoomName" value="${i.name}" readonly></td>
                    <td><input type="text" name="clickedRoomFloor" value="${i.floor}" readonly></td>
                    <td><input type="text" name="clickedRoomType" value="${i.type}" readonly></td>
                    <td><input type="text" name="clickedRoomPrice" value="${i.price}" readonly></td>
                    <td><input type="text" name="clickedRoomStatus" value="${i.status}" readonly></td>
                    <td>
                        <button class="btn-primary">Đặt</button>
                    </td>
                </form>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
