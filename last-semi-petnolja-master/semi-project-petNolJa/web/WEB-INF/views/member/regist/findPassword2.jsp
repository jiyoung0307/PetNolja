<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기2(비밀번호 변경)</title>

<style>
    #script{color: rgb(101, 101, 101); font-size: 14px;}
    div{text-align: left;}
    input{width: 35%;}
    #button{position: absolute; width: 60%; text-align: center;}
    div>button{width: 120px; height: 30px; border: none; background-color: rgb(196, 196, 196); color: white;}
    #next{background-color:rgb(152, 126, 88);}
</style>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

<div class="wrap">
     <div class="innerwrap">
         <h2>비밀번호 찾기</h2>
         <p id="script">회원가입 시 입력한 이메일로 인증 번호가 전송됩니다. <br>
         비밀번호 찾기에 문제가 있을 경우 고객센터로 문의 부탁 드립니다.</p>
         <br>
         <hr>
         <br>
         <div>
             <label for="newPwd">새로운 비밀번호 </label>　<input type="text" name="newPwd" id="newPwd" placeholder="새로운 비밀번호를 입력하세요."><br><br>
             <label for="checkPwd">비밀번호 확인 </label>　　<input type="text" name="checkPwd" id="checkPwd" placeholder="비밀번호를 다시 입력하세요."><br><br>
         </div>
         <br>
         <hr>
         <br><br><br>
         <div id="button">
             <button id="next"><b>로그인</b></button>
         </div>
     </div>
 </div>

<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>