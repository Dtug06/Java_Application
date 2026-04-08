<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 08/04/2026
  Time: 8:07 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <h1>Đây là trang home</h1>
    <c:forEach items="${listStudents}" var="s">
        <p>ID: <c:out value="${s.id}" /></p>
        <p>Name: <c:out value="${s.fullName}" /></p>
        <p>Age: <c:out value="${s.age}" /></p>
        <p>
            Gender:
            <c:out value="${s.gender ? 'Nam' : 'Nữ'}" />
        </p>
    </c:forEach>
</head>
<body>

</body>
</html>
