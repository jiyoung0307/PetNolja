<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기1(사용자한테 입력받기)</title>

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
            <label for="name">이름 </label>　　　<input type="text" name="name" id="name" placeholder="이름을 입력하세요."><br><br>
            <label for="id">아이디 </label>　　<input type="text" name="id" id="id" placeholder="아이디를 입력하세요."><br><br>
            <label for="email">이메일</label>　　 <input type="text" name="email" id="email" placeholder="가입 시 등록한 이메일을 입력하세요.">
        </div>
        <br>
        <hr>
        <br><br><br>
        <div id="button">
            <button><b>취소</b></button> &nbsp;&nbsp;&nbsp; <button id="next"><b>다음</b></button>
        </div>
    </div>
</div>

<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>