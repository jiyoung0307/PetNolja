<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<meta charset="UTF-8">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/css/basic.css">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/css/slick-theme.css">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/css/slick.css">
<script src="${ pageContext.servletContext.contextPath }/resources/js/jquery-1.12.4.min.js"></script>
<script src="${ pageContext.servletContext.contextPath }/resources/js/main.js"></script>
<script src="${ pageContext.servletContext.contextPath }/resources/js/slick.min.js"></script>
<script src="${ pageContext.servletContext.contextPath }/resources/js/slider.js"></script>
</head>
<body>
	<div id="header_wrap">
		<header>
			<div class="header_top">
				<ul class="top_member_box">
					<c:if test="${ empty sessionScope.loginMember }">
						<li><a
							href="${ pageContext.servletContext.contextPath }/common/login">로그인</a></li>
					</c:if>
					<c:if test="${ !empty sessionScope.loginMember }">
						<li><a
							href="${ pageContext.servletContext.contextPath }/common/logout">로그아웃</a></li>
						<li><a
							href="${ pageContext.servletContext.contextPath }/member/reservation">호텔예약</a></li>
					</c:if>
					<c:if test="${ empty sessionScope.loginMember }">
						<!-- 회원 가입을 누르면 MemberRegisttermsServlet으로 이동 : WEB-INF 내에 있는 jsp의 경우 여기서 바로 이동 불가능! -> Servlet을 통해 forward로 이동해야 함 -->
						<li><a href="${ pageContext.servletContext.contextPath }/member/regist/terms">회원가입</a></li>
					</c:if>
					<c:if test="${ !empty sessionScope.loginMember }">
						<li><a href="${ pageContext.servletContext.contextPath }/member/info/select">마이페이지</a></li>
					</c:if>
					<li><a href="${ pageContext.servletContext.contextPath }/member/faq/select">고객센터 <span class="arrow"><img src="${ pageContext.request.contextPath }/resources/img/s_arrow.png" alt="화살표"></span></a></li>
					<li><img src="${ pageContext.request.contextPath }/resources/img/kor_icon.png" alt=" "> KR 한국어 <span class="arrow"><img src="${ pageContext.request.contextPath }/resources/img/s_arrow.png" alt="화살표"></span></li>
				</ul>
			</div>
			<!-- //.header_top -->
			<div class="header_bottom">
				<div class="header_main">
					<div class="gnb_all">
						<input type="checkbox" id="hamB"> <label for="hamB"
							class="hamB_la"> <span></span> <span></span> <span></span>
						</label>
					</div>
					<!-- //.gnb_all -->

					<!-- a태그로 메인(index.jsp)으로 이동 -> index.jsp의 경우 WEB-INF에 있지 않기 때문에 바로 이동 가능 -->
					<h1>
						<a href="${ pageContext.request.contextPath }/index.jsp">Petnolja</a>
					</h1>
					<div class="right_btn">
						<ul>
							<c:if
								test="${ !empty sessionScope.loginMember and sessionScope.role eq 'member' }">
								<li class="right_btn01"><a href="#">${sessionScope.loginMember.memberName}님
										환영합니다.</a></li>
							</c:if>
							<c:if test="${ empty sessionScope.loginMember }">
								<li class="right_btn02"><a
									href="${ pageContext.servletContext.contextPath }/common/login">login</a></li>
							</c:if>
						</ul>
					</div>
					<!-- //.right_btn-->
				</div>
				<!-- //.header_main -->
				<div class="gnb">
					<ul class="depth0">
						<li><a href="${ pageContext.servletContext.contextPath }/selectRoomListForMember">ROOM</a></li>

						<!-- review 등록하는 페이지니 잘 보관해주세요 -->
						<%--<li><a href="${ pageContext.servletContext.contextPath }/insertReviewForm"> </a></li> --%>
					<c:if test="${!empty sessionScope.loginMember }">
						<li><a href="${ pageContext.servletContext.contextPath }/petsitter/postList">PET SITTER</a></li>
					</c:if>
						<%-- <li><a href="${ pageContext.servletContext.contextPath }/insertReviewForm">COMPANY</a></li> --%>
						<li><a href="${ pageContext.servletContext.contextPath }/SelectLocationIntro">LOCATION</a></li> 
                   		<li><a href="${ pageContext.servletContext.contextPath }/SelectCompanyIntro">COMPANY</a></li>

						<li><a href="${ pageContext.servletContext.contextPath }/member/faq/select">CUSTOMER CENTER</a></li>
						<li><a href="${pageContext.servletContext.contextPath}/selectAllAndBestReview">REVIEW</a></li>
						<!-- 리뷰 서블릿 이동 후 조회 페이지로 이동 -->

					</ul>
				</div>
				<!-- //.gnb end -->
			</div>
		</header>
	</div>
	<div id="sub_menu" style="left: -300px;">
		<div class="cover"></div>
		<div class="closeBtn">
			<div class="close1"></div>
			<div class="close2"></div>
		</div>
		<div class="login">
			<c:if test="${ !empty sessionScope.loginMember and sessionScope.role eq 'member' }">
				<li class="right_btn01"><a href="${ pageContext.servletContext.contextPath }/member/info/select">${sessionScope.loginMember.memberName}님
						환영합니다.</a></li>
			</c:if>
			<c:if test="${ empty sessionScope.loginMember }">
				<li class="right_btn02"><a href="${ pageContext.servletContext.contextPath }/common/login">login</a></li>
				<li><a href="${ pageContext.servletContext.contextPath }/member/reservation">reservation</a></li>
			</c:if>
		</div>
		<div class="sub_list">
			<c:if test="${ empty sessionScope.loginMember }">
				로그인 후에 이용가능합니다.
			</c:if>
			<c:if test="${ !empty sessionScope.loginMember }">
			<a><b>my page</b></a><br>
				<div class="sub">
					<ul>
					<c:if test="${ sessionScope.loginmember }"></c:if>
						<li><a href="${ pageContext.servletContext.contextPath }/member/pet/insert">반려동물 등록</a></li>
						<li><a href="${ pageContext.servletContext.contextPath }/member/info/select">회원정보 조회</a></li>
						<li><a href="${ pageContext.servletContext.contextPath }/member/pet/select">반려동물 조회</a></li>
						<li><a href="${ pageContext.servletContext.contextPath }/reservation/list/select">예약내역 조회</a></li>
						<li><a href="${ pageContext.servletContext.contextPath }/selectReviewLog?memberNo=${sessionScope.memberDTO.memberNo}">작성리뷰 조회</a></li>
						<li><a href="${ pageContext.servletContext.contextPath }/member/notice/select">공지사항 조회</a></li>
						<li><a href="${ pageContext.servletContext.contextPath }/member/faq/select">FAQ	조회</a></li>
						<li><a href="${ pageContext.servletContext.contextPath }/question/select">1:1 문의글 조회</a></li>
						<li><a href="${ pageContext.servletContext.contextPath }/question/insert">1:1문의 등록</a></li>
					</ul>
				</div>
			</c:if>

				</div>
		</div>
</body>
</html>