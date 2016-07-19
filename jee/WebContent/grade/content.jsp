<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    <%  String ctx = application.getContextPath(); %>
<div style="text-align:center"  >
	<h1 style="text-align:center;" ><b> 	 회원관리	</b></h1>
	<div style="width:300px; margin:0 auto; text-align:left" >
	<br/>
	<ol>
		<li><a href="<%=ctx %>/grade/service/add.jsp">성적입력</a></li>
		<li><a href="<%=ctx %>/grade/service/count.jsp">응시생수</a></li>
		<li><a href="<%=ctx %>/grade/service/delete.jsp">성적삭제</a></li>
		<li><a href="<%=ctx %>/grade/service/list.jsp">전체리스트</a></li>
		<li><a href="<%=ctx %>/grade/service/serach.jsp">검색</a></li>
		<li><a href="<%=ctx %>/grade/service/update.jsp">성적 변경</a></li>
		</ol>
	</div>
	<a  href="<%=ctx %>/global/main.jsp" ><img src="<%=ctx %>/image/home.jpg" alt="" width="30px" height="30px"  /></a>
	</div>