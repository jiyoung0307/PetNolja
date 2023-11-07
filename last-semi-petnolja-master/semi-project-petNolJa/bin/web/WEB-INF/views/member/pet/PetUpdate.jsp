<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반려동물 등록 수정</title>

	    <style>
        body{background-color:rgb(243, 242, 242); width: 1500px; margin: auto;}
        .wrap{width: 1500px; margin: auto;}
        aside{float: left; width: 300px;}
        section>section{float: left; width: 900px;}
        table{width: 1500px; margin: auto;}
        #pic{background-color: rgb(207, 207, 207);  width: 450px; text-align: center;}


        .detailTitle {height: 500px; width: 100%; margin-top: 20px;}

        h2 {width: 450px; margin: auto; margin-bottom: 10px; text-align: center;}
        .petInfo {margin: auto;}
        #button {width: 900px; text-align: center;}
        .wrap {width: 1500px; margin: auto;}

    </style>

</head>
<body>
	<div class="wrap">
        <div>
            <h2>멍멍이</h2>
            <p>* 필수입력</p>
            <hr>
            <div class="detailTitle" align="center">
                <table>
                    <tr>
                        <td rowspan="2" width="200px" height="100px" align="center" style="background-color: gray;">사진
                        </td>
                    </tr>
                </table>
                <br>
                <table>
                    <tr>
                        <td id="label"><label for="name">이름</label></td>
                        <td id="data"><input type="text" name="name" id="name" placeholder="반려동물의 이름을 입력하세요."></td>
                        <td id="label"></td>
                        <td id="label"><label for="sociability">사회성</label></td>
                        <td id="data"><input type="text" name="sociability" id="sociability" placeholder="사회성을 입력하세요.">
                        </td>
                    </tr>
                    <tr>
                        <td id="label"><label>품종</label></td>
                        <td id="data">
                            <form>
                                <select name="breed">
                                    <option value="none">=== 선택 ===</option>
                                    <option value="maltese">말티즈</option>
                                    <option value="poodle">푸들</option>
                                    <option value="retriever">리트리버</option>
                                    <option value="shihTzu">시츄</option>
                                </select>
                            </form>
                        </td>
                        <td></td>
                        <td id="label"><label for="health">건강 상태</label></td>
                        <td id="data"><input type="text" name="health" id="health" placeholder="건강상태를 입력하세요."></td>
                    </tr>
                    <tr>
                        <td id="label"><label for="weight">몸무게</label></td>
                        <td id="data"><input type="number" name="weight" id="weight" placeholder="몸무게를 입력하세요."></td>
                        <td></td>
                        <td id="label"><label for="etc"><small>기타 참고사항</small></label></td>
                        <td id="data"><input type="text" name="etc" id="etc" placeholder="기타 참고사항을 입력하세요."></td>
                    </tr>
                    <tr>
                        <td id="label"><label for="birth">생년월일</label></td>
                        <td id="data"><input type="date" name="birth" id="birth" value="2022-04-10"></td>
                        <td></td>
                        <td id="label"><label for="vaccination">정기 접종</label></td>
                        <td id="data"><input type="number" name="vaccination" id="vaccination" value="6"><small>
                                차</small>
                        </td>
                    </tr>
                    <tr>
                        <td id="label"><label>성별</label></td>
                        <td id="data"><button name="sex" value="man"><b>남</b></button>&nbsp;&nbsp;&nbsp;<button
                                name="sex" value="woman"><b>여</b></button>&nbsp;&nbsp;&nbsp;<button name="sex"
                                value="mannorwoman"><b>중성화</b></button></td>
                        <td></td>
                        <td id="label"><label for="raibies">광견병 접종</label></td>
                        <td id="data"><button name="raibies" value="yes"><b>YES</b></button>&nbsp;&nbsp;&nbsp;<button
                                name="raibies" value="no"><b>NO</b></button></td>
                    </tr>
            </table>
            <br>
            <div id="button" align="center">
                <button id="cancle"><b>취소</b></button> &nbsp;&nbsp;&nbsp; <button><b>수정</b></button>
            </div>
            <br><br><br><br><br>
        </div>
    </div>
    </div>
</body>
</html>