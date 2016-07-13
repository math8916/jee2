<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원로그인 페이지</title>
<link rel="stylesheet" href="../css/member.css" />
</head>
<body>
<div class="box">
	<%
	String id = request.getParameter("name");
	if(id !=null && id.equals("hong")){
		response.sendRedirect("../../grobal/main.jsp");
		}else{
			%>
			<h2>로그인 실패</h2>
			<a href="../service/login.jsp"> 다시 시도</a>
		<%	
		}
	%>
	<a  href="../index.jsp" ><img src="../../image/home.jpg" alt="" width="30px" height="30px"  /></a>
<a  href="../../member_controller.jsp" ><img src="../../image/member.jpg" alt="" width="30px" height="30px"  /></a>
	</div>
</body>
</html>