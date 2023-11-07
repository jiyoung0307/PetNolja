<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠폰 목록 조회</title>

<style>
	#table{text-align: center; border-collapse: collapse;}
    #button{position: absolute; width: 70%; text-align: center;}
    div>button{width: 120px; height: 30px; border: none; background-color: rgb(152, 126, 88); color: white;}
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<div class="innerwrap" align="center">
        <br>
        <h2 >Coupon</h2>
        <br>
        <table  width="70%">
            <tr>
                <td width="100px">쿠폰 검색</td>
                <td><label for="couponName">쿠폰명</label></td>
                <td width="200px"><input type="text" name="couponName" id="couponName" placeholder="쿠폰명을 입력하세요."></td>
                <td width="50px"> </td>
                <td><label for="admin">작성자</label></td>
                <td width="200px"><input type="text" name="admin" id="admin" placeholder="작성자를 입력하세요."></td>
                <td width="50px"> </td>
                <td><button type="submit">검색</button></td>
            </tr>
            <tr>
                <td colspan="8" height="60px"><br></td>
            </tr>
            <tr>
                <td>정렬</td>
                <td>
                    <select name="orderby" id="orderby">
                        <option value="startDate">발행일순</option>
                        <option value="endDate">만료일순</option>
                        <option value="discount">할인 금액순</option>
                        <option value="adminName">관리자 이름순</option>
                        <option value="title">쿠폰 이름순</option>
                    </select>
                </td>
                <td colspan="4"></td>
                <td colspan="2" align="right"><input type="button" value="쿠폰 등록"></td>
            </tr>
        </table>
        <table border="1" width="70%" id="table">
            <tr height="25px">
                <th width="50px">글 번호</th>
                <th>작성자</th>
                <th>쿠폰 제목</th>
                <th>할인 금액</th>
                <th>발행일</th>
                <th>만료일</th>
            </tr>
            <tr height="25px">
                <td>1</td>
                <td>최지수</td>
                <td>멍멍 할인 대잔치</td>
                <td>10,000원</td>
                <td>2022/05/07</td>
                <td>2022/06/09</td>
            </tr>
            <tr height="25px">
                <td>1</td>
                <td>최지수</td>
                <td>멍멍 할인 대잔치</td>
                <td>10,000원</td>
                <td>2022/05/07</td>
                <td>2022/06/09</td>
            </tr>
            <tr height="25px">
                <td>1</td>
                <td>최지수</td>
                <td>멍멍 할인 대잔치</td>
                <td>10,000원</td>
                <td>2022/05/07</td>
                <td>2022/06/09</td>
            </tr>
            <tr height="25px">
                <td>1</td>
                <td>최지수</td>
                <td>멍멍 할인 대잔치</td>
                <td>10,000원</td>
                <td>2022/05/07</td>
                <td>2022/06/09</td>
            </tr>
            <tr height="25px">
                <td>1</td>
                <td>최지수</td>
                <td>멍멍 할인 대잔치</td>
                <td>10,000원</td>
                <td>2022/05/07</td>
                <td>2022/06/09</td>
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