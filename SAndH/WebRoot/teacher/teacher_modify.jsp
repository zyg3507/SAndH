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
    
    <title>修改教师信息</title>
    
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
}
table tr td{line-height:35px;}

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
					<strong>修改教师资料</strong> <br> <br>
					<form name="modifyForm"
						action="<%=path%>/teacher/Teacher_save.action" method="post">
						<table width="400">
							<tr>
								<td width="30%">教工号：</td>
								<td><input type="text" name="tid"
									value='<s:property value="#session.modify_teacher.tid"/>'
									readonly="readonly" style="width:200px;height:27px;"/>
								</td>
							</tr>
							<tr>
								<td width="30%">姓名：</td>
								<td><input type="text" name="tname"
									value='<s:property value="#session.modify_teacher.tname"/>' placeholder="请输入小于10个字符的名字" style="width:200px;height:27px;"/>
								</td>
							</tr>
							<tr>
								<td>性别：</td>
								<td><s:if test='%{#session.modify_teacher.gender=="男"}'>
										<input type="radio" name="gender" value="男" checked="checked" />男&nbsp &nbsp &nbsp
         <input type="radio" name="gender" value="女" />女
      </s:if> <s:else>
										<input type="radio" name="gender" value="男" />男&nbsp &nbsp &nbsp
         <input type="radio" name="gender" value="女" checked="checked" />女
      </s:else></td>
							</tr>
							<tr>
								<td>出生日期：</td>
								<td><input name="birthday" type="text" id="control_date"
									size="20" maxlength="10" onclick="new Calendar().show(this);"
									readonly="readonly"
									value="<s:date name="#session.modify_teacher.birthday" format="yyyy-MM-dd"/>" style="width:200px;height:27px;"/>
								</td>
							</tr>
							<tr>
								<td>地址：</td>
								<td><input type="text" name="address"
									value='<s:property value="#session.modify_teacher.address"/>' placeholder="请输入您的地址" style="width:200px;height:27px;"/>
								</td>
							</tr>
							<tr>
								<td colspan="2" align="center"><input class="button"
									type="submit" value="修改" style="margin-top:20px; width:80px;">
								</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../user/adminMainfoot.jsp"></jsp:include>
  </body>
</html>
