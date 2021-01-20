<%--
  Created by IntelliJ IDEA.
  User: ethantumbocon
  Date: 1/19/21
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int pageNumber = 1; %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
<h1>Hello Jupiter!</h1>
<%--testing!!--%>
<!--123!-->
<p>The page number is: <%=pageNumber %></p>

<form action="user-profile,jsp" method="get">
    <label for="username">Username</label>
   <input type="hidden" id="username" name="username" value="bob">

    <input type="hidden" id ="lastname"name="lastname" value="Z">
    <button type="submit">Go there.</button>
</form>
<%@include file="partials/footer.jsp"%>
</body>
</html>
