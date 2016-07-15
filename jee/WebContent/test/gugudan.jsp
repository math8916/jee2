<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<% for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
				int result =i*j;
				%>
					<%=j%>x  <%=i%> = <%=i*j%>
					<%
			}%><br>
		<%}%>
		<br>
		<br>
		<%	for (int i = 1; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				int result =i*j;
				%>
					<%=j%>x  <%=i%> = <%=i*j%>
					<%}%><br>
		<%}%>
</body>
</html>
