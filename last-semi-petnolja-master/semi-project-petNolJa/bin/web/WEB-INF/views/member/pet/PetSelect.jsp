<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<meta charset="UTF-8">
<title>반려동물 조회</title>

    <style>
        body{background-color:rgb(243, 242, 242); width: 1500px; margin: auto;}
        .wrap{width: 1500px; margin: auto;}
        table{width: 100%; margin: auto;}
        #pic{background-color: rgb(207, 207, 207);  width: 450px; text-align: center;}
        #button{margin: 0 auto;}
        div>button{width: 120px; height: 30px; border: none; background-color: rgb(152, 126, 88); color: white;}
        aside{float: left; width: 300px;}
        h2{font-family:'Nanumsquare', "맑은 고딕","돋움",sans-serif;}
    </style>

</head>
<body>


 <jsp:include page="../../common/header-main.jsp"/>
 
    <div class="wrap">
        <div class="innerwrap" align="center">
            <h2>반려 동물 조회</h2>
            <hr>
            
             <c:forEach var="petSelect" items="${ requestScope.petList }">
            	<div class="pet-List">
            		<table>
            			<tr>
            				<td>
            					이름 : <c:out value="${ petSelect.petName }"/>
            				</td>
            			</tr>
            			<tr>
            				<td>
            					나이 : <c:out value="${ petSelect.petAge }"/>
            				</td>
            			</tr>		
            			<tr>
            				<td>
            					몸무게 : <c:out value="${ petSelect.petWeight }"/>
            				</td>
            			</tr>
            			
            			<tr>
            				<td>
            					품종 : <c:out value="${ petSelect.petType }"/>
            				</td>
            			</tr>
            			
            			
            		</table>
            	</div>
             </c:forEach>
            
            
            <hr>
            <br><br><br>

            <div id="button">
                <button id="cancle"><b>확인</b></button> &nbsp;&nbsp;&nbsp; <button><b>수정</b></button>
            </div>
        </div> 
    </div>
 
 <jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>