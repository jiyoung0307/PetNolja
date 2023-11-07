<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>petnolja</title>
<style>
         h2{padding-top:10px;}
        .wrap{width: 100%;}
        #script{color: rgb(101, 101, 101); font-size: 18px;}
        #order{color:rgb(181, 181, 181); font-size: 12px;}
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
        #DoCtype, #neuter, #sex, #raibies{width: 10px; height: 10px;}
        .main{font-size: 20px;}
    </style>

</head>
<body>

	<!-- jQuery --> 
    <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script> 
	<!-- iamport.payment.js --> 
    <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
    
     <jsp:include page="../../common/header-main.jsp"/>

    <div >
        <aside></aside>
        <div class="innerwrap">
            <section class="wrap" style="border: 1 solid black;">
                <h2>Booking</h2><br>
                <p id="script">
                    Petnolja만의 특별한 <b>petsitter</b>와 편안함을 느낄 수 있는 <br>
                    <b>객실</b>에서 잊을 수 없는 여행의 경험을 애완동물에게 선사합니다.
                </p><br>
                <p id="order">① 날짜 선택 &nbsp;- ② 객실/펫시터 선택&nbsp; - <b class="date">③ 기본 정보 입력 및 결제&nbsp;</b> - ④ 예약 완료&nbsp;</p><br>
                <hr>
                <p id="ness">필수 입력</p>
                <hr id="hr"><br>
                <div class="top" align="center">
                    <form name="reservationForm">
                    <table>
                        <tr>
                            <td>
                                <input type="radio" name="DoCtype" id="DoCtype" value="DOG"><label for="DoCtype">강아지</label>
                            </td>
                            <td>
                                <input type="radio" name="DoCtype" id="DoCtype" value="CAT"><label for="DoCtype">고양이</label>
                            </td>
                        </tr>
                    </table>
                    <c:choose>
                        <c:when test="${empty requestScope.petList}">
                            <table>
                                <tr>
                                    <td id="label"><label for="name">이름</label></td>
                                    <td id="data"><input type="text" name="name" id="name" placeholder="반려동물의 이름을 입력해주세요." required></td>
                                    <td></td>
                                    <td id="label"><label for="sociability">사회성</label></td>
                                    <td id="data"><input type="text" name="sociability" id="sociability" placeholder="반려동물의 성격을 간략하게 작성해주세요." required></td>
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
                                    <td id="data"><input type="radio"  name="neuter" id="neuter" value="Y" checked><b>YES</b></button>&nbsp;&nbsp;&nbsp;<input type="radio"  name="neuter" id="neuter" value="N" ><b>NO</b></button></td>
                                </tr>
                                <tr>
                                    <td id="label"><label for="birth">나이</label></td>
                                    <td id="data"><input type="number" name="age" id="age" placeholder="반려동물의 나이를 작성해주세요." required></td>
                                    <td></td>
                                    <td id="label"><label for="vaccination">정기 접종</label></td>
                                    <td id="data"><input type="number" name="vaccination" id="vaccination" placeholder="정기접종 차수를 숫자로 입력해주세요." required><small> 차</small></td>
                                </tr>
                                <tr>
                                    <td id="label"><label for="sex">성별</label></td>
                                    <td id="data"><input type="radio" name="sex" id="sex" value="man" checked><b>남</b></button>&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" id="sex" value="woman"><b>여</b></button></td>
                                    <td></td>
                                    <td id="label"><label for="raibies">광견병 접종</label></td>
                                    <td id="data"><input type="radio" name="raibies" id="raibies" value="Y"><b>YES</b></button>&nbsp;&nbsp;<input type="radio" name="raibies" id="raibies" value="N" checked><b>NO</b></button></td>
                                </tr>
                                <tr>
                                    <td id="label"><label for="etc"><small>기타 참고사항</small></label></td>
                                    <td id="data" colspan="4"><input type="text" name="etc" id="etc" value="${pet.petEtc}" required></td>
                                </tr>
                            </table>
                        </c:when>
                        <c:when test="${not empty requestScope.petList}">
                            
                        <table>
                            <tr>
                                <td id="label"><label for="name">이름</label></td>
                                <td id="data"><input type="text" name="name" id="name" value="${requestScope.petList.petName}" required></td>
                                <td id="label"></td>
                                <td id="label"><label for="sociability">사회성</label></td>
                                <td id="data"><input type="text" name="sociability" id="sociability" value="${requestScope.petList.petCharacter}" required></td>
                            </tr>
                            <tr>
                                <td id="label"><label for="type">품종</label></td>
                                <td id="data"><input type="text" name="type" id="type" value="${requestScope.petList.petType}" required></td>
                                <td></td>
                                <td id="label"><label for="health">건강상태</label></td>
                                <td id="data"><input type="text" name="health" id="health" value="${requestScope.petList.petHealth}" required></td>
                            </tr>
                            <tr>
                                <td id="label"><label for="weight">몸무게</label></td>
                                <td id="data"><input type="number" name="weight" id="weight" value="${requestScope.petList.petWeight}" required></td>
                                <td></td>
                                <td id="label"><label>중성화 여부</label></td>
                                <c:if test="${requestScope.petList.rabiesVaccinate eq 'Y'}">
                                <td id="data"><input type="radio" name="neuter" id="neuter" value="Y" checked><b>YES</b>&nbsp;&nbsp;&nbsp;<input type="radio"  name="neuter" id="neuter" value="N" ><b>NO</b></td>
                                </c:if>
                                <c:if test="${requestScope.petList.rabiesVaccinate eq 'N' or pet.rabiesVaccinate == null}">
                                <td id="data"><input type="radio"  name="neuter" id="neuter" value="Y"><b>YES</b>&nbsp;&nbsp;&nbsp;<input type="radio"  name="neuter" id="neuter" value="N" checked><b>NO</b></td>
                                </c:if>
                            </tr>
                            <tr>
                                <td id="label"><label for="birth">나이</label></td>
                                <td id="data"><input type="number" name="age" id="age" value="${requestScope.petList.petAge}" required></td>
                                <td></td>
                                <td id="label"><label for="vaccination">정기 접종</label></td>
                                <td id="data"><input type="number" name="vaccination" id="vaccination" value="${requestScope.petList.perioVaccinate}" required><small> 차</small></td>
                            </tr>
                            <tr>
                                <td id="label"><label for="sex">성별</label></td>
                                <c:if test="${pet.petSex eq 'man' or pet.petSex == null}">
                                <td id="data"><input type="radio" name="sex" id="sex" value="man" checked><b>남</b>&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" id="sex" value="woman"><b>여</b></td>
                                </c:if>
                                <c:if test="${pet.petSex eq 'woman'}">
                                <td id="data"><input type="radio" name="sex" id="sex" value="man"><b>남</b>&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" id="sex" value="woman" checked><b>여</b></td>
                                </c:if>
                                <td></td>
                                <td id="label"><label for="raibies">광견병 접종</label></td>
                                <c:if test="${pet.rabiesVaccinate eq 'Y'}">
                                <td id="data"><input type="radio" name="raibies" id="raibies" value="Y" checked><b>YES</b>&nbsp;&nbsp;&nbsp;<input type="radio" name="raibies" id="raibies" value="N" ><b>NO</b></td>
                                </c:if>
                                <c:if test="${pet.rabiesVaccinate eq 'N' or pet.rabiesVaccinate == null}">
                                <td id="data"><input type="radio" name="raibies" id="raibies" value="Y"><b>YES</b>&nbsp;&nbsp;&nbsp;<input type="radio" name="raibies" id="raibies" value="N" checked><b>NO</b></td>
                                </c:if>
                            </tr>
                            <tr>
                            	<td id="label"><label for="etc"><small>기타 참고사항</small></label></td>
                                <td id="data" colspan="4"><input type="text" name="etc" id="etc" value="${pet.petEtc}"></td>
                            </tr>
                        </table>
                   
                        </c:when>
                    </c:choose> <br> <hr> <br><br>
                </div>
                <div class="body">
                    <p class="main">예약 내역</p>
                    <hr>
                    <table>
                        <tr>
                            <td><h4 id="right">Room</h4></td>
                            <td><h3 id="paymentname"><c:out value="${sessionScope.reservationInfo.room.roomName}"/></h3></td>
                            <td><h4 id="right">$ <c:out value="${sessionScope.reservationInfo.room.roomPrice}"/>won</h4></td>
                            <td><h4 id="right">Coupon</h4></td>
                            <td colspan="2">
                                <select name="coupon" id="coupon">
                                    <option value="0">사용하실 쿠폰을 선택하세요.</option>
                                    <c:forEach var="coupon" items="${ requestScope.couponList }">
                                        <option id="couponUse" value="${coupon.couponNo}"><div id="couponPrice"><c:out value="${coupon.coupon.couponName}"/> <c:out value="${coupon.coupon.couponDiscountPrice}"/></div>won</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td><h4 id="right">Sitter</h4></td>
                            <td><h3><c:out value="${sessionScope.reservationInfo.petsitter.emp.empName}"/> 시터</h3></td>
                            <td><h4 id="right">$ <c:out value="${sessionScope.reservationInfo.petsitter.ability.abilityMoney}"/> won</h4></td>
                            <td><h4 id="right">Membership</h4></td>
                            <td colspan="2"><h4 id="right"><input type="number" name="pointPrice" id="pointPrice"> point</h4>
                            <br> <small id="right">** 보유 포인트 : <c:out value="${sessionScope.loginMember.memberPoint}"/> point</small>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="6"><hr></td>
                        </tr>
                        <tr>
                            <td colspan="2" style="text-align: right;"><h4>total</h4></td>
                            <td><h4 id="right"><div id="price"><c:out value="${sessionScope.reservationInfo.reservationPrice}"/></div> </h4></td>
                            <td align="left"> <h4>won</h4></td>
                        </tr>
                        <tr>
                            <td colspan="6"><hr></td>
                        </tr>
                    </table>
                </form>
                </div>
                <div class="bottom">
                    <p class="main">개인정보 수집 · 이용 동의</p><hr><br>
                    <input type="checkbox" name="agree" id="agree" required><label for="agree">[필수] 개인정보 수집 · 이용에 동의합니다.</label>
                    <br><br><hr>
                    <p><small>* 위 개인정보 수집 · 이용에 대한 동의를 거부할 수 있으나 동의 거부 시 객실 예약이 불가합니다.</small></p>
                    <br><br>
                    <p class="main">취소 규정</p>
                    <hr><br>
                    <input type="checkbox" name="agree" id="agree" required><label for="agree">[필수] 취소 및 노쇼(NO-SHOW) 규정에 동의합니다.</label>
                    <br><br>
                    <div id="text">
                    <br>
                    <p><small>* 체크인 7일 전 오후 6시 이전 : 위약금 없이 변경 및 취소 가능</small></p>
                    <p><small>* 체크인 7일 전 오후 6시 이후 : 결제 금액의 50% 부과</small></p>
                    <p><small>* 체크인 3일 전 오후 6시 이전 : 취소 및 NO-SHOW 환불 금액 없음</small></p>
                    <br>
                    </div>
                </div><br><br><br>
            <div id="button">
                <button type="reset" onclick="location.href='${ pageContext.request.contextPath }/index.jsp'"><b>취소</b></button> &nbsp;&nbsp;&nbsp; <button type="button" id="kakaopayment">카카오페이</button>
            </div>
            </section>
        </div>
    </div>
    

	<script>
        var buyer_email = "${sessionScope.loginMember.memberEmail}";
        var buyer_name = "${sessionScope.loginMember.memberName}";
        var buyer_tel = "${sessionScope.loginMember.memberPhone}";
        var today = new Date();
        var year = today.getFullYear();
        var month = today.getMonth() + 1;
        var date = today.getDate();
        var hours = today.getHours();
        var minutes = today.getMinutes();
        var seconds = today.getSeconds();
        var milliseconds = today.getMilliseconds();
        let payNo = year + month + date + hours + minutes + seconds + milliseconds;	// 결제번호
        var paymentName = "${sessionScope.reservationInfo.room.roomName}";
        var couponPrice = Number($("#couponPrice").text());
        var pointUse = Number($("#pointPrice").text());
        var price = Number($("#price").text());
        var amount = price - couponPrice - pointUse;

        $(document).ready(function(){
            $("#kakaopayment").click(function(){
                DoCtype = $("#DoCtype").val();
                name = $("#name").val();
                sociability = $("#sociability").val();
                type = $("#type").val();
                health = $("#health").val();
                weight = $("#weight").val();
                neuter = $("#neuter").val();
                age = $("#age").val();
                vaccination = $("#vaccination").val();
                sex = $("#sex").val();
                raibies = $("#raibies").val();
                etc = $("#etc").val();
                couponUsed = $("#coupon").val();
                
                console.log(couponUsed);
                console.log(pointUse);

                var reservationPet ={
                    DoCtype:DoCtype,
                    name:name,
                    sociability:sociability,
                    type:type,
                    health:health,
                    weight:weight,
                    neuter:neuter,
                    age:age,
                    vaccination:vaccination,
                    sex:sex,
                    raibies:raibies,
                    etc:etc
                };
                console.table(reservationPet);
                if(amount < 1){
                    $.ajax({
                        url: "${pageContext.servletContext.contextPath}/reservation/payment",
                        type: "post",
                        data: {
                            DoCtype:DoCtype,
                            name:name,
                            sociability:sociability,
                            type:type,
                            health:health,
                            weight:weight,
                            neuter:neuter,
                            age:age,
                            vaccination:vaccination,
                            sex:sex,
                            raibies:raibies,
                            etc:etc,
                            couponUsed:couponUsed,
                            pointUse:pointUse
                        },
                        success: function(data){
                            location.href="${pageContext.servletContext.contextPath}/reservation/complete";
                        },
                        error: function(request, status, error){
                            alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
                        }
                    });
                } else{
                    payment();
                }
            });
        });

        function payment(data){
            IMP.init('imp02624048');
            IMP.request_pay({
                pg: "kakaopay.TC0ONETIME", //pg사명 or pg사명.CID (잘못 입력할 경우, 기본 PG사가 띄워짐)
                pay_method: "card", //지불 방법
                merchant_uid: payNo, //가맹점 주문번호 (아임포트를 사용하는 가맹점에서 중복되지 않은 임의의 문자열을 입력)
                name: paymentName, //결제창에 노출될 상품명
                amount: amount, //금액
                buyer_email : buyer_email, 
                buyer_name : buyer_name,
                buyer_tel : buyer_tel
            }, function(rsp){
                if(rsp.success){
                	console.log('결제성공');
                    $.ajax({
                        url: "${pageContext.servletContext.contextPath}/reservation/payment",
                        type: "post",
                         data: {
                            DoCtype:DoCtype,
                            name:name,
                            sociability:sociability,
                            type:type,
                            health:health,
                            weight:weight,
                            neuter:neuter,
                            age:age,
                            vaccination:vaccination,
                            sex:sex,
                            raibies:raibies,
                            etc:etc,
                            couponUsed:couponUsed,
                            pointUse:pointUse
                        }, 
                        success: function(data){
                            location.href='${pageContext.servletContext.contextPath}/reservation/complete';
                        },
                        error: function(request, status, error){
                            alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
                        }
                    });
                } else{
                	alert("실패 : 코드("+rsp.error_code+") / 메세지(" + rsp.error_msg + ")");
                }
            });
        }
     </script>
      <jsp:include page="../../common/footer-main.jsp"/> 
</body>
</html>