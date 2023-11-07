<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>

<form action="${ pageContext.servletContext.contextPath }/member/admin/change" method="post">
	<div class="innerwrap">
         <h2>비밀번호 변경</h2>
         <br>
         <hr>
         <br>
         <div >
            <label for="empPwd">새로운 비밀번호 </label>　<input type="password" name="empPwd" id="empPwd" placeholder="새로운 비밀번호를 입력하세요." style="width: 400px;"><div id="check1"></div><br><br>
            <label for="checkPwd">비밀번호 확인 </label>　　<input type="password" name="checkPwd" id="checkPwd" placeholder="비밀번호를 다시 입력하세요." style="width: 400px;"><div id="check2"></div><br><br>
         </div>
         <br>
         <hr>
         <br><br><br>
         <div id="button">
             <button type="reset" onclick="location.href='${ pageContext.request.contextPath }/admin/main'">취소</button><button type="submit">완료</button>
         </div>
     </div>
</form>

<script>
		/* 비밀번호 유효성 검사 */
		$("#empPwd").keyup(function(){
		    let empPwd = $("#empPwd").val();
		    let regExpPwd = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{5,}$/;
		    
		    if(empPwd == '' || !(regExpPwd.test(empPwd))){
		        $("#check1").html('　비밀번호는 영문자, 숫자, 특수문자를 포함한 6~24자리로 입력해주세요.');
		        $("#check1").css('color', 'gray').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
		    } else{
		    	$("#check1").html(' ');
		    }
		});
	    
	    $("#checkPwd").keyup(function(){
	        let checkPwd = $("#checkPwd").val();
	        let empPwd = $("#empPwd").val();
	        
	        if(checkPwd != empPwd){
	            $("#check2").html('　비밀번호가 일치하지 않습니다.');
	            $("#check2").css('color', 'red').css('font-family','Nanumsquare', "맑은 고딕","돋움").css('font-size', '16px');
	        } else{
	        	$("#check2").html(' ');
	        }
	    });
</script>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>