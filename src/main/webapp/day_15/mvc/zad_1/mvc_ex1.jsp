<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 16.10.2022
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/mvc11">
        <label>Write your role: <input type="text" name="role"></label><br/>
        <input type="submit" value="Send">
    </form><br/>
    <hr/>
    <p>Your role:
        <c:if test="${not empty userRole}"><c:out value="${userRole}"/></c:if>
        <c:if test="${empty userRole}">guest</c:if>
    </p>
</body>
</html>
