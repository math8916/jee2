<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <% String ctx = application.getContextPath(); %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원리스트 페이지</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
<style type="text/css">
div.box {style ="width: 500px;margin: 0 auto;text-align: center;"}
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	align: center;
	width: 500px;
	margin: auto;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

h1 {
	background-color: black;
	color: white;
	text-align: center;
	padding: 5px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}

div {
	style ="width: 500px;
	margin: 0 auto;
	text-align: center;
	"
}
</style>
</head>
<body>
	<div class="box">
		<h1 style="width: 500px;">회원목록 페이지</h1>
		<br />

		<table>
			<tr>
				<th>ID</th>
				<th>이름</th>
				<th>등록일</th>
				<th>생년월일</th>
			</tr>
			<tr>
				<td>hong</td>
				<td><a href="detail.html">홍길동</a>홍길동</td>
				<td>2016-01</td>
				<td>700814</td>
			</tr>
			<tr>
				<td>hong11</td>
				<td><a href="">홍길성</a> </td>
				<td>2016-01</td>
				<td>700814</td>
			</tr>
			<tr>
				<td>choi</td>
				<td><a href="">최인철</a></td>
				<td>2016-01</td>
				<td>700814</td>
			</tr>
			<tr>
				<td>kim</td>
				<td><a href="">김유신</a></td>
				<td>2016-01</td>
				<td>680814</td>
			</tr>
		</table>


		<a  href="<%=ctx %>/global/main.jsp" ><img src="<%=ctx %>/image/home.jpg" alt="" width="30px" height="30px"  /></a>
<a  href="member_controller.jsp" ><img src="<%=ctx %>/image/member.jpg" alt="" width="30px" height="30px"  /></a>
	</div>
</body>
</html>