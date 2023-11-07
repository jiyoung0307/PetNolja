<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>팝업 상세 조회</title>

<style>
	#table{text-align: left; border-collapse: collapse;}
    #button{position: absolute; width: 70%; text-align: center;}
    div>button{width: 120px; height: 30px; border: none; background-color: rgb(152, 126, 88); color: white;}
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="innerwrap" align="center">
        <br>
        <h2 >Pop Up</h2>
        <br>
        <table width="70%">
            <tr>
                <th align="left" width="70px"><small>작성일: </small></th>
                <th align="left"><small>2022/05/07</small></th>
                <th width="550px"></th>
                <th align="right" width="70px"><small>수정일: </small></th>
                <th align="right"><small>2022/05/10</small></th>
            </tr>
        </table>
        <table width="70%">
            <tr>
                <td colspan="2"><hr><br></td>
            </tr>
            <tr>
                <td width="90px">글번호: </td>
                <td >1</td>
            </tr>
            <tr>
                <td colspan="2"><br><br></td>
            </tr>
            <tr>
                <td>작성자: </td>
                <td>최예나님</td>
            </tr>
            <tr>
                <td colspan="2"><br><br></td>
            </tr>
            <tr>
                <td>팝업 만료일: </td>
                <td>2022/06/30</td>
            </tr>
            <tr>
                <td colspan="2"><br><br></td>
            </tr>
            <tr>
                <td>팝업 제목: </td>
                <td>초특가 멍멍야옹 할인 대잔치!</td>
            </tr>
            <tr>
                <td colspan="2"><br><br></td>
            </tr>
            <tr>
                <td>팝업 내용: </td>
                <td>더운 여름! 더워하는 강아지와 고양이의 힐링 캠프가 되어줄 펫놀자 이용 시 8,000원 할인권 증정!</td>
            </tr>
            <tr>
                <td colspan="2"><br><hr></td>
            </tr>
        </table>
        <br><br><br>
        <div id="button">
            <button type="reset">이전</button>&nbsp;&nbsp;<button type="submit">수정</button>
        </div>

    </div>
</div>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>