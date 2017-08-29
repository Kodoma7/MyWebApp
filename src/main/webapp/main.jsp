<%@ page contentType="text/html; charset=utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <head>
    <title>Список контактов</title>
  </head>
  <body>
      <div class="title">
        <p>Список контактов</p>
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
              <th>&nbsp;</th>
          </tr>
          <c:forEach var="contact" items="${listContacts}">
              <tr>
                  <td><c:out value="${contact.fname}"/></td>
                  <td><c:out value="${contact.lname}"/></td>
                  <td><c:out value="${contact.address}"/></td>
                  <td><c:out value="${contact.phoneNumber}"/></td>
                  <td><c:out value="${contact.groupName}"/></td>
                  <td>
                  <p><select name="take">
                      <option value="Edit"> Редактировать контакт </option>
                      <option value="Remove"> Удалить контакт </option>
                  </select></p>
                  </td>
                  <td><button type="submit" name="Ok" value="${contact.id}">Ok</button></td>
              </tr>
          </c:forEach>
      </table>
      </form>

      <form action="/addContact" method="post">
          <input type="submit" value="Add"
                 name="Add" id="frm1_submit" />
      </form>

      <form method="post" action="/showInformation">
          <b>Найти контакт по ID</b>
          <table>
              <tr>
                  <td>Введите id</td>
                  <td><input type="text" name="ID"></td>
              </tr>
              <tr>
                  <td><input type="submit" value="Найти"></td>
              </tr>
          </table>
      </form>

      <form method="post" action="/showInformation">
          <b>Найти контакт по имени</b>
          <table>
              <tr>
                  <td>Введите имя</td>
                  <td><input type="text" name="Name"></td>
              </tr>
              <tr>
                  <td><input type="submit" value="Найти" name="123"></td>
              </tr>
          </table>
      </form>

      <form method="post" action="/showInformation">
          <b>Отобразить список всех групп</b>
          <table>
              <tr>
                  <td><button type="submit" name="Show" value="Show">Показать</button></td>
              </tr>
          </table>
      </form>

      <form method="post" action="/showInformation">
          <b>Найти контакты определенной группы</b>
          <table>
              <tr>
                  <td>Введите название группы</td>
                  <td><input type="text" name="NameOfGroup"></td>
              </tr>
              <tr>
                  <td><input type="submit" value="Найти" name="ShowContactsOfGroup"></td>
              </tr>
          </table>
      </form>

  </body>
</html>
