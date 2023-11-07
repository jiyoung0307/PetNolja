<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>펫놀자</title>

</head>
<body>
<jsp:include page="../common/header-main.jsp"/>

<div id="sub_menu" style="left:-300px ;">
    <div class="cover"></div>
    <div class="closeBtn">
        <div class="close1"></div>
        <div class="close2"></div>
    </div>
    <div class="login">
        <li><a href="#">login</a></li>
        <li> <a href="#">reservation</a></li>
    </div>
    <div class="sub_list">
        <li><a href="${pageContext.servletContext.contextPath}\selectMemberInfo">my page</a>	<!-- 서블릿으로 이동 후 마이 페이지로 이동 -->
            <div class="sub">
                <ul>
                    <li><a href="#">반려동물 등록</a></li>
                    <li><a href="#">반려동물 조회</a></li>     
                    <li><a href="#">예약내역 조회</a></li>
                    <li><a href="#">작성리뷰 조회</a></li>
                </ul>
                
            </div>
        </li>
    </div>
    <div class="sub_footer"> ⓒPetnolja</div>
<!--sub_menu end-->
</div>      
<div id="slider">
    <div class="sliders">
        <div><img src="resources/img/10.jpg" alt="1"></div>
        <div><img src="resources/img/12.jpg" alt="2"></div>     
    </div>
</div>
</body>

<jsp:include page="../common/footer-main.jsp"/>
</html>