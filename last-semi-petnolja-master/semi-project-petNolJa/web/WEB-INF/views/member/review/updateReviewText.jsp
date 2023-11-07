<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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

.littleTitle {
	font-size: 20px;
	color: rgb(80, 80, 80);
}

button{
	float: right;
	color: white;
	background-color: gray;
	border: 0ch;
	height: 30px;
	width: 110px;
}

.title {
	font-size: 50px;
	color: rgb(80, 80, 80);
}

#reviewStar, #petsitterReviewStar {
	font-size: 20px;
	bottom: 4px;
}

#reviewText, #petsitterReviewStar {
	resize: none;
}

#regist {
	background-color: burlywood;
	color: white;
}

#cancle {
	background-color: gray;
	color: white;
}

.button {
	margin: auto;
}


.star-rating {
	display: flex;
	flex-direction: row-reverse;
	font-size: 1.5rem;
	line-height: 2.5rem;
	justify-content: space-around;
	padding: 0 0.2em;
	text-align: center;
	width: 5em;
}

.star-rating input {
	display: none;
}

.star-rating label {
	-webkit-text-fill-color: transparent;
	/* Will override color (regardless of order) */
	-webkit-text-stroke-width: 2.3px;
	-webkit-text-stroke-color: #2b2a29;
	cursor: pointer;
}

.star-rating :checked ~label {
	-webkit-text-fill-color: gold;
}

.star-rating label:hover, .star-rating label:hover ~label {
	-webkit-text-fill-color: #fff58c;
}
        </style>
        <title>Insert title here</title>
    </head>

    <body>
        <jsp:include page="../../common/header-main.jsp" />




        <section class="wrap">
            <aside>　</aside>
		<section>
			<h2 class="selecth2" style="text-align: left; margin-left: 20px;">
				Review <br> <br>
			</h2>
			<h3 class="selecth3"
				style="text-align: left; margin-left: 20px; line-height: 20px;">
				고객님의 생생한 후기를 들려주세요 :) <br> <br>
			</h3>
			<br>
			<hr>
			<br> <br>
			<h3 class="selecth3" style="text-align: left; margin-left: 20px;">
				Overall Review</h3>
			<br>
			<form method="post" action="${pageContext.servletContext.contextPath}/updateReview">
				<table>
					<tr>
						<td style="text-align: right;">
							<p class="selecthp"
								style="margin-left: 15px; margin-right: 10px; text-align: left; margin-left: 30px;">
								총평점</p>
						</td>
						<td id="reviewStar" style="height: 50px;">
                        <div class="star-rating space-x-4 mx-auto">
                            <input type="radio" id="5-stars" name="rating" value="5" v-model="ratings" />
                            <label for="5-stars" class="star pr-4">★</label>
                            <input type="radio" id="4-stars" name="rating" value="4" v-model="ratings" />
                            <label for="4-stars" class="star">★</label>
                            <input type="radio" id="3-stars" name="rating" value="3" v-model="ratings" />
                            <label for="3-stars" class="star">★</label>
                            <input type="radio" id="2-stars" name="rating" value="2" v-model="ratings" />
                            <label for="2-stars" class="star">★</label>
                            <input type="radio" id="1-star" name="rating" value="1" v-model="ratings" />
                            <label for="1-star" class="star">★</label>
                        </div>
						</td>
					</tr>
					<tr>
						<td style="vertical-align: top;">
							<p class="selecthp"
								style="margin: 0px; text-align: left; margin-left: 20px;">
								리뷰 내용</p>
						</td>
						
						<td><textarea name="reviewText" id="reviewText" cols="100"
								rows="20" placeholder="리뷰를 작성해주세요" ></textarea></td>
					</tr>
					 

					
					<tr>
						<td></td>
							
						<td><div>
								<div>
									<c:forEach var="index" items="${ updateList }">
										<c:out value="${ index.userPicName }" />&nbsp;&nbsp;&nbsp;
	                    </c:forEach>
								</div>
							</div>
							<button id="roomUploadPic">사진 업로드</button></td>
					</tr>
				</table>
					<br> <br> <br> <br>
					<table class="button">
						<tr>
							<td>
					<input type="text" name="reviewNo" value="${ requestScope.reviewNo }" style="display: none;">
 				   <button type="reset" id="back">취소</button></td>
				<td><button type="submit" id="reviewRate">수정</button></td>
						</tr>
					</table>
		</form>
					<br> <br>
					<script>
						const reviewArea = document.getElementById("reviewText");
						reviewArea.innerHTML ="${requestScope.reviewContexts}";
					</script>
    <script>
    const back = document.getElementById("back");
    back.onclick = function() {
        if(confirm("취소하시겠습니까?")){
            alert("취소되었습니다.")
        location.href="${pageContext.servletContext.contextPath}/selectAllAndBestReview";
        }
    }
    </script>
<script>
            const reviewRate = "${requestScope.reviewRate}-stars";
            const reviewStar = document.getElementById(reviewRate);
            reviewStar.setAttribute("checked", true);
</script>
		</section>
		<aside></aside>

	</section>
	<br>
	<br>
	<br>
	<br>








	<jsp:include page="../../common/footer-main.jsp" />
</body>
</html>