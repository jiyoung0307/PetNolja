<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1:1 문의 조회</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
	.Chart {margin-top: 50px; width: 800px; height: 100px;}
</style>
</head>
<body>
<div class="body-section">
<jsp:include page="../../common/header-adm.jsp"/>

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

					<c:forEach var="questionSelect" items="${ requestScope.questionList }">
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
								<!-- 작성자 정보를 가져오는 건 못해써여,,,,ㅜㅠ -->
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
                    <button id="function"><b>메인</b></button> &nbsp;&nbsp;&nbsp;
                    <button><b>수정</b></button>&nbsp;&nbsp;&nbsp;
                    <button><b>삭제</b></button>&nbsp;&nbsp;&nbsp;
                </div>
                <br><br><br><br><br>

            </section>
            <b class="text-deco"></b>
        </div>
    </div>
    
    
<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>