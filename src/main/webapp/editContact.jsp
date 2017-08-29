<%--
  Created by IntelliJ IDEA.
  User: Кодома
  Date: 29.08.2017
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Редактирование контакта</title>
</head>
   <body>
   <h2>Авторизация</h2>
   <form method="post" action="/validate">
       <table>
           <tr>
               <td>Имя</td>
               <td><input type="text" name="firstName"></td>
           </tr>
           <tr>
               <td>Пароль</td>
               <td><input type="text" name="password"></td>
           </tr>
           <tr>
               <td align="right" colspan="2"><input type="submit" value="Войти"></td>
           </tr>
       </table>
   </form>
   </body>
</html>
