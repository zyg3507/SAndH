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
		*{margin:0;padding: 0;}
		.userinfo{text-align: right;float: right;height: 60px;line-height: 60px;font-size: 20px; }
		.logo{
			float:left;
		}
		.head-right{position:absolute; top:0; right:0;}
		.time{
			width:300px;
			height:30px;
			line-height:30px;	
		}
		.welcome{width:300px; height:30px; line-height:30px;}
		.welcome a:hover{color:red;}
	</style>
  </head>
  
  <body>
  		 <div class="logo"><img src="images/Logo-last.png" /></div>
  		 <div class="head-right">
  		 	 <div class="welcome">
			 	<strong>欢迎您： ${sessionScope.loginUserName} &nbsp;&nbsp;&nbsp;&nbsp;
			 	<a href="<%=path %>/user/Admin_logout.action">安全退出</a></strong>
			 </div>
			 <div class="time">
			     <span id=localtime></span>
			     <script type="text/javascript">
			     function showLocale(objD)
			         {
			            var str,colorhead,colorfoot;
			            var yy = objD.getYear();
			            if(yy<1900) yy = yy+1900;
			            var MM = objD.getMonth()+1;
			            if(MM<10) MM = '0' + MM;
			            var dd = objD.getDate();
			            if(dd<10) dd = '0' + dd;
			            var hh = objD.getHours();
			            if(hh<10) hh = '0' + hh;
			            var mm = objD.getMinutes();
			            if(mm<10) mm = '0' + mm;
			            var ss = objD.getSeconds();
			            if(ss<10) ss = '0' + ss;
			            var ww = objD.getDay();
			            if  ( ww==0 )  colorhead="<font color=\"#373737\">";
			            if  ( ww > 0 && ww < 6 )  colorhead="<font color=\"#373737\">";
			            if  ( ww==6 )  colorhead="<font color=\"#008000\">";
			            if  (ww==0)  ww="星期日";
			            if  (ww==1)  ww="星期一";
			            if  (ww==2)  ww="星期二";
			            if  (ww==3)  ww="星期三";
			            if  (ww==4)  ww="星期四";
			            if  (ww==5)  ww="星期五";
			            if  (ww==6)  ww="星期六";
			            colorfoot="</font>"
			            str = colorhead + yy + "-" + MM + "-" + dd + " " + hh + ":" + mm + ":" + ss + "  " + ww +                        colorfoot;
			                return(str);
			            }
			            function tick()
			                {
			                    var today;
			                    today = new Date();
			                    document.getElementById("localtime").innerHTML = showLocale(today);
			                    window.setTimeout("tick()", 1000);
			                }
			                tick();
			            </script>
			 </div>
			
		 </div>
  </body>
</html>
