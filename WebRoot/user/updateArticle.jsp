<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
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
                    <div class="col-md-10">  
                        <div class="panel panel-default">  
                            <div class="panel-heading">  
                                <h4>修改文章</h4>  
                            </div>  
   <s:iterator value="listNews">
                            <div class="panel-body">  
                                <form method="post" action="Newsupdate!update?nid=<s:property value="%{nid}" />" class="form-horizontal">  
                                    <div class="form-group">  
                                        <label for="article-title" class="col-sm-2 control-label">标题</label>  
                                        <div class="col-sm-10">  
                                            <input type="text" class="form-control" id="article-title" name="news.title"value="<s:property value="title" />">  
                                        </div>  
                                    </div>  

  
                                    <div class="form-group">  
                                        <label for="article-content" class="col-sm-2 control-label">内容</label>  
                                        <div class="col-sm-10">  
                                            <textarea name="news.context" id="article-content" cols="30" rows="15" class="form-control" ><s:property value="context" /></textarea>  
                                        </div>  
                                    </div>  
  									<div class="form-group">  
                                        <label for="article-title" class="col-sm-2 control-label">分类</label>  
                                        <div class="col-sm-10">  
                                            <select name="news.sort" class="form-control">  
  												<option value ="健身">健身</option>  
  												<option value ="养生">养生</option>  
  												<option value="饮食">饮食</option>   
											</select>  
                                        </div>  
                                    </div>  
                                    <div class="form-group">  
                                        <div class="col-sm-offset-2 col-sm-10">  
                                            <button type="submit" class="btn btn-default">提交</button>  
                                        </div>  
                                    </div>  
                                </form>  
                            </div> 
                            </s:iterator> 
                        </div>  
                    </div>  
                </div>  
            </div>  
        </div>  
    </div>  
   
  </body>
 
  <script src="js/jquery-1.7.2.min.js"></script>
   <script src="js/bootstrap.js"></script>
</html>
