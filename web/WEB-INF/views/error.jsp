<%--
  Created by IntelliJ IDEA.
  User: lenkasava
  Date: 2019-04-04
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>error</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>

<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>You have no right for this page</h1>
</div>

<div class="w3-container w3-padding">
    <div class="w3-card-4">
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="menu.jsp"></jsp:include>
        <div class="w3-container w3-center w3-green">
            <h2>Please login to continue booking rooms!</h2>
        </div>

    </div>
</div>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href=''">Back to main</button>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
