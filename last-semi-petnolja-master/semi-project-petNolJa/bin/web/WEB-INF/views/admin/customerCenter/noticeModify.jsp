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
        </tr>
        <tr>
            <td><p>호텔 이용과 관련된 궁금한 사항은 1:1 문의로 남겨주시면 신속하게 답변 드리겠습니다. <br>
                항상 고객의 소리에 귀 기울이는 <b>Petnolja</b>가 되겠습니다.</p></td>
        </tr>
    </table>
    <hr>
    <br>
    <div class="innerwrap">

    <table style="width: 800px;">
        <tr>
            <td>작성일: <c:out value="${requestScope.adminList.adminpostDate}"/></td>
            <td>게시글 번호: <label><c:out value="${requestScope.adminList.adminpostNo}"/></label></td>
            <td><c:out value="${requestScope.adminList.emp.empName}"/>님</td>
        </tr>
        <tr>
            <td colspan="3">제목: <input type="text" name="title" id="title" value="<c:out value='${requestScope.adminList.adminpostTitle}'/>"></td>
        </tr>
        <tr>
            <td colspan="3"><hr></td>
        </tr>
        
        <tr>
            <td colspan="3" rowspan="3">내용: <textarea name="contents" id="contents" cols="30" rows="10"><c:out value="${requestScope.adminList.adminpostContents}"/></textarea></td>
        </tr>
    </table>
    <div>
        <button  onclick="location.href='${ pageContext.servletContext.contextPath }/notice/select'">취소</button> &nbsp;&nbsp;&nbsp; <button id="modifya">등록</button>
    </div>

    </div>
    </div>


<jsp:include page="../../common/footer-adm.jsp"/>

<script>
     $("#modifya").click(function(){
        let noticeNo = "<c:out value='${requestScope.adminList.adminpostNo}'/>";
        let title = $("#title").val();
        let contents = $("#contents").val();

        if(confirm('정말 수정하시겠습니까?')){
            $.ajax({
                url: "${pageContext.servletContext.contextPath}/notice/select",
                type: "post",
                data:{
                    noticeNo:noticeNo,
                    title:title,
                    contents:contents
                },
                success: function(data){
                    alert('수정이 완료 되었습니다.');
                    location.href = "${ pageContext.servletContext.contextPath }/admin/main";
                },
                error: function(request, status){
                    alert('서버 오류로 인해 등록되지 못했습니다.\n 다시 작성해주세요!');
                }
            });
        }
     });
</script>
</body>
</html>