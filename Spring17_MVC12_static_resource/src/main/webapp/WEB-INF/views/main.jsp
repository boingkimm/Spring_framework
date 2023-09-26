<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/test.js"></script>
<link rel="stylesheet" type="text/css" href="css/test.css">
</head>
<body>
<h1>static resource 실습</h1>
jsp에서 리소스(image, js, css, ... ) 접근 불가(WEB-INF)<br>
=> 접근 가능하도록 static resources 설정 <br>

<img src="xxx/happy.png" width="100" height="100"/><br>
<button onclick="fun()">OK</button>
</body>
</html>