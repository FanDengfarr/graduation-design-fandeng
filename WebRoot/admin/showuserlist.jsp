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
				
				
				
				<div class="widget widget-table">
										
					<div class="widget-header">
						<i class="icon-th-list"></i>
						<h3>审核通过文章</h3>
					</div> <!-- /widget-header -->
					
					<div class="widget-content">
					
						<table class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>id</th>
									<th>用户名</th>
									<th>昵称</th>
									<th>创建时间</th>
									<th>账号状态</th>
									<th>状态管理</th>
								</tr>
							</thead>
							<s:iterator value="listUsers">
							<tbody>
								<tr>
									<td><s:property value="id"/></td>
									<td><s:property value="username"/></td>
									<td><s:property value="name"/></td>
									<td><s:property value="regtime"/></td>
									<td><s:property value="state"/></td>
									<td class="action-td">
										<a href="Checkuseryes!checkyes?id=<s:property value="%{id}"/>" class="btn btn-small btn-warning">
											<i class="icon-ok"></i>								
										</a>					
										<a href="Checkuserno!checkno?id=<s:property value="%{id}"/>" class="btn btn-small">
											<i class="icon-remove"></i>						
										</a>
									</td>

								</tr>
								
							</tbody>
							</s:iterator >
						</table>
					
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
