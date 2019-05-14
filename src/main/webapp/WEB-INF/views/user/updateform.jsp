<%@page import="com.cafe24.mysite1.vo.UserVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%
	UserVo authUser = (UserVo)session.getAttribute("authUser");
 %>	
<!doctype html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="<%=request.getContextPath() %>/assets/css/user.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/includes/header.jsp" />
		<div id="content">
			<div id="user">
				<form id="update-form" name="updateform" method="post" action="<%=request.getContextPath() + "/user" %>">
					<input type="hidden" name="a" value="update" />
					<input type="hidden" name="no" value="<%=authUser.getNo()%>" />
					
					<h4>기존 이메일 : </h4> 
					<%=request.getAttribute("email") %><br />
					<h4>기존 비밀번호 : </h4>
					<%=request.getAttribute("password") %><br />
										
					<label class="block-label" for="email">수정할 이메일</label>
					<input id="email" name="email" type="text" value="">
					<label class="block-label" >수정할 패스워드</label>
					<input name="password" type="password" value="">
					
					<input type="submit" value="수정">
				</form>
			</div>
		</div>
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp" />
		<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>