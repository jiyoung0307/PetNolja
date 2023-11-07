<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>login_log</title>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>
<body>
	<jsp:include page="../common/header-adm.jsp" />

	<div class="innerwrap">

			<h2>Admin Log</h2>

			<hr style="width: 800px">
			<br> <br> <br> <br>

			<table class="Chart" border="1px" align="center">
				<tr>
					<th>번호</th>
					<th>로그인 시간</th>
				</tr>
				<c:forEach var="list" items="${ empLogList }">
					<tr>
						<td>${ list.adminlogNo }</td>
						<td>${ list.adminlogDate }</td>
					</tr>
				</c:forEach>

			</table>

			<hr style="width: 800px">

	</div>

	<jsp:include page="../common/footer-adm.jsp" />

	<script>
		
		var loginpwd = <c:out value="${ sessionScope.loginMember.password}"/>
		var regExpn = /[0-9]/;
		var regExps = /[a-zA-Z]/;

		if (regExpn.test(loginpwd) && regExps.test(regExps)) {
			$(document).ready(function() {
								alert("비밀번호를 변경해주세요!");
								location.href = '${ pageContext.servletContext.contextPath }/member/admin/change';
								});
							}
	</script>
</body>
</html>