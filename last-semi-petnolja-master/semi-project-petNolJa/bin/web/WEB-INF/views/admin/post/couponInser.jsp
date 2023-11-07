<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠폰 등록</title>

<style>
	textarea {
            width: 100%;
            height: 6.25em;
            border: none;
            resize: none;
        }
    input {
        width: 100%;
        height: 30px;
        border: none;
    }
    #table{
        text-align: left; 
        border-collapse: collapse;
    }
    #button{
        position: absolute;
        width: 70%;
        text-align: center;
    }
    div>button{
        width: 120px;
        height: 30px;
        border: none;
        background-color: rgb(152, 126, 88);
        color: white;
    }
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="innerwrap" align="center">
        <br>
        <h2 >Coupon</h2>
        <br>
        <table width="70%">
            <tr>
                <td colspan="2"><br><br></td>
            </tr>
            <tr>
                <td>작성자: </td>
                <td>${sessionScope.loginMember.empName}</td>
            </tr>
            <tr>
                <td colspan="2"><br><br></td>
            </tr>
            <tr>
                <td>쿠폰 제목: </td>
                <td><input type="text" name="title" id="title" placeholder="쿠폰 제목을 입력하세요."></td>
            </tr>
            <tr>
                <td colspan="2"><br><br></td>
            </tr>
            <tr>
                <td>할인 금액: </td>
                <td><input type="text" name="discount" id="discount" placeholder="할인 금액을 입력하세요."></td>
            </tr>
            <tr>
                <td colspan="2"><br><br></td>
            </tr>
            <tr>
                <td>내용: </td>
                <td><textarea name="contents" id="contents" cols="30" rows="10" placeholder="쿠폰 상세 내용을 입력하세요."></textarea></td>
            </tr>
            <tr>
                <td colspan="2"><br><hr></td>
            </tr>
        </table>
        <br><br><br>
        <div id="button">
          <button type="reset">취소</button>&nbsp;&nbsp;<button type="submit">다음</button>
        </div>

    </div>
</div>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>