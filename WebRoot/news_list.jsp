<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Guardian &mdash; 100% Free Fully Responsive HTML5 Template by FREEHTML5.co</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FREEHTML5" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
	

  

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

  
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
		<div id="fh5co-wrapper">
		<div id="fh5co-page">
		<div id="fh5co-header">
			<header id="fh5co-header-section">
				<div class="container">
					<div class="nav-header">
						<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
						<h1 id="fh5co-logo"><a href="index.jsp">健康饮食&nbsp;<span>分享</span>一下</a></h1>
						<!-- START #fh5co-menu-wrap -->
						<nav id="fh5co-menu-wrap" role="navigation">
							<ul class="sf-menu" id="fh5co-primary-menu">
								<li class="active">
									<a href="index.jsp">主页</a>
								</li>
								<li>
									<a href="portfolio.jsp" class="fh5co-sub-ddown">精华</a>
									<ul class="fh5co-sub-menu">
										<li><a href="#/preview/?item=build-free-html5-bootstrap-template" target="_blank">排行榜</a></li>
										<li><a href="#/preview/?item=work-free-html5-template-bootstrap" target="_blank">今日最热</a></li>
									</ul>
								</li>
								<li>
									<a href="services.jsp" class="fh5co-sub-ddown">服务</a>
									 <ul class="fh5co-sub-menu">
									 	<li><a href="left-sidebar.html"></a>暂定</li>
					
									</ul>
								</li>
								<li><a href="about.jsp">关于</a></li>
								<li><a href="blog.jsp">更新日志</a></li>
								<li><a href="blog.jsp">${username}</a></li>
							</ul>
						</nav>
					</div>
				</div>
			</header>
			
		</div>
		

		<div class="fh5co-hero">
			<div class="fh5co-overlay"></div>
			<div class="fh5co-cover text-center" data-stellar-background-ratio="0.5" style="background-image: url(images/home-image.jpg);">
				<div class="desc animate-box">
					<h2>快来分享你的健康饮食小秘诀吧</h2>
					<span>此处可以是轮播图 <a href="http://www.runoob.com/bootstrap/bootstrap-carousel-plugin.html" target="_blank" class="fh5co-site-name">Bootstrap模板</a></span>
					<span><a class="btn btn-primary" href="#" >Get Started</a></span>
				</div>
			</div>
			
		</div>
        <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >企业网站模板</a></div>
		<!-- end:header-top -->
		<div id="fh5co-work-section">
		  <table border="0" width="100%">
		  <th>文章列表</th>
		  <th>创建时间</th>
		<s:iterator value="listNews">
		<tr><td align="left"><a href="ShowNews?nid=<s:property value="%{nid}"/>"><s:property value="title"/></td>
		   
			<td><s:property value="createtime"/></td>
		</tr> 
		</s:iterator>
		</table>
		<table align="center">
		<s:iterator value="pagebean">   		
        <tr>   
         <td colspan="6" align="center" > 
           
         共<s:property value="allRow"/>条记录        
         共<s:property value="totalPage"/>页        
         当前第<s:property value="currentPage"/>页<br>    
        
         <s:if test="%{currentPage == 1}">    
           第一页  上一页    
         </s:if>    
         <!-- currentPage为当前页 -->    
         <s:else>    
           <a href="ListNews?page=1">第一页</a>    
           <a href="ListNews?page=<s:property value="%{currentPage-1}"/>">上一页</a>    
         </s:else>    
        
         <s:if test="%{currentPage != totalPage}">    
         <a href="ListNews?page=<s:property value="%{currentPage+1}"/>">下一页</a>    
         <a href="ListNews?page=<s:property value="totalPage"/>">最后一页</a>    
         </s:if>    
        
         <s:else>    
         下一页  最后一页    
         </s:else>    
         </td>    
        </tr>    
</s:iterator>  
</table>  
		</div>
	
		<!-- fh5co-blog-section -->
		<footer>
			<div id="footer">
				<div class="container">
					<div class="row">
						<div class="col-md-6 col-md-offset-3 text-center">
							<p class="fh5co-social-icons">
								<a href="#"><i class="icon-twitter2"></i></a>
								<a href="#"><i class="icon-facebook2"></i></a>
								<a href="#"><i class="icon-instagram"></i></a>
								<a href="#"><i class="icon-dribbble2"></i></a>
								<a href="#"><i class="icon-youtube"></i></a>
							</p>
							<p>Copyright 2016 Free Html5 <a href="#">Guardian</a>. All Rights Reserved. <br>Made with <i class="icon-heart3"></i> by <a href="#/" target="_blank">Freehtml5</a> / More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
						</div>
					</div>
				</div>
			</div>
		</footer>
	

	</div>
	<!-- END fh5co-page -->

	</div>
	



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


