<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.innerwrap{
		height : auto;
 		min-height: 100%;
		padding-bottom: 350px;
		}
	.innerwrap1{margin-left: 20px;}
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>
	
	<div class="innerwrap">
			<div class="innerwrap1">
				<h2>Petsitter 게시물 조회</h2> 
				
				<div id="button1"><button id="modify">수정</button>&nbsp;&nbsp;&nbsp;&nbsp;<button id="delete">삭제</button>
				<hr>
				<table align="center" style="width: 80%;" id="test">
					<tr height="30px">
						<td colspan="4" align="left" id="title"><h3 style="text-align: left;"><label><c:out value="${ requestScope.petsitterPostNo }"/></label>. <c:out value="${ requestScope.petsitterPostDetail.petsitterPostTitle }"/></h3></td>
					</tr>
					<tr>
						<td colspan="4"><hr><br></td>
					</tr>
					<tr>
						<td colspan="2" id="career"><small style="font-size: 16px;"><c:out value="${ requestScope.petsitterPostDetail.petsitterPostCareer }"/></small></td>
						<td colspan="2" rowspan="2" width="400"><img id="titleImg" width="400" height="300"  src="${pageContext.servletContext.contextPath}/${requestScope.petsitterPostDetail.adminPicture.adminPictureSaveRoute}"/></td>
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
</div>
</div>
<script>
	$("#modify").click(function(){
		const petsitterPostNo = $("#test").find("label").text();
		console.log(petsitterPostNo);
		location.href = "${ pageContext.servletContext.contextPath }/petsitter/post/modify?no=" + petsitterPostNo;
	});
	
	$("#delete").click(function(){
		const petsitterPostNo = $("#test").find("label").text();
		console.log(petsitterPostNo);
		location.href = "${pageContext.servletContext.contextPath}/petsitter/post/delete?no=" + petsitterPostNo;
	});
	
</script>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>