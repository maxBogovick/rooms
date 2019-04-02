<%--
  Created by IntelliJ IDEA.
  User: lenkasava
  Date: 2019-03-31
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Room Reservation</title>
  </head>
  <body>
  <h2>
    Room reservation! <br/>

  </h2>

  <br/>

  <br>
  <form method="GET" action="${pageContext.request.contextPath}/api/teacher-login">
    <input type="text" name="name"/><br>
    <input type="password" name = "pass"/><br>
    <input type="submit"/>
  </form>

  </body>
</html>
