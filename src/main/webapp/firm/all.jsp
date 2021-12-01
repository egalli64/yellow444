<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Firms</title>
<link rel="icon" href="data:;base64,=">
<link rel="stylesheet" type="text/css" href="/yellow/css/basic.css">
</head>
<body>
    <h1>Firms</h1>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
        </tr>
        <c:forEach var="firm" items="${firms}">
            <tr>
                <td>${firm.id}</td>
                <td>${firm.name}</td>
            </tr>
        </c:forEach>
    </table>
    <p>
        Back <a href="/yellow/index.html">home</a>
    </p>
</body>
</html>