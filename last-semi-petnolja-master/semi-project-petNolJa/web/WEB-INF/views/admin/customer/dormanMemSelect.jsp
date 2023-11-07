<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<meta charset="UTF-8">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>		

	 <div class="body-section">
        <section class="wrap1">
            <section>

                <div class="inquiry" align="center">
                    <h2>휴먼회원 조회</h2>
                    
                    <table class="inquiry">
                        <tr align="center">
                            <td rowspan="2" width="800px" height="100px" style="background-color: lightgray";>
                                <label>검색: </label>
                                <select name="select">
                                    <option value="category1">아이디</option>
                                    <option value="category2">이름</option>
                                    <option value="category3">이메일</option>
                                    <option value="category5">핸드폰번호</option>
                                    <option value="" selected>--</option>
                                </select>
                                <label>검색어: </label>
                                <input type="search1" name="search1" placeholder="검색어를 입력하세요.">
                                <button type="button">search</button> &nbsp;
                            </td>
                        </tr>
                    </table>
             
                    <br><br>
                    
					<c:forEach var="dormanSelect" items="${ requestScope.dormanList }">
						<div class="dorman-List">
						
                     <table class="Chart" border="1">
                        <thead>
                            <tr>
                                <th>아이디 : <c:out value="${ dormanSelect.dormanId }"/></th>
                                <th>이름 : <c:out value="${ dormanSelect.dormanName }"/></th>
                                <th>이메일 :  <c:out value="${ dormanSelect.dormanEmail }"/></th>
                                <th>핸드폰번호 : <c:out value="${ dormanSelect.dormanNumber }"/></th>
                            </tr>
                        </thead>
                    </table>
						</div>
					</c:forEach>
                    
                <br><br><hr><br><br>
                <div id="button"><button><b>메인으로</b></button></div>   
        </section>
        <b class="text-deco"></b>
    </div>
</div>


<jsp:include page="../../common/footer-adm.jsp"/>		
</body>
</html>

              