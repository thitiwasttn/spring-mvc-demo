<%--
  Created by IntelliJ IDEA.
  User: peegh
  Date: 3/7/2020
  Time: 5:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>customer process</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/" >main menu</a>
<hr>
<p>
    <h1 style="color: green">
    customer
    <br>
    ${customer.toString()}
</h1>
</p>
</body>
</html>
