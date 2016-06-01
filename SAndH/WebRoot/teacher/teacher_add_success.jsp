<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加教师成功页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.right {
	border: 2px solid #1f53ea;
	width: 1090px;
	height: 520px;
	float: left;
	border-radius:23px;	
   }

.right .r-main {
	border: 1px solid #000;
	width: 1020px;
	height: 460px;
	margin: 0 auto;
	margin-top: 30px;
	padding-left: 10px;
	padding-right: 10px;
	text-align: left;
	font-size: 16px;
}

.r-main h3 {
	text-align: center;
	padding-top: 20px;
}

.text {
	
	width: 380px;
	height: 50px;
	text-align: center;
	margin:0 auto;
	margin-top:30px;
}

.text a {
	
	width: 160px;
	height: 45px;
	text-align: center;
	display: inline-block;
	margin-top: 3px;
	font-size:16px;
	font-weight:800;
	color:#000;
	margin-right:15px;
	line-height:45px;
}

.text a:hover{color:#345;}
</style>

  </head>
  
  <body>
    <jsp:include page="../user/adminMainhead.jsp"></jsp:include>
	<div class="body">
		<div class="main">
		    <jsp:include page="../user/adminMainleft.jsp"></jsp:include>		
			<div class="right">
				<div class="r-main">
					<h3>添加成功！</h3>
				    <div class="text">
	                    <a href="teacher/teacher_add.jsp">继续添加</a>
	                    <a href="teacher/Teacher_query.action">查看所添加的教师</a>
	                </div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../user/adminMainfoot.jsp"></jsp:include>
  </body>
</html>
