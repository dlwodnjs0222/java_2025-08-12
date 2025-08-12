<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String str = "람다";
	request.setAttribute("코어", str);// ""안에있는 문자가
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		${코어 }
		${greatherThen = (a,b) -> a > b ? true : false; '' }<br>
		${greatherThen(10, 30) } <!--  문자랑 같아야함 -->
	</body>
</html>