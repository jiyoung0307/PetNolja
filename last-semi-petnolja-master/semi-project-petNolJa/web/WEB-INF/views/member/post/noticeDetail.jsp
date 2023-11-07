<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FAQ 상세 조회</title>

<style>
	.notice { margin: auto; margin-bottom: 20px; }
	.ucontents { margin: 0; }
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
        <section>
            <table>
               <tr>
                  <td>제목: </td>
                  <td>${ noticeDTO.adminpostTitle }</td>
                  <td>날짜: </td>
                  <td>${ noticeDTO.adminpostDate }</td>
               </tr>
               <tr>
                  <td>내용:</td>
                  <td>${ noticeDTO.adminpostContents }</td>
               </tr>
            </table>

        </section>
    </div>
</div>

<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>