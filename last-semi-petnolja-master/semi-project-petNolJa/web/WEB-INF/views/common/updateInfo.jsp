<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <jsp:include page="header-main.jsp"/>
    
    	
    	<h1>정보 변경에 성공하셨습니다.</h1>
    	<h2>안전한 변경을 위해 다시 로그인 해주세요.</h2>
		<div style="text-align: center;">
			<button onclick="main();">MAIN</button>
		</div>
		
		<script>
    		function main(){
    			location.href="${ pageContext.servletContext.contextPath }/common/login";
    		}
    	</script>
    	
<jsp:include page="footer-main.jsp"/>
</body>
</html>