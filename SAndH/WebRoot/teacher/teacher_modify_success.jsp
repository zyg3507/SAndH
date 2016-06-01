<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>教师修改成功页面</title>
    
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
	padding-left:10px;
	padding-right:10px;
	text-align:left;
	font-size:16px;
	text-align:center;
}


</style>

<script type="text/javascript" src="js/Calendar3.js"></script>
<script type="text/javascript" src="js/hide.js"></script>

  </head>
  
  <body>
    <jsp:include page="../user/adminMainhead.jsp"></jsp:include>
	<div class="body">
		<div class="main">
		    <jsp:include page="../user/adminMainleft.jsp"></jsp:include>		
			<div class="right">
				<div class="r-main">
				    <strong class="strong">修改教师资料成功！</strong> <br> <br>
					<strong class="strong"><a href="teacher/Teacher_query.action">返回教师列表</a></strong>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../user/adminMainfoot.jsp"></jsp:include>
  </body>
</html>
