<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="resources/css/styles.css" type='text/css'>
    <script src="resources/javascript/jquery-3.6.0.min.js"></script>
</head>
<body>
<h1>Login Form</h1>
<p>Sample login Example - try with username as "admin" and password as "admin".</p>
<form id="loginForm" name="loginForm" action="Login" method="post" onsubmit="return checkInput()">
    <label><input type="text" name="username" placeholder="username" min="2" maxlength="12" required></label>
    <label><input type="password" name="password" placeholder="password" min="2" maxlength="12" required></label>
    <input id="submitButton" type="submit" value="Login">
</form>
<div id="errorMessage">
    <p>${errorMessage}</p>
</div>
<input id="btn" class="btn" type="button" value="Run Hello World">
<script src="resources/javascript/index.js"></script>
</body>
</html>

