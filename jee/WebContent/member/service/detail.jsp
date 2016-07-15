<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberBean" %>
   <%@ page import="member.MemberService" %>
   <%@ page import="member.MemberServiceImpl" %>
     <% String ctx = application.getContextPath(); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세정보</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
<style>
	#member_detail{border: 1px solid gray; width: 90%;height: 400px;margin:0  auto;border-collapse:collapse;  }
	#member_detail tr{border: 1px solid gray;height: 20%;}
	#member_detail tr td{border: 1px solid gray;}
	.font_bold {font-weight: bold;}
	.bg_color_yellow{background-color: yellow}
</style>
</head>
<body>

<div class="box">
<!--  id,birth,name,reg,gender,profileImg -->
<h2>	회원상세 정보<br/></h2>
<embed src="<%=ctx %>/image/tank_banner.gif" width=50%; height=50%>
<%
	MemberService service =MemberServiceImpl.getInstance();
	MemberBean member = new MemberBean(); 
	
	if( service.getSession().getId() != ""){
	%>
	
<table id="member_detail">
	<tr>
		<td rowspan="4" style="width: 30%;">
		<img src="<%=ctx %>/image/javafatherface.jpg" alt="" width=100% height=100% /></td>
		<td style="width: 20%; " class="font_bold bg_color_yellow">ID</td>
		<td style="width: 40%;"><%= service.getSession().getId() %></td>
	</tr>
	<tr>
		
		<td class="font_bold bg_color_yellow">이 름</td>
		<td><%=service.getSession().getName() %></td>
	</tr>
	<tr>
		
		<td class="font_bold bg_color_yellow">성 별</td>
		<td><%= service.getSession().getGender() %></td>
	</tr>
	<tr>
		<td class="font_bold bg_color_yellow">이메일</td>
		<td><%= service.getSession().getEmail() %></td>
	</tr>
	<tr>
		<td class="font_bold bg_color_yellow">생년월일</td>
		<td colspan="2"><%= service.getSession().getSsn() %></td>
	</tr>
	<tr>
		<td class="font_bold bg_color_yellow">등록일</td>
		<td colspan="2"><%= service.getSession().getReg() %></td>
	</tr>
</table>
<%} else{ %>
<h2>로그인을 하시오!!</h2>
				<a href="<%=ctx %>/member/service/login.jsp">다시 로그인 하시겠습니까?</a>
<%}  %>
<a  href="<%=ctx %>/global/main.jsp" ><img src="<%=ctx %>/image/home.jpg" alt="" width="30px" height="30px"  /></a>
<a  href="member_controller.jsp" ><img src="<%=ctx %>/image/member.jpg" alt="" width="30px" height="30px"  /></a>
</div>
</body>
</html>