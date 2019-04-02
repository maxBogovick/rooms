<%--
  Created by IntelliJ IDEA.
  User: lenkasava
  Date: 2019-04-02
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h2>
    Please login! <br/>

</h2>

<br/>

<br>
<form method="GET" action="${pageContext.request.contextPath}/api/user-login">
    <input type="text" name="name"/><br>
    <input type="password" name = "pass"/><br>
    <input type="submit"/>
</form>

</body>
</html>
