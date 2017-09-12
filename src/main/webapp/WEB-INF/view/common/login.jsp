<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/10
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户验证</title>
</head>
<body>

<h1>Login</h1>

<div id="login-error">${error}</div>

<form action="../j_spring_security_check" method="post">

    <p>
        <label for="j_username">用户名:</label> <input id="j_username"
                                                        name="j_username" type="text" />
    </p>

    <p>
        <label for="j_password">密  码:</label> <input id="j_password"
                                                        name="j_password" type="password" />
    </p>

    <input type="submit" value="登录" />

</form>

</body>
</html>
