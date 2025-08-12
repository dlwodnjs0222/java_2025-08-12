<%@page import="dto.TinyDTO"%>
<%@page import="dao.TinyDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	TinyDAO dao = new TinyDAO();
	List<TinyDTO> list =  dao.selectList();
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
			<%
				for(TinyDTO dto : list) {
			%>
				<tr>
					<td><%=dto.getNum() %></td>
					<td><%=dto.getContent() %>
				</tr>
			<% 		
				}
			%>	
			</table>
		<button type="button" onclick="location.href='insertFrom.jsp'">글쓰기</button>
	</body>
</html>