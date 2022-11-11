<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/2/2022
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Quản lý</title>
    <link href="bootstrap/bootstrap.4.0.0.min.css" rel="stylesheet">
    <script type="text/javascript" src="bootstrap/bootstrap.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.2.1.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.2.1.slim.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/popper.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.6.0.js" crossorigin="anonymous"></script>
</head>
<body>

<div class="text-center">
    <h1>Người dùng: ${user.username}</h1><br>

    <form action="<c:url value="MiddleServlet549"/>" method="post">
        <input type="hidden" name="userID" value="${user.ID}">
        <div>
            <input type="hidden" name="action" value="searchFreeRoom">
            <button class="btn-primary">Tìm phòng trống</button>
        </div>
    </form>

    <div>
        <button class="btn-primary">Lập hóa đơn theo tháng</button>
    </div>
    <br>

    <div>
        <button class="btn-primary">Thanh toán hóa đơn</button>
    </div>
    <br>

    <div>
        <button class="btn-primary">Thống kê khách hàng theo dư nợ</button>
    </div>
    <br>

    <div>
        <button class="btn-primary">Thống kê doanh thu</button>
    </div>


</div>

</body>
</html>
