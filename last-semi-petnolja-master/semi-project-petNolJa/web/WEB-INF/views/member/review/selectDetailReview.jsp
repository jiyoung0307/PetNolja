<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <style>
            body {
                color: black;
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
            }

            aside {
                float: left;
                width: 20%;
            }

            .memberInfo tr td {
                padding-left: 15px;
            }

            .memberInfo {
                text-align: left;
            }

            .picGroup {
                text-align: center;
            }

            .button {
                margin: auto;
            }

            button {
                float: right;
                color: white;
                background-color: rgb(131, 105, 58);
                border: 0ch;
                height: 30px;
                width: 110px;
            }

            .reviewInfo tr td {
                padding-right: 15px;
                padding-bottom: 3px;
            }

            .memberInfo {
                margin-left: 50px;
            }

            .text {

                margin-left: 52px;
            }
            
            .picture{
            object-fit: cover;
            width: 250px;
            height: 250px;
            margin: 0auto;
            overflow: hidden;
       	    }

            .rec {
            width: 250px; 
            height: 250px; 
            border: 1px solid black; 
            text-align: center; 
            display: inline-block; 
            margin: 15px;
           }
        </style>
        <title>Insert title here</title>
    </head>

    <body>
        <jsp:include page="../../common/header-main.jsp" />




        <section class="wrap">
            <aside>　</aside>
            <section>
                <br>
                <h2 class="selecth2">
                    Detailed review
                </h2>
                <br>
                <hr>
                <br>
                <table class="memberInfo">
                    <tr>
                        <td>
                            <p>
                            <h3 class="selecth3">${ requestScope.reviewDTO.memberId }</h3>
                            </p>
                        </td>
                        <td>${SessionScope.loginMember.memberName}</td>
                        <td>
                            <p>
                            <h3 class="selecth3">${ requestScope.reviewDTO.gradeName }</h3>
                            </p>
                        </td>
                        <!-- <td>{SessionScope.memberDTO.grade}</td> -->
                        <td>
                            <p>
                            <h3 class="selecth3">${ requestScope.reviewDTO.reviewDate }</h3>
                            </p>
                        </td>
                        <!-- <td>attributeScope.date</td> -->
                        <td>
                            <p>
                            <h3 class="selecth3">★ ${ requestScope.reviewDTO.reviewRate }</h3>
                            </p>
                        </td>
                        <!-- <td>attributeScope.reviewStar</td> -->
                    </tr>
                </table>
                <br>
                <br>
                <div class="picGroup">
                <c:forEach items="${ userPictureList }" var="userPicture">
               <%--  ${pageContext.servletContext.contextPath}<br> --%>
                     <div class="rec picRec1">
                        <img src="${pageContext.servletContext.contextPath}/${ userPicture.userPicSaveRoute }" alt="picture1"
                            class="picture pic" id="reviewPic1">
                    </div>
				</c:forEach>
                </div>
                <br>
                <div class="text">
                    <div id="reviewText">
                        <p class="selecth3">${ requestScope.reviewDTO.reviewContents }</p>
                    </div>
                    <!-- {attribute.reviewDTO.reviewText} -->
                    <br>
                    <table class="reviewInfo">
                        <tr>
                            <p class="selectp">
                                <%-- <td>체크 인 ${pageContext.servletContext.contextPath}/${ requestScope.userPictureList[0].userPicSaveRoute }</td> --%>
                                <td>${ requestScope.reviewDTO.checkIn }</td>
                            </p>
                        </tr>
                        <tr>
                            <p class="selectp">
                            <td>체크아웃</td>
                            <td>${ requestScope.reviewDTO.checkOut } </td>
                            </p>
                        </tr>
                        <tr>
                            <p class="selectp">
                            <td>객실</td>
                            <td>${ requestScope.reviewDTO.roomName }</td>
                            </p>
                        </tr>
                        <tr>
                            <p class="selectp">
                            <td>펫시터</td>
                            <td>${ requestScope.reviewDTO.empName }</td>
                            </p>
                        </tr>
                    </table>
                    <br>
                </div>
                <hr>
                <br>
                <br>
                
			<c:if test="${ sessionScope.loginMember.memberNo eq memberNo }">
            <table class="button" id="btn1">
                    <tr>
                        <td><button onclick="re();" id="cancle">수정</button></td>
                        <script>
                            function re() {
                                if (confirm("수정 하시겠습니까?")) {
                                    location.href = "${pageContext.servletContext.contextPath}/updateReviewForm?reviewNo=${requestScope.reviewDTO.reviewNo}";
                                }
                            }
                        </script>
                        <td><button onclick="del();" id="regist">삭제</button></td>
                        <script>
                            function del() {
                                if (confirm("정말 삭제하시겠습니까?")) {
                                	/* const passWord = prompt("비밀번호를 한 번 더 입력하세요.");
                                    location.href = "${pageContext.servletContext.contextPath}/deleteReview?reviewNo=${requestScope.reviewDTO.reviewNo}&memberNo=${sessionScope.loginMember.memberNo}&passWord="+passWord */
                                    location.href = "${pageContext.servletContext.contextPath}/deleteReview?reviewNo=${requestScope.reviewDTO.reviewNo}";
                                    		
                                }
                            }
                        </script>
                    </tr>
                </table>
			</c:if>
			<br>
			<br>
            </section>
            <aside>　</aside>

        </section>
        <br><br>

					<!-- <script>
				    const btn = document.getElementById("btn1");
				    btn.style.display = "none";
				</script> -->



        <jsp:include page="../../common/footer-main.jsp" />
    </body>

    </html>