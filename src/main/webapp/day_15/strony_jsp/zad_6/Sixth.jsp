<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 18.10.2022
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach begin="2" end="11" step="2" var="number">
        ${number}<br/>
    </c:forEach>
</body>
</html>
