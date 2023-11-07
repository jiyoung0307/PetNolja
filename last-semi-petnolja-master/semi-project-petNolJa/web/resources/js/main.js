$(document).ready(function(){ 

      // 메인 슬라이더
      $('.sliders').slick({
        autoplay: true,                 
        autoplaySpeed: 2000, 
        dots: true,
        infinite: true,
        pauseOnFocus:false,    
        pauseOnHover:false,
        speed: 1000,
        fade: true,
        cssEase: 'linear'
        
    });
  
   //슬라이더-ptop/play
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
	
	
	
	
    
    /* 메인페이지 서브메뉴 */
    $('.sub_list a').click(function(){

        $('.sub').slideUp();
     
    
    
        if($(this).hasClass('active') == false){       
            $(this).siblings('.sub').slideDown(500);
            $(this).addClass('active'); 
            $(this).parent('li').addClass('on');  
        } else  {
            $(this).siblings('.sub').slideUp(200);
            $(this).removeClass('active'); 
            $(this).parent('li').removeClass('on'); 
        }
    
        });
    



    /* 관리자 메인 메뉴 */
   $('.m01_b').click(function(){

    $('.sub_wrap').slideUp();
 


    if($(this).hasClass('active') == false){       
        $(this).siblings('.sub_wrap').slideDown(500);
        $(this).addClass('active'); 
        $(this).parent('li').addClass('on');  
    } else  {
        $(this).siblings('.sub_wrap').slideUp(200);
        $(this).removeClass('active'); 
        $(this).parent('li').removeClass('on'); 
    }

    });



    /*메뉴가 왼쪽에서 튀어나옴*/
      $('.gnb_all').click(function(){
        $('#sub_menu').animate({left:0},500,'swing');
        $('.cover').animate({left:0},50,'swing');
    });
    $('.closeBtn').click(function(){
        $('#sub_menu').animate({left:-350},500,'swing');
        $('.cover').animate({left:'-100%'},50,'swing');
    });




});
