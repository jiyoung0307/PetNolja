<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>신규 입사자 등록</title>

<style>
	#button{position: absolute; width: 70%; text-align: center;}
    div>button{width: 120px; height: 30px; border: none; background-color: rgb(152, 126, 88); color: white;}
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="innerwrap">
        <br>
        <h2 align="center">신규 입사자 등록</h2>
        <br>
        <table align="center">
            <tr>
                <td colspan="2"><hr></td>
            </tr>
            <tr>
                <td width="10%"><label for="id">사번 </label></td>
                <td><input type="text" name="id" id="id" readonly value="20220501"></td>
            </tr>
            <tr>
                <td><label for="name">이름 </label></td>
                <td><input type="text" name="name" id="name" placeholder="신규 입사자 이름을 입력하세요."></td>
            </tr>
            <tr>
                <td><label for="adminNo">주민번호 </label></td>
                <td><input type="" name="name" id="name" placeholder="이름을 입력하세요."></td>
            </tr>
            <tr>
                <td><label for="phone">핸드폰 </label></td>
                <td><input type="tel" name="phone" id="phone" placeholder="ex. 010-1234-1234"> <button type="submit">인증번호 요청</button>
            </tr>
            <tr>
                <td><label for="email">이메일 </label></td>
                <td><input type="email" name="email" id="email" placeholder="사용할 이메일을 입력하세요."> <button type="submit">중복확인</button></td>
            </tr>
            <tr>
                <td colspan="2"><hr></td>
            </tr>
            <tr>
                <td><label for="hireDate">입사일 </label></td>
                <td><input type="date" name="hireDate" id="hireDate"></td>
            </tr>
            <tr>
                <td><label for="dept">부서 </label></td>
                <td>
                    <select name="dept" id="dept">
                        <option value="humanResources">인사관리부</option>
                        <option value="accounting">재무회계부</option>
                        <option value="sales">영업관리부</option>
                        <option value="marketing">마케팅부</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><label for="job">직책 </label></td>
                <td>
                    <select name="job" id="job">
                        <option value="junior">사원</option>
                        <option value="senior">주임</option>
                        <option value="deputy">대리</option>
                        <option value="manager">과장</option>
                        <option value="executives">임원</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><label for="salary">급여 </label></td>
                <td><input type="text" name="salary" id="salary" placeholder="월 급여 단위로 입력하세요."> won</td>
            </tr>
            <tr>
                <td><label for="bonus">보너스 </label></td>
                <td><input type="text" name="bonus" id="bonus" placeholder="연 보너스 단위를 입력하세요."> %</td>
            </tr>
            <tr>
                <td colspan="2"><hr></td>
            </tr>
        </table>
        <br><br><br>
        <div id="button">
          <button type="reset">취소</button>&nbsp;&nbsp;<button type="submit">다음</button>
        </div>
    </div>
</div>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>