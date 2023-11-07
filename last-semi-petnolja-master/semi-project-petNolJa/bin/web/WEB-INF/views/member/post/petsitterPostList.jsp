<jsp:directive.page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
	.thumb-list{float: left;}
    .search-area{margin-bottom: 20px;}
    table{
        margin: 10px 5px;
        width: 290px; 
        border-top: 1px solid black; 
        border-right: 1px solid black; 
        border-left: 1px solid black; 
        border-bottom: 1px solid black;
        }
     #thumbnailArea > div{cursor: pointer;}
</style>
</head>
<body>

<jsp:include page="../../common/header-main.jsp"/>
	
	<div class="innerwrap">
		<h2>Introduce Our Petsitter</h2>
        <p>반려동물을 뜻하는 <b>펫(pet)</b>과 <br>
            돌보는 직업을 가리키는 <b>시터(sitter)</b>의 합성어. <br>
            <b>베이비시터(babysitter)</b>가 아이를 돌보듯 내 아이처럼 돌보겠습니다.</p>
        <br><hr><br>
    
        <div class="search-area">
            <select id="searchCondition" name="searchCondition">
                <option value="writer">작성자</option>
                <option value="title">제목</option>
                <option value="content">내용</option>
            </select>
            <input type="search">
            <button type="submit">검색하기</button>
        </div>

		<div class="thumbnail-area" id="thumbnailArea">
		
        
		<c:forEach var="petsitterPost" items="${ requestScope.petsitterPostList }">
			<div class="thumb-list">
				<table>
                    <tr style="height: 10px;">
                        <td width="140px"><label><c:out value="${ petsitterPost.petsitterPostNo }"/></label></td>
                        <td rowspan="3">
							<img src="${ pageContext.request.contextPath }/${ petsitterPost.adminPicture.adminThumbnailPictureSaveRoute }" width="150px" height="100px">
						</td>
                    </tr>
					<tr>
						<td><h4><c:out value="${ petsitterPost.petsitterPostTitle }"/></h4></td>
					</tr>
					<tr>
						<td rowspan="2">
                            <%-- <small><c:out value="${ petsitterPost.petsitterPostCareer }"/></small> --%>
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
					</tr>
                    <tr>
                        <td colspan="2">
                            <small>조회수 : <c:out value="${ petsitterPost.petsitterPostCount }"/></small>
                        </td>
                    </tr>
				</table>
			</div>
		</c:forEach>
		
		</div>
	</div>
        <br><br><br><br><br>
	<jsp:include page="../../common/paging.jsp"/>
	
	<script>
		$("#thumbnailArea > div").click(function(){
            
			const petsitterPostNo = $(this).find("label").text();
			console.log(petsitterPostNo);
			location.href = "${ pageContext.servletContext.contextPath }/petsitter/postDetail?no=" + petsitterPostNo;
		});
		
	</script>
	
<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>