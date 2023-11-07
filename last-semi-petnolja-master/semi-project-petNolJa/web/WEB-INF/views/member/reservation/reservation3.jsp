<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 3단계</title>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<!-- iamport.payment.js -->
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
 
 <style>
         h2{padding-top:80px;}
        .wrap{width: 100%;}
        #script{color: rgb(101, 101, 101); font-size: 16px;}
        #order{color:rgb(181, 181, 181); font-size: 14px;}
        .date{color:rgb(152, 126, 88);}
        aside{float: left; width: 20%;}
        section{float: left;width: 60%;}
        #ness{font-size: xx-small; color: rgb(152, 126, 88);}
        #hr{border-style: ridge;}
        table{width: 100%;}
        td{height: 50px; text-align: left;}
        #label{width: 10%;}
        #data{width: 35%;}
        input{border: none; width: 80%;}
        select{border: none; width: 80%;}
        td>button{width: 30%;}
        td>h3{text-align: center;}
        #right{text-align: right;}
        #pointUse{width: 65%;}
        #agree{width: 5%; height: 18px;}
        #text{background-color: #ebe8e8; color: #73645d;}
        .sub_title { font-weight: bold;font-size:20px}
        #button{position: absolute; width: 60%; text-align: center;}
        aside{float: left; width: 20%;}
    </style>
</head>
<body>
    <jsp:include page="../../common/header-main.jsp"/>
    <section class="wrap">
        <aside>　</aside>
        <section>
            <h2>Booking</h2><br>
            <p id="script">Petnolja만의 특별한 <b>petsitter</b>와 편안함을 느낄 수 있는 <br>
                <b>객실</b>에서 잊을 수 없는 여행의 경험을 애완동물에게 선사합니다.</p> <br>
            <p id="order">① 날짜 선택 &nbsp;- ② 객실/펫시터 선택&nbsp; - <b class="date">③ 기본 정보 입력 및 결제&nbsp;</b> - ④ 예약 완료&nbsp;</p>
            <br>
            <hr>
            <p id="ness">* 필수 입력</p>
        <hr id="hr">
        <br>
            <div align="center">
                <table style="width: 100px;">
                  <tr>
                    <td><input type="radio" name="DoCtype" id="dog" value="DOG"><label for="dog">강아지</label></td>
                    <td><input type="radio" name="DoCtype" id="cat" value="CAT"><label for="cat">고양이</label></td>
                  </tr>  
                </table>
            </div>
            <c:choose>
                <c:when test="${empty requestScope.petList}">
                    <table>
                        <tr>
                            <td id="label"><label for="name">이름</label></td>
                            <td id="data"><input type="text" name="name" id="name" placeholder="반려동물의 이름을 작성해주세요." required></td>
                            <td id="label"></td>
                            <td id="label"><label for="sociability">사회성</label></td>
                            <td id="data"><input type="text" name="sociability" id="sociability" placeholder="반려동물의 사회성을 간략하게 작성해주세요." required></td>
                        </tr>
                        <tr>
                            <td id="label"><label for="type">품종</label></td>
                            <td id="data"><input type="text" name="type" id="type" placeholder="반려동물의 품종을 작성해주세요." required></td>
                            <td></td>
                            <td id="label"><label for="health">건강상태</label></td>
                            <td id="data"><input type="text" name="health" id="health" placeholder="반려동물의 건강상태를 작성해주세요." required></td>
                        </tr>
                        <tr>
                            <td id="label"><label for="weight">몸무게</label></td>
                            <td id="data"><input type="number" name="weight" id="weight" placeholder="반려동물의 몸무게를 숫자로 작성해주세요." required></td>
                            <td></td>
                            <td id="label"><label>중성화 여부</label></td>
                            <td id="data"><input type="radio" name="neuter" value="Y" checked><b>YES</b></button>&nbsp;&nbsp;&nbsp;<input type="radio" name="neuter" value="N" ><b>NO</b></button></td>
                        </tr>
                        <tr>
                            <td id="label"><label for="birth">나이</label></td>
                            <td id="data"><input type="number" name="age" id="age" placeholder="반려동물의 나이를 작성해주세요." required></td>
                            <td></td>
                            <td id="label"><label for="vaccination">정기 접종</label></td>
                            <td id="data"><input type="number" name="vaccination" id="vaccination" placeholder="정기접종 차수를 숫자로 입력해주세요." required><small> 차</small></td>
                        </tr>
                        <tr>
                            <td id="label"><label>성별</label></td>
                            <td id="data"><input type="radio" name="sex" value="man" checked><b>남</b></button>&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="woman"><b>여</b></button></td>
                            <td></td>
                            <td id="label"><label for="raibies">광견병 접종</label></td>
                            <td id="data"><input type="radio" name="raibies" value="Y"><b>YES</b></button>&nbsp;&nbsp;<input type="radio" name="raibies" value="N" checked><b>NO</b></button></td>
                        </tr>
                        <tr>
                            <td id="label"><label for="etc"><small>기타 참고사항</small></label></td>
                            <td id="data" colspan="4"><input type="text" name="etc" id="etc" value="${pet.petEtc}" required></td>
                        </tr>
                    </table>
                </c:when>
                <c:when test="${not empty requestScope.petList}">
                    <c:forEach var="pet" items="${ requestScope.petList }">
                        <table>
                            <tr>
                                <td id="label"><label for="name">이름</label></td>
                                <td id="data"><input type="text" name="name" id="name" value="${pet.petName}" required></td>
                                <td id="label"></td>
                                <td id="label"><label for="sociability">사회성</label></td>
                                <td id="data"><input type="text" name="sociability" id="sociability" value="${pet.petCharacter}" required></td>
                            </tr>
                            <tr>
                                <td id="label"><label for="type">품종</label></td>
                                <td id="data"><input type="text" name="type" id="type" value="${pet.petType}" required></td>
                                <td></td>
                                <td id="label"><label for="health">건강상태</label></td>
                                <td id="data"><input type="text" name="health" id="health" value="${pet.petHealth}" required></td>
                            </tr>
                            <tr>
                                <td id="label"><label for="weight">몸무게</label></td>
                                <td id="data"><input type="number" name="weight" id="weight" value="${pet.petWeight}" required></td>
                                <td></td>
                                <td id="label"><label>중성화 여부</label></td>
                                <c:if test="${pet.rabiesVaccinate eq 'Y'}">
                                <td id="data"><input type="radio" name="neuter" value="Y" checked><b>YES</b>&nbsp;&nbsp;&nbsp;<input type="radio" name="neuter" value="N" ><b>NO</b></td>
                                </c:if>
                                <c:if test="${pet.rabiesVaccinate eq 'N' or pet.rabiesVaccinate == null}">
                                <td id="data"><input type="radio" name="neuter" value="Y"><b>YES</b>&nbsp;&nbsp;&nbsp;<input type="radio" name="neuter" value="N" checked><b>NO</b></td>
                                </c:if>
                            </tr>
                            <tr>
                                <td id="label"><label for="birth">나이</label></td>
                                <td id="data"><input type="number" name="age" id="age" value="${pet.petAge}" required></td>
                                <td></td>
                                <td id="label"><label for="vaccination">정기 접종</label></td>
                                <td id="data"><input type="number" name="vaccination" id="vaccination" value="${pet.perioVaccinate}" required><small> 차</small></td>
                            </tr>
                            <tr>
                                <td id="label"><label>성별</label></td>
                                <c:if test="${pet.petSex eq 'man' or pet.petSex == null}">
                                <td id="data"><input type="radio" name="sex" value="man" checked><b>남</b>&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="woman"><b>여</b></td>
                                </c:if>
                                <c:if test="${pet.petSex eq 'woman'}">
                                <td id="data"><input type="radio" name="sex" value="man"><b>남</b>&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="woman" checked><b>여</b></td>
                                </c:if>
                                <td></td>
                                <td id="label"><label for="raibies">광견병 접종</label></td>
                                <c:if test="${pet.rabiesVaccinate eq 'Y'}">
                                <td id="data"><input type="radio" value="Y" checked><b>YES</b>&nbsp;&nbsp;&nbsp;<input type="radio" value="N" ><b>NO</b></td>
                                </c:if>
                                <c:if test="${pet.rabiesVaccinate eq 'N' or pet.rabiesVaccinate == null}">
                                <td id="data"><input type="radio" value="Y"><b>YES</b>&nbsp;&nbsp;&nbsp;<input type="radio" value="N" checked><b>NO</b></td>
                                </c:if>
                            </tr>
                            <tr>
                            	<td id="label"><label for="etc"><small>기타 참고사항</small></label></td>
                                <td id="data" colspan="4"><input type="text" name="etc" id="etc" value="${pet.petEtc}" required></td>
                            </tr>
                        </table>
                    </c:forEach>
                    </c:when>
                </c:choose>
                    <br>
                    <hr>
                    <br><br><br>
        <h3>선택 내역</h3>
        <hr>
        <div>
            <table>
                <tr>
                    <td><h4 id="right">Room</h4></td>
                    <td><h3> <c:out value="${sessionScope.reservationInfo.room.roomName}"/> </h3></td>
                    <td id="right">$ <c:out value="${sessionScope.reservationInfo.room.roomPrice}"/>won</td>
                    <td><h4 id="right">Coupon</h4></td>
                    <td colspan="2" id="right">
                        <select name="coupon" id="couponSelect" >
                        <option value="none">사용하실 쿠폰을 선택하세요.</option>
                        <c:forEach var="coupon" items="${ requestScope.couponList }">
                        <option name="couponUsed" id="couponUsed" value="${coupon.couponNo}"> <c:out value="${coupon.coupon.couponName}"/> - <c:out value="${coupon.coupon.couponDiscountPrice}"/> </option>
                        </c:forEach>
                        </select>
                </td>
                </tr>
                <tr>
                    <td><h4 id="right">Sitter</h4></td>
                    <td><h3> <c:out value="${sessionScope.reservationInfo.petsitter.emp.empName}"/> 시터</h3></td>
                    <td id="right">$<c:out value="${sessionScope.reservationInfo.petsitter.ability.abilityMoney}"/></td>
                    <td><h4 id="right">Membership</h4></td>
                    <td colspan="2"><h4 id="right"><input type="number" name="pointUse" id="pointUse">  point</h4><br>
                    <small> ** <c:out value='${ sessionScope.logintMember.memberPoint }'/> point 사용 가능합니다.</small>
                       </td>
                </tr>
                <tr>
                    <td colspan="6"><hr></td>
                </tr>
                <tr>
                    <td colspan="3"><h4 id="right">Total</h4></td>
                    <td colspan="3">$ <div id="total"><c:out value="${sessionScope.reservationInfo.reservationPrice}"/></div> won</td>
                </tr>
            </table>
        </div>
        <hr>
        <br><br><br>
        <h3>개인정보 수집 · 이용 동의</h3>
        <hr>
        <br>
        <input type="checkbox" name="agree" id="agree" required><label for="agree">[필수] 개인정보 수집 · 이용에 동의합니다.</label>
        <br><br>
        <hr>
        <p><small>* 위 개인정보 수집 · 이용에 대한 동의를 거부할 수 있으나 동의 거부 시 객실 예약이 불가합니다.</small></p>
        <br><br>
        <h3>취소 규정</h3>
        <hr>
        <br>
        <input type="checkbox" name="agree" id="agree" required><label for="agree">[필수] 취소 및 노쇼(NO-SHOW) 규정에 동의합니다.</label>
        <br><br>
        <div id="text">
        <br>
        <p><small>* 체크인 7일 전 오후 6시 이전 : 위약금 없이 변경 및 취소 가능</small></p>
        <p><small>* 체크인 7일 전 오후 6시 이후 : 결제 금액의 50% 부과</small></p>
        <p><small>* 체크인 3일 전 오후 6시 이전 : 취소 및 NO-SHOW 환불 금액 없음</small></p>
        <br>
        </div>
        <br><br>
        <br><br>
        <div id="button">
            <button type="reset" onclick="location.href='${ pageContext.request.contextPath }/index.jsp'"><b>취소</b></button> &nbsp;&nbsp;&nbsp; <button id="paymentNext" onclick="requestPay()"><b>결제</b></button>
        </div>
        <br><br><br><br><br>
    </section>
</section>

<jsp:include page="../../common/footer-main.jsp"/>


<script>
    // $("#couponSelect").mouseleave(function(){
    //     let couponNo = $("#couponUsed").val();
    //     let totalPrice = $("#total").val();
    //     $.ajax({
    //         url: "${pageContext.servletContext.contextPath}/member/reservation",
    //         type: "POST",
    //         data: {couponNo:couponNo},
    //         success: function(data){
    //             var couponPrice = data;
    //             if(couponPrice >= totalPrice){
    //                 totalPricef = 0;
    //                 $("#total").html(totalPricef);
    //             } else{
    //                 var totalPricef = totalPrice - couponPrice;
    //                 $("#total").html(totalPricef);
    //             }
    //         },
    //         error: function(request, status){
    //             console.log(status);
    //         }
    //     });
    // });

    // $("#pointUse").keypress(function(){
    //     let point = $("#pointUse").val();
    //     let totalPrice2 = $("#total").val();
        
    //     if(point >= totalPrice2){
    //         totalPrice2 = 0;
    //         $("#pointUse").html(totalPrice2);
    //         $("#total").html(totalPrice2);
    //     } else{
    //         totalPrice2 = totalPrice2 - point
    //         $("#total").html(totalPrice2);
    //     }
    // });

    $("#paymentNext").click(function(){
			
			let memNo = '${sessionScope.loginMember.memberNo}';
			let memName = '${sessionScope.loginMember.memberName}';
			let phone = '${sessionScope.loginMember.memberPhone}';		          // 회원전화번호
			let totalPrice = '${sessionScope.reservationInfo.reservationPrice}'	 // 총가격
			let usePoint = Number($("#pointUse").val()); ;			             // 사용 포인트
            let couponPoint = Number(couponPrice);                               // 쿠폰 가격
			let actualTotlaPrice = '300';					         // 실제결제가격
			
			let today = new Date();
			let year = today.getFullYear();
			let month = today.getMonth() + 1;
			let date = today.getDate();
			let hours = today.getHours();
			let minutes = today.getMinutes();
			let seconds = today.getSeconds();
			let milliseconds = today.getMilliseconds();
			
			let payNo = year + month + date + hours + minutes + seconds + milliseconds;	// 결제번호
			let payDate = year + '/' + month + '/' + date;
			let payHour = hours + ':' + minutes;			// 시간
			//alert(memNo + phone + totalPrice + usePoint + actualTotalPrice + payNo + payHous);
			
			console.log('결제번호'+ payNo);
			console.log('회원번호: ' + memNo)
			
			if(totalPrice == usePoint) {
				console.log(totalPrice + usePoint);
				let payMentDTO = {
						payNo: payNo,
						memNo: memNo,
						paymentDate: payDate,
						payHour: payHour,
						paymentCouponPrice: couponPoint,
						paymentPointPrice: usePoint,
						totalPrice: actualTotlaPrice
						}
					console.log(payMentDTO);
					// 컨트롤러에 데이터를 전달하여 DB에 입력하는 로직
	                		// 결제내역을 사용자에게 보여주기 위해 필요함.
	               		$.ajax({
                            url : "${ pageContext.servletContext.contextPath }/reservation/payment",
                            type : "post",
                            data : payMentDTO,
                            success : function(result){
                                if(result > 0) {
                                    location.href = "${ pageContext.servletContext.contextPath }/reservation/complete";
                                } else {
                                    alert("결제에 실패하였습니다.");
                                    return false;
                                };
						},
						error : function(a,b,c){}
					});
					
			} else {
			
				var IMP = window.IMP; // 생략가능
				IMP.init('imp02624048');	//아임포트 관리자계정
				//결제 시스템을 실행시키는 함수
			  	IMP.request_pay({ // param
			  		pg: 'tosspay',
					pay_method: 'card',
					merchant_uid: "order_no_" + payNo,	// 상점에서 생성한 고유 주문번호
					name: '주문명: 수강권',
					amount: actualTotlaPrice,	//테스트 완료 후 가격정보 넣기
					buyer_email : 'petnolja@siot.do',
				    buyer_name : '구매자이름',
				    buyer_tel : '010-1234-5678',
				    buyer_addr : '서울특별시 강남구 삼성동',
				    buyer_postcode : '123-456',
					m_redirect_url : 'www.naver.com'
					}, function (rsp) {
						console.log(rsp);
						if (rsp.success) {
							var msg = '결제가 완료되었습니다.';
							msg += '\n고유ID : ' + rsp.imp_uid;
							msg += '\n거래번호 : ' + rsp.merchant_uid;
							msg += '\n결제 금액 : ' + rsp.paid_amount;
							msg += '\n카드 승인번호 : ' + rsp.apply_num + 'cd-103245';
							let payMentDTO = {
								payNo: payNo,
								memNo: memNo,
								payDate: payDate,
								payHour: payHour,
								payPrice: totalPrice,
								usePoint: usePoint,
								totalPrice: actualTotlaPrice
								}
							console.log(payMentDTO);
							// 컨트롤러에 데이터를 전달하여 DB에 입력하는 로직
			                		// 결제내역을 사용자에게 보여주기 위해 필요함.
			               			$.ajax({
								url : "${ pageContext.servletContext.contextPath }/reservation/payment",
								type : "get",
								data : payMentDTO,
								success : function(result){
									if(result > 0) {
										location.href = "${ pageContext.servletContext.contextPath }/reservation/complete";
									} else {
										alert("결제에 실패하였습니다.");
										return false;
									};
								},
								error : function(a,b,c){}
							});
						} else {
							var msg = '결제에 실패하였습니다.';
							msg += '에러내용 : ' + rsp.error_msg;
						};
					alert(msg);
				});
			};
		});

</script>
</body>
</html>