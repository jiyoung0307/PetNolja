<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>
<div class="body-section">
        <section class="wrap1">
            <aside>　</aside>
            <section>
                <div class="inquiry" align="center">
                    <h2>탈퇴 회원 조회</h2>
                    <table class="inquiry">
                        <tr align="center">
                            <td rowspan="2" width="800px" height="100px" style="background-color: lightgray";>
                                <label>검색: </label>
                                <select name="select">
                                    <option value="category1">아이디</option>
                                    <option value="category2">이름</option>
                                    <option value="category3">핸드폰 번호</option>
                                    <option value="category3">주소</option>
                                    <option value="category3">이메일</option>
                                    <option value="category3">생년월일</option>
                                    <option value="etc">가입일</option>
                                    <option value="" selected>--</option>
                                </select>
                                <label>검색어: </label>
                                <input type="search1" name="search1" placeholder="검색어를 입력하세요.">
                                <button type="button">search</button> &nbsp;
                            </td>
                        </tr>
                    </table>
                    <br><br>
                    
				<c:forEach var="withdrawSelect" items="${ requestScope.withdrawMemList }">
						<div class="withdraw-List">
                    <table class="Chart" border="1">
                        <thead>
                            <tr>
                                <th>아이디 : <c:out value="${ withdrawSelect.withdrawId }"/></th>
                                <th>이름 : <c:out value="${ withdrawSelect.withdrawName }"/></th>
                                <th>핸드폰번호 : <c:out value="${ withdrawSelect.withdrawNumber }"/></th>
                                <th>이메일 : <c:out value="${ withdrawSelect.withdrawWEmail }"/></th>
                                <th>탈퇴일 : <c:out value="${ withdrawSelect.withdrawDate }"/></th>
                            </tr>
                        </thead>
                    </table>
						</div>
				</c:forEach>
					
                <br><br><hr><br><br>
                <div id="button"><button><b>메인으로</b></button></div>
               </div>
            </section>         
        </section>
        <b class="text-deco"></b>
    </div>
	
	
	<jsp:include page="../../common/footer-adm.jsp"/>	
</body>
</html>