<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<form action="${pageContext.request.contextPath}/login" method ="get">
    <table>
        <tr>
            <td>Username: </td>
            <td>
                <label>
                    <input type="text" name="username" placeholder="username">
                </label>
            </td>
        </tr>
        <tr>
            <td>Password: </td>
            <td>
                <label>
                    <input type="password" name="password" placeholder="password">
                </label>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Login">
            </td>
        </tr>
    </table>
</form>
<br/>

</body>
</html>