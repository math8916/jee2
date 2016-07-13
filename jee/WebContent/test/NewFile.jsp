<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
public int multiply(int a, int b){
	return a*b;
}
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%
int a=3,b=9;
%>
	10*25 = <%= multiply(10,25) %>
</body>
</html>