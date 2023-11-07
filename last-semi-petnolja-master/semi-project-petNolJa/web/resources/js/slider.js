$(document).ready(function(){ 



   //메인 슬라이더
   $('.sliders').slick({
        autoplay: true,         //자동 슬라이드
        autoplaySpeed: 4000,    //이미지 전환 속도(1초=1000)
        arrows:true,           //양옆 화살표(prev/next)
        dots:true,              //페이지버튼
        //fade:true,            //투명도로 전환
        //easing:'swing',
        initialSlide:2,         //처음 시작하는 이미지(0부터 순서를 센다)
        pauseOnFocus:false,     //마우스를 클릭하면 멈춤
        pauseOnHover:false,     //마우스를 울려놓으면 멈춤
        speed:500,               //애니메이션(이미지 전환상태 속도) 스피드
        //vertical:true,         //세로 슬라이드
        swipe:false                //직접 이미지를 눌러서 움직이게 하는 기능 
   });

   //슬라이더-stop/play
   $('.sliderBtn').click(function(){
        //$(this).toggleClass('on');   //stop,play이미지 전환(if사용 안할때)
        
        if( !($(this).hasClass('on')) ){
           $('.sliders').slick('slickPause');
           $(this).addClass('on');
        } else {
            $('.sliders').slick('slickPlay');
            $(this).removeClass('on');
        }
       
   });
   
});     