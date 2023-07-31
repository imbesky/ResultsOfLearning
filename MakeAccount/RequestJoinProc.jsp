<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<style>
 h4{
 border: 1px solid black;
 }
</style>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>Account</h2>
	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String pwch = request.getParameter("pwch");
	String email = request.getParameter("email");
	String num = request.getParameter("num");
	
	//체크박스 받는 법
	String[] agree = request.getParameterValues("agree");
	
	String age = request.getParameter("age");
	String info = request.getParameter("info");

	if(!pw.equals(pwch)){
	%>
	<script>
	alert("password check error");
	history.go(-1);//이전 페이지로 이동
	</script>
	<%
	}
	%>
	<div>
	<h4>id: <%= id %></h4>
	<h4>pw: <%= pw %></h4>
	<h4>email: <%= email %></h4>
	<h4>number: <%= num %></h4>
	<h4>agree: 
	<% for(int i=0; i<agree.length; i++)
	{out.write(agree[i]);
	}%></h4>
	<h4>age: <%= age %></h4>
	<h4>info: <%= info %></h4>
	</div>
</body>
</html>
