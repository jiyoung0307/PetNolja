<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<style>
   input{width: 300px;}
	#order{font-size:14px;}
	input{width: 300px;}
	.button{display:block; position:relative; display:block; width:320px; margin:0 auto; padding-top:60px; }
	#order{font-size:14px;}
	#btn1,#btn2 {border:0.7px solid  #73645D; background-color:transparent;width:100px; height:30px;}
	#btn1,#btn2 a {color: #73645D;font-size:13px;}
	#btn1:hover,#btn2:hover {border:0.7px solid  #73645D; background-color:#73645d; color:rgba(233, 230, 226, 1);width:100px; height:30px;}
	.text-deco{color: rgb(152, 126, 88);}
</style>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

   <div class="wrap">
        <div class="innerwrap">
            <div align="center">
                <h2>회원 정보 입력</h2>
                <p id="order">① 약관동의 - <b class="text-deco">② 회원 정보 입력</b> - ③ 가입 완료</p>
            </div>
            
            <!-- 이전 회원가입 페이지에서 사용했던 MemberRegistServlet 으로 다시 이동 -> post로 값을 넘겨주어 보안 및 doPost 실행으로 같은 서블릿을 이용 가능 -->
            <form action="${ pageContext.servletContext.contextPath }/member/regist" method="post">
                <br>
                <p id="ness">* 필수 입력</p>
                <hr>
                <table align="center" width="100%">
                    <tr>
                        <td width="100px"><label for="memberId">아이디 </label></td>
                        <td width="300px">
                           <input type="text" maxlength="12" class="memberId" name="memberId" id="memberId" placeholder="사용할 아이디를 입력하세요." required="required"> 
                        </td>
                        <td>
                           <div id="checkId"></div>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="memberPwd">비밀번호 </label></td>
                        <td><input type="password" maxlength="24" name=memberPwd id="memberPwd" placeholder="사용할 비밀번호를 입력하세요." required="required"></td>
                        <td>
                           <div id="checkPwd"></div>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="pwdcheck">비밀번호 확인 </label></td>
                        <td><input type="password" name="pwdcheck" id="pwdcheck" placeholder="사용할 비밀번호를 입력하세요." required="required"></td>
                        <td>
                           <div id="checkPwd2"></div>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="3"><hr></td>
                    </tr>
                    <tr>
                        <td><label for="memberName">이름 </label></td>
                        <td><input type="text" name="memberName" id="memberName" placeholder="이름을 입력하세요." required="required"></td>
                        <td>
                           <div id="checkName"></div>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="memberBirth">생년월일 </label></td>
                        <td><input type="date" name="memberBirth" id="memberBirth" required="required"></td>
                        <td>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="memberPhone">핸드폰 </label></td>
                        <td><input type="tel" name="memberPhone" id="memberPhone" placeholder="ex. 010-1234-1234" required="required"></td>
                        <td><button  type="button" id="phoneCheck">인증번호 요청</button><div id="checkPhone"></div></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="text" name="phoneCheck" id="phoneCheck" placeholder="인증번호를 입력하세요." required="required"></td>
                        <td><button type="button">인증번호 확인</button></td>
                    </tr>
                    <tr>
                        <td colspan="3"><hr></td>
                    </tr>
                    <tr>
                        <td><label for="memberEmail">이메일 </label></td>
                        <td><input type="email" name="memberEmail" id="memberEmail" placeholder="사용할 이메일을 입력하세요." required="required"></td>
                        <td><div id="checkEmail"></div></td>
                    </tr>
                    <tr>
                        <td colspan="3"><hr></td>
                    </tr>
                </table>
			
				<div class="button" >             
                <button type="reset" onclick="location.href='${ pageContext.request.contextPath }/index.jsp'">취소</button>&nbsp;&nbsp;&nbsp;<button type="submit">다음</button>
            	</div> 
            </form>
        </div>
    </div>
    
    <script>
    	
        /* 아이디 유효성 검사 */
        $("#memberId").keyup(function(){
           let memberId = $("#memberId").val();
           let regExpId = /(?=.*\d)(?=.*[a-z]).{3,}/;
           
           if(memberId == '' || !(regExpId.test(memberId))){
               $("#checkId").html('　　아이디는 4~12자리의 영문 소문자와 숫자만 입력해주세요.');
               $("#checkId").css('color', 'gray').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
           } else{
              $("#checkId").html(' ');
           }
       });
       
       $("#memberId").keyup(function(){
           let memberId = $("#memberId").val();
           let regExpId = /(?=.*\d)(?=.*[a-z]).{3,}/;
           
              $.ajax({
                   url: "${pageContext.servletContext.contextPath}/member/check",
                   type: "get",
                   data: {memberId : memberId},
                   success: function(data){
                       if(data == 0 && memberId != '' && regExpId.test(memberId)){
                           $("#checkId").html('　사용 가능한 아이디입니다.');
                           $("#checkId").css('color', 'gray').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
                           console.log(data);
                           return true;
                       } else if(data == 1 || !(regExpId.test(memberId))) {
                           $("#checkId").html('　사용할 수 없는 아이디입니다.');
                           $("#checkId").css('color', 'red').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '18px');
                           console.log(data);
                           return false;
                       }
                   },
                   error: function(request, status){
                       alert("네트워크를 확인해주세요.")
                       return false;
                   }
               });
       });
       
       /* 비밀번호 유효성 검사 */
       $("#memberPwd").keyup(function(){
           let memberPwd = $("#memberPwd").val();
           let regExpPwd = /^(?=.*[a-z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{5,}$/;
           let memberId = $("#memberId").val();
           
           if(memberPwd == '' || !(regExpPwd.test(memberPwd))){
               $("#checkPwd").html('　비밀번호는 영문자, 숫자, 특수문자를 포함한 6~24자리로 입력해주세요.');
               $("#checkPwd").css('color', 'gray').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
               return false;
           } else{
              $("#checkPwd").html(' ');
              return true;
           }
       });
       
       $("#pwdcheck").keyup(function(){
           let pwdcheck = $("#pwdcheck").val();
           let memberPwd = $("#memberPwd").val();
           
           if(pwdcheck != memberPwd){
               $("#checkPwd2").html('　비밀번호가 일치하지 않습니다.');
               $("#checkPwd2").css('color', 'red').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
           } else{
              $("#checkPwd2").html(' ');
           }
       });
       
       /* 전화번호 유효성 검사 */
       $("#memberPhone").keyup(function(){
           let memberPhone = document.getElementById("memberPhone").value;
           var regExpPhone = /^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$/;
           
           if(!regExpPhone.test(memberPhone)){
                $("#memberPhone").css('color', 'red').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
               $("#checkPhone").html('000-0000-0000 형식으로 입력해주세요.');
           }else{
                $("#checkPhone").html('올바른 휴대폰 번호입니다.');
                $("#memberPhone").css('color', 'black').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
            }
       });
       
       /* 이메일 유효성 검사 */
        $("#memberEmail").keyup(function(){
            let memberEmail = $("#memberEmail").val();
            let regExpEmail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
            
            if(memberEmail == '' || !(regExpEmail.test(memberEmail))){
                $("#checkEmail").html('　비밀번호를 찾을 때 사용할 수 있는 이메일로 작성해주세요.');
                $("#checkEmail").css('color', 'gray').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
            } else{
               $("#checkEmail").html(' ');
            }
        });
        
        $("#memberEmail").keyup(function(){
            let memberEmail = $("#memberEmail").val();
            let regExpEmail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
            
               $.ajax({
                   url: "${pageContext.servletContext.contextPath}/member/check",
                   type: "get",
                   data: {memberEmail : memberEmail},
                   success: function(data){
                       if(data == 0 && memberEmail != '' && regExpEmail.test(memberEmail)){
                           $("#checkEmail").html('　사용 가능한 이메일입니다.');
                           $("#checkEmail").css('color', 'gray').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
                           console.log(data);
                           return true;
                       } else if(data == 1 || !(regExpEmail.test(memberEmail))) {
                           $("#checkEmail").html('　사용할 수 없는 이메일입니다.');
                           $("#checkEmail").css('color', 'red').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '18px');
                           console.log(data);
                       }
                   },
                   error: function(request, status){
                       alert("네트워크를 확인해주세요.")
                   }
               });
        });
       
        
        


    </script>

<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>