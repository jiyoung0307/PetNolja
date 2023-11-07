<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="wrap">
    <table>
        <tr>
            <td><h2>Customer center</h2></td>
            <td><button id="modify">수정</button> &nbsp;&nbsp;&nbsp; <button id="delete">삭제</button></td>
        </tr>
        <tr>
            <td><p>호텔 이용과 관련된 궁금한 사항은 1:1 문의로 남겨주시면 신속하게 답변 드리겠습니다. <br>
                항상 고객의 소리에 귀 기울이는 <b>Petnolja</b>가 되겠습니다.</p></td>
        </tr>
    </table>
    <hr>
    <br>
    <div class="innerwrap">
    <table style="width: 800px;" border="1">
        <tr>
            <td>작성일: <c:out value="${requestScope.adminList.adminpostDate}"/></td>
            <td>게시글 번호: <c:out value="${requestScope.adminList.adminpostNo}"/></td>
            <td><c:out value="${requestScope.adminList.emp.empName}"/>님</td>
        </tr>
        <tr>
            <td colspan="3"><c:out value="${requestScope.adminList.adminpostTitle}"/></td>
        </tr>
        <tr>
            <td colspan="3"><hr></td>
        </tr>
        
        <tr>
            <td colspan="3" rowspan="3"><c:out value="${requestScope.adminList.adminpostContents}"/></td>
        </tr>
        <tr>
        <td colspan="2"><hr></td>
    </tr>
    </table>
    </div>
    </div>
<div>
    <button  onclick="location.href='${ pageContext.servletContext.contextPath }/faq/select'">목록으로</button>
</div>

<jsp:include page="../../common/footer-adm.jsp"/>

<script>
     $("#modify").click(function(){
            let faqNo = "<c:out value='${requestScope.adminList.adminpostNo}'/>";
            location.href = "${ pageContext.servletContext.contextPath }/faq/edit?no=" + faqNo;
        });


    $("#delete").click(function(){
        let faqNo = "<c:out value='${requestScope.adminList.adminpostNo}'/>";
        if(confirm('정말 삭제하시겠습니까?')){
            $.ajax({
            url: "${ pageContext.servletContext.contextPath }/faq/edit",
            type: "post",
            data: {faqNo:faqNo},
            success: function(data){
                alert('해당 게시물이 정상적으로 삭제되었습니다.');
                location.href = "${ pageContext.servletContext.contextPath }/admin/main";
            },
            error: function(request, status){
                alert('서버의 문제로 실행되지 않았습니다.\n 다시 실행해주세요.')
            }
            });
        }
        
    });
</script>
</body>
</html>