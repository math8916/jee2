<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String ctx = application.getContextPath(); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴페이지</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />

</head>
<body>
<div class="box">
	회원 비밀번호변경 페이지<br/>
	
	<form action="<%=ctx %>/member/result/delete_result.jsp" method="post">
	<span class="meta">해지할 아이디를 입력하세요:</span><input type="id" name="id"/><br/>
	<br/><br/>

	
	
	<input type="submit" value="확인"  />
	<input type="reset" value="취소"  />
	
	</form>
	
	</div>
	<jsp:include page="/global/footer.jsp"/>
</body>
</html>