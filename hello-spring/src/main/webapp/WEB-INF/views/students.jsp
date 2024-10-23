<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Students List</title>
</head>
<body>
<h1>Students List</h1>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Grade</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.name}</td>
            <td>${student.grade}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
