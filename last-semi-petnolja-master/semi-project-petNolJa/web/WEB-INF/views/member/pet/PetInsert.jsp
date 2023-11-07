<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반려동물 등록 페이지</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

	<style>
	    h1 {text-align: center;}
	    .detailTitle {height: 500px; Width: 1500px;margin: auto;; margin-top: 20px;}
	    h2 {width: 30%; margin: auto; margin-bottom: 10px; text-align: center;}
	    .petInfo {margin: auto;}
	    #button{margin-top: 50px; position: absolute; width: 53%; text-align: right; margin-right: 900px;}
	    #wrap{width: 1500px;}
	    aside{float: center; width: 20%;}
	    section>section{margin: auto; width: 60%;}
	    aside{float: left; width: 20%;}
    </style>
    
</head>
<body>
    <jsp:include page="../../common/header-main.jsp"/>
    
	<div id="wrap">
            <h2>반려동물 등록</h2>
            <p>* 필수입력</p>
            <hr>
            <div class="detailTitle" align="center">
                <table>
                    <tr>
                        <td rowspan="2" width="200px" height="100px" align="center" style="background-color: gray;">사진</td>
                    </tr>
                </table>
                <br>
                
    <form action="${ pageContext.servletContext.contextPath }/member/pet/insert" method="post">
            <table>
				<tr>
					<th>이름 : </th>
						<td id="data"><input type="text" name="petName" id="name" placeholder="이름을 입력하세요."></td>
				</tr>
				<tr>
					<th>종류 : </th>
						<td><input type="checkbox" id="dog" name="petKind" value="dog" unchecked>강아지</td>
						<td><input type="checkbox" id="cat" name="petKind" value="cat" unchecked>고양이</td>
				</tr>
				<tr>
					<th>품종 : </th>
						<td id="data"><input type="text" name="petType" id="name" placeholder="품종을 입력하세요."></td>
					<th>등록 번호 : </th>
						<td id="data"><input type="text" name="petNumber" id="name" placeholder="등록 번호를 입력하세요."></td>
				<tr>
					<th>사회성 : </th>
						<td id="data"><input type="text" name="petCharacter" id="name" placeholder="사회성을 입력하세요."></td>
					<th>건강상태 : </th>
						<td id="data"><input type="text" name="petHealth" id="name" placeholder="건강상태를 입력하세요."></td>
				</tr>
				<tr>
					<th>나이 : </th>
						<td id="data"><input type="text" name="petAge" id="name" placeholder="나이를 입력해주세요"></td>
					
					<th>몸무게 : <th>
						<td id="data"><input type="text" name="petWeight" id="name" placeholder="몸무게를 입력해주세요"></td>
				</tr>
				<tr>
					<th>성별 : </th>
						<td id="data"><input type="checkbox" id="sex" name="petSex" value="sex" unchecked>남</td>
						<td id="data"><input type="checkbox" id="sex" name="petSex" value="sex" unchecked>여</td>
					<th>정기 접종 : </th>
						<td><input type="checkbox" id="yes" name="perioVaccinate" value="Y" unchecked>Y</td>
						<td><input type="checkbox" id="no" name="perioVaccinate" value="N" unchecked>N</td>
				</tr>
				<tr>
					<th>광견병 접종 여부 : </th>
						<td><input type="checkbox" id="yes" name="rabiesVaccinate" value="Y" unchecked>Y</td>
						<td><input type="checkbox" id="no" name="rabiesVaccinate" value="N" unchecked>N</td>
					
					<th>즁성화 여부 : </th>
						<td><input type="checkbox" id="yes" name="petNeuter" value="Y" unchecked>Y</td>
						<td><input type="checkbox" id="no" name="petNeuter" value="N" unchecked>N</td>
				</tr>
				<tr>
					<th>기타 참고사항 : </th>
						<td id="data"><input type="text" name="petEtc" id="name" placeholder="기타 참고사항을 입력해주세요"></td>
				</tr>

            </table>
                <div id="button">
                    <button type="reset" onclick="location.href='${ pageContext.request.contextPath }/index.jsp'"><b>취소</b></button>&nbsp;&nbsp;&nbsp;<button><b>완료</b></button>
                </div>
    </form>
            </div>
            <aside>　</aside>
         </div>

    <jsp:include page="../../common/footer-main.jsp"/>	
</body>
</html>