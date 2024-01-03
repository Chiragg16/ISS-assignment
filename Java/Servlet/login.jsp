<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
    <form action="loginForm" method="post" style="display: flex; flex-direction: column; justify-content: flex-start; width: fit-content">
        <div>
            Email: <input type="text" name="email">
        </div>
        <div>
            Password: <input type="password" name="password">
        </div>
        <input type="submit" value="Login">
    </form>
    
    <a href="register.jsp">New User? <br>Create an Account</a>
</body>
</html>
