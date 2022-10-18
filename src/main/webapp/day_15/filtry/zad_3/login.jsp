<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 17.10.2022
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${not empty badLog}">${badLog}</c:if>
    <form action="/login" method="post">
        <input type="text"  name="username"/>
        <input name="password" type="password"/>
        <button type="submit">Zaloguj</button>
    </form>
</body>
</html>
