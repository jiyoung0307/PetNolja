<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>

         body{background-color:rgb(243, 242, 242); font-family:'Nanumsquare', "맑은 고딕","돋움",sans-serif; color:#333; font-size:16px; box-sizing: border-box; width: 1500px;margin: auto; }
            .wrap{width: 100%;}
            aside{float: left; width: 20%;}
            section>section{float: left; width: 60%; background-color: black;}
            aside{float: left; width: 20%;}
            .hotelIntro{
        margin: 50px 5px;
        width: 100%;
        height: 150px;
        
    }
    .hotelIntro h2{
        margin-left: 80px;
        width: 300px;
        font-size : 60px;
    }
    .hotelIntro p{ 
        margin:  0 auto;
        font-size: 20px;
        width: 500px;
    }
    .hotelIntro2 {
        text-align: center;
    }
    .hotelIntro2 p{ 
        margin: 0 auto;
        font-size: 20px;
        width: 500px;
    }
    .hotelIntro img{
        margin: 10px 0px; 
        padding: 20px;
        width: 800px;
        height: 400px;
        border-bottom: 1px solid black;
    }

    .hotelIntro2 h2{
        text-align: center;
        margin-bottom: 20px;
        width: 100%;
        font-size : 40px;
    }
    .hotelIntro2 p1{ 
        margin: 0 auto;
        padding: 10px;
        font-size: 15px;
        width: 500px;
    }
    .hotelIntro2 p2{ 
        margin: 0 auto;
        padding: 10px;
        font-size: 15px;
        width: 500px;
    }
    .hotelIntro2 p3{ 
        margin: 0 auto;
        padding: 10px;
        font-size: 15px;
        width: 500px;
    }
    button {
            color: white;
            background-color: gray;
            border: 0ch;
            height: 30px;
            width: 110px;
    }
    </style>









<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../../common/header-adm.jsp"/>
	<!-- 여기에 조회할 db값 넣자. -->
	
	<section class="wrap">
        <aside>　</aside>
        <section>
            
        </section>
        <aside>　</aside>
        <div class="hotelIntro">
            <h2> ${ requestScope.companyPostdto.hotelPostTitle }</h2>
            <p>
            첫번째 내용: ${ requestScope.companyPostdto.hotelPostContentsFirst }
            </p><br>
        </div>
        <br>
        <div class = "hotelIntro2" >
        <p>
        두번째 내용: ${ requestScope.companyPostdto.hotelPostContentsTwo }
        </p><br>
        
        <tr>
			<td colspan="2" rowspan="2" width="400"><img src="resources/img/dog.jpg"/></td>
		</tr>
		
		<%-- <tr>
			<td colspan="2" rowspan="2" width="400"><img src="${ pageContext.servletContext.contextPath }${requestScope.companyPostdto.adminPictureSaveRoute}"/></td>
		</tr> --%>
		
        <h2>소제목 : ${ requestScope.companyPostdto.hotelPostLtitle }</h2>
        <p1>
     	3번째 내용: ${ requestScope.companyPostdto.hotelPostContentsThird }
        </p1>
        </div>
    </section>
	<table class="href" style="margin: auto;">
        <tr>

            
            <td><button onclick="modify()" id="modify">수정하기</button></td>
               
                <script>
                	function modify(){
                		if(confirm("수정하시겠습니까?")){
                			location.href="${pageContext.servletContext.contextPath}/UpdateCompanyPost";
		
                		}
                	}
                </script>
            </tr>
        </table>
	<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>