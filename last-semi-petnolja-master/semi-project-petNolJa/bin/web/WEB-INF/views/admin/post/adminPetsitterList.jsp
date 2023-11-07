<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .selectPost{background-color: rgb(196, 196, 196); text-align: center;}
    #innerwrap{margin-left: 100px}
    #petsitterPostDiv{cursor: pointer;}
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div id="innerwrap">
	<h2>Petsitter 게시물 조회</h2>
	
	
    <table class="selectPost" width="100%">
        <tr>
            <th><p class="selectPost">No</p></th>
            <th><p class="selectPost">제목</p></th>
            <th><p class="selectPost">경력</p></th>
            <th><p class="selectPost">내용</p></th>
            <th><p class="selectPost">게시일</p></th>
            <th><p class="selectPost">수정일</p></th>
            <th><p class="selectPost">조회수</p></th>
            <th><p class="selectPost">작성자</p></th>
        </tr>
        <tr>
            <td colspan="8"><hr></td>
        </tr>
        </table>
    	<div class="selectPost" id="petsitterPost">
    	
        <c:forEach var="petsitterPost" items="${ requestScope.petsitterPostList }">
            <div id="petsitterPostDiv">
            <table width="100%">
            <tr>
                <td><label><c:out value="${ petsitterPost.petsitterPostNo }"/></label></td>
                <td><c:out value="${ petsitterPost.petsitterPostTitle }"/></td>
                <td>
                    <c:choose>
                            <c:when test="${fn:length(petsitterPost.petsitterPostCareer) gt 18}">
                            <c:out value="${fn:substring(petsitterPost.petsitterPostCareer, 0, 17)}">
                            </c:out></c:when>
                            <c:otherwise>
                            <c:out value="${petsitterPost.petsitterPostCareer}">
                            </c:out></c:otherwise>
                    </c:choose>
                    ...
                </td>
                <td>
                    <c:choose>
                            <c:when test="${fn:length(petsitterPost.petsitterPostContents) gt 18}">
                            <c:out value="${fn:substring(petsitterPost.petsitterPostContents, 0, 17)}">
                            </c:out></c:when>
                            <c:otherwise>
                            <c:out value="${petsitterPost.petsitterPostContents}">
                            </c:out></c:otherwise>
                    </c:choose>
                    ...
                </td>
                <td><c:out value="${ petsitterPost.petsitterCreateDate }"/></td>
                <td><c:out value="${ petsitterPost.petsitterModifyDate }"/></td>
                <td><c:out value="${ petsitterPost.petsitterPostCount }"/></td>
                <td><c:out value="${ petsitterPost.emp.empName }"/></td>
            </tr>
            <tr>
                <td colspan="8"><hr></td>
            </tr>
         </table>
        </div>
        </c:forEach>
        </div>
        <br><br><br><br><br>
	<jsp:include page="../../common/paging.jsp"/>
</div>

<script>
    $("#petsitterPost > div").click(function(){
        const petsitterPostNo = $(this).find("label").text();
        console.log(petsitterPostNo);
        location.href = "${ pageContext.servletContext.contextPath }/petsitter/postDetail?no=" + petsitterPostNo;
    });
</script>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>