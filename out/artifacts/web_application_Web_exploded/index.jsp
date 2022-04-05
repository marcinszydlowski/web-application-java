<jsp:useBean id="errorMessage" scope="request" type="Java"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
    <link rel="stylesheet" href="resources/css/styles.css" type='text/css'>
</head>
<body>
    <h1>Login Form</h1>
    <p>Sample login Example - try with username as "admin" and password as "admin".</p>
    <form id="loginForm" name="loginForm" action="Login" method="post" onsubmit="return checkInput()">
        <p>Enter your Username :</p>
        <label><input type="text" name="username" placeholder="username" min="2" maxlength="12" required></label>
        <p>Enter your Password :</p>
        <label><input type="password" name="password" placeholder="password" min="2" maxlength="12" required></label>
        <input id="submitButton" type="submit" value="Login">
    </form>
    <div id="errorMessage">
        <p>${errorMessage}</p>
    </div>
    <script src="resources/javascript/index.js"></script>
</body>
</html>

