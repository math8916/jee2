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
	<form action="../result/login_result.jsp" method="post">
	<span class="meta">I       D:</span><input type="text" name="id"/><br/>
	<span class="meta">비밀번호:</span><input type="password" name="pw"/><br/>
	<br/><br/>

	
	
	<input type="submit" value="로그인"  />
	<input type="reset" value="취소"  />
	
	</form>
	
	</div>
</body>
</html>