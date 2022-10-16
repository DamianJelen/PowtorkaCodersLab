<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 16.10.2022
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Start: ${start}
    <br/>
    End: ${end}
    <br/>
    <c:forEach begin="${start}" end="${end}" var="num">
        ${num} <br/>
    </c:forEach>
</body>
</html>
