<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 페이지의 예약내역 목록 조회</title>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<style>
    input{background: none; border: none; text-align: center; font-size: large;}
    table{width: 100%;}
    #review{text-align: right;}
    #pic{background-color: rgb(207, 207, 207);  width: 30%; text-align: center;}
    #button{position: absolute; width: 60%; text-align: center;}
    div>button{width: 120px; height: 30px; border: none; background-color: rgb(152, 126, 88); color: white;}
</style>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

<div class="wrap">
    <div class="innerwrap">
        <h2>예약 내역</h2>
        <p>고객님의 반려동물에 대한 호텔 예약 내역을 확인할 수 있습니다.</p>
        <br>
        <h4>예약 날짜 설정</h4>
        <input type="date" name="checkIn" id="checkIn" value="2022-04-01"> <b> - </b> <input type="date" name="checkOut" id="checkOut" value="2022-04-30">
        <br><br>
        <hr>
        <table>
        <c:forEach var="reservation" items="${ requestScope.reservationList }" varStatus="st">
            <tr>
                <td colspan="3" id="review"><button onclick="location.href='${pageContext.servletContext.contextPath }/insertReviewForm?reservationNo=${reservation.reservationNo}'">Review 작성하기</button></td>
            </tr>
            <tr>
                <td colspan="3"> <p>객실명 : <c:out value="${reservation.room.roomName}"/><br><br> 담당 펫시터 : <c:out value="${reservation.petsitter.emp.empName}"/><br><br> 예약 기간 : <c:out value="reservationList.reservationCheckIn"/> ~ <c:out value="reservationList.reservationCheckOut"/></p></td>
            </tr>
            <tr>
                <td colspan="3"><br><hr></td>
            </tr>
        </c:forEach>
        </table>
        <br><br><br>
        <div id="button">
            <button onclick="location.href='${pageContext.servletContext.contextPath}'"><b>메인으로</b></button>
        </div>
    </div>
</div>

<jsp:include page="../../common/footer-main.jsp"/>

</body>
</html>