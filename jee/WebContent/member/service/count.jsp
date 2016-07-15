<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <% String ctx = application.getContextPath(); %> 
     <%@ page import="member.MemberBean" %>
   <%@ page import="member.MemberService" %>
   <%@ page import="member.MemberServiceImpl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원수  페이지</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
</head>
<body>
<div  class="box">
	회원수 페이지<br/>
	<%
	MemberService service =MemberServiceImpl.getInstance();
	MemberBean member = new MemberBean();
			
	int count = service.count();
	out.print(count);
	%>
	<h1>회원 수는 : <%=count %></h1>
	
<a  href="<%=ctx %>/main.jsp" ><img src="<%=ctx %>/image/home.jpg" alt="" width="30px" height="30px"  /></a>
<a  href="member_controller.jsp" ><img src="<%=ctx %>/image/member.jpg" alt="" width="30px" height="30px"  /></a>

</div>
</body>
</html>