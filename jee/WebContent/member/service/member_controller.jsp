<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String ctx = application.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학원관리</title>
<style type ="text/css">
div {
    border: 5px solid black;width:300px;margin: 0 auto;
    background-color: yellow;
}

h1   {color: blue;}
p    {color: red;}
a	 {margin: 0 auto}
h1	{background-color:black;
    color:white;
    text-align:center;
    padding:5px; }
 img {margin: 0 auto;}
</style>
</head>
<body>
	<div id="" class="memberClass box" style="border:solid;" >
	<h1 style="text-align:center;" ><b> 	 회원관리	</b></h1>
	<br/>
	<ol>
		<li><a href="regist.jsp">회원가입</a></li>
		<li><a href="login.jsp">로그인</a></li>
		<li><a href="login_out.jsp">로그아웃</a></li>
		<li><a href="detail.jsp">내정보 보기</a></li>
		<li><a href="update.jsp">내정보 수정</a></li>
		<li><a href="delete.jsp">탈퇴</a></li>
		<li><a href="list.jsp">회원목록</a></li>
		<li><a href="findByID.jsp">검색(ID)</a></li>
		<li><a href="findByName.jsp">검색(이름)</a></li>
		<li><a href="findByGender.jsp">검색(성별)</a></li>
		<li><a href="count.jsp">회원수</a></li>
	</ol>
	
	<a  href="<%=ctx %>/global/main.jsp" ><img src="<%=ctx %>/image/home.jpg" alt="" width="30px" height="30px"  /></a>
	</div>
	
</body>
</html>