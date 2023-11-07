<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서조회</title>

	<style>
        body {
            width: 1500px;margin: auto;
            background-color: rgb(243, 242, 242);
            font-family: 'Gilda Display', serif;
        }

        #wrap {width: 100%;}

        #body {
            height: 100%;
            font-family: 'Nanumsquare', "맑은 고딕", "돋움", sans-serif;
        }

        #header {border-bottom: 1px solid black;}

        #pix-nav {
            width: 20%;
            float: left;
            height: 100vh;
            border-right: 1px solid black;
        }

        .body-section {
            width: 70%;
            float: left;
        }

        #menu-text {margin-left: 40px;}

        #admin-member {
            background-color: rgb(229, 229, 229);
            border-bottom: 1px solid black;
        }

        li {
            list-style: none;
            margin: 10px;
            margin-right: 30%;
        }

        a {
            text-decoration-line: none;
            color: black;
        }

        h2 {
            text-align: left;
            margin-left: 30px;
        }

        .Chart {
            margin-top: 50px;
            width: 800px;
            height: 100px;
        }

        footer {
            clear: both;
            margin-bottom: 0%;
        }

        #footer {border-top: 1px solid black;}

        table tr td {
            border: 1px solid gray;
            padding-left: 10px;
            padding-right: 10px;
        }

        table tr {text-align: center;}
    </style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="body-section">
     <div>
         <h2>부서관리</h2>
         <hr>
         <br>
         <table class="inquiry" align="center">
             <tr align="center">
                 <td rowspan="2" width="800px" height="100px" style="background-color: lightgray";>
                     <label>검색: </label>
                     <select name="select">
                         <option value="category1">인사과</option>
                         <option value="category2">총무부</option>
                         <option value="category3">TF팀</option>
                         <option value="category3">경영지원본부</option>
                         <option value="etc">기타</option>
                         <option value="" selected>--</option>
                     </select>
                     <label>검색어: </label>
                     <input type="search" name="search1" placeholder="검색어를 입력하세요.">
                     <button type="button">search</button> &nbsp;
                 </td>
             </tr>
         </table>
			<br><br>
			
		<c:forEach var="deptSelect" items="${ requestScope.deptList }">
			<div class="dept-List">
				<table>
 					<tr>
						<td>
							<small>부서 번호 : <c:out value="${ deptSelect.deptNo }"/></small>
						</td>
					</tr>
					
					<tr>
						<td>
							<small>부서명 : <c:out value="${ deptSelect.deptName }"/></small>
						</td>
					</tr>
					
					<tr>
						<td>
							<small>사용 여부 : <c:out value="${ deptSelect.deptYn }"/></small>
						</td>
					</tr>	
				</table>				
			</div>
		</c:forEach>
		
			<br><br>
			<hr><br><br>
			
     <aside>　</aside>
     <div id="button" align="center">
         <button id="function"><b>추가</b></button>
         &nbsp;&nbsp;&nbsp; 
         <button><b>수정</b></button>
         &nbsp;&nbsp;&nbsp;
     </div>
     <br><br><br><br><br>

    </div>
</div>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>