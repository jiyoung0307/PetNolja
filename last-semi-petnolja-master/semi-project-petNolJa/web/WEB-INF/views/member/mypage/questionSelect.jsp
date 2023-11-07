<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body{background-color:rgb(243, 242, 242);width: 1500px;margin: auto;}
        .top_txt{color: rgb(101, 101, 101); font-size: 14px; height: 150px; padding:50px s0; border-bottom: 0.7px solid black; ;width: 500px;}
        .box_wrap>div {border: 1px solid red; margin: 0 auto; width: 500px;}
        .box_wrap .text{overflow: hidden;}
        .main{margin: 0 auto; border: 1px solid red;}
        #order{color:rgb(181, 181, 181); font-size: 12px;}
        .date{color:rgb(152, 126, 88);}
        aside{float: left; width: 20%;}
        section{float: left;width: 60%;}
        table{width: 100%; text-align: center;}
        #pic{width: 50%; height: 100px;}
        #room{text-align: left; font-size: large;}
        #price{text-align: right; font-size: smaller;}
        #button{position: absolute; width: 60%; text-align: center;}
        div>button{width: 120px; height: 30px; border: none; background-color: rgb(152, 126, 88); color: white;}
        aside{float: left; width: 20%;}
        h2{font-size: 35px;}
       .top_txt {margin: 0 auto;}
        
    
    </style>
</head>

<body>

	<div style="display: none;">
		window.onload = function(){
		<c:if test="${empty sessionScope.loginMember }">
			<script>
			   alert("로그인이 필요합니다.");
			   location.href="${pageContext.servletContext.contextPath}/index.jsp"
		   </script>
		</c:if>
		}
	</div>

<jsp:include page="../../common/header-main.jsp"/>

        <div class="body-section">

            <section class="wrap1">
                <section>

                    <div class="inquiry" align="center">
                        <h2>1:1 문의 사항 조회</h2>
                        <table class="inquiry">
                            <tr align="center">
                                <td rowspan="2" width="800px" height="100px" style="background-color: lightgray" ;>
                                    <label>검색: </label>
                                    <select name="select">
                                        <option value="category1">예약</option>
                                        <option value="category2">환불</option>
                                        <option value="category3">리뷰</option>
                                        <option value="etc">기타</option>
                                        <option value="" selected>--</option>
                                    </select>
                                    <label>검색어: </label>
                                    <input type="text" name="name" placeholder="검색어를 입력하세요.">
                                    <button type="button">search</button> &nbsp;
                                </td>
                            </tr>
                        </table>
					</div>
                        <br><br>
					<c:forEach var="questionSelect" items="${ requestScope.questionSelectList }">
						<div class="question-List">
							<table>
 								<tr>
									<td>
										<small>제목 : <c:out value="${ questionSelect.questionTitle }"/></small>
									</td>
								</tr>
								<tr>
									<td>
										<small>내용 : <c:out value="${ questionSelect.questionContents }"/></small>
									</td>
								</tr>
								<tr>
									<td>
										<small>작성자 : <c:out value="${ questionSelect.memberNo }"/></small>
									</td>
								</tr>	
							</table>
						</div>

						</c:forEach>
						
                        <br><br>
                        <hr><br><br>

                </section>
                <aside>　</aside>
                <div id="button" align="center">
                    <button id="function" onclick="location.href='${ pageContext.request.contextPath }/index.jsp'">><b>메인</b></button> &nbsp;&nbsp;&nbsp;
                </div>
                <br><br><br><br><br>

            </section>
            <b class="text-deco"></b>
        </div>

<jsp:include page="../../common/footer-main.jsp"/> 
    
</body>
</html>