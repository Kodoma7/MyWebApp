<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Кодома
  Date: 29.08.2017
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Просмотр контактов</title>
</head>
<body>
<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Address</th>
        <th>Phone Number</th>
        <th>Group Name</th>
    </tr>
    <c:forEach var="contact" items="${listContacts}">
        <tr>
            <td><c:out value="${contact.fname}"/></td>
            <td><c:out value="${contact.lname}"/></td>
            <td><c:out value="${contact.address}"/></td>
            <td><c:out value="${contact.phoneNumber}"/></td>
            <td><c:out value="${contact.groupName}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
