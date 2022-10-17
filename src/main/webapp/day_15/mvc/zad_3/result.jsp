<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 17.10.2022
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Object book:<br/>
    Title: <c:out value="${book.title}"/><br/>
    Author: ${book.getAuthor()}<br/>
    ISBN: ${book.isbn}
</body>
</html>
