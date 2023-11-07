<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
   <meta charset="UTF-8">
   <title>직원정보</title>
   <style>
      tr{
         text-align: left;
      }
      td{
         width: 70px;
         height: 50px;
         border-bottom: black 1px solid ;
      }
      .value{
         width: 150px;
      }
      table{
         text-align: center;
      }
      .align{
               margin-left: 500px;
      }
      hr{
      }

   </style>
</head>
<body>
    <jsp:include page="../../common/header-adm.jsp"/>
    
<h1 style="padding-left: 450px;">직원정보</h1>
<hr>
<br>
<br>
<div class="align">
<table>
   <tr>
      <td>사번</td>
      <td class="value">${ empDTO.empId }</td>
      <td>이름</td>
      <td class="value">${ empDTO.empName }</td>
   </tr>
   <tr>
      <td>부서</td>
      <td class="value">${ empDTO.deptName }</td>
      <td>주민번호</td>
      <td class="value">${ empDTO.no }</td>
   </tr>
   <tr>
      <td>직급</td>
      <td class="value">${ empDTO.jobName }</td>
      <td>이메일</td>
      <td class="value">${ empDTO.empEmail }</td>
   </tr>
   <tr>
      <td>핸드폰</td>
      <td class="value">${ empDTO.empPhone }</td>
      <td>입사일</td>
      <td class="value">${ empDTO.hireDate }</td>
   </tr>
   <tr>
      <td>급여</td>
      <td class="value">${ empDTO.salary }</td>
      <td>보너스</td>
      <td class="value">${ empDTO.bonus }</td>
   </tr>
   <tr>
      <td>퇴사일</td>
      <td class="value">${ empty empDTO.leaveDate ? "퇴사안함" : "empDTO.leaveDate" }</td>
      <td>퇴사여부</td>
      <td class="value">${ empDTO.dropYN }</td>
   </tr>
</table>
</div>

<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>