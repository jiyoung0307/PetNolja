<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<meta charset="UTF-8">
<title>공지사항 조회</title>

<style>
	.notice {margin-bottom: 30px;margin-left: 50px;}
	.search {margin-left: 50px;}
	.contents {font-family: 'Numans', sans-serif;}
	.noticeList {margin-top: 50px;}
	.list {margin-top: 50px; width: 800px; height: 100px;}
    #datawrap > div{cursor: pointer;}
    #innerwrap{clear: auto;}
</style>
</head>
<body>


<jsp:include page="../../common/header-main.jsp"/>

<div class="wrap">
    <div class="innerwrap">
        <h2>Customer center</h2>
        <br>
        <p class="contents">호텔 이용과 관련된 궁금한 사항을 남겨주시면 신속하게 답변 드리겠습니다.<br>
            항상 고객의 소리에 귀 기울이는 Petnolja가 되겠습니다.</p>
        <br>
        <hr><br>
        <div class="notice" align="center">
            <h2>공지사항</h2>
            <table class="search">
                <tr align="center">
                    <td rowspan="2" width="800px" height="100px" style="background-color: lightgray";>
                        <label>검색: </label>
                        <select name="select">
                            <option value="category1">예약</option>
                            <option value="category2">환불</option>
                            <option value="category3">리뷰</option>
                            <option value="etc">기타</option>
                            <option value="" selected>--</option>
        <div id="search-wrap" style="width: 800px;">
            <table id="search-table" border="1" style="width: 600px;">
                <tr>
                    <td>
                        <select name="searchList" id="searchList">
                            <option value="all">전체</option>
                            <option value="admin">작성자</option>
                            <option value="title">제목</option>
                            <option value="contents">내용</option>
                        </select>
                        <label>검색어: </label>
                        <input type="search1" name="search1" placeholder="검색어를 입력하세요.">
                        <button type="button">search</button> &nbsp;
                    </td>
                </tr>
            </table>

			<c:forEach var="noticeSelect" items="${ requestScope.noticeList }">
				<div class="notice-List">
					<table>
						<tr>
							<td>
								글번호 : <c:out value="${ noticeSelect.adminpostNo }"/>
							</td>
						</tr>
						<tr>
							<td>
								제목 : <c:out value="${ noticeSelect.adminpostTitle }"/>
							</td>
						</tr>
						<tr>
							<td>
								내용 : <c:out value="${ noticeSelect.adminpostContents }"/>
							</td>
						</tr>
						<tr>
							<td>
								작성일 : <c:out value="${ noticeSelect.adminpostDate }"/>
							</td>
						</tr>
						<tr>
							<td>
								수정일 : <c:out value="${ noticeSelect.adminpostUpdate }"/>
							</td>
						</tr>
						<tr>
							<td>
								작성자 : <c:out value="${ noticeSelect.empId }"/>
							</td>
						</tr>
					</table>
				</div>
			
			</c:forEach>

        </div>
    </div>
</div>

<jsp:include page="../../common/footer-main.jsp"/>
                    <td></td>
                    <td><input type="text" name="search" id="search" placeholder="검색어를 입력하세요."></td>
                    <td><input type="submit" value="검색"></td>
                </tr>
            </table>
        </div>        
    

<table width="800px">
    <tr>
        <td><input type="checkbox" name="checkBox" id="checkBox"></td>
        <td>No</td>
        <td>제목</td>
        <td>작성자</td>
        <td>등록일</td>
    </tr>
</table>
<div id="datawrap">
<c:forEach var="notice" items="${ requestScope.noticeList }">
    <div id="petsitterPostDiv">
<table width="800px">
    <tr>
        <td><input type="checkbox" name="checkBox" id="checkBox"></td>
        <td><label><c:out value="${ notice.adminpostNo }"/></label></td>
        <td><c:out value="${ notice.adminpostTitle }"/></td>
        <td><c:out value="${ notice.emp.empName }"/></td>
        <td><c:out value="${ notice.adminpostDate }"/></td>
    </tr>
    <tr>
        <td colspan="5"><hr></td>
    </tr>
</table>
</div>
</c:forEach>
</div>
<div>
    <button onclick="location.href='${pageContext.servletContext.contextPath}/admin/main'">메인으로</button>
</div>        

</div>

<jsp:include page="../../common/footer-adm.jsp"/>

<script>

    $("#datawrap > div").click(function(){
            const noticeNo = $(this).find("label").text();
            console.log(noticeNo);
            location.href = "${ pageContext.servletContext.contextPath }/notice/select/detail?no=" + noticeNo;
        });
</script>
</body>
</html>