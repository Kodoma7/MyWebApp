<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Кодома
  Date: 28.08.2017
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Поиск контакта по ID</title>
</head>
<body>
     <h2>Поиск контакта по ID</h2>
     <table>
         <tr>
             <td><b>Имя:</b></td>
             <td><c:out value="${contact.fname}"/></td>
         </tr>
         <tr>
             <td><b>Фамилия:</b></td>
             <td><c:out value="${contact.lname}"/></td>
         </tr>
         <tr>
             <td><b>Адрес:</b></td>
             <td><c:out value="${contact.address}"/></td>
         </tr>
         <tr>
             <td><b>Номер телефона:</b></td>
             <td><c:out value="${contact.phoneNumber}"/></td>
         </tr>
         <tr>
             <td><b>Группа:</b></td>
             <td><c:out value="${contact.groupName}"/></td>
         </tr>
     </table>
</body>
</html>
