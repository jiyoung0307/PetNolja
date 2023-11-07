<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- 오청이 2번가네? -->
<!-- 오청이 2번가네? -->
<!-- 오청이 2번가네? -->
<!-- 오청이 2번가네? -->
<!-- 오청이 2번가네? -->



<style>
.bottomLine {
	border-bottom: black solid 1px;
	padding-bottom: 20px;
	margin-left: 40px;
	display: inline-block;
	width: 65%;
}

.table {
	display: inline-block;
	padding-bottom: 20px;
	margin-left: 40px;
}

p {
	margin: 0%;
}

#petsitterPic {
	border: black 1px solid;
	text-align: center;
	display: inline-block;
	width: 100px;
	height: 120px;
	line-height: 100px;
}

table tr:first-child {
	vertical-align: top;
}

.pic {
	border: solid 1px rgb(0, 0, 0);
	padding-left: 50px;
	padding-right: 50px;
}

.imageTable {
	text-align: center;
	margin-left: 49px;
}

.imageTable .pic {
	text-align: center;
	line-height: 150px;
	margin: auto;
}

#home {
	background-color: burlywood;
	color: white;
	margin-left: 50px;
}

#confirm {
	background-color: gray;
	color: white;
}

button {
	color: white;
	background-color: gray;
	border: 0ch;
	height: 30px;
	width: 110px;
}
</style>

<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../../common/header-adm.jsp" />

	<div class="table">
		<br>
		<br>
		<table>
			<tr>
				<td>
					<h3 class="selecth3">객실명</h3>
				</td>
				<td>
					<p>${requestScope.roomPostDTO.roomPostTitle}</p> <br>
				</td>
			</tr>
			<tr>
				<td>
					<h3 class="selecth3" style="margin-bottom: 140px;">세부내용</h3>
				</td>
				<td>
					<p>${requestScope.roomPostDTO.roomPostContents}</p>
				</td>
			</tr>
		</table>
		<br>
		<table class="imageTable">
			<tr>
				<c:forEach var="roomPost"
					items="${ requestScope.roomPostDTO.adminPictureList }">
					<td><img
						src="${ pageContext.servletContext.contextPath}/${ roomPost.adminThumbnailPictureSaveRoute }"
						class="pic pic1" alt="picture1"></td>

				</c:forEach>
			</tr>
		</table>
		<br>
		<br>
		<div class="href" style="margin: auto;">


			<td><button onclick="back()" id="back">돌아가기</button></td>
			<!-- <td><button onclick="modify()" id="modify">수정하기</button></td> -->
			<td><button onclick="deleteRoomPost()" id="delete">삭제하기</button></td>
			<script>
				function back() {
					if (confirm("돌아가시겠습니까?")) {
						location.href="${ pageContext.servletContext.contextPath }/admin/main";
					}
				}
				function modify() {
					if (confirm("수정하시겠습니까?")) {
						location.href = "${pageContext.servletContext.contextPath}/updateRoomPostForm?roomPostNo=${requestScope.roomPostDTO.roomPostNo}";
					}
				}
				function deleteRoomPost() {
					if (confirm("삭제하시겠습니까??")) {
						location.href = "${pageContext.servletContext.contextPath}/deleteRoomPostForm?roomPostNo=${requestScope.roomPostDTO.roomPostNo}";
					}
				}
			</script>
		</div>

	</div>

	<jsp:include page="../../common/footer-adm.jsp" />
</body>
</html>