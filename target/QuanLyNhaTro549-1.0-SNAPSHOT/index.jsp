<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Đăng nhập</title>
    <link href="bootstrap/bootstrap.4.0.0.min.css" rel="stylesheet">
    <script type="text/javascript" src="bootstrap/bootstrap.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.2.1.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.2.1.slim.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/popper.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="bootstrap/jquery-3.6.0.js" crossorigin="anonymous"></script>
</head>
<body>

<div class="container-fluid">
    <div class="text-center">
        <h1>Đăng nhập</h1>
        <br><br>
        <form class="form-group" action="<c:url value="/UserServlet549" />" method="post">
            <input type="hidden" name="action" value="login">
            <div>
                <label>username: </label><input type="text" name="username">
            </div>
            <div>
                <label>password: </label><input type="password" name="password">
            </div>
            <div>
                <button class="btn-success">
                    Đăng nhập
                </button>
            </div>
        </form>

    </div>
</div>

</body>
</html>