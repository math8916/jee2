<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <% String ctx = application.getContextPath(); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원ID 검색 페이지</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
</head>
<body>
<div class="box"> 
	회원수 검색 페이지<br/>
<form action="<%=ctx %>/member/result/find_by_id_result.jsp" method="post">
	<span class="meta">검색 아이디를 입력하세요:</span><input type="id" name="id"/><br/>
	<br/><br/>

	
	
	<input type="submit" value="확인"  />
	<input type="reset" value="취소"  />
	
	</form></div>
</body>
</html>