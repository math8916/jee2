<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="member.MemberBean"%>
<%@ page import="member.MemberService"%>
<%@ page import="member.MemberServiceImpl"%>
<%
	String ctx = application.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
<link rel="stylesheet" href="<%=ctx%>/css/member.css" />
<style>
#member_detail {
	border: 1px solid gray;
	width: 100%;
	height: 500px;
	margin: 0 auto;
	border-collapse: collapse;
}

#member_detail tr {
	border: 1px solid gray;
	height: 20%;
}

#member_detail tr td {
	border: 1px solid gray;
}

.font_bold {
	font-weight: bold;
}

.bg_color_yellow {
	background-color: yellow
}
</style>
</head>
<body>

	<div class="box">
		<!--  id,birth,name,reg,gender,profileImg -->
		<h2>
			회원상세 정보<br />
		</h2>
		<embed src="<%=ctx%>/image/tank_banner.gif" width=50%; height=50%>
			<%
				MemberService service = MemberServiceImpl.getInstance();
				MemberBean member = new MemberBean();
			%>
		
		<form action="<%=ctx%>/member/result/update_result.jsp" method="post">
			<table id="member_detail">
				<tr>
					<td rowspan="7" style="width: 30%;"><img
						src="<%=ctx%>/image/javafatherface.jpg" alt="" width=100%
						height=100% /></td>
					<td style="width: 20%;" class="font_bold bg_color_yellow">ID</td>
					<td style="width: 40%;"><%=service.getSession().getId()%></td>
				</tr>
				
				<tr>

					<td class="font_bold bg_color_yellow">Password</td>
					<td><input type="text" name="pw"
						value="<%=service.getSession().getPw()%>" /></td>
				</tr>

				<tr>

					<td class="font_bold bg_color_yellow">이 름</td>
					<td><%=service.getSession().getName()%></td>
				</tr>
				<tr>

					<td class="font_bold bg_color_yellow">성 별</td>
					<td><%=service.getSession().getGender()%></td>
				</tr>
				<tr>
					<td class="font_bold bg_color_yellow">이메일</td>
					<td><input type="text" name="email"
						value="<%=service.getSession().getEmail()%>" /></td>
				</tr>
				<tr>
					<td class="font_bold bg_color_yellow">생년월일</td>
					<td colspan="2"><%=service.getSession().getSsn()%></td>
				</tr>
				<tr>
					<td class="font_bold bg_color_yellow">등록일</td>
					<td colspan="2"><%=service.getSession().getReg()%></td>
				</tr>
			</table>
		<input type="hidden" name="id" value="<%=service.getSession().getId()%>"/>
		<input type="submit" value="수정" />
		 <input type="reset" value="취소" />
</form>
		<a href="<%=ctx%>/global/main.jsp"><img
			src="<%=ctx%>/image/home.jpg" alt="" width="30px" height="30px" /></a>
		<a href="member_controller.jsp"><img
			src="<%=ctx%>/image/member.jpg" alt="" width="30px" height="30px" /></a>
	</div>
</body>
</html>