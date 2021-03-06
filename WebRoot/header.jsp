<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>健康饮食分享平台jiankangmeishishare</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FREEHTML5" />
	<meta name="keywords" conten                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           t="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700,300' rel='stylesheet' type='text/css'>
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">
	<!-- Superfish -->
	<link rel="stylesheet" href="css/superfish.css">

	<link rel="stylesheet" href="css/style.css">


	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	
	</head>
	<body>
		
		<div id="fh5co-header">
			<header id="fh5co-header-section">
				<div class="container">
					<div class="nav-header">
						<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
						<h1 id="fh5co-logo"><a href="index.jsp">健康饮食&nbsp;<span>分享</span>一下</a></h1>
						<!-- START #fh5co-menu-wrap -->
						<nav id="fh5co-menu-wrap" role="navigation">
							<ul class="sf-menu" id="fh5co-primary-menu">
							<li><%@ include file="search.jsp" %></a></li>
								<li class="active">
									<a href="index.jsp">主页</a>
								</li>
								<li>
									<a href="#" class="fh5co-sub-ddown">精华</a>
									<ul class="fh5co-sub-menu">
										<li><a href="ListNews!list" >全部文章</a></li>
										<li><a href="HotNews!list">最热文章</a></li>
										<li><a href="ListVideo!list">视频列表</a></li>
									</ul>
								</li>
								<li>
									<a href="#" class="fh5co-sub-ddown">分类</a>
									 <ul class="fh5co-sub-menu">									 	
										<li><a href="Findhealth!findhealth">健身</a></li>
										<li><a href="Findrest!findrest">养生</a></li>
										<li><a href="Finddiet!finddiet">饮食</a></li>
									</ul>
								</li>
								<li><a href="about.jsp">关于</a>
								 <ul class="fh5co-sub-menu">
									 	<li><img src="images/jiankangmeishishare.jpg" alt="微信订阅号二维码" /></li>
									 	<li><center><small>订阅号:jiankangmeishishare</small></center></li>
									</ul>
								</li>
								<li><a href="blog.jsp">更新日志</a></li>
								<s:if test="#session.username==''||#session.username==null">
								<li><a href="user_login.jsp">登录</a></li>
								</s:if>
								<s:else>
								<li><a href="User1!show">${session.username }</a>
								 <ul class="fh5co-sub-menu">
									 	<li><a href="User1!show">个人主页</a></li>				
									 	<li><a href="Login!logout">注销</a></li>					
								</ul>
								
								</li>
								<!-- <li><a href="Login!logout">注销</a></li> -->
								</s:else>
							</ul>
							
						</nav>
					</div>
				</div>
			</header>
			
		</div>
		

		
		<!-- end:header-top -->
		
		<!-- fh5co-work-section -->
		
	



	<!-- END fh5co-wrapper -->

	<!-- jQuery -->


	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Stellar -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Superfish -->
	<script src="js/hoverIntent.js"></script>
	<script src="js/superfish.js"></script>

	<!-- Main JS (Do not remove) -->
	<script src="js/main.js"></script>
	</body>
</html>


