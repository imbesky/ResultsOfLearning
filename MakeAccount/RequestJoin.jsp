<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	h2 {
	align-text: center;
	}
	form {
	display: grid;
	justify-content: center;
	align-items: center;
	grid-template-columns: 15% 20% 50% 15%;
	grid-template-rows: repeat(8,minmax(10px, auto));
	}
	label{
	grid-column: 2 / 3;
	}
	div{
	grid-column: 2 / 4;
	border: 1px solid powderblue;
	}
</style>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>make new account</h2>
	<form action="RequestJoinProc.jsp" method="post">
		<div>
			<label>ID</label>
			<input type="text" name="id" size="20">
		</div>
		<div>
			<label>Password</label>
			<input type="password" name="pw" size="20">
		</div>
		<div>
			<label>Password check</label>
			<input type="password" name="pwch" size="20">
		</div>
		<div>
			<label>E-mail</label>
			<input type="email" name="email" size="20">
		</div>
		<div>
			<label>Number</label>
			<input type="tel" name="num" size="20">
		</div>
		<div>
			<h4>Agreements</h4>
			<input type="checkbox" name="agree" value="agree1">1
			<input type="checkbox" name="agree" value="agree2">2
			<input type="checkbox" name="agree" value="agree3">3
			<input type="checkbox" name="agree" value="agree4">4
		</div>
		<div>
			<h4>Your age</h4>
			<select name="age">
			<option vlaue="under">under 18</option>
			<option value="over">over 18</option>
			</select>
		</div>
		<div>
			<h4>Something to say</h4>
			<textarea name="info" row="5" cols="20">
			</textarea>
		</div>
		<div>
			<input type="reset" value="reset">
			<input type="submit" value="submit">
		</div>
	</form>
</body>
</html>
