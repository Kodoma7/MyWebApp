<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
         <h2>Start page</h2>
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

