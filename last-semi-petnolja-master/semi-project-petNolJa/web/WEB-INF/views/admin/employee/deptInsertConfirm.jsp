<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

    <style>
        body{background-color:rgb(243, 242, 242); color: rgb(101, 101, 101); width: 1500px; margin: auto;}
        .wrap{width: 1500px; margin: auto;}
        #script{color: rgb(101, 101, 101); font-size: 14px;}
        #order{color:rgb(181, 181, 181); font-size: 12px;}
        .date{color:rgb(152, 126, 88);}
        #message{background-color: rgb(226, 224, 224); color: rgb(101, 101, 101); height: 150px; text-align: center;}
        
        #button{position: absolute; width: 1500px; margin: auto;}
        div>button{width: 120px; height: 30px; border: none; background-color: rgb(152, 126, 88); color: white;}
        #cancle{background-color: rgb(181, 181, 181);}
    </style>
    
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

    <div class="wrap">
        <div>
            <h2>부서 등록 확인</h2>
            <br>
            <hr>
            <br><br>
            <div id="message">
                <br>
                <h4>감사합니다.</h4>
                <p>부서가 성공적으로 <b>등록</b> 되었습니다.</p>
                <br>
            </div>
            <br><br><hr><br><br>
            <div id="button" align="center">
                <button><b>메인</b></button>
            </div>
         </div>
    </div>
    
    
<jsp:include page="../../common/footer-main.jsp"/>
</body>
</body>
</html>