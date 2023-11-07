<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

<div class="innerwrap">
    <br><br><br>
    <h2 style="margin-left: 100px;">Login</h2>
    <form action="${pageContext.servletContext.contextPath}/common/login" method="post">
        <div align="center">
            <table style="width: 80%;">
                <tr>
                    <td colspan="3" height="25px"><hr></td>
                </tr>
                <tr>
                    <td><input type="text" name="id" id="id" max="15" placeholder="아이디를 입력하세요." style="width: 450px;"></td>
                    <td rowspan="2"><button type="submit" style="height: 65px; width: 200px;"> 로그인</button></td>
                </tr>
                <tr>
                    <td><input type="password" name="pwd" id="pwd" placeholder="비밀번호를 입력하세요." style="width: 450px;"></td>
                </tr>
            </table>
        </div>
    </form><br>
    <div class="registwrap" align="center">
        <table style="width: 90%; text-align: center;">
            <tr>
                <td width="30%"><a href="${pageContext.servletContext.contextPath}/member/regist/terms">회원가입</a></td>
                <td>|</td>
                <td width="30%"><a href="${pageContext.servletContext.contextPath}/regist/findId">아이디 찾기</a></td>
                <td>|</td>
                <td width="30%"><a href="#">비밀번호 찾기</a></td>
            </tr>
        </table>
    </div>
</div>

<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>