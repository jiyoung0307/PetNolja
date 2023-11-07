<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 2단계(객실)</title>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<style>
    #script{color: rgb(101, 101, 101); font-size: 14px;}
    #order{color:rgb(181, 181, 181); font-size: 12px;}
    .date{color:rgb(152, 126, 88);}
    table{width: 100%; text-align: center;}
    #pic{width: 50%; height: 100px;}
    #room{text-align: left; font-size: large;}
    #price{text-align: right; font-size: smaller;}
    #button{position: absolute; width: 60%; text-align: center;}
    div>button{width: 120px; height: 30px; border: none; background-color: rgb(152, 126, 88); color: white;}
</style>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

<div class="wrap">
     <div class="innerwrap">
         <h2>Booking</h2>
         <p id="script">Petnolja만의 특별한 <b>petsitter</b>와 편안함을 느낄 수 있는 <br>
             <b>객실</b>에서 잊을 수 없는 여행의 경험을 애완동물에게 선사합니다.</p> 
         <p id="order">① 날짜 선택 - <b class="date">② 객실/펫시터 선택</b> - ③ 기본 정보 입력 및 결제 - ④ 예약 완료</p>
         <br>
         <hr>
         <br>
         <div class="thumbnail-area" id="thumbnailArea">
         <c:forEach var="roomList" items="${ requestScope.roomList }">

			<div class="thumb-list">
                <table>
                    <tr>
                        <td colspan="4">
                            <img src="${ pageContext.request.contextPath }${ roomList.roomPostDTO.adminPicture.adminPictureSaveRoute }" width="100%" height="180px">
                        </td>
                        <td rowspan="2" style="width: 30px;"></td>
                    </tr>
                    <tr>
                        <td style="text-align: left;"><c:out value="${ roomList.roomName }"/></td>
                        <td><label style="display: none;"><c:out value="${ roomList.roomNo }"/> </label></td>
                        <td style="text-align: right;">$<c:out value="${ roomList.roomPrice }"/></td>
                        <td style="text-align: right;">남은 객실 수량: <c:out value="${ roomList.roomAble }"/></td>
                    </tr>
                </table>
            </div>
            
            </c:forEach>
         <br>
         <br>
         <br>
        </div>
     </div>
 </div>

 <script>
    $("#thumbnailArea > div").click(function(){
        if(confirm('해당 객실을 선택하시겠습니까?')){
            const roomNo = $(this).find("label").text();
            console.log(roomNo);
            location.href = "${ pageContext.servletContext.contextPath }/reservation/petsitter?no=" + roomNo;
        }
    });
    
</script>

<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>