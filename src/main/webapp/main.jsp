<%@ page contentType="text/html; charset=utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <head>
    <title>Список студентов</title>
  </head>
  <body>
      <div class="title">
        <p><span class="pink">L</span>ist of <span class="pink">S</span>tudents</p>
      </div>
      <form method="post" action="/editContact">
      <table>
          <tr>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Address</th>
              <th>Phone Number</th>
              <th>Group Name</th>
              <th>&nbsp;</th>
          </tr>
          <c:forEach var="contact" items="${listContacts}">
              <tr>
                  <td><c:out value="${contact.fname}"/></td>
                  <td><c:out value="${contact.lname}"/></td>
                  <td><c:out value="${contact.address}"/></td>
                  <td><c:out value="${contact.phoneNumber}"/></td>
                  <td><c:out value="${contact.groupName}"/></td>
                  <td><button type="submit" name="Edit" value="${contact.id}, ${contact.fname}, ${contact.lname}, ${contact.address}, ${contact.phoneNumber}, ${contact.groupName}">edit</button></td>
              </tr>
          </c:forEach>
      </table>
      <table>
          <tr>
              <td><input type="submit" value="Add" name="Add"/></td>
              <td><input type="submit" value="Edit" name="Edit"/></td>
              <td><input type="submit" value="Delete" name="Delete"/></td>
          </tr>
      </table>
      </form>
  </body>
</html>