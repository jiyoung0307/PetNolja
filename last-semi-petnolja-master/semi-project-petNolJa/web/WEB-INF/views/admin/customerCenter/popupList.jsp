<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>팝업 목록 조회</title>

<style>
	#table{
            text-align: left; 
            border-collapse: collapse;
        }
   #button{
       position: absolute;
       width: 70%;
       text-align: center;
   }
   div>button{
       width: 120px;
       height: 30px;
       border: none;
       background-color: rgb(152, 126, 88);
       color: white;
   }
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="innerwrap" align="center">
        <br>
        <h2 >Pop Up</h2>
        <br>
        <table  width="70%">
            <tr>
                <td width="130px"><b>팝업 검색</b></td>
                <td align="right"><label for="couponName"><b>팝업 제목　</b></label></td>
                <td width="200px"><input type="text" name="title" id="title" placeholder="팝업 제목을 입력하세요."></td>
                <td width="50px"> </td>
                <td align="right"><label for="admin"><b>작성자　</b></label></td>
                <td width="200px"><input type="text" name="admin" id="admin" placeholder="작성자를 입력하세요."></td>
                <td width="50px"> </td>
                <td><button type="submit"><b>검색</b></button></td>
            </tr>
            <tr>
                <td colspan="8" height="60px"><br></td>
            </tr>
            <tr>
                <td>정렬</td>
                <td>
                    <select name="orderby" id="orderby">
                        <option value="startDate">작성일순</option>
                        <option value="endDate">만료일순</option>
                        <option value="adminName">관리자 이름순</option>
                        <option value="title">팝업 제목순</option>
                    </select>
                </td>
                <td colspan="4"></td>
                <td colspan="2" align="right"><input type="button" value="팝업 등록"></td>
            </tr>
        </table>
        <table border="1" width="70%" id="table">
            <tr height="25px">
                <th width="50px">글 번호</th>
                <th>작성자</th>
                <th>팝업 제목</th>
                <th>작성일</th>
                <th>만료일</th>
            </tr>
            <tr height="25px">
                <td>1</td>
                <td>최지수</td>
                <td>멍멍 할인 대잔치 이벤트</td>
                <td>2022/05/07</td>
                <td>2022/06/30</td>
            </tr>
            <tr height="25px">
                <td>1</td>
                <td>최지수</td>
                <td>멍멍 할인 대잔치 이벤트</td>
                <td>2022/05/07</td>
                <td>2022/06/30</td>
            </tr>
            <tr height="25px">
                <td>1</td>
                <td>최지수</td>
                <td>멍멍 할인 대잔치 이벤트</td>
                <td>2022/05/07</td>
                <td>2022/06/30</td>
            </tr>
            <tr height="25px">
                <td>1</td>
                <td>최지수</td>
                <td>멍멍 할인 대잔치 이벤트</td>
                <td>2022/05/07</td>
                <td>2022/06/30</td>
            </tr>
            <tr height="25px">
                <td>1</td>
                <td>최지수</td>
                <td>멍멍 할인 대잔치 이벤트</td>
                <td>2022/05/07</td>
                <td>2022/06/30</td>
            </tr>
        </table>        
        <br><br><br>
        <div id="button">
            <button type="button">확인</button>
          </div>
        
    </div>
</div>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>