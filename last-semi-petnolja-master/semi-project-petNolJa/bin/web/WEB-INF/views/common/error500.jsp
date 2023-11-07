<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error</title>
</head>
<body>

	<c:if test="${!empty sessionScope.loginMember }">
		<c:if test="${ sessionScope.role eq 'admin' }">
			<jsp:include page="header-adm.jsp" />
			<h1>서버에 오류가 발생하여 요청을 수행할 수 없습니다.</h1>
			<div style="text-align: center;">
				<button onclick="adminError();">MAIN</button>
			</div>
			<jsp:include page="footer-adm.jsp" />
		</c:if>

		<c:if test="${ sessionScope.role eq 'member' }">
			<jsp:include page="header-main.jsp" />
			<h1>서버에 오류가 발생하여 요청을 수행할 수 없습니다.</h1>
			<div style="text-align: center;">
				<button onclick="memberError();">MAIN</button>
			</div>
			<jsp:include page="footer-main.jsp" />
		</c:if>
	</c:if>

	<c:if test="${empty sessionScope.loginMember }">
		<jsp:include page="header-main.jsp" />
		<h1>서버가 요청의 구문을 인식하지 못했습니다.</h1>
		<h2>로그인 후 다시 이용해주세요.</h2>
		<div style="text-align: center;">
			<button onclick="unMemberError();">MAIN</button>
		</div>
		<jsp:include page="footer-main.jsp" />
	</c:if>

	<script>
		function memberError() {
			location.href = "${pageContext.servletContext.contextPath}/index.jsp";
		}

		function adminError() {
			location.href = "${ pageContext.servletContext.contextPath }/admin/main";
		}

		function unMemberError() {
			location.href = "${pageContext.servletContext.contextPath}/index.jsp";
		}
	</script>

</body>
</html>