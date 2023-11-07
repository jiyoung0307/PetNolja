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
    <link rel="stylesheet" href="css/id_discover2.css">
    <link href="https://fonts.googleapis.com/css2?family=Noto+Serif+KR&display=swap" rel="stylesheet">
    <script src="js/jquery-1.12.4.min.js"></script>
    <script src="js/jquery.slides.min.js"></script>
    <script src="js/jquery.stellar.js"></script>
    <script src="js/main_1.js"></script>

</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>


    <section class="wrap">
        <aside>　</aside>
        <section>
            <main id="login">
                <div class="login_wrap">
                    <h2>아이디찾기</h2>
                    	
                    <hr>
                    <div class="box_wrap">
                        <div class="id">
                            <p>ID: ${ requestScope.memberDTO.memberId }</p>
                        </div>    
                    </div>    
                    <hr>
                    <button class="login_btn" onclick="location.href='${ pageContext.servletContext.contextPath }/common/login'">로그인</button>
        
                </div>
            </main>
            <jsp:include page="../../common/footer-main.jsp"/>
        </section>
        <aside>　</aside>    
    </section>

    
    
<!--     
    <main id="login">
        <div class="login_wrap">
            <h2>ID 찾기</h2>
      
            <dv class="box_wrap">
                <div class="id">
                    <p><a href="#">pet_nol_ja</a></p>
                </div>    
            </div>
            <div class="checkB">
                <div class="stayC">
                    <input type="checkbox">
                    <p>로그인 상태 유지</p>
                </div>  
                <div class="saveC">
                    <input type="checkbox">
                    <p>아이디 저장</p>
                </div>  
            </div>    
            <button class="login_btn">로그인</button>

        </div>
    </main> -->
    
</div>    
</body>
</html>