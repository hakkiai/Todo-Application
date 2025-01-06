<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
a
{
background-color: #5af6f6;
border:2px solid black;
list-style=none;
}
</style>
<body>
<h1>your todos list</h1><br>
${todos}
<br/>
<a href="add-todo">Add todo</a>
<hr>
${username}<br>
${description}<br>
${targetdate}<br>
</body>
</html>
