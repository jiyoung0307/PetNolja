<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<meta charset="UTF-8">
<title>1:1 문의 답변 작성</title>

<style>
    .Chart {
        margin-top: 50px;
        width: 800px;
        height: 100px;
    }
    .answer {
        margin-left: 30px;
    }
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="body-section">

        <section class="wrap1">
            <div class="innerwrap">
                <div class="inquiry1" align="center">
                    <h2>1:1 문의 사항 조회</h2>
                    
                <c:forEach var="answerInsert" items="${ requestScope.answerInsert }">
                    <table class="inquiry">
                        <tr>
                            <td rowspan="2" width="800px" height="60px" style="background-color: lightgray";>
                                <label>답변 글번호: ${ answerInsert.answerNo }</label>
                            </td>
                        </tr>
                    </table>
                    <hr>
                    <br>
                    <table class="inquiry1">
                        <tr>
                            <td rowspan="2" width="800px" height="300px" style="background-color: darkgray";>
                                <label>답변 제목: ${ answerInsert.answerTitle }</label>
                            </td>
                        </tr>
                    </table>
                    <hr>
                    <br>
                    <table class="inquiry2">
                        <tr>
                            <td rowspan="2" width="800px" height="300px" style="background-color: white";>
                                <label>답변 내용: ${ answerInsert.answerContents }</label>
                            </td>
                        </tr>
                    </table>
                    <table class="inquiry3">
                        <tr>
                            <td rowspan="2" width="800px" height="300px" style="background-color: white";>
                                <label>작성자: ${ answerInsert.empId }</label>
                            </td>
                        </tr>
                    </table>
                    <table class="inquiry4">
                        <tr>
                            <td rowspan="2" width="800px" height="300px" style="background-color: white";>
                                <label>문의글번호: ${ answerInsert.questionNo }</label>
                            </td>
                        </tr>
                    </table>
				</c:forEach>
				
                <br><br><hr><br><br>
                <div id="button">
                    <button id="cancle"><b>취소</b></button> &nbsp;&nbsp;&nbsp; <button><b>완료</b></button>
                </div>
                <br><br><br><br><br>
            </div>
          </div>
    </section>
</div>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>