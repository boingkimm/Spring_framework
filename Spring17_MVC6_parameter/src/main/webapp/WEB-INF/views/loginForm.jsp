<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
loginForm.jsp
<h3>GET방식 로그인 화면</h3>
<form action="login" method="get">
아이디:<input type="text" name="userid"><br>
비번:<input type="text" name="passwd"><br>
<input type="submit" value="로그인">
</form>

<h3>POST방식 로그인 화면</h3>
<form action="login" method="post">
아이디:<input type="text" name="userid"><br>
비번:<input type="text" name="passwd"><br>
<input type="submit" value="로그인">
</form>

</body>
</html>