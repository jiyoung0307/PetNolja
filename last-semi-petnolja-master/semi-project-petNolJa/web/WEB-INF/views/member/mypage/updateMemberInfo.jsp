<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style>
body {
	background-color: rgb(243, 242, 242);
	color: black;
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
	background-color: rgb(226, 226, 226);
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
	margin: 0 auto;
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

.href {
	margin: auto;
}

.memberInfo tr {
	margin: auto;
	height: 30px;
}

.memberInfo tr p {
	margin-left: 30px;
}

.title {
	margin: 0;
}

.title tr td {
	text-align: center;
	width: 160px;
}

.confirm {
	background-color: burlywood;
	color: white;
	width: 70px;
	height: 30px;
	border: 0;
}

#cancle {
	background-color: gray;
	color: white;
	width: 70px;
	height: 30px;
	border: 0;
}

.subList {
	list-style: none;
	display: inline-block;
	margin: auto;
	position: relative;
	right: 25px;
}

li {
	float: left;
}

.wrap {
	border: 1px solid red;
	overflow: hidden;
}

section {
	border: 1px solid black;
}

.wrap2 {
	margin: 0 auto;
	overflow: hidden;
	border: 1px solid blue;
}

.wrap3 {
	border: 1px solid lime;
	width: 60%;
	margin: 0 auto;
}

.subList {
	text-align: center;
	border: 1px solid black;
	font-size: 16px;
	overflow: hidden;
	padding: 0 10px;
	display: block;
	width: 400px;
}

.sublist>ul>li {
	padding: 0 50px;
	margin: 0 30px;
}

tbody>tr>td {
	width: 100px;
	font-size: 12px;
}

.container {
	margin: 0 40px;
	border: 1px solid blue;
}

.gift-wrapper {
	display: flex;
	align-items: center;
	justify-content: space-between;
	justify-content: 15px;
}

.gift-content1 {
	max-width: 324px;
	width: 100%;
	text-align: center;
	display: inline-block;
	vertical-align: middle;
	top: 13px;
	position: relative;
	margin-bottom: 8px;
	border: 1px solid blue;
}

.gift-content .ut {
	font-size: 14px;
	display: block;
}
</style>
<title>Insert title here</title>
</head>

<body>
	<jsp:include page="../../common/header-main.jsp" />









	<div style="display: none;">
		window.onload = function(){
		<c:if test="${empty sessionScope.loginMember }">
			<script>
			   alert("로그인이 필요합니다.");
			   location.href="${pageContext.servletContext.contextPath}/index.jsp"
		   </script>
		</c:if>
		}
	</div>

	<section class="wrap">
		<aside></aside>
		<section class="wrap2">
			<br>
			<div class="wrap3">
				<div>
					<div class="memberGrade">
						<c:out value="${sessionScope.loginMember.gradeNo}" />
					</div>
					<div class="hello">
						<p>
							<c:out value="${sessionScope.loginMember.memberName}님" />
							<br> 환영합니다.
						</p>
					</div>
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
							<td>
								<div class="circle circle1">1</div>
							</td>
							<td>
								<div class="circle circle2">2</div>
							</td>
							<td>
								<div class="circle circle3">3</div>
							</td>
						</tr>
					</table>



					<br>
				</div>
				<br> <br> <br>



				</ul>
				<br>
				<hr width="500px">

				<form action="${pageContext.servletContext.contextPath}/updateMemberInfo" method="post">
					<table class="memberInfo">
						<tr>
							<td>
								<p>아이디</p>
							</td>
							<td>
								<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>
							</td>
							<td>
								<p>
									<c:out value="${sessionScope.loginMember.memberId}" />
								</p>
							</td>
						</tr>
						<tr>
							<td>
								<p>이름</p>
							</td>
							<td>
								<p></p>
							</td>
							<td>
								<p>${sessionScope.loginMember.memberName}</p>
							</td>
						</tr>
						<tr>
							<td>
								<p>휴대폰 번호</p>
							</td>
							<td></td>
							<td>
								<p>
									<input type="tel" name="phone" id="phone" required>
									<div id="PhoneArea"> </div>
								</p>
							</td>
						</tr>
						<tr>
							<td>
								<p>이메일</p>
							</td>
							<td></td>
							<td>
								<p>
									<input type="email" name="email" id="email" required>
									<div id="emailArea"> </div>
								</p>
							</td>
						</tr>
						<tr>
							<td>
								<p>생년월일</p>
							</td>
							<td></td>
							<td>
								<p>${sessionScope.loginMember.memberBirth}</p>
							</td>
						</tr>
						<tr>
							<td>
								<p>현재 마일리지</p>
							</td>
							<td></td>
							<td>
								<p>${sessionScope.loginMember.memberPoint}</p>
							</td>
						</tr>
						<tr>
							<td>
								<p></p>
							</td>
							<td></td>
							<td>
								<p></p>
							</td>
						</tr>
					</table>
					<div style="text-align: center;">
						<tr>
							<td><button type="button" id="cancle">취소</button></td>


							<td><input type="submit" class="confirm" value="완료"></td>
					</div>
					</tr>
				</form>

			</div>
			<br>
			<br>
			<br>
			<table class="href">
			</table>
			<br>
			<br>
		</section>
		<aside></aside>

	</section>
           <script>
              $("#cancle").click(function(){
                 if(confirm("돌아가시겠습니까?")){
                    location.href="${pageContext.servletContext.contextPath}/index.jsp"
                 }
              });

	    $("#phone").keyup(function(){
	        let memberPhone = document.getElementById("phone").value;
	        var regExpPhone = /^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$/;
	        
	        if(!regExpPhone.test(memberPhone)){
                $("#phone").css('color', 'red').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
	            $("#PhoneArea").html('000-0000-0000 형식으로 입력해주세요.');
	        }else{
                $("#PhoneArea").html('옳바른 휴대폰 번호입니다.');
                $("#phone").css('color', 'black').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
            }
	    });
	    

	    $("#email").keyup(function(){
	        let memberEmail = document.getElementById("email").value;
	        var regExpPhone = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
	        
	        if(!regExpPhone.test(memberEmail)){
                $("#email").css('color', 'red').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
	            $("#emailArea").html('옮바른 이메일 형식을 입력해주세요.');
	        }else{
                $("#email").css('color', 'black').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
                $("#emailArea").html('옮바른 이메일 형식입니다.');
            }
	    });

           </script> 
	<br>
	<br>
	<br>
	<br>

	<jsp:include page="../../common/footer-main.jsp" />
</body>

</html>