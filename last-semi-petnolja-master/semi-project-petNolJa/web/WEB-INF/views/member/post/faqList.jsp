<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<meta charset="UTF-8">
<title>FAQ 조회</title>

<style>
   .body-section{height:700px; padding-left: 50px; }

   #search-wrap {
    width: 900px;
    height: 500px;
    background-color: #ebe8e8;
    -moz-border-radius: 20px;
    -webkit-border-radius: 20px;
    padding-left: 40px;
    margin: 0 auto;
   }

   #search-table {  padding-top: 3%; }
   .title{margin:0 auto; width:900px; padding-top:80px;}
   #searchList{
       width: 350px;
       height: 25px;
       border: none;
       text-align: center;
   }
   .faq-List {}
   .faq_table {width:100%;margin:0 auto;} 
   .faq_table tr {height:30px;border-bottom:1px solid #73645d;
    margin: 0 auto; }
   #search {
       width: 300px;
       height: 25px;
       border: none;
   }
   #submit{ background-color: #73645d; 
        margin: 0 auto; 
        width:150px;
        height:30px;
        border:none;
        color:#fff;
        font-size:16px;
        cursor:pointer;
        font-family:'Nanumsquare'      }
        td{
        border-bottom: 1px black solid;}
   </style>
</head>
<body>
<jsp:include page="../../common/header-main.jsp"/>

<div class="body-section">
    <div class="title" align="left">
       <h2>FAQ</h2>
        <br>
        <hr>
    </div>  
    <br>
    
    <div id="search-wrap">
        
        
        <c:forEach var="faqSelect" items="${ requestScope.faqList }">
           <div class="faq-List"> <br>
              <table class="faq_table">
                 <tr>
                  <td style="width: 50px;" class="faqList">
                     글번호
                  </td>
                  <td class="faqList">
                     ${ faqSelect.adminpostNo }
                  </td>
                     <td style="width: 50px;" class="faqList">
                        제목 :
                     </td>
                     <td style="overflow: hidden;" class="faqList">
                        <c:out value="${ faqSelect.adminpostTitle }"/>
                     </td>
                     <td style="width: 50px;" class="faqList">
                        내용 : 
                     </td>
                     <td style="overflow: hidden;" class="faqList">
                        <c:out value="${ faqSelect.adminpostContents }"/>
                     </td>
                     <td style="width: 50px;" class="faqList">
                        작성일 : 
                     </td>
                     <td style="overflow: hidden;" class="faqList">
                        <c:out value="${ faqSelect.adminpostDate }"/>
                     </td>
                  </tr>
              </table>
           </div>
           
        </c:forEach>
        
    </div>
</div>



  <script>
 
    	
    	
        if(document.getElementsByClassName("faqList")) {

            const faqList = document.getElementsByClassName("faqList");

            for(let i = 0; i < faqList.length; i++){
            	faqList[i].onmouseenter = function(){
                    this.parentNode.style.backgroundColor = "white";
                    this.parentNode.style.cursor = "pointer";
                }
            	faqList[i].onmouseout = function(){
                    this.parentNode.style.backgroundColor = "#ebe8e8";
                }

            	faqList[i].onclick = function(){
                    location.href="${pageContext.servletContext.contextPath}/faqDetail?faqNo="
                    		+this.parentNode.children[1].innerText
                }
            }
        }
    	
    	
    </script>  




<jsp:include page="../../common/footer-main.jsp"/>
</body>
</html>