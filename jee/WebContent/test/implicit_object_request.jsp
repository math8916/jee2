<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Implicit object :request</title>
</head>
<body>
	요청 URI:<%= request.getRequestURI() %>
	요청 컨텍스트:<%= request.getContextPath() %>
</body>
</html>