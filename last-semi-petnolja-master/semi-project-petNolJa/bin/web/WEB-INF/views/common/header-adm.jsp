<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/css/admin_main.css">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/css/slick-theme.css">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/css/slick.css">
<script src="${ pageContext.servletContext.contextPath }/resources/js/jquery-1.12.4.min.js"></script>
<script src="${ pageContext.servletContext.contextPath }/resources/js/main.js"></script>
<script src="${ pageContext.servletContext.contextPath }/resources/js/slick.min.js"></script>
<script src="${ pageContext.servletContext.contextPath }/resources/js/slider.js"></script>

<style>

h1{}
header{}
body{background-color:#f1efec; font-family:'Nanumsquare', "맑은 고딕","돋움",sans-serif;}
#pix-nav{height:500px;}
#admin-member{left: 0; border-bottom: 0.7px solid black;height: 230px; background-color: #292523;}
#admin-menu{height:200px;}
h3{color:rgba(233, 230, 226, 0.7);}
#button{position: absolute; margin-left: 300px; margin-top:20px;}
	
	#admin-member p{color:rgba(233, 230, 226, 0.7); margin-top:0; font-size:16px;}
	.sub_wrap { display:none; position:absolute; top:111px; left:0; right:0; height:265px; border-bottom:0.7px solid #292523;padding:0 0 30px 0;}
	.sub_wrap > ul { position:relative; width:1200px; margin:auto;  }
	.sub_wrap > ul > li { float:left; width:240px; margin-top:24px; }
	.sub_wrap > ul > li > a {font-famliy: "맑은 고딕",sans-serif;   font-size:14px; line-height:33px; font-weight: bold; }
	.innerwrap{width: 900px; height: 600px; margin-left:30px; padding-top: 30px;}
	.button{width:320px; margin:0 auto; border:1px solid red; }
	.m01_b:before { display:block; content:''; position:relative; top:25px; left:-20px; width:5px; height:5px; border:1px solid #000; }
	.m01_b:hover a::before, .sub_list li.on a::before { border:1px solid #292523; background:#292523; transform:rotate(45deg); transition: 0.3s; }
	 
	 /*서브메뉴*/
	 .m01{margin:10px 0;}
	 .m01 > a {line-height: 45px;}
	 .sub_wrap {  position:absolute; width: 100%; left:0; right:0; height:265px; 
	 padding:0 0 30px 0;color:#f1efec;   }
   
    .sub_wrap > ul > li { margin: 0 auto; width:100%; margin-top:24px; }
    .sub_wrap > ul > li > a { font-size:15px; line-height:33px; color:  #0b1c2c; }

    /*서브들 전부*/   
    .sub_wrap a { }   
    .sub_wrap .floatX { clear:both; }  
    .sub_wrap .subUp { margin-left:-240px; margin-top:130px; }

    .subhas {}
    .subhas ul { }
    .subhas li {}
    .subhas a { font-size:13px; line-height:30px; color:  #0b1c2c; }

    /*서브메뉴-2*/
    .sub_wrap {display: none; position:relative; top:0px; margin: 0 auto; width: 100%; height:auto; padding:0 0 0 0;  }
    .sub_wrap > ul { position:relative; width:100%; }
    .sub_wrap > ul > li { float:none; width:auto; margin-top:0;  border-top:1px solid #ccc;}
    .sub_wrap > ul > li > a { font-size:14px; line-height:37px; }
    .sub_wrap > ul > li > a:hover { color: #959595;}



    .sub_wrap > ul > li.subhas { padding-left:0;  }

    .subhas ul { display:none; background:#ebe9e9; padding-left:20px;  border-top:1px solid #ccc;}
    .subhas > a {  position:relative; display:block; padding-left:20px;}
    .subhas > a:after { position:absolute; top:15px; right:15px; display:block; content:""; width:11px; height:11px; background:url('../img/icon_sp.png') no-repeat -125px -14px / 400px 400px}
    .subhas.on > a:after { background-position:-125px -25px;}

    .subhas > ul > li { }
    .subhas > ul > li > a { font-size:13px; line-height:26px; }
   
 footer{width:100%; bottom:0; left:0; background-color:#292523;height:40px; z-index:1000px; position:fixed;}
 footer p{color:rgba(233, 230, 226, 0.7); margin-top:10px; font-size:13px;}      
</style>
</head>
<body > 
    <header>
        <div id="header">
            <h1 align="center">Petnolja</h1>
        </div>
    </header>
 <div id="wrap">
        <section id="body">
            <aside id="pix-nav">
                <div id="admin-member" align="center">
                    <br>
                    <h3>인사부</h3>
                    <h3><c:out value="${ sessionScope.loginMember.empName }"/>님</h3>
                    <br>
                    <p><c:out value="${ sessionScope.loginMember.empEmail }"/></p> <br>
                </div>
                <div id="admin-menu">
                    <section align="center">
                        <ul>
                            <li class="m01">
                                <a class="m01_b" href="#">회원 관리</a>
                                <div class="sub_wrap">
                                    <ul>
                                        <li class="subhas" ><a href="${ pageContext.servletContext.contextPath }/admin/member/select">회원 정보 조회</a></li>
		                        		<li class="subhas"><a href="${ pageContext.servletContext.contextPath }/member/admin/select">회원 정보 수정</a></li>
		                        		<li class="subhas"><a href="${ pageContext.servletContext.contextPath }/dorman/member/select">휴면 회원 관리</a></li>
		                        		<li class="subhas"><a href="${ pageContext.servletContext.contextPath }/withdraw/member/select">탈퇴 회원 관리</a></li>
                                       
                                    </ul>
                                </div>
                            </li>
                            <li class="m01">
                                <a class="m01_b" href="#">호텔 관리</a>
                                <div class="sub_wrap">
                                    <ul>
                                        <li><a href="${ pageContext.servletContext.contextPath }/SelectCompanyPost">회사 소개 조회</a></li>
                        				<li><a href="${ pageContext.servletContext.contextPath }/SelectLocationPost">위치 안내 조회</a></li>
                                    </ul>
                                </div>
        
                            </li>
                            <li class="m01">
                                <a class="m01_b" href="#">예약 관리</a>
                                <div class="sub_wrap">
                                    <ul>
        
                                        <li><a href="#">예약 조회</a></li>
                                
                                    </ul>
                                </div>
                            </li>
                            <li class="m01">
                                <a class="m01_b" href="#">매출 관리</a>
                                <div class="sub_wrap">
                                   <ul>
                                     	<li><a href="${ pageContext.servletContext.contextPath }/SelectSalesList">날짜별 매출 조회</a></li>
       
                                    </ul>
                                </div>
                            </li>
                            <li class="m01">
                                <a class="m01_b" href="#" >인사 관리</a>
                                <div class="sub_wrap">
                                    <ul>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/admin/job/select">직책 조회</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/admin/employee/all/select">전체 직원 정보 조회</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/admin/job/select">직책 조회</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/admin/job/insert">직책 등록</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/admin/job/update">직책 수정</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/admin/dept/select">부서 조회</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/admin/dept/insert">부서 등록</a></li>		
		                        		<li><a href="${ pageContext.servletContext.contextPath }/admin/dept/update">부서 수정</a></li>
                                    </ul>
                                </div>
                            </li>           
                            <li class="m01">
                                <a class="m01_b" href="#" >게시물 관리</a>
                                <div class="sub_wrap">
                                    <ul>
                                       <li><a href="${ pageContext.servletContext.contextPath }/petsitter/postList">펫시터 게시물 조회</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/petsitter/post/insert">펫시터 게시물 등록</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/roomList">객실 게시물 조회</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/insertRoomPostForm">객실 게시물 등록</a></li>
		        
                                    </ul>
                                </div>
                            </li> 
                            <li class="m01">
                                <a class="m01_b" href="#" >고객 센터</a>
                                <div class="sub_wrap">
                                    <ul>
                                        <li><a href="${ pageContext.servletContext.contextPath }/notice/insert">공지사항 등록</a></li>
                        				<li><a href="${ pageContext.servletContext.contextPath }/notice/select">공지사항 조회</a></li>
                        				<li><a href="${ pageContext.servletContext.contextPath }/faq/insert">FAQ 등록</a></li>
                        				<li><a href="${ pageContext.servletContext.contextPath }/faq/select">FAQ 조회</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/admin/answer/select">1:1 문의글 조회</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/admin/answer/insert">1:1 문의글 답변 등록</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/admin/answer/update">1:1 문의글 답변 수정</a></li>
                                    </ul>
                                </div>
                            </li> 
                            <li class="m01">
                                <a class="m01_b" href="#" >이벤트 관리</a>
                                <div class="sub_wrap">
                                    <ul>
                                       	<li><a href="${ pageContext.servletContext.contextPath }/coupon/insert">쿠폰 등록</a></li>
		                        		<li><a href="${ pageContext.servletContext.contextPath }/coupon/select">쿠폰 조회</a></li>
		                        		<li><a href="#">팝업 등록</a></li>
		                        		<li><a href="#">팝업 조회</a></li>
                                    </ul>
                                </div>
                            </li> 
                            
                        </ul>
                    </section>
                </div>
            </aside>
        </section>
    </div>
  
</body>
</html>