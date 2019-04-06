
<%--
  Created by IntelliJ IDEA.
  User: lenkasava
  Date: 2019-03-31
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
  <%--<head>--%>
    <%--<title>Room Reservation</title>--%>
  <%--</head>--%>
  <%--<body>--%>
    <%--<h2>--%>
      <%--Hello Clients! <br/>--%>
    <%--</h2>--%>

    <%--<br/>--%>
      <%--<a href="${pageContext.request.contextPath}/login.jsp">Login</a>--%>
        <%--<br>--%>
          <%--<a href="${pageContext.request.contextPath}/api/students">RoomsList</a>--%>
        <%--<br>--%>
    <%--<a href="${pageContext.request.contextPath}/api/exception">Exception</a>--%>
  <%--<br>--%>

  <%--</body>--%>
<%--</html>--%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Room Reservation!</title>
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>

<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
  <h1>Room Reservation!</h1>
</div>

<div class="w3-container w3-center">
  <div class="w3-bar w3-padding-large w3-padding-24">
    <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/api/registration'">Registration</button>
    <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/api/login'">Login</button>
  </div>
</div>
</body>
</html>