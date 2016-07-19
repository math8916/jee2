<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	request.setCharacterEncoding("UTF-8");%>
<%@ page import="member.MemberBean"%>
<%@ page import="member.MemberService"%>
<%@ page import="member.MemberServiceImpl"%>
<%	String ctx = application.getContextPath();%>
<jsp:include page="../../global/top.jsp"/>
<jsp:include page="../../global/header.jsp"/>
<jsp:include page="../../global/nav.jsp"/>
<style>
h1 {
	color: blue;
}

h5 {
	border: 1px solid gray;
	width: 500px;
	margin: 0 auto;
}

p {
	color: red;
}

span.meta {
	width: 200px;
	background-color: yellow;
	float: left
}

div.box {
	border: 1px solid black;
	width: 500px;
	margin: 0 auto;
}

input {
	size: 10;
	margin: 10 left;
}
</style>
<div class="box">
		<%
			MemberService service = MemberServiceImpl.getInstance();
			MemberBean member = new MemberBean();

			String name = request.getParameter("name");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String ssn = request.getParameter("ssn");
			String email = request.getParameter("email");
			member.setId(id);
			member.setPw(pw);
			member.setName(name);
			member.setSsn(ssn);
			member.setEmail(email);
			member.setReg();
			name = service.regist(member);
			out.print(name);
			if (name == "") {
		%>
		<h2>사용된 아이디가 중복 되어습니다. 다시 가입하시겠습니까?</h2>
		<a href="<%=ctx%>/member/service/regsit.jsp">다시 로그인 하시겠습니까?</a>
		<%
			} else {
		%>

		<span class="meta">이름:</span><%=request.getParameter("name")%><br />
		<span class="meta">ID:</span><%=request.getParameter("id")%><br /> <span
			class="meta">비밀번호:</span><%=request.getParameter("pw")%><br /> <span
			class="meta">SSN:</span><%=request.getParameter("ssn")%><br /> <span
			class="meta">전공:</span><%=request.getParameter("major")%><br /> <span
			class="meta">수강과목:</span>
		<%
			String[] subjects = request.getParameterValues("subject");
				if (subjects != null) {
					for (int i = 0; i < subjects.length; i++) {
		%><%=subjects[i]%><br />
		<%
			}
				}
		%>
		<br /> 회원 가입을 축하합니다
		<%=request.getParameter("name")%>
		님......
		<%
			}
		%>
		<a href="<%=ctx%>/index.jsp"><img
			src="<%=ctx%>/image/home.jpg" alt="" width="30px" height="30px" /></a>
		<a href="<%=ctx%>/member/service/member_controller.jsp"><img
			src="<%=ctx%>/image/member.jpg" alt="" width="30px" height="30px" /></a>

	</div>
<jsp:include page="../../global/footer.jsp"/>
<jsp:include page="../../global/end.jsp"/>
