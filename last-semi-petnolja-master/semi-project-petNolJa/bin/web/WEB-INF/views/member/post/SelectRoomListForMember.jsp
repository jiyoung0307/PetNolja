<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객실 게시물 목록 조회</title>
	<style>
    #roomPicture{
        width: 800px;
        height: 200px;
    }
	</style>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

<div class="wrap">
	<div class="innerwrap">
	     <section>
	         <h2>Room List</h2>
	         <%-- ${ selectRoomForMemberList} --%>
	         <p>Petnolja만의 특별함을 느낄 수 있는 <b>객실</b>에서 <br>잊을 수 없는 특별한 경험을 반려동물에게 선사합니다.</p>
	         <br><hr><br>
	     </section>
	     	 <c:forEach var="roomList" items="${ selectRoomForMemberList }">
	     	 
				     <div style="text-align: center;" id="imgBlock">
			        	 <img id="roomPicture" src="${ pageContext.servletContext.contextPath }${roomList.adminPictureList[0].adminPictureSaveRoute}"
			        	 onclick="location.href='${ pageContext.servletContext.contextPath }/selectRoomDetailForMember?roomPostNo=${ roomList.roomPostNo }'" alt="사진없음"> 
					     <br><br><br><br>
				     </div>
		     	 </c:forEach>
	     	         <script>
            if(document.getElementsByTagName("img")) {
    
                const picture = document.getElementsByTagName("img");
    
                for(let i = 0; i < picture.length; i++){
                    picture[i].onmouseenter = function(){
                        this.parentNode.style.cursor = "pointer";
                    }
                    picture[i].onmouseout = function(){
                        this.parentNode.style.backgroundColor = "default";
                    }
   
                }
            }
            </script>
		     <br>
	    </div>
	    
    </div>
 </div>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<jsp:include page="../../common/footer-main.jsp"/>


</body>
</html>