<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mainleft.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery.js"></script>
	<!-- <link rel="stylesheet" type="text/css" href="css/leftMenu2.css">
	<script type="text/javascript" src="js/leftMenu.js"></script> -->
	
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

.main .left {
	border: 2px solid blue;
	width: 200px;
	height: 520px;
	float: left;
	border-radius:23px;
}

.l-box {
	margin-left: 30px;
	margin-top: 30px;
	border: 1px solid #fbf5f4;
	width: 130px;
	height: 450px;
	float: left;
	/* text-indent: 10px; */
	line-height: 30px;
	border-radius:23px;
}

.l-box .big .small1,.small2,.small3 {
	/* border: 1px solid red; */
	width: 100px;
	height: 100px;
	float: right;
	text-align: center;
}
.l-box .big .small1 a,.small2 a,.small3 a{
       color:#000;
       }
.l-box .big .small1 a:hover,.small2 a:hover,.small3 a:hover{
       color:#E3101E;
       }

.l-box .bs1:hover,.bs2:hover,.bs3:hover{}
strong{cursor:pointer;}

	</style>
<script type="text/javascript" src="js/jquery-2.1.4.js"></script>
	<script type="text/javascript" src="js/hide.js"></script>

  </head>
  <body>
 <!--  <div class="body">
         <div class="main"> -->
             <div class="left">
               <div class="l-box">
                <ul class="big">
                  <li class="bs1"><strong>■&nbsp管理学生</strong>
                     <ul class="small1">
                       <li><a href="student/Student_query.action">◆&nbsp学生列表</a></li>
                       <li><a href="student/student_add.jsp">◆&nbsp添加学生</a></li>
                       <li><a href="student/student_query.jsp">◆&nbsp查找学生</a></li>
                       <!-- <li><a href="">删除学生</a></li> -->
                     </ul>
                  </li>
                  <li class="bs2"><strong>■&nbsp管理教师</strong>
                     <ul class="small2">
                       <li><a href="teacher/Teacher_query.action">◆&nbsp教师列表</a></li>
                       <li><a href="teacher/teacher_add.jsp">◆&nbsp添加教师</a></li>
                       <li><a href="">◆&nbsp查找教师</a></li>
                     </ul>
                  </li>
                  <li class="bs3"><strong>■&nbsp管理博客</strong>
                     <ul class="small3">
                       <li>查询学生</li>
                       <li>添加学生</li>
                       <li>更新信息</li>
                     </ul>
                  </li>
                </ul>
               </div>
             </div>
             <!-- <div class="right">
                <h3>欢迎您进入后台管理系统，在这里您可以轻松愉快的完成您的工作······</h3>
             </div> -->
       <!--   </div>
      </div> -->
  </body>
</html>
