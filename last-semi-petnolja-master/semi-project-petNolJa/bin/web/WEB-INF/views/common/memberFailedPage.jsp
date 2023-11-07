<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header-main.jsp" />
		<h1>요청하신 작업을 완료하지 하였습니다.</h1>
		<h2>다시 시도하여 주시기 바랍니다.</h2>
		<button onclick="main();">MAIN</button>
	<jsp:include page="footer-main.jsp" />

	<script>
		function main() {
			location.href="${pageContext.servletContext.contextPath}/index.jsp";
		}
		</script>
</body>
</html>