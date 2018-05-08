<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  <script type="text/javascript" src="js/jquery-easyui-1.5.4.4/locale/easyui-lang-zh_CN.js" charset="utf-8"></script></head>
  <script type="text/javascript">
  
  </script>
  <script language="javascript">
  function getCurDate(){ 
	  var d = new Date(); 
	  var week; 
	  switch (d.getDay()){ 
	  case 1: week="星期一"; break; 
	  case 2: week="星期二"; break; 
	  case 3: week="星期三"; break; 
	  case 4: week="星期四"; break; 
	  case 5: week="星期五"; break; 
	  case 6: week="星期六"; break; 
	  default: week="星期天"; } 
	  var years = d.getFullYear(); 
	  var month = add_zero(d.getMonth()+1); 
	  var days = add_zero(d.getDate()); 
	  var hours = add_zero(d.getHours()); 
	  var minutes = add_zero(d.getMinutes());
	  var seconds=add_zero(d.getSeconds()); 
	  var ndate = years+"年"+month+"月"+days+"日 "+hours+":"+minutes+":"+seconds+" "+week; 
	  var divT=document.getElementById("divT"); divT.innerHTML= ndate;
	  }function add_zero(temp){
		  if(temp<10) 
			  return "0"+temp; else return temp;}setInterval("getCurDate()",100);
  </script>
  <body>
    <div class="easyui-layout" style="width:1300px;height:700px;">
    	<div region="west" split="true" title="导航栏" style="width:210px;">
    		<div style="width:200px;height:auto;background:#7190E0;padding:5px;">
		    	<div class="easyui-panel" title="时间信息" collapsible="true" style="width:200px;height:auto;padding:10px;">
		    		现在的时间是：<br/><br/>
		    		<font id="divT"></font>
		    	</div>
		    	<br/>
		    	<div class="easyui-panel" title="欢迎信息" collapsible="true" style="width:200px;height:auto;padding:10px;">
		    		欢迎您：${name}<br/><br/>
		    		您上次登录的时间是：<br/><br/>
		    	</div>
		    	<br/>
		    	<div class="easyui-panel" title="统计信息" collapsible="true" collapsed="true" style="width:200px;height:auto;padding:10px;">
		    		目前共有个投票主题<br/><br/>
		    		其中：<br/><br/>
		    		单选投票共有：<br/><br/>
		    		多选投票共有：<br/>
		    	</div>
		    	<br/>
		    	<div class="easyui-panel" title="Details" collapsible="true" style="width:200px;height:auto;padding:10px;">
		    		My documents<br/>
		    		File folder<br/><br/>
		    		Date modified: Oct.3rd 2010
		    	</div>
   			 </div>
    	</div>
    	<div id="content" region="center" title="内容" style="padding:5px;">
	    	<div class="easyui-tabs" fit="true">
	    			<div title="首页" style="padding:10px;">
	    					<div style="padding:5px;background:#fafafa;width:500px;border:1px solid #ccc">
								<a href="#" class="easyui-linkbutton" >创建投票</a>
								<a href="#" class="easyui-linkbutton" iconCls="icon-reload">查找投票</a>
								<a href="vote_find.action" class="easyui-linkbutton" iconCls="icon-search">管理投票</a>
								<a href="#" class="easyui-linkbutton">text button</a>
								<a href="admin_get.action?admin.name=${name}" class="easyui-linkbutton" iconCls="icon-print" target="content">修改密码</a>
							</div>
							<div>
								<table>
									<tr>
										<td>投票编号</td>
										<td>投票主题</td>
										<td>创建时间</td>
										<td>创建人</td>
										<td>投票状态</td>
										<td>投票类型</td>
										<td>编辑</td>
									</tr>
									<c:forEach items="votelist" var="v">
										<tr>
											<td></td>
										</tr>
									</c:forEach>
								</table>
							</div>
					</div>
					<div title="Contacts">
						No contact data.
					</div>
					<div title="Contacts">
						No contact data.
					</div>
					<div title="Contacts">
						No contact data.
					</div>
	    	</div>
    	</div>
    </div>
  </body>
</html>
