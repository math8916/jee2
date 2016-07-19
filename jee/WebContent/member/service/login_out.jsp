<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	String ctx = application.getContextPath();%>
<%@ page import="member.MemberBean"%>
<%@ page import="member.MemberService"%>
<%@ page import="member.MemberServiceImpl"%>
<jsp:include page="../../global/top.jsp"/>
<jsp:include page="../../global/header.jsp"/>
<jsp:include page="../../global/nav.jsp"/>
<div class="box">
		<%
			MemberService service = MemberServiceImpl.getInstance();
			MemberBean member = new MemberBean();
		%>
		<form action="<%=ctx%>/member/result/logout_result.jsp" method="post">

			<input type="hidden" name="id"
				value="<%service.getSession().getId();%>" /> <input type="hidden"
				name="pw" value="<%service.getSession().getPw();%>" /> <input
				type="submit" value="로그아웃" /> <input type="reset" value="취소" />

		</form>

	</div>
<jsp:include page="../../global/footer.jsp"/>
<jsp:include page="../../global/end.jsp"/>
