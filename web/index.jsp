<%--
  Created by IntelliJ IDEA.
  User: 11910
  Date: 2019/11/26
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/user/login" method="post">
    用户名：<input type="text" name="name">
    密码：<input type="password" name="password">
    <input type="submit"  value="登录">
    <a href="/user/register">注册</a>
  </form>
  </body>
</html>
