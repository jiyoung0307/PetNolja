<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <style>
       body{background-color:rgb(243, 242, 242); color: black; font-size: 17px;}
        .wrap{width: 100%;}
        aside{float: left; width: 20%;}
        section>section{float: left; width: 60%; background-color: rgb(255, 255, 255);}
        aside{float: left; width: 20%;}

        .reviewTable tr td{
            border: solid white 1px;
            padding-left: 25px;
            padding-right: 25px;
            padding-bottom: 35px;
        }
        table{
            margin: auto;
        }

        #reviewDay{
            width: 90px;
        }
        #reviewStar{
            width: 140px;
        }
        #reviewText{
            width: 300px;
        }
        .pageButton{
            border: 0ch;
            width: 35px;
            height: 25px;
            background-color: white;
            border: 1px solid black;
        }
        #pageNum{
            display: inline-block;
            text-align: center;
            font-size: 15px;
            margin-left: 25px;
            margin-right: 25px;
        }
        #confirm{
            border: 0ch;
            background-color: rgb(141, 124, 78);
            color: white;
            height: 30px;
            width: 110px;
        }
        .confirm{
            text-align: center;
        }
    </style>
<title>Insert title here</title>
</head>
<body>

<jsp:include page="../../common/header-main.jsp"/>




<section class="wrap">
    <aside>　</aside>
    <section>
        <br>
            <h2 class="selecth2" style="text-align: left; margin-left: 20px;">
                Review history
            </h2>
        <br>
        <br>
            <br><br>
            <hr>
            <br><br>
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
        <c:forEach items="${selectReviewLogList}" var="reviewLogList">
            <tr id="trtr">
                <td id="reviewDay" class="eachp">${reviewLogList.memberId}</td>
                <td id="reviewStar" class="eachp">★ ${reviewLogList.reviewRate}</td>
                <td id="reviewText" class="eachp">${reviewLogList.reviewContents}</td>
                <td id="reviewText" class="eachp" style="display: none;">${reviewLogList.reviewNo}</td>
                <tr>
                <td colspan="3"><hr></td>
                </tr>
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
                        this.parentNode.style.backgroundColor = "rgb(50,150,250)";
                        this.parentNode.style.cursor = "pointer";
                    }
                    picture[i].onmouseout = function(){
                        this.parentNode.style.backgroundColor = "white";
                    }
    
                    picture[i].onclick = function(){
                        location.href="${pageContext.servletContext.contextPath}/selectDetailReview?ReviewNo="
                        		+this.parentNode.children[3].innerText
                    }
                }
            }
            </script>
            <br>
            	<br>
    </section>
    <aside>　</aside>
    
</section>












<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>