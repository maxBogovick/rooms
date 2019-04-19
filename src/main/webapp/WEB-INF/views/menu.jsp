<%--
  Created by IntelliJ IDEA.
  User: lenkasava
  Date: 2019-04-08
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div style="padding: 5px;">

    <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/api/info_page'">About Hotel</button>
    |
    <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/api/room_list'">Room List</button>
    |
    <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/api/admin_home_list'">Admin Room List</button>
    |
    <%--<a href="${pageContext.request.contextPath}/userInfo">My Account Info</a>--%>
    <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/api/user_home_page'">My Account Info</button>

    |
    <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/api/log_out'">Logout</button>

</div>
