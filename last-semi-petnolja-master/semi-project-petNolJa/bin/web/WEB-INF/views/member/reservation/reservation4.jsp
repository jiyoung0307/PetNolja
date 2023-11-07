<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 4단계(예약 성공)</title>

<style>
    #script{color: rgb(101, 101, 101); font-size: 14px;}
    #order{color:rgb(181, 181, 181); font-size: 12px;}
    .date{color:rgb(152, 126, 88);}
    #message{background-color: rgb(226, 224, 224); color: rgb(101, 101, 101); height: 150px; text-align: center;}
    
    #button{position: absolute; width: 60%; text-align: center;}
    div>button{width: 120px; height: 30px; border: none; background-color: rgb(152, 126, 88); color: white;}
    #cancle{background-color: rgb(181, 181, 181);}
</style>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

<div class="wrap">
     <div class="innerwrap">
         <h2>Booking</h2>
         <p id="script">Petnolja만의 특별한 <b>petsitter</b>와 편안함을 느낄 수 있는 <br>
             <b>객실</b>에서 잊을 수 없는 여행의 경험을 애완동물에게 선사합니다.</p> 
         <p id="order">① 날짜 선택 - ② 객실/펫시터 선택 - ③ 기본 정보 입력 및 결제 - <b class="date">④ 예약 완료</b></p>
         <br>
         <hr>
         <br><br>
         <div id="message">
             <br>
             <h4>감사합니다.</h4>
             <p>고객님의 객실 예약이 <b>완료</b> 되었습니다.</p>
             <br>
         </div>
         <br><br><hr><br><br>
         <div id="button"><button onclick="location.href='${pageContext.servletContext.contextPath}/reservation/list/select'"><b>예약 조회</b></button></div>
     </div>
 </div>
<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>