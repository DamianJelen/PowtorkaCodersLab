<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 19.10.2022
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${not empty chooseLang}">
        <h4>
            <c:out value="${chooseLang}"/>
        </h4><br/>
    </c:if>
    <form action="/servlet/512" method="post">
        <select name="language">
            <c:forEach items="${lang}" var="element">
            <option value="${element.value}">${element.key}</option>
            </c:forEach>
        </select><br/>
        <input type="submit" value="send">
    </form>
</body>
</html>
