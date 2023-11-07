 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객실 게시물 목록 조회</title>

<style>

        table{
            width: 100%;
        }
        .table{
            margin-left: 50px;
            margin-top: 20px;
            color: black;
        }
        .box{
            background-color: rgb(190, 190, 190);
            border-radius: 15px;
            color: black;
        }
         table tr td{
            text-align: center;
        }
        td, tr{
        overflow: hidden;
        }
    </style>


</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="wrap">
	<div class="innerwrap">
	     <section>
	         <h2>Room List</h2>
	         <p>Petnolja만의 특별함을 느낄 수 있는 <b>객실</b>에서 <br>잊을 수 없는 특별한 경험을 반려동물에게 선사합니다.</p>
	         <br><hr><br>
	     </section>










        <div class="table">
        <table class="tableTop">
            <tr>
                <th style="text-align: left;"><h2 class="selecth2">객실 게시물 조회</h2></th>
            </tr>
        </table>
        <div class="box">
        
        <table class="selectPost">
            <tr style="margin-left: 50px; width=90%">
                <th><p style="margin-left: 5px;">No</p></td>
                <th><p>객실명</p></th>
                <th><p>내용</p></th>
                <th><p>등록자</p></th>
                <th><p>게시일</p></th>
                <th><p>view</p></th>
            </tr>
            <tr>
                <td colspan="6">
                    <hr>
                </td>
            </tr>
            
            <c:forEach var="roomPost" items="${requestScope.roomPostList}">
            <tr>
                <td><p>${roomPost.roomPostNo}</p></td>
                <td><p>${roomPost.roomPostTitle}</p></td>
                <td><p style="width: 280px">${roomPost.roomPostContents}</p></td>
                <td><p>${roomPost.roomPostNo}</p></td>
                <td><p>${roomPost.roomPostDate}</p></td>
                <td><p>${roomPost.roomPostAble}</p></td>
            </tr>
            </c:forEach>
        </div>
        </table>
        
        <script>
            if(document.getElementsByClassName("selectPost")) {
    
                const picture = document.getElementsByTagName("td");
    
                for(let i = 0; i < picture.length; i++){
                    picture[i].onmouseenter = function(){
                        this.parentNode.style.backgroundColor = "rgb(50,150,250)";
                        this.parentNode.style.cursor = "pointer";
                    }
                    picture[i].onmouseout = function(){
                        this.parentNode.style.backgroundColor = "rgb(190, 190, 190)";
                    }
    
                    picture[i].onclick = function(){
                        location.href="${pageContext.servletContext.contextPath}/selectRoomDetail?roomPostNo="
                        		+this.parentNode.children[0].innerText;
                    }
                }
            }
            </script>
    </div>
	










    </div>
 </div>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>