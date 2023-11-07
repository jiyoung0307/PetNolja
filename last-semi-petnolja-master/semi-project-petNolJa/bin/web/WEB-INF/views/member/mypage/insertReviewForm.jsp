<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.wrap{margin: 0 auto; height: 750px;}

        .littleTitle {
            font-size: 20px;
            color: rgb(80, 80, 80);
        }

        .title {
            font-size: 50px;
            color: rgb(80, 80, 80);
        }

        #reviewStar,
        #petsitterReviewStar {
            font-size: 20px;
            position: relative;
            bottom: 4px;
        }

        #reviewText,
        #petsitterReviewStar {
            resize: none;
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
        
      	h4{font-family:'Gilda Display', serif; }
      	.button{text-align: center; margin: 0 auto; border}
        div>button{width: 120px; height: 30px; border: none; background-color: rgb(196, 196, 196);}
    </style>


</head>
<body>

<jsp:include page="../../common/header-main.jsp"/>

<div class="wrap">
        <section class="innerwrap">
                <h2>
                    Review <br>
                </h2>
                <p>
                    고객님의 생생한 후기를 들려주세요 :) <br><br>
                </p>
            <hr>
            <h4>
                Overall Review
            </h4>
            <br><br>
                <div align="center">
            <table>
                <tr>
                    <td style="text-align: right;"><p>총 평점</p></td>
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
                    <td style="vertical-align: top;"><p style="margin: 0px;">리뷰 내용</p></td>
                    <td><textarea name="reviewText" id="reviewText" cols="55" rows="5"
                            placeholder="리뷰를 작성해주세요"></textarea></td>
                    <td><input type="text" style="display: none;" value="${requestScope.reservationNo}" id="reservationNo"></td>
                </tr>
            </table>
            <hr>

    <button type="reset" id="back">취소</button></td>
    <script>
    const back = document.getElementById("back");
    back.onclick = function() {
        if(confirm("취소하시겠습니까?")){
            alert("취소되었습니다.")
        location.href="${pageContext.servletContext.contextPath}/selectAllAndBestReview";
        }
    }
    </script>
			<td><button type="button" id="reviewRate">등록</button></td>
	<script>
      $(document).ready(function () {
        $('#reviewRate').click(function () {
          const rating = $('input[name="rating"]:checked').val();
          let reviewText = document.getElementById("reviewText").value;
          let reservationNo = document.getElementById("reservationNo").value;
        if(confirm("리뷰를 작성 하시겠습니까?")){
        location.href="${pageContext.servletContext.contextPath}/insertReview?rating="+rating+"&reviewText="+reviewText+"&reservationNo="+reservationNo
        };
        });
      });
      
    </script>

    </div>
 

  
    
<jsp:include page="../../common/footer-main.jsp"/>

</body>

</html>