<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Petnolja</title>
    <style>
        body{
            background-color: rgb(243, 242, 242); 
            font-family:'Nanumsquare', "맑은 고딕","돋움",sans-serif; color:#333; 
            font-size:14px; box-sizing: border-box; width: 1500px;margin: auto; }

        h2 {font-family: 'Nanumsquare', serif; }
        
        .point_text { text-align: center; position: absolute; top: 30%;}
        .wrap{width: 100%; overflow: hidden;}
        aside{float: left; width: 20%;}
        section>section{float: left; width: 60%; }
        aside{float: left; width: 20%;}
        .top_box ul>li {display: inline-block; font-size: 16px; margin: 0 auto; }
        .top_box {margin: 0 auto; display: block;width: 130px;}
        .top_box div img {width: 80px; border: 1px solid black; position: absolute; left: 50%; border: 1px solid black;}
        #main_wrap {height: 670px; }   
        .tab >ul>li{display: inline-block;  width: auto;border: 1px solid black;}
        .tb {margin: 20px 40px; margin: 0 auto;width: 700px; text-align: center;border: 1px solid black;}
        .tb tr td { width: 300px; height: 60px;}
        .point_text {margin: 0 auto; display: block; position: absolute; top:35%; left: 50%; transform: translate(-50%); font-size: 20px; }
         .point_text span {}   
        .wrap_line { border-bottom: 1px solid black;}
        .wrap_line {margin-top:70px; width: 1000px;margin: 0 auto; }
        .wrap_line div {border-bottom: 1px solid black; margin-bottom: 20px;}
   </style>
</head>

<body>
<jsp:include page="../../common/header-main.jsp"/>

     
    <!------------------------login-------------------------------->
     <div id="main_wrap">

        <div class="top_box">
            <img src="../../../../resources/img/PointTopCircle.png">
        </div>  
        <br>
        <br>
        <div class="point_text">
            <span>
               사용 가능 포인트 
            </span>
               &nbsp;&nbsp;&nbsp;
            <span class="point"> 
               ${ pointList[0].memberPoint }
            </span>
          </div>
        <br>
        <br>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <table class="tb">
             <tr style="border: solid 1px solid;">
                <th> <button id="lastoneMonth" onclick="location.href='${pageContext.servletContext.contextPath}/pointSearchCriteria?value=1'">최근 1개월</button> </th>
                <th> <button id="lastThreeMonth" onclick="location.href='${pageContext.servletContext.contextPath}/pointSearchCriteria?value=3'">최근 3개월</button> </th>
                <th> <button id="lastSixMonth" onclick="location.href='${pageContext.servletContext.contextPath}/pointSearchCriteria?value=6'">최근 6개월</button> </th>
            </tr>
        </table>
        <br>
        <br>
        <br>
        <div class="wrap_line">
           <table style="text-align: center;" >
              <tr style="text-align: center;">
                 <td>
                    사용 날짜
                 </td>
                 <td>
                    사용 포인트
                 </td>
              </tr>
              
              
           <c:forEach var="point" items="${ pointList }">
              <tr style="text-align: center;">
                 <td>
                      <span>${ point.pointLogDate }</span>
                 </td>
                 <td>
                         <span>${ point.pointUse }</span>
                 </td>
              </tr>
           </c:forEach>
           </table>
                   
                </div>
        </div>
    
    <div>
   
    <button class="bottom_btn">완료</button>

</div>    
<jsp:include page="../../common/footer-main.jsp"/>


</body>
</html>