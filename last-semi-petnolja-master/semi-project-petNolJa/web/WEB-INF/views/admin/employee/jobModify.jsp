<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>직책 수정</title>
<style>
	table tr td {
	            border: 1px solid gray;
	            padding-left: 10px;
	            padding-right: 10px;
	        }
	
	table tr {
	            text-align: center;
	        }
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="body-section">
 <div class="inner-wrap">
     <h2>직책 수정</h2>
     <hr>
     <br>

     <div class="newJob" align="center">
	<form action="${ pageContext.servletContext.contextPath }/admin/job/update" method="post">
         <tr>
             <td>
                 <label>변경할 직책명: </label>
                 <input type="text" name="jobName" placeholder="직책명을 입력하세요.">
             </td>
         </tr>

         <br>
         <label>사용 여부 : </label>
         <select name="jobYn">
             <option value="Y">Y</option>
             <option value="N">N</option>
             <option value="" selected>-- Y/N --</option>
         </select>

         <br><br>

         <aside>　</aside>
         <div id="button" align="center">
         	<button type="reset" onclick="location.href='${ pageContext.request.contextPath }/index.jsp'"><b>취소</b></button>&nbsp;&nbsp;&nbsp;
         	<button type="submit"><b>완료</b></button>
         </div>
         <br><br><br><br><br>

	</form>	
     </div>
 </div>
</div>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>