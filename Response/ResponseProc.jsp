<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String dbid="id";
		String dbpw="pw";
		
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		if(dbid.equals(id)&&dbpw.equals(pw)){
			reponse.sendRedirect("ResponseMain.jsp?id="+id);
		} else
		{ %>
		<script>
			alert("error");
			history.go(-1);
		</script>
		<%
		}
	%>
</body>
</html>
