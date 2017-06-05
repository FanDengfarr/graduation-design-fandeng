<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title>健康饮食后台管理</title>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="apple-mobile-web-app-capable" content="yes" />    
    
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/bootstrap-responsive.min.css" rel="stylesheet" />   
    <link href="css/font-awesome.css" rel="stylesheet" />   
    <link href="css/adminia.css" rel="stylesheet" /> 
    <link href="css/adminia-responsive.css" rel="stylesheet" /> 
    <link href="css/pages/dashboard.css" rel="stylesheet" /> 
    

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
	
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

<body>
	

<div class="navbar navbar-fixed-top">
	
	<div class="navbar-inner">
		
		<div class="container">
			
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 				
			</a>
			
			<a class="brand" href="./">后台管理</a>
			
			
			
		</div> <!-- /container -->
		
	</div> <!-- /navbar-inner -->
	
</div> <!-- /navbar -->



<div id="content">
	
	<div class="container">
		
		<div class="row">
			
			<div class="span3">
				
				<div class="account-container">
				
				
					<div class="account-details">
					
						<span class="account-name">####</span>
						
						<span class="account-role">管理员</span>
						
						<span class="account-actions">
							<a href="javascript:;">特权</a> |
							
							<a href="javascript:;">编辑设置</a>
						</span>
					
					</div> <!-- /account-details -->
				
				</div> <!-- /account-container -->
				
				<hr />
				
				<ul id="main-nav" class="nav nav-tabs nav-stacked">
					
					<li class="active">
						<a href="admin/index.jsp">
							<i class="icon-home"></i>
							主页	
						</a>
					</li>
					
					<li>
						<a href="Checknewsall!showall">
							<i class="icon-pushpin"></i>
							所有文章
							<span class="label label-warning pull-right">5</span>
						</a>
					</li>
					
					<li>
						<a href="Checknewscheck!showcheck">
							<i class="icon-th-list"></i>
							已审核文章	
							<span class="label label-warning pull-right">5</span>
						</a>
					</li>
					
					<li>
						<a href="ChecknewsNotcheck!shownotcheck">
							<i class="icon-th-large"></i>
							待审核文章
							<span class="label label-warning pull-right">5</span>
						</a>
					</li>
					
					<li>
						<a href="admin/index.jsp">
							<i class="icon-signal"></i>
							###	
						</a>
					</li>
					
					<li>
						<a href="admin/index.jsp">
							<i class="icon-user"></i>
							账号							
						</a>
					</li>
					
					<li>
						<a href="admin/index.jsp">
							<i class="icon-lock"></i>
							登录	
						</a>
					</li>
					
				</ul>	
				
				<hr />
				
				<div class="sidebar-extra">
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.</p>
				</div> <!-- .sidebar-extra -->
				
				<br />
		
			</div> <!-- /span3 -->
  </body>
</html>
