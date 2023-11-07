<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객실 게시물 상세 조회</title>

<style>
     table{width: 100%;}
     #button{position: absolute; width: 60%; text-align: center;}
     div>button{width: 120px; height: 30px; border: none; background-color: rgb(196, 196, 196); color: white;}
 </style>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

<div class="wrap">
    <div class="innerwrap">
        <h2>${ SelectRoomDetailDTO.roomPostTitle }</h2>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
	            	<c:out value="${ SelectRoomDetailDTO. adminPictureList[0].adminPictureSaveRoute }"/><br><br>
	            	<c:out value="${ SelectRoomDetailDTO. adminPictureList[1].adminPictureSaveRoute }"/>
        <br><br>
                ${ SelectRoomDetailDTO.roomPostContents }
        <br><br>    
	     	 <c:forEach var="roomList" items="${ SelectRoomDetailDTO.adminPictureList }">
		     	 <c:forEach var="AdminPictureDTO" items="${ roomList.adminThumbnailPictureSaveRoute }">
                 <img src="${ pageContext.servletContext.contextPath }/${ AdminPictureDTO }">
		     	 
				     <div style="text-align: center;" id="imgBlock">
					     <br><br><br><br>
				     </div>
		     	 </c:forEach>
	     	 </c:forEach>        <br>
        <br><br><br>
        <div id="button">
            <button onclick="location.href='${ pageContext.servletContext.contextPath }/selectRoomListForMember'" id="back"><b>뒤로가기</b></button>
        </div>
        <br><br><br>
    </div>
</div>
<br>
<br>
<br>
<br>
<br>
<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>