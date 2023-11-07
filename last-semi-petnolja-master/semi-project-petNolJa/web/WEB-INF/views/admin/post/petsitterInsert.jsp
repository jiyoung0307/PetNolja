<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.innerwrap {width:500px; margin:0 auto; border:1px solid black;}
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>
	
	<div class="innerwrap">
        <h2>Petsitter 게시물 등록</h2>
        <hr>
        <br>
		<form action="${ pageContext.servletContext.contextPath }/petsitter/post/insert" method="post" encType="multipart/form-data">
			<div class="thumbnail-insert-area">
				<table>
					<tr>
						<td width="100px">제목</td>
						<td colspan="1"><input type="text" size="45" name="title" style="height: 25px;" placeholder="펫시터의 이름을 작성하세요."></td>
                        <td colspan="2" rowspan="2" width="350" height="180">
                            <div class="title-img-area" id="titleImgArea" align="center">
								<img id="titleImg" width="255" height="150">
                                <div class="thumbnail-file-area">
                                    <input type="file" id="thumbnailImg1" name="thumbnailImg1" onchange="loadImg(this,1)">
                                </div>
							</div>
                        </td>
					</tr>
					<tr>
						<td>경력 사항</td>
						<td colspan="2">
							<textarea name="subtitle" rows="5" cols="50" style="resize:none;" placeholder="펫시터의 경력을 작성하세요."></textarea>
						</td>
					</tr>
                    <tr>
                        <td>세부 내용</td>
                        <td colspan="4">
                            <textarea name=body rows="10" cols="100" style="resize:none;" placeholder="세부내용을 작성하세요."></textarea>
                        </td>
                    </tr>
				</table>
				
			</div>
			<br>
			<div class="thumbnail-btn-area" id="button">
					<button onclick="location.href='${ pageContext.servletContext.contextPath }/adim/main'">취소</button>
				<button type="submit">등록</button>
			</div>
		</form>
	</div>	
		<script>
			
			const $titleImgArea = document.getElementById("titleImgArea");
			
			$titleImgArea.onclick = function() { 
				document.getElementById("thumbnailImg1").click(); 
			}
			
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
			
		</script>

	
	
<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>