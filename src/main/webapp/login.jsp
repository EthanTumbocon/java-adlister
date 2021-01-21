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
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<head>
    <%@include file="partials/head.jsp"%>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
<h1> Log In!</h1>

<form action="/login.jsp", method="post">
    <label for="username">Username</label>
    <input type="text" id="username" name="username" placeholder="Username">
    <label for="password">Password</label>
    <input type="password" id ="password"name="password" placeholder="password">
    <button type="submit">Submit</button>

<%@include file="partials/footer.jsp"%>
</form>
</body>
</html>
