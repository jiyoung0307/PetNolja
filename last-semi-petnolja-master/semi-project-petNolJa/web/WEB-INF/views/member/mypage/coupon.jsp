<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 페이지의 쿠폰 조회</title>
<style>
  table{width: 800px;}
</style>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

<div class="wrap">
        <div class="innerwrap">
            <h2>Coupon</h2>
            <p><c:out value="${sessionScope.loginMember.memberName}"/>님의 회원등급은 <b><c:out value="${sessionScope.loginMember.gradeNo}"/></b> 입니다.</p>
            <br><br>
            <hr>

            <div class="tabmenu">
                    <div class="tabCon" align="center">
                    
                      <table>
                        <tr>
                            <td>쿠폰 번호</td>
                            <td>쿠폰 내용</td>
                            <td>할인 금액</td>
                            <td>유효 기간</td>
                        </tr>
                      </table>
                      <fmt:formatData var="today" value="${now}" pattern="yyyy/MM/dd"/>
                    <c:if test="${today < couponList.coupon.couponEndDate}">
                      <table style="color: black;">
                        <tr>
                            <td><c:out value="${couponList.couponNo}"/> </td>
                            <td><c:out value="${couponList.coupon.couponName}"/></td>
                            <td><c:out value="${couponList.coupon.couponDiscountPrice}"/></td>
                            <td><c:out value="${couponList.coupon.couponStartDate} ~ "/><c:out value="${couponList.coupon.couponEndDate}"/></td>
                        </tr>
                    </table>
                  </c:if>
                  <c:forEach var="couponList" items="${ requestScope.couponList }">
                    <c:if test="${today > couponList.coupon.couponEndDate}">
                    <table style="color: rgb(177, 177, 177);">
                      <tr>
                          <td><c:out value="${couponList.couponNo}"/> </td>
                          <td><c:out value="${couponList.coupon.couponName}"/></td>
                          <td><c:out value="${couponList.coupon.couponDiscountPrice}"/></td>
                          <td><c:out value="${couponList.coupon.couponStartDate} ~ "/><c:out value="${couponList.coupon.couponEndDate}"/></td>
                      </tr>
                  </table>
                  </c:if>
                  </c:forEach>
            <br><br><br><br><br><br>
            <div id="button">
                <button onclick="location.href='${pageContext.servletContext.contextPath}/index.jsp'">메인으로</button>
            </div>
        </div>
    </div>
    
<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>