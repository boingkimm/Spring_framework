<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>dept 부서 등록 화면</h1>
<form action="deptAdd" method="post">
부서번호:<input type="text" name="deptno"><br>
부서명:<input type="text" name="dname"><br>
부서위치:<input type="text" name="loc"><br>
<input type="submit" value="저장">
</form>
</body>
</html>



