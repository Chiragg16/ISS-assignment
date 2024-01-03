<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
    <form action="regForm" method="post" style="display: flex; flex-direction: column; justify-content: flex-start; width: fit-content">
        <div>
            Username: <input type="text" name="username">
        </div>
        <div>
            Email: <input type="text" name="email">
        </div>
        <div>
            Password: <input type="password" name="password">
        </div>
        <input type="submit" value="Register">
    </form>
    
    <a href="login.jsp">Already have an account? Login</a>
</body>
</html>
