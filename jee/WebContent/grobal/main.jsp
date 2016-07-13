<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한빛 아카데미</title>
<style>
#header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;
}

#section {
    width:350px;
    float:left;
    padding:10px;
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:5px;
}
#nav ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}
</style>
</head>
<body>

<div id="header">
<h1>학생 관리 시스템 (Student Management System)</h1>
</div>

<div id="nav">
<ul>
	<li class="active" style="text-align:center"><a href="../member/member_controller.jsp">회원관리</a></li>
	<li style="text-align:center"><a  href="bank/bankController.jsp">계좌관리</a></li>
	<li style="text-align:center"><a  href="gradeController.jsp">성적관리</a></li>
	<li style="text-align:center"><a  href="school_info.jsp">학교소개</a></li>
	</ul>
</div>

<div id="section">
<h2>London</h2>

</div>

<div id="footer">
Copyright � 배근홍 제작 옆에 최인철 
</div>







</body>
</html>