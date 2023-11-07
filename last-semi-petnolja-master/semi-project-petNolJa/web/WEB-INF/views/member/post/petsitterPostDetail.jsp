<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.outer outer-thumbnail-detail{height: max-content;}
</style>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>
	
	<div class="outer outer-thumbnail-detail">
			<div class="innerwrap">
				<h2>Introduce Our Petsitter</h2>
				<p>반려동물을 뜻하는 <b>펫(pet)</b>과 <br>
				   돌보는 직업을 가리키는 <b>시터(sitter)</b>의 합성어. <br>
				   <b>베이비시터(babysitter)</b>가 아이를 돌보듯 내 아이처럼 돌보겠습니다.</p>
				<br><hr><br>
				<table align="center" style="width: 100%;">
					<tr>
						<td colspan="4" align="left"><h3 style="text-align: left;"><c:out value="${ requestScope.petsitterPostDetail.petsitterPostTitle }"/></h3></td>
					</tr>
					<tr>
						<td colspan="4"><br></td>
					</tr>
					<tr>
						<td colspan="2"><small><c:out value="${ requestScope.petsitterPostDetail.petsitterPostCareer }"/></small></td>
						<td colspan="2" rowspan="2" width="400"><img id="titleImg" width="400" height="300" src="${pageContext.servletContext.contextPath}/${requestScope.petsitterPostDetail.adminPicture.adminPictureSaveRoute}""/></td>
					</tr>
					<tr>
						<td colspan="2" height="50px"><br></td>
					</tr>
					<tr>
						<td colspan="4">
							<p>
								<c:out value="${ requestScope.petsitterPostDetail.petsitterPostContents }"/>
							</p>
						</td>
					</tr>
					<tr>
						<td colspan="4" height="20px"><hr></td>
					</tr>
					<tr>
						<td width="200" align="left"><c:out value="${ requestScope.petsitterPostDetail.emp.empName }"/>관리자</td>
						<td width="200">조회수 <c:out value="${ requestScope.petsitterPostDetail.petsitterPostCount }"/>회</td>
						<td width="200" align="right">작성일 <c:out value="${ requestScope.petsitterPostDetail.petsitterCreateDate }"/></td>
					</tr>
					<tr>
						<td colspan="4" height="50px"><br></td>
					</tr>
				</table>
			
		<div align="center">
			<button onclick="location.href='${ pageContext.servletContext.contextPath }/petsitter/postList'">목록으로</button>
		</div>
	</div>
<div style="clear: both; height: 100px;"><br></div>	
<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>