<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <style>
        .wrap {
            width: 100%;
            height:1300px;
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

        .title {
            font-size: 50px;
            color: rgb(80, 80, 80);}
        .selecth2 {font-weight:bold; fontsize:16px;}
        
        }

         .reviewTable tr td {
            padding-left: 25px;
            padding-right: 25px;
            padding-bottom: 15px;
        } 

        table {
            margin: auto;
        }

        #reviewDay {
            width: 90px;
        }

        #reviewStar {
            width: 40px;
        }

        #reviewText {
            width: 300px;
        }

        .pageButton {
            border: 0ch;
            width: 35px;
            height: 25px;
            border: 1px solid black;
        }

        #pageNum {
            display: inline-block;
            text-align: center;
            font-size: 15px;
            margin-left: 25px;
            margin-right: 25px;
        }

        #confirm {
            border: 0ch;
            color: white;
            height: 30px;
            width: 110px;
        }

        .confirm {
            text-align: center;
        }

        .detailAlign{
            text-align: center;
            margin: auto;
        }
        .detail1{
            margin-left: 20px;
            margin-right: 20px;
            padding: 15px;
        }
        .reviewTable{
            width: 800px;
        }
        .pic{
            height: 400px;
            width: 250px;
            border: solid black 1px;
            display: inline-block;
            margin: 20px;
            text-align: center;
        }
        .pic div1:hover {background-color:white; }
        .picAll{
            text-align: center;
        }
        .pic2{
            display: inline-block;
            border: solid black 1px;
            width: 200px;
            height: 200px;
            margin-top: 25px;
            margin-bottom: 15px;
        }
        .picture{
            object-fit: cover;
            width: 200px;
            height: 200px;
        }
        .picp{
            word-wrap: break-word; 
            width: 200px; height: 120px; 
            overflow: hidden;
        }
            .eachp{
                height: 20px;
                overflow: hidden;

            }

	#preButton,#nextButton{background-color:#73645d;border:none;}

    </style>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>







<section class="wrap">
    <aside>　</aside>
    <div class="innerwrap">
        <br>
        <h2 class="selecth2" style="text-align: left; margin-left: 20px;">
            Review
        </h2>
        <br>
        <p class="selecth2" style="margin-left: 20px;">펫놀자를 이용해 주신 고객님들이 직접 작성하신 후기입니다.</p>
        <br>
        <hr>
        <br>
        <p><h4 class="selecth4" style="margin-left: 20px;">
            Best review <br><br>
        </h4 class="selecth4">
        </p>




        </script>
        <div class="picAll">
            <div class="pic div1">
                <div class="pic2 div1-1">
                    <img class="picture" src="${pageContext.servletContext.contextPath}/${SelectBestReviewList[0].userPicSaveRoute}" onerror="this.style.display='none'" alt="picture3">
                </div>
                <table class="detailReview">
                    <tr>
                        <td class="detailReviewId eachp" ><p class="selectp"> ${SelectBestReviewList[0].memberId}</p></td>
                        <td class="detailReviewStar "><p class="selectp">★ ${SelectBestReviewList[0].reviewRate}</p></td>
                        <td></td>
                        <td class="detailReviewNo " style="display: none;">${SelectBestReviewList[0].reviewNo}</td>
                    </tr>
                    <tr>
                        <td colspan="2" class="detailReviewText eachp"><p class="picp"><br>${SelectBestReviewList[0].reviewContents}</p> </td>
                        <td style="display: none;"></td>
                        <td></td>
                        <td class="detailReviewNo" style="display: none;">${SelectBestReviewList[0].reviewNo}</td>
                </tr>
            </table>
            </div>

            <div class="pic div2">
                <div class="pic2 div1-2">
                    <img class="picture" src="${pageContext.servletContext.contextPath}/${SelectBestReviewList[1].userPicSaveRoute}" onerror="this.style.display='none'" alt="picture3">                
                    </div>
                <table class="detailReview">
                    <tr>
                        <td class="detailReviewId eachp"><p class="selectp"> ${SelectBestReviewList[1].memberId}</p></td>
                        <td class="detailReviewStar eachp"><p class="selectp">★ ${SelectBestReviewList[1].reviewRate}</p></td>
                        <td></td>
                        <td class="detailReviewId eachp" style="display: none;"> ${SelectBestReviewList[1].reviewNo}</td>
                    </tr>
                    <tr>
                        <td colspan="2" class="detailReviewText eachp"><p class="picp"><br> ${SelectBestReviewList[1].reviewContents}</p> </td>
                        <td style="display: none;"></td>
                        <td></td>
                        <td class="detailReviewId" style="display: none;"> ${SelectBestReviewList[1].reviewNo}</td>
                </tr>
            </table>    
            </div>
            

            
            <div class="pic div3">
                <div class="pic2 div1-3">
                    <img class="picture" src="${pageContext.servletContext.contextPath}/${SelectBestReviewList[2].userPicSaveRoute}" onerror="this.style.display='none'" alt="picture3">                
                </div>
                <table class="detailReview">
                    <tr>
                        <td class="detailReviewId eachp"><p class="selectp"> ${SelectBestReviewList[2].memberId}</p></td>
                        <td class="detailReviewStar"><p class="selectp">★ ${SelectBestReviewList[2].reviewRate}</p></td>
                        <td></td>
                        <td class="detailReviewId" style="display: none;">${SelectBestReviewList[2].reviewNo}</td>
                    </tr>
                    <tr>
                        <td colspan="2" class="detailReviewText eachp"><p class="picp"><br> ${SelectBestReviewList[2].reviewContents}</p> </td>
                        <td style="display: none;"></td>
                        <td></td>
                        <td class="detailReviewId" style="display: none;">${SelectBestReviewList[2].reviewNo}</td>
                </tr>
            </table>    
            </div>
        </div>






    <br><br><br><br>
        </select>
        <hr>
        <br>
        <br>
        <br>
        <table class="reviewTable">
            <tr>
                <td colspan="3">
                    <hr>
                </td>
            </tr>
            <tr style="margin-bottom: 10px;">
                <th><p>회원</p></td>
                <th><p>평점</p></td>
                <th><p>내용</p></td>
            </tr>
            <tr>
                <td colspan="3">
                    <br>
                    <hr>
                </td>
            </tr>
        <c:forEach items="${selectAllReviewList}" var="allList">
            <tr id="trtr">
                <td id="reviewDay" class="eachp">${allList.memberId}</td>
                <td id="reviewStar" class="eachp">★ ${allList.reviewRate}</td>
                <td id="reviewText" class="eachp">${allList.reviewContents}</td>
                <td id="reviewText" class="eachp" style="display: none;">${allList.reviewNo}</td>
            </tr>
                <tr>
                <td colspan="3"><hr></td>
                </tr>
        </c:forEach>
        </table>
        <br><br>
        <hr>
        <br>
        <table class="page1">
            <tr>
                <td><input type="button" class="pageButton preButton" id="preButton" value="<"></button>
                    
                </td>
                <td>
                    <div id="pageNum">1 | 2 | 3</div>
                </td>
                <!-- 페이징 처리 할 때 수정 가능성 99% -->
                
                <td><input type="button" class="pageButton preButton" id="nextButton" value=">"></button>
            </tr>
        </table>

        <script>
            if(document.getElementsByClassName("pic")) {
    
                const picture = document.getElementsByClassName("eachp");
    
                for(let i = 0; i < picture.length; i++){
                    picture[i].onmouseenter = function(){
                        this.parentNode.style.backgroundColor = "rgb(146, 142, 142";
                        this.parentNode.style.cursor = "pointer";
                    }
                    picture[i].onmouseout = function(){
                        this.parentNode.style.backgroundColor = "rgb(243, 242, 242)";
                    }
    
                    picture[i].onclick = function(){
                        location.href="${pageContext.servletContext.contextPath}/selectDetailReview?ReviewNo="
                              +this.parentNode.children[3].innerText
                    }
                }
            }
            </script>
        <div class="confirm">
            <br>
            <br>
        <br>
        <br>
        </div>
    </div>
    <aside>　</aside>

</section>














<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>