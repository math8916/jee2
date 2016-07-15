<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String ctx = application.getContextPath(); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 아이디 검색 페이지</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
</head>
<body>
<div  class="box">
	회원 성별 검색 페이지<br/>
<a  href="<%=ctx %>/main.jsp" ><img src="<%=application.getContextPath() %>/image/home.jpg" alt="" width="30px" height="30px"  /></a>
<a  href="member_controller.jsp" ><img src="<%=application.getContextPath() %>/image/member.jpg" alt="" width="30px" height="30px"  /></a>
</div>
</body>
</html>