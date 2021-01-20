<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ethantumbocon
  Date: 1/20/21
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
        }
    }
%>
<html>
<head>
    <title>Log In!!</title>
</head>
<body>
<h1> Log In!</h1>

<form action="/login.jsp", method="post">
    <label for="username">Username</label>
    <input type="email" id="username" name="username" value="bob">
    <label for="password">Password</label>
    <input type="password" id ="password"name="password" value="123!">
    <button type="submit">Submit</button>


</form>
</body>
</html>
