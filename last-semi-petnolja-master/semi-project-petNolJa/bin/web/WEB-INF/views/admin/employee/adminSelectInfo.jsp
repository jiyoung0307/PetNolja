<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <style>
        body {
            background-color: rgb(243, 242, 242);
            color: black;
        }

        .wrap {
            width: 100%;
        }

        aside {
            float: left;
            width: 20%;
        }

        section>section {
            float: left;
            width: 60%;
            background-color: rgb(226, 226, 226);
        }

        aside {
            float: left;
            width: 20%;
        }

        .memberGrade {
         height: 50px;
         width: 10%;
         text-align: center;
         line-height: 50px;
         font-size: 20px;
      }

      .hello {
         height: 50px;
         width: 80%;
         position: relative;
         bottom: 50px;
         left: 11%;
         text-align: left;
         line-height: 25px;
         font-size: 15px;
         display: inline-block;
      }

      .box {
         width: 500px;
         height: 170px;
         background-color: rgb(184, 184, 184);
         position: relative;
         bottom: 25px;
         color: rgb(0, 0, 0);
         margin: 0 auto;
      }

      .circle {
         height: 100px;
         width: 100px;
         border-radius: 50%;
         background-color: rgb(255, 255, 255);
         font-size: 25px;
         line-height: 100px;
         position: relative;
         margin: auto;

      }

      .href{
         margin: auto;
      }
      .memberInfo tr{
         margin: auto;
         height: 30px; 
      }
      .memberInfo tr p{
       margin-left: 30px;
       }

      .title { margin: 0;}
       
      .title tr td{
         text-align: center;
         width: 160px;
        
      }
      button{
         width: 70px;
         height: 30px;
         border: 0;
      }
      #re{
         background-color: burlywood;
         color: white;
      }
      #home{
         background-color: gray;
         color: white;
      }
      .subList{
         list-style: none;
         display: inline-block;
         margin: auto;
         position: relative;
         right: 25px;
      }
      li{
         float: left;
      }
      .wrap{border: 1px solid red; overflow: hidden;}
      section {
        border: 1px solid black;
      }
      .wrap2{
         margin: 0 auto;
         overflow: hidden;
         border: 1px solid blue;

      }
      .wrap3{
         border: 1px solid lime;
         width: 60%;
         margin: 0 auto;
      }
      .subList{text-align: center;
         border: 1px solid black;
         font-size: 16px;

        overflow: hidden;
         padding: 0 10px;
      display: block;
      width: 400px;
 }
      .sublist >ul>li { padding:0 50px; margin: 0 30px;}
 
      tbody > tr > td {
         width: 100px;
         font-size: 12px;
   }
  
   .container{ margin: 0 40px; border: 1px solid blue;}
    
    .gift-wrapper { display: flex; align-items: center; justify-content: space-between; justify-content: 15px; }
       
    .gift-content1 {
        max-width: 324px;
        width: 100%;
        text-align: center;
        display: inline-block;
        vertical-align: middle;
        top: 13px;
        position: relative;
        margin-bottom: 8px;
        border: 1px solid blue;
      }
  
    
      .gift-content .ut
      { font-size: 14px;
        display:block;
    } 





    </style>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>











  <section class="wrap">
      <aside>　</aside>
      <section class="wrap2">
         <br>
         <div class="wrap3">
            <div>
               <div class="memberGrade">Vip</div>
               <div class="hello"><p> #{memberName}님 <br> 환영합니다.</p></div>
            </div>
            <div class="box">
               <br>
               <table class="title">
                  <tr>
                     <td>RESERVATION</td>
                     <td>COUPON</td>
                     <td>POINT</td>
                  </tr>
               </table>
               <table class="title">
                  <tr>
                     <td><div class="circle circle1">1</div></td>
                     <td><div class="circle circle2">2</div></td>
                     <td><div class="circle circle3">3</div></td>
                  </tr>
               </table>
               
               
               
               <br>
            </div>
            <br>

            <div class="container">
               <div class="gift-wrapper">
                 <div class="gift-content">
                   <p class="ut"> 회원정보</p>
                 </div>
                 
                 <div class="gift-content2">
                  <p class="ut"> 회원정보 수정</p>
                 </div>
                
                 <div class="gift-content3">
                  <p class="ut"> 회원정보 탈퇴</p>
                 </div>
                 
               </div>
           </div>
            
            
            
            
            <ul class="subList">
               <li><p>회원정보&nbsp;&nbsp;&nbsp;&nbsp;</p></li> 
               <li><p>회원 정보 수정&nbsp;&nbsp;&nbsp;&nbsp;</p></li>
               <li><p>회원 정보 탈퇴</p></li>
               
            </ul>
            <br>
            <hr width="500px">
            
            <table class="memberInfo">
               <tr>
                  <td><p>아이디</p></td>
                  <td><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p></td>
                  <td><p></p></td>
               </tr>
               <tr>
                  <td><p>이름</p></td>
                  <td><p></p></td>
                  <td><p></p></td>
               </tr>
               <tr>
                  <td><p>휴대폰 번호</p></td>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td><p>이메일</p></td>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td><p>생년월일</p></td>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td><p>현재 마일리지</p></td>
                  <td></td>
                  <td><p></p></td>
               </tr>
               <tr>
                  <td><p></p></td>
                  <td></td>
                  <td><p></p></td>
               </tr>
            </table>
         </div>
         <br><br><br>
         <table class="href">
            <tr>
               <td><button type="home()" id="home">취소</button></td>
               <!-- 
            <script>
               let home = Document.getElememtById("home");
               function home(){
                  location.href="#";
               }
            </script>
             -->
               <td><button type="re()" id="re">완료</button></td>
               <!-- 
             <script>
                let home = Document.getElememtById("home");
                function home(){
                   location.href="#";
                }
             </script>
              -->
            </tr>
         </table>
         <br><br>
      </section>
      <aside>　</aside>

    </section>
<br><br><br><br>

<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>