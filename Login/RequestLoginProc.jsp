<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- RequestLogin에서 받아 온 정보를 읽어들여야 함 -->
	
	<%
		// 사용자의 정보가 저장되어 있는 객체: request 객체
		String id = request.getParameter("id"); // 사용자 정보추출
		String pw = request.getParameter("pw");
	%>
	<h2>your id: <%= id %></h2>
	<h2>your pw: <%= pw %></h2>
	<%
		boolean log;
		if(id.equals("id")&&pw.equals("pw"))
			log = true;
		else
			log = false;
	%>
	<h2>login: <%= log %></h2>
</body>
</html>
