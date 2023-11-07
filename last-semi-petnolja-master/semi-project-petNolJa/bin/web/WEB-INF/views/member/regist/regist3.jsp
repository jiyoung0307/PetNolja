<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
     h2{}
     #script{color: rgb(101, 101, 101); font-size: 14px;}
     #order{color:rgb(181, 181, 181); font-size: 14px;}
     .date{color:rgb(152, 126, 88);}
     #message{background-color:#ebe8e8; color: rgb(101, 101, 101); height: 150px; text-align: center;}
     .text-deco{color: rgb(152, 126, 88);}
     #cancle{background-color:  #ebe8e8;}
     #button{margin:0 auto; width:150px;bordre:1px solid red;}
 </style>

</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

<div class="wrap">
    <div class="innerwrap">
        <div align="center">
            <h2>회원 정보 입력</h2><br>
            <p id="order">① 약관동의 - ② 회원 정보 입력 - <b class="text-deco"> ③ 가입 완료</b></p>
        </div>
        <br>
        <hr>
        <br><br>
        <div id="message">
            <br>
            <h4>감사합니다.</h4>
            <p>고객님의 Petnolja 회원 가입이 <b>완료</b> 되었습니다.</p>
            <br>
        </div>
        <br><br><hr><br><br>
        <div id="button"><button type="submit" onclick="location.href='${ pageContext.request.contextPath }/index.jsp'"><b>메인으로</b></button></div>
    </div>
</div>

<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>