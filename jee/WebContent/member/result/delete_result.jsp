<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	String ctx = application.getContextPath();%>
<%@ page import="member.MemberBean"%>
<%@ page import="member.MemberService"%>
<%@ page import="member.MemberServiceImpl"%>
<jsp:include page="../../global/top.jsp"/>
<jsp:include page="../../global/header.jsp"/>
<jsp:include page="../../global/nav.jsp"/>
<body>
	<%
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		member.setId(id);
		member.setPw(pw);
		service.delete(member);
		response.sendRedirect(ctx + "/index.jsp");
	%>

	<div>
		<br />해지 되었습니다
	</div>
<jsp:include page="../../global/footer.jsp"/>
<jsp:include page="../../global/end.jsp"/>
