<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 17.10.2022
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Books</h3>
    <table>
        <thead>
            <th>Title</th>
            <th>Author</th>
            <th>ISBN</th>
        </thead>
        <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.getTitle()}</td>
            <td>${book.author}</td>
            <td>${book.isbn}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
