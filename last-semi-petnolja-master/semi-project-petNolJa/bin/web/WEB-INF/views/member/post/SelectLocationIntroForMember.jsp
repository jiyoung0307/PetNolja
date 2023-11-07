<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Petnolja</title>
    <style>
        body{background-color:rgb(243, 242, 242); font-family:'Nanumsquare', "맑은 고딕","돋움",sans-serif; color:#333; font-size:12px; box-sizing: border-box; width: 1500px;margin: auto; }
        .wrap{width: 100%;}
        aside{float: left; width: 20%;}
        section>section{float: left; width: 60%; background-color: black;}
        aside{float: left; width: 20%;}
        /* contents */
    .locationIntro{
        margin: 40px 5px;
        width: 100%;
        height: 150px;
        border-bottom: 1px solid black;
        
    }
    .locationIntro h2{
        margin-left: 80px;
        width: 300px;
        font-size : 60px;
        font-family: 'Numans', sans-serif;
    }
    .locationIntro p{ 
        margin:  0px 50px;
        float: right;
        font-size: 20px;
        width: 500px;
        font-family: 'Numans', sans-serif;
        
    }
    .locationIntro2 {
        text-align: center;
        padding-top : 50px;
    }
    .locationIntro2 p{ 
        margin: 0 auto;
        font-size: 20px;
        width: 500px;
    }
    .locationIntro2 img{
        margin: 10px 0px; 
        padding: 20px;
        width: 800px;
        height: 400px;
        border-bottom: 1px solid black;
    }

    .locationIntro2 h2{
        text-align: center;
        margin-bottom: 20px;
        width: 100%;
        font-size : 40px;
    }
    .locationIntro2 p1{ 
        margin: 0 auto;
        padding: 10px;
        font-size: 15px;
        width: 500px;
    }
    .locationIntro2 p2{ 
        margin: 0 auto;
        padding: 10px;
        font-size: 15px;
        width: 500px;
    }
    .locationIntro2 p3{ 
        margin: 0 auto;
        padding: 10px;
        font-size: 15px;
        width: 500px;
    }
    </style>

</head>
<body>
    <jsp:include page="../../common/header-main.jsp"/>
    <section class="wrap">
        <div class="locationIntro">
            <h2>${ requestScope.locationdto.locationPostTitle }</h2>
            <p>${ requestScope.locationdto.locationPostLtitle }
            </p><br>
        </div>
        <br>	
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
        <p >구 주소: ${ requestScope.locationdto.locationOldPost }
        </p><br>
        <p>구 주소: ${ requestScope.locationdto.locationNewPost }
        </p><br>
        <p>연락처: ${ requestScope.locationdto.telePhoneNumber }
        </p><br>
        </div>
    </section>
    <jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>
