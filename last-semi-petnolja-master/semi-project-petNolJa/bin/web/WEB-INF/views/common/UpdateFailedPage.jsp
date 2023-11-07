<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>실패!!</h1>
	<button onclick="failed()">메인으로 돌아가기</button>
	<script>
		function failed(){
			location.href="${pageContext.servletContext.contextPath}/index.jsp"
		}
	</script>
</body>
</html>