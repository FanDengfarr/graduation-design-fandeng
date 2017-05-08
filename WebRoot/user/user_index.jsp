<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML>
<html>
  <head>
   
    
    <title>个人主页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- bootstrap -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
  </head>
  <body>
<!-- 管理界面 --> 
 
  
    
      <%@ include file="header.jsp" %>
     
  <!-- 展示内容块 -->
  <s:iterator value="listUsers">
               <div class="col-md-10">  
                        <div class="panel panel-default">  
                            <div class="panel-heading">  
                                <h4>个人信息</h4>  
                            </div>  
     
                                    
                                       
                                            	
                                    
                                 
                            <div class="panel-body">  
                                <form  class="form-horizontal">  
                                    
                                     
                                    <div class="form-group">  
                                        <label for="article-title" class="col-sm-2 control-label">用户名</label>  
                                        <div class="col-sm-10">  
                                           
                                            <input type="text" class="form-control"  name="title" value="<s:property value="username" />"readonly>
                                           
                                        </div>  
                                    </div>  
  
                                    <div class="form-group">  
                                        <label for="article-author" class="col-sm-2 control-label">昵称</label>  
                                        <div class="col-sm-10">  
                                            <input type="text" class="form-control" id="article-author" value="<s:property value="name" />" name="author" readonly>  
                                        </div>  
                                    </div>  
  
                                    <div class="form-group">  
                                        <label for="article-des" class="col-sm-2 control-label">注册时间</label>  
                                        <div class="col-sm-10">  
                                             <input type="text" class="form-control" id="article-author" value="<s:property value="regtime" />" name="author" readonly> 
                                        </div>  
                                    </div>       
                                </form>  
                            </div>  
                        </div>  
                    </div> 
   </s:iterator>
		
                            
                               
                               
                    
            </div>  
        </div>  
 </div>
 </div>
  
  
  </body>
 
  <script src="js/jquery-1.7.2.min.js"></script>
   <script src="js/bootstrap.js"></script>
</html>
