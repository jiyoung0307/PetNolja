<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="innerwrap">
	<h2>Petsitter 게시물 수정</h2>
	<hr>
	<br>
	<form id="dataform" method="post" encType="multipart/form-data">
		<div class="thumbnail-insert-area">
		<p>게시물 번호 : <label><c:out value="${requestScope.petsitterPostDetail.petsitterPostNo}"/></label></p>
			<table>
				<tr>
					<td width="100px">제목</td>
					<td colspan="1"><input type="text" size="45" name="title" id="title" style="height: 25px;" value="<c:out value='${ requestScope.petsitterPostDetail.petsitterPostTitle }'/>"></td>
					<td colspan="2" rowspan="2" width="350" height="180">
						<div class="title-img-area" id="titleImgArea" align="center">
							<img id="titleImg" width="255" height="150" src="${ pageContext.servletContext.contextPath }/${ petsitterPostDetail.adminPicture.adminThumbnailPictureSaveRoute }"/>
							<div class="thumbnail-file-area">
								<input type="file" id="thumbnailImg1" name="thumbnailImg1" onchange="loadImg(this,1)">
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td>경력사항</td>
					<td colspan="2">
						<textarea name="subtitle" id="subtitle" rows="5" cols="50" style="resize:none;"><c:out value="${ requestScope.petsitterPostDetail.petsitterPostCareer }"/></textarea>
					</td>
				</tr>
				<tr>
					<td>세부 내용</td>
					<td colspan="4">
						<textarea name="body" id="body" rows="10" cols="100" style="resize:none;"><c:out value="${ requestScope.petsitterPostDetail.petsitterPostContents }"/></textarea>
					</td>
				</tr>
			</table>
			
		</div>
		<br>

			<div align="center">
				<button onclick="location.href='${ pageContext.servletContext.contextPath }/petsitter/postList'">취소</button>
				<button type="submit" id="submitbutton">등록</button>
			</div>
	</form>

	<script>
		const $titleImgArea = document.getElementById("titleImgArea");
		$titleImgArea.onclick = function() { 
			document.getElementById("thumbnailImg1").click(); 
		}
		
	
		/* 이미지 미리보기 관련 함수(File API 활용하기) */
		function loadImg(value, num) {
			if (value.files && value.files[0]) {			// value.files[0]는 파일 이름
				const reader = new FileReader();
				reader.readAsDataURL(value.files[0]);		// Base64방식으로 파일을 FileReader에 전달 (Base64로 인코딩한 것은 브라우저가 원래 데이터로 만들게 됨)
				reader.onload = function(e) {				// load EventListener에 function 등록 (FileReader에서 전달 받은 파일을 다 읽으면 리스너에 등록한 function이 호출 됨)
						console.log(e.target.result);		// e.target.result는 인코딩한 결과로 img태그의 src로 사용할 수 있음
						document.getElementById("titleImg").src = e.target.result;
				}
			}
		}
		
			$("#submitbutton").click(function(){
				const petsitterPostNo = $(this).find("label").text();
				console.log(petsitterPostNo);
				location.href = "${ pageContext.servletContext.contextPath }/petsitter/post/modify?no=" + petsitterPostNo;
			});
		
	</script>

</div>
<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>