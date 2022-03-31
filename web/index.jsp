<%--
  Created by IntelliJ IDEA.
  User: mszydlowski
  Date: 31/03/2022
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html">
        <title>Login Form</title>
    </head>
    <body>
    <h1>Login Form</h1>
    <p>Sample login Example (try with username as "admin" and password as "admin")</p>
    <form action="LoginController" method="post">
        Enter username :<label> <input type="text" name="username"> </label>
     <br>
        Enter password :<label> <input type="password" name="password"> </label><br>
        <input type="submit" value="Login">
    </form>
    </body>
</html>