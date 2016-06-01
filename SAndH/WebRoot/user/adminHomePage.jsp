<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mainhead.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
* {
	matgin: 0px;
	padding: 0px;
	overflow: hidden;
}

a {
	text-decoration: none;
}

ul li {
	list-style: none;
}

.body {
	/* border: 1px solid red; */
	width: 98%;
	height: 530px;
	margin: 0 auto;
}

.main {
	/* border: 3px solid blue; */
	width: 98%;
	height: 530px;
}

.main .right {
	border: 2px solid #1f53ea;
	width: 1090px;
	height: 520px;
	float: left;
	background: url('images/welcome.jpg');
	background-repeat: no-repeat;
	border-radius:23px;
}

.main .right h3 {
	text-align: center;
	margin-top: 250px;
}



</style>
	<script type="text/javascript" src="js/jquery-2.1.4.js"></script>
	<script type="text/javascript" src="js/hide.js"></script>
	<!-- <script type="text/javascript" src="js/loginpage.js"></script> -->
   </head>
   
   <body>
      <jsp:include page="../user/adminMainhead.jsp"></jsp:include>
      <div class="body">
         <div class="main">
             <jsp:include page="../user/adminMainleft.jsp"></jsp:include>
             <div class="right">
                <h3>欢迎您进入后台管理系统，在这里您可以轻松愉快的完成您的工作······</h3>
             </div>
         </div>
      </div>
      <jsp:include page="../user/adminMainfoot.jsp"></jsp:include>
   </body>
   
  <!--  <script type="text/javascript">
      $(document).ready(function(){
      $(".bs1").click(function(){
      $(".small1").toggle();
      });
      
      $(".bs2").click(function(){
      $(".small2").toggle();
      });
      
      $(".bs3").click(function(){
      $(".small3").toggle();
      });
      
      });
   </script> -->
   
   <!-- <script type="text/javascript">
      $(document).ready(function(){
      $(".bs1").click(function(){
      $(".small1").slideToggle("fast");
      });
      
      $(".bs2").click(function(){
      $(".small2").slideToggle();
      });
      
      $(".bs3").click(function(){
      $(".small3").slideToggle();
      });
      
      });
    
   </script>
    -->
 </html> 
   
   
<!-- frameset 元素可定义一个框架集。它被用来组织多个窗口（框架）。每个框架存有独立的文档。 -->
<!-- 在其最简单的应用中，frameset 元素仅仅会规定在框架集中存在多少列或多少行。必须使用 cols 或 rows 属性	 -->
<!-- <frameset rows="10%,80%,*" border="1">

	<frame src="adminMainhead.jsp" noresize="no">
	
	<frameset cols="9%,*">
		<frame src="adminMainleft.jsp">
		<frame src="adminDescription.jsp" name="main">
	</frameset>

	<frame src="adminMainfoot.jsp" noresize="no">
</frameset> -->


