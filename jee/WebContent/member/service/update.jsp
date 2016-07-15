<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String ctx = application.getContextPath(); %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 비밀번호변경 페이지</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
</head>
<body>
<div class="box">
	회원 비밀번호변경 페이지<br/>
	<div class="box">
	<form action="<%=ctx %>/member/result/update_result.jsp" method="post">
	<span class="meta">변경할 비밀번호를 입력하세요:</span><input type="password" name="pw"/><br/>
	<br/><br/>

	
	
	<input type="submit" value="확인"  />
	<input type="reset" value="취소"  />
	
	</form>
	
	</div>
	<jsp:include page="/global/footer.jsp"/>
	

<a  href="<%=ctx %>/global/main.jsp" ><img src="<%=ctx %>/image/home.jpg" alt="" width="30px" height="30px"  /></a>
<a  href="member_controller.jsp" ><img src="<%=ctx %>/image/member.jpg" alt="" width="30px" height="30px"  /></a>
</div>
</body>
</html>