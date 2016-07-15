<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String ctx = application.getContextPath(); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 아이디 검색 페이지</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
<style>
iframe.ifm {border: none;width: 400px;
	
}
</style>
</head>
<body>
<div>
	회원 이름 검색 페이지<br/>
	<iframe src="image.html" class="ifm" style="border: none"></iframe>
<a  href="<%=ctx %>/main.jsp" ><img src="<%=ctx %>/image/home.jpg" alt="" width="30px" height="30px"  /></a>
<a  href="member_controller.jsp" ><img src="<%=ctx %>/image/member.jpg" alt="" width="30px" height="30px"  /></a>
</div>
</body>
</html>