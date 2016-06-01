<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>管理员登录</title>

<style type="text/css">
	body{
			background-image:url("images/login_bg.jpg");
			background-repeat: none;	
	}
	.login{
			width:250px;
			height:180px;
			border:1px solid gray;
			margin:100px auto;
			border-radius:6px;
			background-image:"images/login_bg.jpg"; 
	}
	.login1{
			width:250px;
			line-height:0px;
			margin-top:-1px;
			margin-left:-1px;
			border:1px solid gray;
			border-radius:6px 6px 0 0;
			
			}
	.login2{
			margin-top:15px;
	}
	.login3{
			margin-top:15px;
	}
</style>

</head>
<body>
	<div class="login" align="center">
		<div class="login1" ><h4>管理员登录</h4></div>
		<div class="login2">
			<form action="AdminLoginServlet" method="post">
				<div class="login3">账号：<input type="text" name="AdminId" /></div>
				<div class="login3">密码：<input type="password" name="AdminPwd" /></div>
				<div class="login3"></div><input type="submit" value="登录" /></div>
			</form>
		</div>
	</div>
</body>
</html>