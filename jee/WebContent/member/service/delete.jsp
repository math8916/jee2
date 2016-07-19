<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	String ctx = application.getContextPath(); %>
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
		회원 비밀번호변경 페이지<br />

		<form action="<%=ctx%>/member/result/delete_result.jsp" method="post">

			<span class="meta">해지할 아이디를 비밀번호입력하세요:</span><input type="pw"
				name="pw" /><br /> <br />
			<br /> <input type="submit" value="확인" /> <input type="reset"
				value="취소" /> <input type="hidden" name="id"
				value="<%=service.getSession().getId()%>" />
		</form>

	</div>
<jsp:include page="../../global/footer.jsp"/>
<jsp:include page="../../global/end.jsp"/>
