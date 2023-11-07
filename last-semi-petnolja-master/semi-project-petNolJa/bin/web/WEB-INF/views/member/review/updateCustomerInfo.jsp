</html>
<!DOCTYPE html>
<html lang="ko">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Petnolja</title>
    <link rel="stylesheet" href="css/basic.css">
    <link rel="stylesheet" href="css/slick-theme.css">
    <link rel="stylesheet" href="css/slick.css">
    <script src="js/jquery-1.12.4.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/slick.min.js"></script>
    <script src="js/slider.js"></script>   
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<style>
		body {
			background-color: rgb(243, 242, 242);
		}

		.wrap {
			width: 100%;
		}

		aside {
			float: left;
			width: 20%;
		}

		section>section {
			float: left;
			width: 60%;
			color: black;
			
		}

		aside {
			float: left;
			width: 20%;
		}

		.memberGrade {
			height: 50px;
			width: 10%;
			text-align: center;
			line-height: 50px;
			font-size: 20px;
		}

		.hello {
			height: 50px;
			width: 80%;
			position: relative;
			bottom: 50px;
			left: 11%;
			text-align: left;
			line-height: 25px;
			font-size: 15px;
			display: inline-block;
		}

		.box {
			width: 500px;
			height: 170px;
			background-color: rgb(184, 184, 184);
			position: relative;
			bottom: 25px;
			color: rgb(0, 0, 0);
			margin: 0auto;
		}

		.circle {
			height: 100px;
			width: 100px;
			border-radius: 50%;
			background-color: rgb(255, 255, 255);
			font-size: 25px;
			line-height: 100px;
			position: relative;
			margin: auto;

		}

		.href{
			margin: auto;
		}
		.memberInfo tr{
			margin: auto;
			height: 30px;
		}
		.title tr td{
			text-align: center;
			width: 160px;
		}
		button{
			width: 70px;
			height: 30px;
			border: 0;
		}
		#re{
			background-color: burlywood;
			color: white;
		}
		#home{
			background-color: gray;
			color: white;
		}
		.subList{
			list-style: none;
			display: inline-block;
			margin: auto;
			position: relative;
			right: 25px;
		}
		li{
			float: left;
		}
		section {
			margin: 0 auto;
		}
	</style>
</head>

<body>
	<header>
        <div class="header_top">
            <ul class="top_member_box">
                <li><a href="#">로그인</a></li>
                <li><a href="#">회원가입</a></li>
                <li><a href="#">마이페이지</a></li>
                <li><a href="#">고객센터 <span class="arrow"><img src="img/s_arrow.png" alt="화살표"></span></a></li>
                <li><img src="img/kor_icon.png" alt=" "> KR 한국어 <span class="arrow"><img src="img/s_arrow.png" alt="화살표"></span></li>
            </ul>
        </div><!-- //.header_top -->
        <div class="header_bottom">
            <div class="header_main">
                <div class="gnb_all">
                    <input type="checkbox" id="hamB">
                    <label for="hamB" class="hamB_la">
                        <span></span>
                        <span></span>
                        <span></span>
	                </label>
                </div><!-- //.gnb_all -->
                <h1><a href="#">Petnolja</a></h1>
                <div class="right_btn">
                    <ul>
                        <li class="right_btn01"><a href="#">-님 환영합니다.</a></li>
                        <li class="right_btn02"><a href="#">login</a></li>                      
                    </ul>
                </div><!-- //.right_btn-->
            </div><!-- //.header_main -->
            <div class="gnb">
               <ul class="depth0">
                   <li><a href="#">ROOM </a></li>
                   <li><a href="#">PET SITTER</a></li>
                   <li><a href="#">COMPANY</a></li>
                   <li><a href="#">CUSTOMER CENTER</a></li>                
                   <li><a href="#">REVIEW</a></li>
                </ul>
            </div><!-- //.gnb end -->
        </div>
    </header> 
</div>
<!--- //header_wrap end --->   
	<section class="wrap">
		<aside>　</aside>
		<section>
			<br>
			<div id="wrap">
			<div>
				<div class="memberGrade">Vip</div>
				<div class="hello"><p> #{memberName}님 <br> 환영합니다.</p></div>
			</div>
			<div class="box">
				<br>
				<table class="title">
					<tr>
						<td>RESERVATION</td>
						<td>COUPON</td>
						<td>POINT</td>
					</tr>
				</table>
				<table class="title">
					<tr>
						<td><div class="circle circle1">1</div></td>
						<td><div class="circle circle2">2</div></td>
						<td><div class="circle circle3">3</div></td>
					</tr>
				</table>
				
				
				
				<br>
			</div>
			<br>
			<ul class="subList">
				<li><p>회원정보&nbsp;&nbsp;&nbsp;&nbsp;</p></li> 
				<li><p>회원 정보 수정&nbsp;&nbsp;&nbsp;&nbsp;</p></li>
				<li><p>회원 정보 탈퇴</p></li>
				
			</ul>
			<br>
			<hr width="500px">
			
			<table class="memberInfo">
				<tr>
					<td><p>아이디</p></td>
					<td><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p></td>
					<td><p>#{sessionScope.MemberDTO.memberId}</p></td>
				</tr>
				<tr>
					<td><p>이름</p></td>
					<td><p></p></td>
					<td><p>#{sessionScope.MemberDTO.name}</p></td>
				</tr>
				<tr>
					<td><p>휴대폰 번호</p></td>
					<td></td>
					<td><input type="text" value="${sessionScope.MemberDTO.phone}"></td>
				</tr>
				<tr>
					<td><p>이메일</p></td>
					<td></td>
					<td><input type="text" value="${sessionScope.MemberDTO.email}"></td>
				</tr>
				<tr>
					<td><p>생년월일</p></td>
					<td></td>
					<td><input type="text" value="${sessionScope.MemberDTO.birth}"></td>
				</tr>
				<tr>
					<td><p>현재 마일리지</p></td>
					<td></td>
					<td><p>#{sessionScope.MemberDTO.currentPoint}</p></td>
				</tr>
				<tr>
					<td><p>적립 마일리지</p></td>
					<td></td>
					<td><p>#{sessionScope.MemberDTO.현재 마일리지랑 뭐가 다른거지?}</p></td>
				</tr>
			</div>
			</table>
			<br><br><br>
			<table class="href">
				<tr>
					<td><button type="home()" id="home">취소</button></td>
					<!-- 
				<script>
					let home = Document.getElememtById("home");
					function home(){
						location.href="#";
					}
				</script>
				 -->
					<td><button type="re()" id="re">완료</button></td>
					<!-- 
				 <script>
					 let home = Document.getElememtById("home");
					 function home(){
						 location.href="#";
					 }
				 </script>
				  -->
				</tr>
			</table>
			<br><br>
		</section>
		<aside>　</aside>

	</section>
	<div id="footer_wrap">
		<footer>
			<div class="left_con">
				<p class="logo">Petnolja</p>
			 
				<p class="copy">COPYRIGHT ⓒPetnolja . ALL RIGHTS RESERVED..</p>
			</div>
			<div class="right_con">
				<div class="footer_menu">
					<ul>
						<li><a href="#">개인정보처리방침</a></li>
						<li><a href="#">이용안내</a></li>
						<li><a href="#">이용약관</a></li>
					</ul>
				</div>
			</div>
		</footer>
	</div>
</body>

</html>