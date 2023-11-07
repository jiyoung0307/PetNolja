<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<meta charset="UTF-8">
<title>FAQ 목록 조회</title>

<style>
    #datawrap > div{cursor: pointer;}
    #innerwrap{clear: auto;}
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="innerwrap"  align="center">
        <br>
        <h2>공지사항</h2>
        <br>
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
                    </td>
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
<c:forEach var="faq" items="${ requestScope.faqList }">
    <div id="petsitterPostDiv">
<table width="800px">
    <tr>
        <td><input type="checkbox" name="checkBox" id="checkBox"></td>
        <td><label><c:out value="${ faq.adminpostNo }"/></label></td>
        <td><c:out value="${ faq.adminpostTitle }"/></td>
        <td><c:out value="${ faq.emp.empName }"/></td>
        <td><c:out value="${ faq.adminpostDate }"/></td>
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
            const faqNo = $(this).find("label").text();
            console.log(faqNo);
            location.href = "${ pageContext.servletContext.contextPath }/faq/select/detail?no=" + faqNo;
        });
</script>
</body>
</html>