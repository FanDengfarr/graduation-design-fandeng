<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
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
	

			
			
			<%@ include file="header.jsp" %>
			<div class="span9">
				
				
				
				
				<div class="widget">
										
					<div class="widget-header">
						<i class="icon-signal"></i>
						<h3>图片内容</h3>
					</div> <!-- /widget-header -->
														
					<div class="widget-content">					
						<s:iterator value="listPhoto">
						<s:property value="pname"/>
			<p><img width="300px" height="200px "src="<s:property value="purl"/>"></p>
		
						</s:iterator>		
					</div> <!-- /widget-content -->
					
				</div> <!-- /widget -->
				
				
				
				
				
				
				
				
			</div> <!-- /span9 -->
			
			
		</div> <!-- /row -->
		
	</div> <!-- /container -->
	
</div> <!-- /content -->
					
	



    

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="../js/jquery-1.7.2.min.js"></script>
<script src="../js/excanvas.min.js"></script>
<script src="../js/jquery.flot.js"></script>
<script src="../js/jquery.flot.pie.js"></script>
<script src="../js/jquery.flot.orderBars.js"></script>
<script src="../js/jquery.flot.resize.js"></script>


<script src="../js/bootstrap.js"></script>
<script src="../js/charts/bar.js"></script>

  </body>
</html>
