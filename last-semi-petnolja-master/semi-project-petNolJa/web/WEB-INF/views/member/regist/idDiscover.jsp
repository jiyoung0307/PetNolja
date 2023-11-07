<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Petnolja</title>
    <link rel="stylesheet" href="css/basic.css">
    <link rel="stylesheet" href="css/id_discover.css">
    <link href="https://fonts.googleapis.com/css2?family=Noto+Serif+KR&display=swap" rel="stylesheet">
    <script src="js/jquery-1.12.4.min.js"></script>
    <script src="js/jquery.slides.min.js"></script>
    <script src="js/jquery.stellar.js"></script>
    <script src="js/main_1.js"></script>
	<style>
	
	@charset "UTF-8";
	@charset "UTF-8";
	@import url('https://cdn.rawgit.com/moonspam/NanumSquare/master/nanumsquare.css');
	@import url('https://fonts.googleapis.com/css2?family=Kaisei+HarunoUmi&display=swap');
	@import url('https://fonts.googleapis.com/css2?family=Gilda+Display&display=swap');
	
	
	body{
	    background-color: rgb(243, 242, 242); 
	    font-family:'Nanumsquare', "맑은 고딕","돋움",sans-serif; color:#333; 
	    font-size:14px; box-sizing: border-box; }
	
	h2 {font-family: 'Nanumsquare', serif; }
	
	.wrap{width: 100%; overflow: hidden;}
	aside{float: left; width: 20%;}
	section>section{float: left; width: 60%; }
	aside{float: left; width: 20%;}
	
	
	#name {width: 300px; height: 20px;font-size: 12px;}
	#email {width: 300px; height: 20px; font-size: 12px;}
	#login{}
	.login_wrap{
	  height:600px;
	  text-align: center;
	}
	.login_wrap h2{
	  position:relative;
	  margin:60px auto 60px;
	  font-size:30px;
	}
	.login_wrap p{
	    padding-bottom: 20px;
	}
	
	.box_wrap {margin: 0 auto; padding: 50px 0; background-color: #ebe8e8;}
	.id a {font-size: 25px; text-align: center;}
	.login_wrap .box_wrap{
	  margin-top:40px;
	  margin-bottom:25px
	}
	  .box_wrap .id, .box_wrap .pw{
	    position:relative;
	    margin:16px auto 0;
	    width:288px;
	  }
	
	  
	.login_wrap .login_btn{
	  width:250px;
	  height:36px;
	  border:none;
	  background:#73645D;
	  color:#fff;
	  font-size:16px;
	  cursor:pointer;
	  margin-top: 60px;
	}
	#next,.wd_btn {
    background-color: #73645d;
    margin: 0 auto;
    width: 150px;
    height: 36px;
    border: none;
    color: #fff;
    font-size: 16px;
    cursor: pointer;}
	</style>
	
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>
     
    <!------------------------login-------------------------------->

    <section class="wrap">
        <aside>　</aside>
        <section>
            <main id="login">
                <div class="login_wrap">
                    <h2>아이디 찾기</h2>
                    <p>회원가입 시 입력한 이메일로 인증 번호가 전송 됩니다.
                       아이디 찾기에 문제가 있을 경우 고객센터로 문의 부탁 드립니다.</p>
                    <hr>
                    <form action="${ pageContext.servletContext.contextPath}/regist/findId" method="post">
                    <div class="box_wrap">
                        <div>
                            <label for="name">이름 </label> <input type="text" name="name" id="name" placeholder="아이디를 입력하세요."><br><br>
                            <label for="email">이메일</label> <input type="text" name="email" id="email" placeholder="가입 시 등록한 이메일을 입력하세요.">
                        </div>
                    </div>    
                    <br>
                    <hr>
                    <br>
              
                	<button type="submit" id="next">다음</button>  &nbsp;&nbsp;&nbsp; <button class="wd_btn" onclick="location.href='${ pageContext.servletContext.contextPath }/index.jsp'">취소</button> 
                	</form>  
                    
               
                </main>
        
        </section>
         
        <aside>　</aside>    
    </section>

</div>    
<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>