<%--
  Created by IntelliJ IDEA.
  User: artem
  Date: 13.09.2023
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tennis Simulator</title>
    <style>
        <%@include file="createMatchStyle.css" %>
    </style>
</head>
<body>
<div class="box">
    <form action="new-match" method="post">
        <div class="firstInput">
            Имя первого Игрока:<input type="text" id="first" placeholder="введите имя..." name="player1" required> <br>
        </div>
        <div class="secondInput">
            Имя второго Игрока:<input type="text" placeholder="введите имя..." name="player2" required><br>
        </div>
        <div>
            <button class="button">Начать Матч</button>
        </div>
    </form>
</div>
</body>
</html>
