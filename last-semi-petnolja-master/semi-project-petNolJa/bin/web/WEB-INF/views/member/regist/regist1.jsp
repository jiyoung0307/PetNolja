<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    
	<style>
		#order{font-size: 14px; padding-top:10px;}
		#script{font-size: 15px; padding-top:10px;}
		label{font-size: 16px; height: 20px;}
		.checksub{margin-left: 20px; display:block; height:20px;}
		input[type="checkbox"]{zoom: 1.5; cursor: pointer;}
		.button {width:320px; margin:0 auto; position:relative; bottom:20px;}
		.innerwrap {
	    width: 900px;
	    height: 600px;
	    margin: 0 auto;
	    }
	.text-deco {color: rgb(152, 126, 88);}
	#allAgree {position:relative; bottom:-10px;}
	.c1{position:relative; left:10px;}
	.allagree{position: relative; left:10px; }
	#script { padding-bottom:0;}
	#agree1,#agree2,#agree3{position:relative; top:11.5px;}
	#allAgree1, #allAgree2{ position:relative; top:11.5px;}
	#sms1,#email1, #email2 { position:relative; top:11.5px; }
	</style>


</head>
<body>
 <jsp:include page="../../common/header-main.jsp"/>

 <div class="innerwrap">
     <div align="center">
	     <h2 class="h2korea">약관동의</h2>
	     <p id="order"><b class="text-deco">① 약관동의</b> - ② 회원 정보 입력 - ③ 가입 완료</p>
	     <p id="script">아래 동의서를 각각 확인한 후 개별적으로 동의하실 수 있습니다. 전체 동의시 체크되는 항목에는 선택 동의 항목이 포함되어 있습니다. <br>
	         펫놀자 회원 가입을 위하여 펫놀자(이하"회사")에서는 아래와 같이 개인정보를 수집, 이용 및 제공하고자 합니다.</p>
     </div>
     
     <!-- 여기서도 역시나 WEB-INF내에 있는 다음 회원 가입 단계 jsp로 바로 이동이 불가하기 때문에 MemberRegistServlet에서 forward로 이동해야 함 : get으로 이동한 이유는 다음 회원가입 단계에서 post로 값을 넘겨 같은 서블릿으로 처리하기 위해서(서블릿 낭비XX) -->
     <form action="${pageContext.servletContext.contextPath}/member/regist" method="get">
     	 <div class="check">
		     <br>
		     <input type="checkbox" name="allAgree" id="allAgree"><label for="allAgree" class="allAgree" >전체 동의하기</label>
		     <br>
		     <br>
		     <hr>
		     <input type="checkbox" name="agree1" id="agree1" class="normal" required="required"><label for="agree1" class="c1">펫놀자 회원약관 <b class="text-deco">(필수)</b></label>
		     <br>
		     <input type="checkbox" name="agree2" id="agree2" class="normal" required="required"><label for="agree2"  class="c1">개인정보의 수집·이용에 관한 사항 <b class="text-deco">(필수)</b></label>
		     <br>
		     <input type="checkbox" name="agree3" id="agree3" class="normal"><label for="agree3"  class="c1">개인정보 수집이용에 관한 사항 <b>(선택)</b></label>
		     <br>
		     <div class="checksub1">
		     <input type="checkbox" name="allAgree1" id="allAgree1"><label for="allAgree1"  class="c1">상품안내 및 마케팅 활용을 위한 개인정보 수집·이용에 관한 동의 <b>(선택)</b></label><br>
	            <input type="checkbox" name="sms1" id="sms1"><label for="sms1">SMS</label>&nbsp;&nbsp;&nbsp;<input type="checkbox" name="email1" id="email1"><label for="email1">email</label>
	         </div>
	            <br>
	         <div class="checksub2">
	            <input type="checkbox" name="allAgree2" id="allAgree2"><label for="allAgree2"  class="c1">상품안내 및 마케팅 활용을 위한 개인정보 제3자 제공에 관한 동의 <b>(선택)</b></label><br>
	            <input type="checkbox" name="sms1" id="sms1"><label for="sms1">SMS</label>&nbsp;&nbsp;&nbsp;<input type="checkbox" name="email1" id="email1"><label for="email1">email</label>
	         </div>
		     <br><br>
		     <hr>	
     	</div>
     </form>
 	 <div class="button">
		<button type="reset" onclick="location.href='${ pageContext.request.contextPath }/index.jsp'"><b>이전</b></button>&nbsp;&nbsp;&nbsp; <button type="submit" onclick="location.href='${ pageContext.request.contextPath }/member/regist'"><b>다음</b></button>
	 </div>

 </div >

 <script>
	$(".check").on("click", "#allAgree", function () {
		    $(this).parents(".check").find('input').prop("checked", $(this).is(":checked"));
	 });
	
	$(".check").on("click", "#allAgree1", function () {
	    $(this).parents(".checksub1").find('input').prop("checked", $(this).is(":checked"));
	 });
	
	$(".check").on("click", "#allAgree2", function () {
	    $(this).parents(".checksub2").find('input').prop("checked", $(this).is(":checked"));
	 });	
	
	$(".check").on("click", ".normal", function() {
	    var is_checked = true;
	
	    $(".check .normal").each(function(){
	        is_checked = is_checked && $(this).is(":checked");
	    });
	
	    $("#allAgree").prop("checked", is_checked);
	 });
	
 </script>

<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>