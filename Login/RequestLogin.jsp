<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login</title>
	<style type="text/css">
		body {
			text-align: center;
		}
		div {
			background-color: "tomato";
		}
	</style>
</head>
<body>
	<h2>Login page</h2>
	<form action="RequestLoginProc.jsp" method="post">
	<div>
		<input type="text" name="id" placeholder="id를 입력하세요">
	</div>
	<div>
		<input type="text" name="pw" placeholder="비밀번호를 입력하세요">
	</div>
	<div>
		<input type="submit" value="login">
	</div>
	</form>
</body>
</html>
