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
<title>회원 비밀번호변경 페이지</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
</head>
<body>
<%
	MemberService service =MemberServiceImpl.getInstance();
	MemberBean member = new MemberBean();
	
	
	String pw = request.getParameter("pw");
	
	member.setId(service.getSession().getId());
	member.setPw(pw);
	String name = service.update(member);
	out.print(name);
	
	%>
	<div> <br/>비밀번호가 변경 되었습니다
	<a  href="<%= ctx %>/index.jsp" ><img src="<%= ctx %>/image/home.jpg" alt="" width="30px" height="30px"  /></a>
<a  href="<%= ctx %>/member/service/member_controller.jsp" ><img src="<%= ctx %>/image/member.jpg" alt="" width="30px" height="30px"  /></a>

	</div>
	<jsp:include page="/global/footer.jsp"/>
	


</body>
</html>