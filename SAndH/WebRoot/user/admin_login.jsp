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
    
    <title>管理员登录界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="stylesheet" type="text/css" href="css/admin_login.css">
    
  </head>
  
  <body>
	<div id="wrapper">
		<header> <!-- <div class="logo"></div> -->
		<div id="header">
			<div id="title">后台管理系统</div>
		</div>
		</header>
		<div class="content">
			<div class="main">
				<div class="mainPanel">
					<div class="left">
						<div id="img"></div>
					</div>
					<div class="right">
						<form name="loginForm" action="<%=path %>/user/Admin_login.action" method="post">
							<!-- start of login form -->
							<div id="welcome">
								<span id="welcome-text">管&nbsp;理&nbsp;登&nbsp;录</span>
							</div>
							<div id="user-name">
								<span class="item">用户名:</span> <span><input type="text"
									name="username" class="form-input"> </span>
							</div>
							<div id="user-password">
								<span class="item">密&nbsp;&nbsp;&nbsp;码:</span> <span
									class="input"><input type="password" name="password"
									class="form-input"> </span>
							</div>
							<div id="button-group">
								<input type="submit" class="btn" value="登录" /> <input
									type="reset" class="btn" value="重置" />
							</div>
							<div class="div1">
								<s:fielderror />
								<!-- 显示表单验证的出错信息 -->
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<footer>
		<div class="text">
			<p>Copyright © 2016 Design by JavaEE X-3507 </p>
			<p>地址：江西省南昌市紫阳大道99号江西师范大学瑶湖校区先骕楼X3507</p>
		</div>
		</footer>
	</div>
</body>
</html>
