<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입</title>
	<link rel="stylesheet" href="../css/member.css" />
	<style>
h1   {color: blue;}
h5   {border: 1px solid gray;width:500px;margin: 0 auto;} 
p    {color: red;}
span.meta{width: 200px;background-color:yellow;float: left} 
div.box {border: 1px solid black;width:500px;margin: 0 auto;}
input {size:10;margin: 10 left;}
</style>
</head>
<body>
<div class="box">
	<span class="meta">이름:</span><%=request.getParameter("name") %><br/>
	<span class="meta">ID:</span><%=request.getParameter("id") %><br/>
	<span class="meta">비밀번호:</span><%=request.getParameter("pw") %><br/>
	<span class="meta">SSN:</span><%=request.getParameter("ssn") %><br/>
	<span class="meta">전공:</span><%=request.getParameter("major") %><br/>
	<span class="meta">수강과목:</span>
	<%
	String[] subjects=request.getParameterValues("subjects");
	if(subjects != null){
		for(int i=0;i<subjects.length;i++){
			%><%= subjects[i] %><br/><%
	
		}
	}
	%> <br/>
	
회원 가입을 축하합니다 <%=request.getParameter("name") %> 님......	
	<a  href="../index.jsp" ><img src="../image/home.jpg" alt="" width="30px" height="30px"  /></a>
<a  href="member_controller.jsp" ><img src="../image/member.jpg" alt="" width="30px" height="30px"  /></a>
	</div>
</body>
</html>