<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-easyui-1.5.4.4/jquery.min.js" charset="utf-8"></script>
  <script type="text/javascript" src="js/jquery-easyui-1.5.4.4/jquery.easyui.min.js" charset="utf-8"></script>
  <link rel="stylesheet" href="js/jquery-easyui-1.5.4.4/themes/default/easyui.css" type="text/css" charset="utf-8"></link>
  <link rel="stylesheet" href="js/jquery-easyui-1.5.4.4/themes/icon.css" type="text/css" charset="utf-8"></link>
  <script type="text/javascript" src="js/jquery-easyui-1.5.4.4/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>
  <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
  <script type="text/javascript">
  	function qq(){
  		$.ajax({
  			url:"admin_findAdminByName.action",//提交地址
			type:"post",
			data:{"admin.name":$("#name").val()},
			dataType:"json",
			success:function(data){
				alert(date);
				if (date!=null) {
					$("#namespan").html("用户名可以使用！！");
				}else{
					$("#namespan").html("用户名重复，请重新命名！");
				}
			}
  		})
  	}
  </script>
  </head>
  
  <body>
    <div id="win" class="easyui-window" title="登录/注册" style="width:450px;height:280px;top:100px;">
    			<div class="easyui-tabs" fit="true">
					<div title="登录" style="padding:10px;">
						<form style="padding:10px 20px 10px 40px;" action="admin_login">
				    		<p>输入用户名： <input type="text" name="admin.name"></p>
				    		<p>密码: <input type="password" name="admin.password"></p>
				    		<div style="padding:5px;text-align:center;">
				    			<input type="submit" value="登录"/>
				    			<a href="register.jsp" class="easyui-linkbutton" icon="icon-cancel">Cancel</a>
				    		</div>
				    	</form>
					</div>
					<div title="注册">
						<form style="padding:10px 20px 10px 40px;" action="admin_register">
				    		<p>输入用户名： <input type="text" name="admin.name" id="name" onblur="qq()"><span id="namespan"></span></p>
				    		<p>密码: <input type="password" name="admin.password"></p>
				    		<p>再次输入密码: <input type="password" name="twopwd"></p>
				    		<div style="padding:5px;text-align:center;">
				    		<input type="submit" value="提交"/>
				    		</div>
				    	</form>
					</div>
				</div>
    	
    </div>
  </body>
</html>
