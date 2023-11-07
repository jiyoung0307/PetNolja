<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1:1 문의 수정</title>

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
       <div class="">
           <div class="inquiry1" align="center">
               <h2>1:1 문의 사항 조회</h2>
               <table class="inquiry">
                   <tr>
                       <td rowspan="2" width="800px" height="60px" style="background-color: lightgray";>
                           <label>제목: </label>
                       </td>
                   </tr>
               </table>
               <hr>
               <br>
               <table class="inquiry1">
                   <tr>
                       <td rowspan="2" width="800px" height="300px" style="background-color: darkgray";>
                           <label>문의글 내용: </label>
                       </td>
                   </tr>
               </table>
               <hr>
               <br>
               <table class="inquiry2">
                   <tr>
                       <td rowspan="2" width="800px" height="300px" style="background-color: white";>
                           <label>답변 내용: </label>
                       </td>
                   </tr>
               </table>
           <br><br><hr><br><br>
           <div id="button">
               <button id="cancle"><b>취소</b></button> &nbsp;&nbsp;&nbsp; <button><b>수정 완료</b></button>
           </div>
           <br><br><br><br><br>
       </div>
       </div>
   </section>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>