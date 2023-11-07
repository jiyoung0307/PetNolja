<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>

<body>

<jsp:include page="../../common/header-adm.jsp"/>
<h2>FAQ 글 관리</h2>
<hr>
<br>
<form method="post">
<table style="width: 800px;">
    <tr>
        <td><label for="title">제목</label></td>
        <td><input type="text" name="title" id="title" max="50"></td>
    </tr>
    <tr>
        <td ><label for="contents">내용</label></td>
        <td rowspan="5"><textarea name="contents" id="contents" cols="50" rows="10"></textarea></td>
    </tr>
    <tr>
        <td colspan="2"><hr></td>
    </tr>
</table>
<div>
    <button id="insert">등록</button>
</div>
</form>

<jsp:include page="../../common/footer-adm.jsp"/>
<script>
    $("#insert").click(function(){
        const title = $("#title").val();
        const contents = $("#contents").val();

        $.ajax({
            url: "${pageContext.servletContext.contextPath}/faq/insert",
            type: "post",
            data:{
                title:title,
                contents:contents
            },
            success: function(data){
                alert('등록이 완료되었습니다!');
                location.href="${pageContext.servletContext.contextPath}/admin/main";
            },
            error: function(request, status){
                alert('서버 오류로 인해 등록되지 못했습니다.\n 다시 작성해주세요!');
            }
        });
    })
</script>
</body>
</html>