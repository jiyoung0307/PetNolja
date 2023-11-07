<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>부서 추가</title>
<style>
	table tr td {
	            border: 1px solid gray;
	            padding-left: 10px;
	            padding-right: 10px;
	        }
	
	table tr {
	            text-align: center;
	        }

	.inner-wrap {
	}
	.body-section{
		width:700px;
		height:500px;
		margin:0 auto;
	}
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>
 <aside>　</aside>
<div class="body-section">
 
 <div class="inner-wrap">
     <h2>부서관리</h2>
     <hr>
     <br>

     <div class="newDept" align="center">
	<form action="${ pageContext.servletContext.contextPath }/admin/dept/insert" method="post">
         <tr>
             <td>
                 <label>새로운 부서명: </label>
                 <input type="text" name="deptName" placeholder="부서명을 입력하세요.">
             </td>
         </tr>

         <br>
         <label>사용 여부 : </label>
         <select name="deptYn">
             <option value="yes">Y</option>
             <option value="no">N</option>
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