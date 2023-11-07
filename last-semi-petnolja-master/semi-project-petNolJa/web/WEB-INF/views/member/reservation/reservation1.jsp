<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- ajax -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body{background-color:rgb(243, 242, 242); width: 1500px; margin: 0 auto;}
      
        .innerwrap{width: 900px; height: 500px; margin: 0 auto; padding-top: 80px;}
        p{margin-bottom: 10px; margin-top: 10px;}
        #order{color:rgb(181, 181, 181); font-size: 14px;}
        .date{color:rgb(152, 126, 88);}
        td>input{background: none; border: none; text-align: center;}
         .buttom{text-align: center; margin: 0 auto; padding-top:50px;}
        #roomSelect:hover,#petsitterSelect:hover{ background-color:transparent; 
               border:1px solid #73645d;
               color: #73645d;    
           }
        aside{float: left; width: 20%;}
        input[type="number"]::-webkit-inner-spin-button {
    -webkit-appearance: none;
    margin: 0;}
  
    </style>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>


        <div class="wrap">
        <div class="innerwrap">
            <h2>Booking</h2>
            <p>Petnolja만의 특별한 <b>petsitter</b>와 편안함을 느낄 수 있는 <br>
                <b>객실</b>에서 잊을 수 없는 여행의 경험을 애완동물에게 선사합니다.</p> 
            <p id="order"><b class="date">① 날짜 선택</b>- ② 객실/펫시터 선택 - ③ 기본 정보 입력 및 결제 - ④ 예약 완료</p>
            <br>
            <hr>
            <br>

            <form action="${pageContext.servletContext.contextPath}/reservation/room" method="get">
            <table width="100%">
                <tr>
                    <td width="50%">
                        <h4>CHECK IN/OUT</h4>
                        
                    </td>
                    <td id="right" width="50%">
                        <h4>PET</h4>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="date" name="checkIn" id="now_date" style="font-size: 18px; font-family: 'Nanumsquare';"> &nbsp;&nbsp;&nbsp;<input type="date" name="checkOut" id="next_date" style="font-size: 18px; font-family: 'Nanumsquare';">
                        <br>
                    </td>
                    <td>
                        <b><input type="button" value="-" style="font-size: 25px; border: none; cursor: pointer;" onclick='count("minus")'></b><div id="number" style="width: 195px; font-size: 18px; font-family: 'Nanumsquare';">1</div> <b ><input type="button" value="+" style="font-size: 25px; border: none; cursor: pointer;" onclick="count('plus')"></b>
                        <hr align="left" width="50%">
                    </td>
                </tr>
            </table>
            <br>
            <br>
            <br>
               
            <div class="button">
                <button type="reset"><b>취소</b></button> &nbsp;&nbsp;&nbsp; <button id="next"><b>다음</b></button>
            </div>
           </form>
        </div> 
    </div>

    <script>
        document.getElementById('now_date').valueAsDate = new Date();
        document.getElementById('next_date').valueAsDate = new Date();

        function count(type)  {
        // 결과를 표시할 element
        const resultElement = document.getElementById('number');
        
        // 현재 화면에 표시된 값
        let number = resultElement.innerText;
        
        // 더하기/빼기
        if(type === 'plus') {
            number = parseInt(number) + 1;
        }else if(type === 'minus')  {
            if(number > 2){
                number = parseInt(number) - 1;
            } else {
                number = 1;
            }
        }
        
        // 결과 출력
        resultElement.innerText = number;
        }

        $("#next").click(function(){
            const resultElement = document.getElementById('number');
            let number1 = resultElement.innerText;
            console.log(number1);
            $('#number').html("<input type='text' name='amount' style='border: none; background-color: none;' value="+number1+">");
        });
        
    </script>


<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>