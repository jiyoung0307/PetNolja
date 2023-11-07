<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>
    <html lang="ko">
    <head>
    <meta charset="UTF-8">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <title>Insert title here</title>
<style>
            body{background-color:rgb(243, 242, 242); font-family:'Nanumsquare', "맑은 고딕","돋움",sans-serif; color:#333; font-size:16px; box-sizing: border-box; width: 1500px;margin: auto; }
            .wrap{width: 100%;}
            aside{float: left; width: 20%;}
            section>section{float: left; width: 60%; background-color: black;}
            aside{float: left; width: 20%;}
            .hotelIntro{
        margin: 50px 5px;
        border-bottom: 1px solid black;
        width: 100%;
        height: 150px;
        
    }
    .hotelIntro h2{
        margin-left: 80px;
        width: 300px;
        font-size : 60px;
    }
    .hotelIntro p{ 
        margin:  0px 50px;
        float: right;
        font-size: 20px;
        width: 500px;
    }
    .hotelIntro2 {
        text-align: center;
    }
    .hotelIntro2 p{ 
        margin: 0 auto;
        font-size: 20px;
        width: 500px;
    }
    .hotelIntro img{
        margin: 10px 0px; 
        padding: 20px;
        width: 800px;
        height: 400px;
        border-bottom: 1px solid black;
    }

    .hotelIntro2 h2{
        text-align: center;
        margin-bottom: 20px;
        width: 100%;
        font-size : 40px;
    }
    .hotelIntro2 p1{ 
        margin: 0 auto;
        padding: 10px;
        font-size: 15px;
        width: 500px;
    }
    .hotelIntro2 p2{ 
        margin: 0 auto;
        padding: 10px;
        font-size: 15px;
        width: 500px;
    }
    .hotelIntro2 p3{ 
        margin: 0 auto;
        padding: 10px;
        font-size: 15px;
        width: 500px;
    }
        </style>
        
        
    </head>
    <body>
    <jsp:include page="../../common/header-main.jsp"/>
        <section class="wrap">
       
            <div class="body-section">
        <div class="hotelIntro" > 
            <h2>펫놀자 소개</h2>
        </div>
        
        <div class="intro">
        <table> 
        <form id="update" action="${pageContext.servletContext.contextPath}/UpdateCompanyPost" method = "post">
            <%-- <div class="title-img-area" id="titleImgArea" align="center">
							<img id="titleImg" width="255" height="150" src="${ pageContext.servletContext.contextPath }/${ petsitterPostDetail.adminPicture.adminThumbnailPictureSaveRoute }"/>
							<div class="thumbnail-file-area">
								<input type="file" id="thumbnailImg1" name="thumbnailImg1" onchange="loadImg(this,1)">
							</div>
						</div> --%>
            <div class = "NameText" >
                <tr>
                    <td style="vertical-align: top;">소제목1:</td>
                    <td><textarea name="hotelPostLtitle" id="smallNameText" cols="40" rows="1"
                            placeholder="소제목을 작성해주세요" style="resize: none;"></textarea></td>
                </tr>
            </div>
            <div class = "questionText" >
                <tr>
                    <td style="vertical-align: top;">내용1:</td>
                    <td><textarea name="hotelPostContentsFirst" id="questionText" cols="60" rows="5"
                        placeholder="내용1을 입력해주세요 (100자 이내)" style="resize: none;"></textarea>
                    </td>
                </tr>
                <tr>
                    <td style="vertical-align: top;">내용2:</td>
                    <td><textarea name="hotelPostContentsTwo" id="questionText" cols="60" rows="5"
                            placeholder="내용2를 입력해주세요 (100자 이내)" style="resize: none;"></textarea>
                    </td>
                </tr>
                <tr>
                    <td style="vertical-align: top;">내용3:</td>
                    <td><textarea name="hotelPostContentsThird" id="questionText" cols="60" rows="5"
                            placeholder="내용3을 입력해주세요 (100자 이내)" style="resize: none;"></textarea>
                    </td>
                    </tr>
            </div>
        </table>
        </div>
        <td><button onclick="back()" id="back">돌아가기</button></td>
        <button onclick="confirmModal()" class="btns" type = "submit">수정</button>
        <script>
	      function back(){
	    	if(confirm("돌아가시겠습니까?")){
	    		location.href="${pageContext.servletContext.contextPath}/index.jsp";
	    	}
	      }
          function confirmModal() {
            window.confirm("정말 수정하시겠습니까?");
          }   
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
        </section>
        <jsp:include page="../../common/footer-main.jsp"/>
    </body>
    </html>