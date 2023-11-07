<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<meta charset="UTF-8">



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
	margin-left: 90px;
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

#contentImgArea1, #contentImgArea2, #contentImgArea3 {
	margin-right: 50px;
}
</style>




<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../../common/header-adm.jsp" />


	<form action="${pageContext.servletContext.contextPath}/insertRoomPost" method="post" encType="multipart/form-data">
		<div class="table">
			<br>
			<br>
			<table>
				<tr>
					<td style="text-align: right;">
						<h3 class="selecth3">제목</h3>
					</td>
					<td>
						<p>
							<input type="text" placeholder="제목을 입력하세요" name="roomPostTitle"
								id="roomPostTitle" style="width: 295px;"
								value="${ requestScope.roomPostDTO.roomPostTitle }">
						</p> <br>
					</td>
				</tr>

				<tr>
					<td style="text-align: right;">
						<h3 class="selecth3" style="margin-bottom: 140px;">세부내용</h3>
					</td>
					<td colspan="2">
					<textarea name="roomPostContents" id="roomPostContents" cols="65" rows="10" style="resize: none;"
							placeholder="세부내용을 입력하세요">${ requestScope.roomPostDTO.roomPostContents }</textarea>
					</td>
				</tr>
				<tr>
					<td style="text-align: right;">
						<h3 class="selecth3" style="margin-bottom: 140px;">사용가능 여부</h3>
					</td>
					<td>
						<input type='radio' name='valueYn' id='Y' value='Y' />Y 
						<input type='radio' name='valueYn' id='N' value='N' />N
					</td>
				</tr>
			</table>
			<br>
			<table class="imageTable">
				<tr>
					<td>
						<div class="content-img-area1" id="contentImgArea1">
							<img id="contentImg1" width="200" height="180">
						</div>
					</td>
					<td>
						<div class="content-img-area2" id="contentImgArea2">
							<img id="contentImg2" width="200" height="180">
						</div>
					</td>
					<td>
						<div class="content-img-area3" id="contentImgArea3">
							<img id="contentImg3" width="200" height="180">
						</div>
					</td>

				</tr>

			<span class="thumbnail-file-area"> 
			<input style="display: none;" type="file" id="thumbnailImg1"
				name="thumbnailImg1" onchange="loadImg(this,1)"><br> 
			<input style="display: none;" type="file" id="thumbnailImg2"
				name="thumbnailImg2" onchange="loadImg(this,2)"><br> 
			<input style="display: none;" type="file" id="thumbnailImg3"
				name="thumbnailImg3" onchange="loadImg(this,3)"><br>
			</span>
			</table>
			<br>
			<br>
			<table class="href" style="margin: auto;">
				<tr>
					<td><button onclick="back()" id="back">돌아가기</button></td>

					<td><button type="submit" id="modify">등록하기</button></td>
					</form>
					<script>
                	function back(){
                		if(confirm("돌아가시겠습니까?")){
                			location.href="${ pageContext.servletContext.contextPath }/admin/main";
                		}
                	}
                </script>
					<script>
			
			const $contentImgArea1 = document.getElementById("contentImgArea1");
			const $contentImgArea2 = document.getElementById("contentImgArea2");
			const $contentImgArea3 = document.getElementById("contentImgArea3");
			
			$contentImgArea1.onclick = function() {
				document.getElementById("thumbnailImg1").click();
			}
			
			$contentImgArea2.onclick = function() {
				document.getElementById("thumbnailImg2").click();
			}
			
			$contentImgArea3.onclick = function() {
				document.getElementById("thumbnailImg3").click();
			}
			
			/* 이미지 미리보기 관련 함수(File API 활용하기) */
			function loadImg(value, num) {
				/* https://developer.mozilla.org/ko/docs/Web/API/FileReader 참고 (MDN 사이트 참고)*/
				if (value.files && value.files[0]) {			// value.files[0]는 파일 이름
					const reader = new FileReader();
					/*
						FileReader 객체는 웹 애플리케이션이 비동기적으로 데이터를 읽기 위하여 읽을 파일을 가리키는 File 혹은 Blob 객체를
						이용해 파일의 내용을(혹은 raw data버퍼로) 읽고 사용자의 컴퓨터에 저장하는 것을 가능하게 하는 것	
						Blob(Binary large object) : 파일류의 불변하는 미가공 데이터로 텍스트와 이진 데이터의 형태로 읽을 수 있음
					*/
					// reader.readAsText(value.files[0]);			// 텍스트 파일을 읽을 때 사용 (이미지 파일을 텍스트로 읽어서 글자가 깨짐)			
					// reader.readAsArrayBuffer(value.files[0]);	// 데이터를 일정한 크기로 조금씩(파일을 표현하는 ArrayBuffer) 서버로 보낼 때
					// reader.readAsBinaryString(value.files[0]);	// 이진 데이터를 서버로 보낼 때 사용
					reader.readAsDataURL(value.files[0]);		// Base64방식으로 파일을 FileReader에 전달 (Base64로 인코딩한 것은 브라우저가 원래 데이터로 만들게 됨)
					
					// load 이벤트의 핸들러로 읽기 동작이 성공적으로 완료 되었을 때마다 발생한다.
					reader.onload = function(e) {				// load EventListener에 function 등록 (FileReader에서 전달 받은 파일을 다 읽으면 리스너에 등록한 function이 호출 됨)
						switch(num){
						case 1:
							console.log(e.target.result);		// e.target.result는 인코딩한 결과로 img태그의 src로 사용할 수 있음
							document.getElementById("contentImg1").src = e.target.result;
							break;
						case 2:
							document.getElementById("contentImg2").src = e.target.result;
							break;
						case 3:
							document.getElementById("contentImg3").src = e.target.result;
							break;
						}
					}
				}
			}
			
		</script>



				</tr>
			</table>
		</div>
	</form>




















	<jsp:include page="../../common/footer-adm.jsp" />
</body>
</html>