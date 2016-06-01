<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mainfoot.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		.foot{
		    
			width:80%;
			margin:0 auto;
			/* height:200px; */
			text-align:center;
		}
		/* .foot p{padding-top:20px;} */
	</style>
  </head>
  
  <body>
  	<div class="foot">
  		<p>地址：江西省南昌市紫阳大道99号江西师范大学瑶湖校区软件学院先骕楼 X-3507 工作室</p>
  	</div>
  </body>
</html>
