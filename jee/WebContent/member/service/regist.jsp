<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String ctx = application.getContextPath(); %> 
<style>
h1   {color: blue;}
h5   {border: 1px solid gray;width:500px;margin: 0 auto;} 
p    {color: red;}
span.meta{width: 200px;background-color:yellow;float: left} 
div.box {border: 1px solid black;width:500px;margin: 0 auto;}
input {size:10;margin: 10 left;}
</style>
<jsp:include page="../../global/top.jsp"/>
<jsp:include page="../../global/header.jsp"/>

<div class="box">
	<form action="<%=ctx %>/member/result/regist_result.jsp" method="post">
	<span class="meta">이     름:</span><input type="text" name="name"/><br/>
	<span class="meta">I       D:</span><input type="text" name="id"/><br/>
	<span class="meta">비밀번호:</span><input type="text" name="pw"/><br/>
	<span class="meta"> SSN     :</span><input type="text" name="ssn"/><br/>
	<span class="meta"> EMAIL    :</span><input type="text" name="ssn"/><br/>
	<span class="meta">전공:</span>
	<input type="radio" name="major" value="computer" checked/>컴퓨터 공학<br/>
	<input type="radio" name="major" value="mamt" />경영학부<br/>
	<input type="radio" name="major" value="math" />수학부<br/>
	<input type="radio" name="major" value="eng" />영문학부<br/>
	<span class="meta">수강과목:</span><br/>
	<input type="checkbox" name="subject" value="java" />Java
	<input type="checkbox" name="subject" value="sql" />SQL
	<input type="checkbox" name="subject" value="cpp" />CPP
	<input type="checkbox" name="subject" value="python" />PYTHON
	<input type="checkbox" name="subject" value="delph" />DELPH
	<input type="checkbox" name="subject" value="html" />Html<br/><br/>

	
	
	<input type="submit" value="회원가입"  />
	<input type="reset" value="취소"  />
	
	</form>
	<a  href="<%=ctx %>/global/main.jsp" ><img src="<%=ctx %>/image/home.jpg" alt="" width="30px" height="30px"  /></a>
	<a  href="member_controller.jsp" ><img src="<%=ctx %>/image/member.jpg" alt="" width="30px" height="30px"  /></a>
	
	
	</div>
<jsp:include page="../../global/footer.jsp"/>
<jsp:include page="../../global/end.jsp"/>
    
