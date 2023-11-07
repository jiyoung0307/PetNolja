<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>1:1 문의 등록 페이지</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<style>
    	body{background-color:rgb(243, 242, 242);width: 1500px;margin: auto;}
        .top_txt{color: rgb(101, 101, 101); font-size: 14px; height: 150px; padding:50px s0; border-bottom: 0.7px solid black; ;width: 500px;}
        .box_wrap>div {margin: 0 auto; width: 500px;}
        .box_wrap .text{overflow: hidden; margin: 0 auto;}
        .main{margin: 0 auto;}
        #order{color:rgb(181, 181, 181); font-size: 12px;}
        .date{color:rgb(152, 126, 88);}
        aside{float: left; width: 20%;}
        section{float: left;width: 60%;}
        table{width: 100%; text-align: center;}
        #pic{width: 50%; height: 100px;}
        #room{text-align: left; font-size: large;}
        #price{text-align: right; font-size: smaller;}
        #button{  margin: 0 auto; width: 280px; border: 1px solid red;} 
        div>button{width: 120px; height: 30px; border: none; background-color: rgb(152, 126, 88); color: white;}
        aside{float: left; width: 20%;}
        h2{font-size: 35px;}

    </style>

</head>
<body>
    <jsp:include page="../../common/header-main.jsp"/>
	
    <div id="wrap">
        <div class="top_txt">
             <h2>1:1 question</h2>
             <p>문의사항을 남겨주시면 성실하게 답변해 드리겠습니다.</p>
        </div>
        <div class="main">
        <form action="${ pageContext.servletContext.contextPath }/question/insert" method="post">
            <div class="box_wrap">
                <div>
                    <label for="name">제목 </label>　　　
                    <input type="text" name="name" id="name" placeholder="이름을 입력하세요."><br><br>
                    <label for="text">문의내용</label>　　 
                    <textarea name="textarea" cols="100" rows="20" style="resize: none;"></textarea>
                </div>
                 <div class="button">
	        	<button type="reset" onclick="location.href='${ pageContext.request.contextPath }/index.jsp'"><b>취소</b></button>&nbsp;&nbsp;&nbsp; <button type="submit"><b>등록</b></button>
            	</div> 
            	</div>
        </form>	
            </div>   
        </div>
    
    
 
    <jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>