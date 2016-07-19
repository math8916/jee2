<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%	String ctx = application.getContextPath();%>
<%@ page import="member.MemberBean"%>
<%@ page import="member.MemberService"%>
<%@ page import="member.MemberServiceImpl"%>
<jsp:include page="../../global/top.jsp"/>
<jsp:include page="../../global/header.jsp"/>
<jsp:include page="../../global/nav.jsp"/>
<%
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = service.findByID(request.getParameter("id"));

		String pw = request.getParameter("pw");
		String email = request.getParameter("email");

		member.setPw(pw);
		member.setEmail(email);
		service.update(member);

		response.sendRedirect(ctx + "/member/service/detail.jsp");
	%>
	<input type="hidden" name="id"
		value="<%=service.getSession().getId()%>" />
	<div>
		<br />정보가 변경 되었습니다 <a href="<%=ctx%>/index.jsp"><img
			src="<%=ctx%>/image/home.jpg" alt="" width="30px" height="30px" /></a>
		<a href="<%=ctx%>/member/service/member_controller.jsp"><img
			src="<%=ctx%>/image/member.jpg" alt="" width="30px" height="30px" /></a>

	</div>
<jsp:include page="../../global/footer.jsp"/>
<jsp:include page="../../global/end.jsp"/>
