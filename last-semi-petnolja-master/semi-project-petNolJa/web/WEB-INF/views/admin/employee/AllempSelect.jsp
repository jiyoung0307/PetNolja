<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.wrap1 { display:block; left:40%; position:abolute;}
.body-section {border:1px solid red; width:600px; margin:0 auto; height:200px;}
</style>
</head>
<body>
<jsp:include page="../../common/header-adm.jsp"/>
<div class="body-section">
        <section class="wrap1">
            <aside>　</aside>
            <section>
                <div class="inquiry" align="center">
                    <h2>전체 직원 조회</h2>
                    <table class="inquiry">
                        <tr align="center">
                            <td rowspan="2" width="800px" height="100px" style="background-color: lightgray";>
                                <label>검색: </label>
                                <select name="select" id="select">
                                    <option value="id">아이디</option>
                                    <option value="name">이름</option>
                                </select>
                                <label>검색어: </label>
                                <input type="search" id="search" name="search" placeholder="검색어를 입력하세요.">
                                <button id="send">search</button> &nbsp;
                            </td>
                        </tr>
                    </table>
                    <br><br>
                    <table id="userList" class="userList" border="1">

                    </table>
                <br><br><hr><br><br>
                <div id="button"><button><b>메인으로</b></button></div>
               
            </section>         
        </section>
        <b class="text-deco"></b>
    </div>

     <script>
     
     $(document).ready(function() { 
		let button = $("#send").click();
     });
/* 		$(document).ready(function(){
			$("#select").click();			
	    	var userList = '${ allEmployeeList }'
	        var startTr = 	  '<tr>' +
	                      '<th>아이디</th>'+
	                      '<th>주민번호 </th>'+
	                      '<th>이름 </th>'+
	                      '<th>핸드펀번호 </th>'+
	                      '<th>이메일 </th>'+
	                      '<th>가입일 </th>'+
	               	  	  '</tr>';
	               	  	  
	        var startTd = function(){     
	        	<c:forEach var="list" items="${ allEmployeeList }">
				      		 '<tr>'+
				              '<th>${ list.empId }</th>'+
				              '<th>${ list.no }</th>'+
				              '<th>${ list.empName }</th>'+
				              '<th>${ list.empPhone }</th>'+
				              '<th>${ list.empEmail }</th>'+
				              '<th>${ list.hireDate }</th>'+
				   	  	  '</tr>'
				</c:forEach>;}
	                 	  
	        
	        $("#userList").append(startTr).append(startTd);	// 테이블에 추가 
		}); */
			
			
    	$("#send").click(function(){
    	const select = $("#select").val();
    	const search = $("#search").val();
    	
    	$.ajax({
    		url:"${pageContext.servletContext.contextPath}/allEmployeeSelectSearchCriteria",
    		type:"get",
    		data:{select : select,
    			  search : search
    		},
    		success: function(data){
    			
    				$("#userList").empty();
    	    	var userList = data;
    	        var tr = 	  '<tr>' +
    	                      '<th>아이디</th>'+
    	                      '<th>주민번호 </th>'+
    	                      '<th>이름 </th>'+
    	                      '<th>핸드펀번호 </th>'+
    	                      '<th>이메일 </th>'+
    	                      '<th>가입일 </th>'+
    	               	  	  '</tr>';
    	                 	  
    	     	$.each(userList , function(i){
    	          tr += '<tr><td class="user">' +  userList[i].empId + '</td><td class="user">' + userList[i].no + '</td><td class="user">' + userList[i].empName + '</td><td class="user">' + userList[i].empPhone + '</td><td class="user">' + userList[i].empEmail + '</td><td class="user">' + userList[i].hireDate + '</td></tr>';
    	        });
    	        
    	        $("#userList").append(tr);	// 테이블에 추가
    	        
    	        
    	        
        if(document.getElementsByClassName("user")) {

            const user = document.getElementsByClassName("user");

            for(let i = 0; i < user.length; i++){
            	user[i].onmouseenter = function(){
                    this.parentNode.style.backgroundColor = "rgb(50,150,250)";
                    this.parentNode.style.cursor = "pointer";
                }
            	user[i].onmouseout = function(){
                    this.parentNode.style.backgroundColor = "white";
                }

            	user[i].onclick = function(){
                    location.href="${pageContext.servletContext.contextPath}/allEmployeeDetail?empNo="
                    		+this.parentNode.children[0].innerText
                }
            }
        }
    		}
    		
    		,
    		error: function(){
    			alert("error");	
    		}
    			
    		});
    	});
 
    	

    	
    	
    	
    	
    	
    	
    	
    	
    	
    </script> 
    
    
    
	
	
	<jsp:include page="../../common/footer-adm.jsp"/>	
</body>
</html>