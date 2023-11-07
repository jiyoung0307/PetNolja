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
		<h1>요청하신 작업이 완료되었습니다.</h1>
			<div>
				<button onclick="main();">MAIN</button>
			</div>
	<jsp:include page="footer-main.jsp" />

	<script>
		function main() {
			location.href="${pageContext.servletContext.contextPath}/index.jsp";
		}
	</script>
</body>
</html>



