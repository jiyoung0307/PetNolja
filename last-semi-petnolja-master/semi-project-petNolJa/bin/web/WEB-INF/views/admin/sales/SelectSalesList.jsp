<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<meta charset="UTF-8">
<title>매출 조회</title>

<style>
	#table{text-align: left; border-collapse: collapse;}
    #button{position: absolute; width: 70%; text-align: center;}
    div>button{width: 120px; height: 30px; border: none; background-color: rgb(152, 126, 88); color: white;}
      	table{
            width: 800px;
        }
        .table{
            margin-left: 50px;
            margin-top: 20px;
            color: black;
        }
        .box{
            background-color: rgb(190, 190, 190);
            width: 800px;
            height: 300px;
            border-radius: 15px;
            color: black;
        }
         table tr td{
            text-align: center;
        }
        .selectPost{background-color: rgb(196, 196, 196); text-align: center;}
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>
<div class="tableTitle" >
            <h2>매출 조회</h2>
        </div>
        <form method="get" action="${pageContext.servletContext.contextPath}/select/date1" >
              <input type="date" id="date" onchange="dateChange();"/>
              <input name="paymentDate" type="text" id="text" />
              <button type="submit" id="subminbutton">검색</button>
              </form>
              <!-- <input type="submit" id="subminbutton" value="검색"> -->
        <table class="selectPost">
            <tr>
                <td><p>예약번호</p></td>
                <td><p>예약날짜</p></td>
                <td><p>객실번호</p></td>
                <td><p>총 결제금액</p></td>
            </tr>
             <c:forEach var="salesSelect" items="${ requestScope.salesList }">
            <tr>
                <td><p>${salesSelect.reservationNo}</p></td>
                <td><p>${salesSelect.paymentDate}</p></td>
                <td><p>${salesSelect.roomNo}</p></td>
                <td><p>${salesSelect.paymentPrice}</p></td>
            </tr>
            </c:forEach>
        </table>
        <script>
            var dateChange = () => {
                  var date_input = document.getElementById("date");
                  var text_input = document.getElementById("text");
                  text_input.value = date_input.value;
                };
         </script>
         
<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>