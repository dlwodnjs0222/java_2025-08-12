<%@page import="dto.TinyDTO"%>
<%@page import="dao.TinyDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%
	
%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Tinylist</title>
		<style type="text/css">
			table tr td {
				border: 1px solid black;
				border-collapse: collapse; 
			}
			tr td{
				padding: 10px 20px;
			}
			body button {
				
			}
		</style>
	</head>
	<body>
		<h2>Tiny DAO</h2>
			<table>
				<c:forEach var="dto" items="${list }">
				<tr>
					<td>${dto.num }</td>
					<td>${dto.content }</td>
				</tr>
			</c:forEach>
			</table>
		<button type="button" onclick="location.href='insertFrom'">글쓰기</button>
	</body>
</html>