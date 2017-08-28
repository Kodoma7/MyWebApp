<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Кодома
  Date: 28.08.2017
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Показать все группы контактов</title>
</head>
  <body>
     <h2>Показать все группы контактов</h2>
     <table>
        <td><b>Группы:</b></td>
        <c:forEach var="group" items="${groupNames}">
          <tr>
              <td><c:out value="${group}"/></td>
          </tr>
        </c:forEach>
     </table>
  </body>
</html>
