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
	
	<section class="wrap">
	<table> 
	<form id="update" action="${pageContext.servletContext.contextPath}/UpdateLocationPost" method = "post">
            <div class = "NameText" >
                <tr>
                    <td style="vertical-align: top; ">소개글: </td>
                    <td><textarea name="locationPostLtitle" id="locationPostLtitle" cols="40" rows="1"
                            style="resize: none;"></textarea></td>
                	<!-- 수정할 값 넣는것. -->
                </tr>
            </div>
            <div class = "questionText" >
                <tr>
                    <td style="vertical-align: top;">구주소:</td>
                    <td><textarea name="locationPostOldPost" id="locationPostOldPost" cols="30" rows="1"
                        style="resize: none;">
                        </textarea>
                    </td>
                </tr>
                <tr>
                    <td style="vertical-align: top;">신주소:</td>
                    <td><textarea name="locationPostNewPost" id="locationPostNewPost" cols="30" rows="1"
                            style="resize: none;">
                       </textarea>
                    </td>
                </tr>
                <tr>
                    <td style="vertical-align: left;">연락처:</td>
                    <td><textarea name="locationPostTelephoneNumber" id="locationPostTelephoneNumber" cols="30" rows="1"
                             style="resize: none;">
                        </textarea>
                    </td>
                    </tr>
            </div>
            
            <br>
        </table>
        
        </section>
        <tr>
            <td><button onclick="back()" id="back">돌아가기</button></td>
            <button id="updateLocationIntro" class="btns" type="submit">수정</button>
          </form>
                <script>
                function back(){
        	    	if(confirm("돌아가시겠습니까?")){
        	    		location.href="${pageContext.servletContext.contextPath}/index.jsp";
        	    	}
        	      }
                  function confirmModal() {
                    window.confirm("정말 수정하시겠습니까?");
                  }
                </script>
      	 </tr>
   		 </table>
	<jsp:include page="../../common/footer-adm.jsp"/>
</body>
</html>