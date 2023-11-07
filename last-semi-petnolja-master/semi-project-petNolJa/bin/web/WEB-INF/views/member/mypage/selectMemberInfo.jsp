<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<meta charset="UTF-8">
    <style>
       .table{
         width: 100%;
       }
      .table>h3{
         text-align: left;
         font-family:'Gilda Display', serif;
      }
       .rp{
         width: 100%;
         height: 80px;
         text-align: center;
         cursor: pointer;
         font-size: 18px;
         background-color: #ebe8e8;
      }
      #td1:hover,#td2:hover{
         background-color: transparent;        
         border:1px solid black;
      }
      .crud{
         width: 100%;
         height: 50px;
         margin-top: 20px;
         text-align: center;
         font-size: 22px;
      }
      #c, #r{
         border-right: 0.5px solid rgb(160, 160, 160);
      }
      #c, #r, #u{
         cursor: pointer;
      }
      .select{
         width: 100%;
         margin-top: 20px;
      }
      #right{text-align: center;}
      #left{text-align: left;}
      #blank{width: 100px;}
      
    </style>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

<div class="wrap">
   <aside></aside>
   <section class="innerwrap">
      <div class="table">
         <h3>My page</h3>
         <br><hr><br>
         <h4><c:out value="${sessionScope.loginMember.memberName}"/>님 환영합니다.</h4><br>
      </div>
      <div class="table">
         <table class="rp">
            <tr>
               <td id="td1" style="width: 50%;"><b>RESERVATION</b></td>
               <td id="td2" style="width: 50%;"><b>POINT</b></td>
            </tr>
         </table>
      </div>
      <div class="table">
         <table class="crud">
            <tr>
               <td id="c" onclick="location.href='${pageContext.servletContext.contextPath}/member/info/select'">조회</td>
               <td id="r" onclick="location.href='${pageContext.servletContext.contextPath}/updateMemberInfo'">수정</td>
               <td id="u" onclick="location.href='${pageContext.servletContext.contextPath}/InsertWithDrawMember'">탈퇴</td>
            </tr>
         </table>
      </div>
      <c:if test="${requestScope.crud eq 'select'}">
      <div class="table">
         <table class="select">
            <tr>
               <td id="right"><p>아이디</p></td>
               <td id="blank"></td>
               <td id="left"><p>${sessionScope.loginMember.memberName}</p></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
            <tr>
               <td id="right"><p>휴대폰 번호</p></td>
               <td id="blank"></td>
               <td id="left"><p>${sessionScope.loginMember.memberPhone}</p></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
            <tr>
               <td id="right"><p>이메일</p></td>
               <td id="blank"></td>
               <td id="left"><p>${sessionScope.loginMember.memberEmail}</p></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
            <tr>
               <td id="right"><p>생년월일</p></td>
               <td id="blank"></td>
               <td id="left"><p>${sessionScope.loginMember.memberBirth}</p></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
            <tr>
               <td id="right"><p>포인트</p></td>
               <td id="blank"></td>
               <td id="left"><p>${sessionScope.loginMember.memberPoint}</p></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
         </table>
         <br><br><br>
         <div id="button">
            <button onclick="location.href='${pageContext.request.contextPath}/index.jsp'"> 메인으로 </button>
         </div>
      </div>
      </c:if>
      <c:if test="${requestScope.crud eq 'update'}">
      <div class="table">
         <form action="${pageContext.servletContext.contextPath}/updateMemberInfo" method="post">
         <table class="select">
            <tr>
               <td id="right"><p>아이디</p></td>
               <td id="blank"></td>
               <td id="left"><input type="text" value="${sessionScope.loginMember.memberName}" disabled></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
            <tr>
               <td id="right"><p>휴대폰 번호</p></td>
               <td id="blank"></td>
               <td id="left"><input type="tel" name="phone" id="phone" value="${sessionScope.loginMember.memberPhone}"></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
            <tr>
               <td id="right"><p>이메일</p></td>
               <td id="blank"></td>
               <td id="left"><input type="email" name="email" id="email" value="${sessionScope.loginMember.memberEmail}"></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
            <tr>
               <td id="right"><p>생년월일</p></td>
               <td id="blank"></td>
               <td id="left"><input type="date"  value="${sessionScope.loginMember.memberBirth}" disabled></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
            <tr>
               <td id="right"><p>포인트</p></td>
               <td id="blank"></td>
               <td id="left"><p>${sessionScope.loginMember.memberPoint}</p></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
         </table>
         <div id="button">
            <button type="reset" onclick="location.href='${pageContext.request.contextPath}/index.jsp'"> 취소 </button>&nbsp;&nbsp;&nbsp;<button type="submit"> 수정 </button>
         </div>
      </form>
      </div>
      </c:if>
      <c:if test="${requestScope.crud eq 'delete'}">
      <div class="table">
         <table class="select">
            <tr>
               <td id="right"><p>아이디</p></td>
               <td id="blank"></td>
               <td id="left"><input type="text" name="id" id="id" value="${sessionScope.loginMember.memberId}" disabled></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
            <tr>
               <td id="right"><p>비밀번호</p></td>
               <td id="blank"></td>
               <td id="left"><input type="password" name="pwd" id="pwd" required></td>
            </tr>
            <tr>
               <td colspan="3" style="height: 30px;"></td>
            </tr>
         </table>
         <div id="button">
            <button type="reset" onclick="location.href='${pageContext.request.contextPath}/index.jsp'"> 취소 </button>&nbsp;&nbsp;&nbsp;<button id="out" type="button"> 탈퇴 </button>
         </div>
      </div>
      </c:if>
   </section>
</div>

<script>
   

   $("#out").click(function(){
      let pwd = $("#pwd").val();
      let id = $("#id").val();

      $.ajax({
         url: "${pageContext.servletContext.contextPath}/InsertWithDrawMember",
         type: "post",
         data: {
            id:id,
            pwd:pwd
         },
         success: function(data){
            alert('회원 탈퇴가 완료되었습니다.\n이용해주셔서 감사합니다.');
            location.href='${pageContext.request.contextPath}/index.jsp';
         },
         error: function(request, status){
            alert('비밀번호를 다시 확인해주세요.');
         }
      });
   });
</script>

<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>