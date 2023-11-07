<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>

         .bottomLine {
            border-bottom: black solid 1px;
            padding-bottom: 20px;
            margin-left: 40px;
            display: inline-block;
            width: 65%;
            
        }

        .table {
            display: inline-block;
            padding-bottom: 20px;
            margin-left: 40px;
        }

        p {
            margin: 0%;
        }
        #petsitterPic{
            border: black 1px solid;
            text-align: center; 
            display: inline-block; 
            width: 100px;
            height: 120px;
            line-height: 100px;
        }
        
        table tr:first-child{
            vertical-align: top;
        }
        .pic{
            border: solid 1px rgb(0, 0, 0);
             padding-left: 50px;
             padding-right: 50px;
            
        }
        .imageTable{
            text-align: center;
            margin-left: 49px;
        }
        .imageTable .pic{
            text-align: center;
            line-height: 150px;
            margin: auto;
        }
        #home {
            background-color: burlywood;
            color: white;
            margin-left: 50px;
        }

        #confirm {
            background-color: gray;
            color: white;
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
	<div class="locationIntro">
            <h2>${ requestScope.locationPostdto.locationPostTitle }</h2>
            <p>${ requestScope.locationPostdto.locationPostLtitle }
            </p><br>
        </div>
	<div id="map" style="width:60%; height: 50vh; margin:0 auto; ">
        <div class="location">
  <script async defer src="https://maps.googleapis.com/maps/api/js?key=
  AIzaSyCwZeYN4Zn-2eDpQdgYkQ8Fmxv-tGnixRg&callback=initMap&region=kr"></script>
  <script>
    function initMap() {
      var seoul = { lat: 37.5642135 ,lng: 127.0016985 };
      var map = new google.maps.Map(
        document.getElementById('map'), {
          zoom: 50,
          center: seoul
        });
      
    }
    var map;
        function initMap() {
            var cityHall = {lat: 37.571698, lng: 126.987209};

            var defaultOptions = {
                zoom: 17,
                center: cityHall,
                disableDefaultUI:true,
                zoomControl: true
                };
            map = new google.maps.Map(document.getElementById('map'), defaultOptions);

            var marker = new google.maps.Marker({position: cityHall, map: map});
        }
    </script>
    </div>
    </div>
	
	
	
	
  <div class ="locationIntro2">
        <p >구 주소: ${ requestScope.locationPostdto.locationOldPost }
        </p><br>
        <p>신 주소: ${ requestScope.locationPostdto.locationNewPost }
        </p><br>
        <p>연락처: ${ requestScope.locationPostdto.telePhoneNumber }
        </p><br>
        </div>
        <br><br>
       </section>
    <table class="href" style="margin: auto;">
        <tr>

            
            <td><button onclick="modify()" id="modify">수정하기</button></td>
               
                <script>
                	function modify(){
                		if(confirm("수정하시겠습니까?")){
                			location.href="${pageContext.servletContext.contextPath}/UpdateLocationPost";
		
                		}
                	}
                </script>
            </tr>
        </table>
        
    </div>
	
	
	
	


	
	
	

	
	
	
	
	
	
	
	
	
	
	<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>