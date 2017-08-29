<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h2>Ввод данных</h2>
<form method="post" action="/editContact">
    <table>
        <tr>
            <td>Имя</td>
            <td><input type="text" name="firstName"></td>
        </tr>
        <tr>
            <td>Фамилия</td>
            <td><input type="text" name="lastName"></td>
        </tr>
        <tr>
            <td>Адрес</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td>Номер телефона</td>
            <td><input type="text" name="phoneNumber"></td>
        </tr>
        <tr>
            <td>Название группы</td>
            <td><input type="text" name="groupName"></td>
        </tr>
        <tr>
            <td><button type="submit" name="Ok" value="ok">Ok</button></td>
        </tr>
    </table>
</form>
</body>
</html>
