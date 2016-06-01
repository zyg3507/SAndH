<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>教师列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- width:1090px;height:520px; -->
	<style type="text/css">
.right {
	border: 2px solid #1f53ea;
	width: 1090px;
	height: 520px;
	float: left;
	border-radius: 23px;
}

.right .r-main {
	border: 1px solid #000;
	width: 1020px;
	height: 470px;
	margin: 0 auto;
	margin-top: 20px;
}
.right .r-main .text{height:40px;line-height:30px;margin-bottom:0px;}

table tr td {
	text-align: center;
	border: 1px solid #ed9d9d;
	line-height: 30px;
	
}
table .title{background:#6381b4;color:#fff;font-weight:bold;}


</style>
<script type="text/javascript" src="js/hide.js"></script>	

  </head>
  
  <body>
	<jsp:include page="../user/adminMainhead.jsp"></jsp:include>
	<div class="body">
		<div class="main">
		    <jsp:include page="../user/adminMainleft.jsp"></jsp:include>		
			<div class="right">
			      <div class="r-main">
			        <div class="text">
			           <p>&nbsp &nbsp<strong>提示：</strong>点击学生列表中的<strong>姓名</strong>可以进行信息的修改,可按<strong>删除</strong>删除对应学生</p>
			           
			        </div>
					<table width="100%" style="border-collapse:collapse;">
					    <col width="15%">
						<col width="20%">
						<col width="10%">
						<col width="20%">
						<col width="20%">
						<col width="15%">
						<tr class="title">
							<td>学号</td>
							<td>姓名</td>
							<td>性别</td>
							<td>出生日期</td>
							<td>地址</td>
							<td>操作</td>
						</tr>
	
						<s:iterator value="#session.teacher_list" var="tea">
							<tr class="list">
								<td><s:property value="#tea.tid" /></td>
								<td><a href="<%=path%>/teacher/Teacher_modify.action?tid=<s:property value="#tea.tid"/>"><s:property value="#tea.tname"/></a></td>
								<td><s:property value="#tea.gender" /></td>
								<td><s:date name="#tea.birthday" format="YYYY年MM月dd日" /></td>
								<td><s:property value="#tea.address" /></td>
								<td><a
									href="<%=path %>/teacher/Teacher_delete.action?tid=<s:property value="#tea.tid"/>"
									onclick="javascript: return confirm('真的要删除吗？');">删除</a>
								</td>
							</tr>
						</s:iterator>
					</table>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../user/adminMainfoot.jsp"></jsp:include>
</body>
</html>
