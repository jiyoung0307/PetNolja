<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/admin_main.css">
<style>
        .point_text { text-align: center; position: absolute; top: 30%;}
        .wrap{width: 100%; overflow: hidden;}
        .wrap {border: 1px solid black;}
        aside{float: left; width: 20%;}
        section>section{float: left; width: 60%; }
        aside{float: left; width: 20%;}
        .top_box ul>li {display: inline-block; font-size: 16px; margin: 0 auto; border: 1px solid black; }
        .top_box {margin: 0 auto; border: 1px solid black; display: block;width: 130px;}
        .top_box div img {width: 80px; border: 1px solid black; position: absolute; left: 50%; border: 1px solid black;}
        #main_wrap {height: 670px; border: 1px solid black; border: 1px solid black;}   
        .tab >ul>li{display: inline-block;  width: auto;border: 1px solid black; color:}
        .tb {margin: 20px 40px; border: 1px solid black; margin: 0 auto;width: 700px; text-align: center; rgb(216, 220, 225);}
        .tb tr td { border: 1px solid red; width: 300px; height: 60px;}
        .point_text {margin: 0 auto; display: block; border: 1px solid red; position: absolute; top:35%; left: 50%; transform: translate(-50%); font-size: 20px; }
         .point_text span {border: 1px solid red;}   
        .wrap_line { border-bottom: 1px solid black;}
        .wrap_line {margin-top:70px; width: 1000px;margin: 0 auto; }
        .wrap_line div {border-bottom: 1px solid black; margin-bottom: 20px;}
   </style>
</head>

<body>
     
     
     <div id="main_wrap">

        <div class="top_box">
            <img src="img/제목 없음-1.png" alt="">
        </div>  
        <br>
        <br>
        <div class="point_text">
            <span>사용 가능 포인트</span>&nbsp;&nbsp;&nbsp;<span class="point">20000</span>
         </div>
        <br>
        <br>
        <br>
        
        <table class="tb">
            <tr>
                <td>최근 1개월</td>
                <td>04월</td>
                <td>03월</td>
            </tr>
        </table>
        <br>
        <br>
        <br>
        <div class="wrap_line" >
                <div class="da">2022.04.28  <span>사용 800P</span>
                  
                </div>
                <div class="da">2022.04.28 <span>사용<br>800P</span>
                   
                </div>
                <div class="da">2022.04.28 <span>사용<br>800P</span>
                   
                </div>
        </div>
    
    </div>
       
</body>
</html>