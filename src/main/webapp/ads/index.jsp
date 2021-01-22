<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ethantumbocon
  Date: 1/22/21
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Here are all the products: </h1>

<c:forEach var="ad" items="${ads}">
    <div class="product">
        <p>${ad.id}</p>
        <h2>${ad.title}</h2>
        <p>${ad.userId}</p>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
