<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 2단계(펫시터)</title>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>

<style>
    table{float: left; cursor: pointer;}
    p{margin-bottom: 10px; margin-top: 10px;}
        #order{color:rgb(181, 181, 181); font-size: 12px;}
        .date{color:rgb(152, 126, 88);}
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
		<c:forEach var="petsitter" items="${ requestScope.petsitterList }">
			<div class="thumb-list">

                <table>
                    <tr>
                        <td colspan="3">
                            <img src="${ pageContext.request.contextPath }/${ petsitter.petsitterPost.adminPicture.adminPictureSaveRoute }" width="250px" height="180px">
                        </td>
                        <td rowspan="2" style="width: 30px;"></td>
                    </tr>
                    <tr>
                        <td style="text-align: left;"><c:out value="${ petsitter.emp.empName }"/> 시터</td>
                        <td><label><c:out value="${ petsitter.empId }"/> </label></td>
                        <td style="text-align: right;">$<c:out value="${ petsitter.ability.abilityMoney }"/></td>
                    </tr>
                </table>
            </div>
            </c:forEach>
	</div>
        <div style="clear: both;"></div>
        <br><br><br><br><br><br><br>
	<jsp:include page="../../common/paging.jsp"/>
	
	<script>
		$("#thumbnailArea > div").click(function(){
            if(confirm('해당 펫시터를 선택하시겠습니까?')){
                const empId = $(this).find("label").text();
                console.log(empId);
                location.href = "${ pageContext.servletContext.contextPath }/reservation/payment?no=" + empId;
            }
		});
		
	</script>

<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>