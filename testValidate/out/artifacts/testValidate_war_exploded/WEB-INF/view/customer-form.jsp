<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="FORM" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: peegh
  Date: 3/7/2020
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>customer form</title>
</head>
<style>
    .error {
        color: red
    }
</style>
<body>
<a href="${pageContext.request.contextPath}/">main menu</a>
<hr>
<form:form modelAttribute="customer" action="processForm" method="post">
    first name <form:input path="firstName" title="first name" placeholder="first name"/>
    <form:errors path="firstName" cssClass="error"/>
    <br>
    last name <form:input path="lastName" title="last name"/>
    <br>
    age : <form:select path="age">
    <form:options items="${customer.ages}"/>
</form:select>
    <form:errors path="age" cssClass="error"/>
    <br>
    password <form:input path="password" type="password"/>
    <form:errors path="password" cssClass="error"/>
    <br>
    <form:input path="facultyCode"/>
    <form:errors path="facultyCode" cssClass="error"/>
    <br>
    <input type="submit">
</form:form>
</body>
</html>
