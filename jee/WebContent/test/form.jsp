<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>폼태그</title>
</head>
<body>
	
	<form action=""method="get">
	이름:<input type="text" name="name"/><br/>
	ID:<input type="text" name="ID"/><br/>
	비밀번호:<input type="text" name="PW"/><br/>
	SSN:<input type="text" name="SSN"/><br/>
	통신사:
	<input type="checkbox" name="SKT" value="SKT" />
	<input type="checkbox" name="LGU" value="LGU" />
	<input type="checkbox" name="KT" value="KT" /><br>
	성별:
	<input type="radio" name="gender" value="male" />
	<input type="radio" name="gender" value="female" /><br>
	<input type="submit" value="회원가입"  />
	<input type="reset" value="취소"  />
	
	</form>
	
</body>
</html>