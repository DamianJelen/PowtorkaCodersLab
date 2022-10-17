<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 17.10.2022
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/mvc13" method="post">
        <label>Title: <input type="text" name="title"></label><br/>
        <label>Author: <input type="text" name="author"></label><br/>
        <label>ISBN: <input type="text" name="isbn"></label><br/>
        <input type="submit" value="Send">
    </form>
</body>
</html>
