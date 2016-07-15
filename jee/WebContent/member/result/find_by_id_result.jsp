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
<title>회원ID 검색 페이지</title>
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
<%
	MemberService service =MemberServiceImpl.getInstance();
	MemberBean member = new MemberBean();
	
	String id = request.getParameter("id");
	
	member.setId(id);
	if( service.findByID(id).getId() != ""){
		%>
		
	<table id="member_detail">
		<tr>
			<td rowspan="3" style="width: 30%;">
			<img src="<%=ctx %>/image/javafatherface.jpg" alt="" width=100% height=100% /></td>
			<td style="width: 20%; " class="font_bold bg_color_yellow">ID</td>
			<td style="width: 40%;"><%= service.findByID(id).getId() %></td>
		</tr>
		<tr>
			
			<td class="font_bold bg_color_yellow">이 름</td>
			<td><%=service.findByID(id).getName() %></td>
		</tr>
		<tr>
			
			<td class="font_bold bg_color_yellow">성 별</td>
			<td><%= service.findByID(id).getGender() %></td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">생년월일</td>
			<td colspan="2"><%= service.findByID(id).getSsn() %></td>
		</tr>
		<tr>
			<td class="font_bold bg_color_yellow">등록일</td>
			<td colspan="2"><%= service.findByID(id).getReg() %></td>
		</tr>
	</table>
	<%} else{ %>
	<h2>아이디가 없음!!</h2>
					<a href="<%=ctx %>/member/service/findByID.jsp">다시 아이디 입력 하시겠습니까?</a>
	<%}  %>
	<a  href="<%=ctx %>/global/main.jsp" ><img src="<%=ctx %>/image/home.jpg" alt="" width="30px" height="30px"  /></a>
	<a  href="member_controller.jsp" ><img src="<%=ctx %>/image/member.jpg" alt="" width="30px" height="30px"  /></a>
	</div>
</body>
</html>