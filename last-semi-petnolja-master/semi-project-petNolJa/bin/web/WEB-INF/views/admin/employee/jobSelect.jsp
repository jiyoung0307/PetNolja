<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직책 조회</title>


</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="body-section">
      <div class="innerwrap">
          <h2>직책 관리</h2>
          <hr>
          <br>
          <table class="inquiry" align="center">
              <tr align="center">
                  <td rowspan="2" width="800px" height="100px" style="background-color: lightgray";>
                      <label>검색: </label>
                      <select name="select">
                          <option value="category1">회장</option>
                          <option value="category2">대표</option>
                          <option value="category3">팀장</option>
                          <option value="category3">사원</option>
                          <option value="etc">기타</option>
                          <option value="" selected>--</option>
                      </select>
                      <label>검색어: </label>
                      <input type="search1" name="search1" placeholder="검색어를 입력하세요.">
                      <button type="button">search</button> &nbsp;
                  </td>
              </tr>
          </table>

		<c:forEach var="jobSelect" items="${ requestScope.jobList }">
			<div class="job-List">
				<table>
 					<tr>
						<td>
							<small>직책 번호 : <c:out value="${ jobSelect.jobNo }"/></small>
						</td>
					</tr>
					
					<tr>
						<td>
							<small>직책명 : <c:out value="${ jobSelect.jobName }"/></small>
						</td>
					</tr>
					
					<tr>
						<td>
							<small>사용 여부 : <c:out value="${ jobSelect.jobYn }"/></small>
						</td>
					</tr>	
				</table>				
			</div>
		</c:forEach>
	

      <div id="button" align="center">
          <button id="function">
              <b>추가</b>
          </button> &nbsp;&nbsp;&nbsp; 
          <button><b>수정</b></button>&nbsp;&nbsp;&nbsp;  
      </div>
      <br><br><br><br><br>
      </div>
  </div>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>