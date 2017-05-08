<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
                                <h4>发布文章</h4>  
                            </div>  
  
                            <div class="panel-body">  
                                <form method="post" action="article.add.handle.php" class="form-horizontal">  
                                    <div class="form-group">  
                                        <label for="article-title" class="col-sm-2 control-label">标题</label>  
                                        <div class="col-sm-10">  
                                            <input type="text" class="form-control" id="article-title" placeholder="Title" name="title">  
                                        </div>  
                                    </div>  
  
                                    <div class="form-group">  
                                        <label for="article-author" class="col-sm-2 control-label">作者</label>  
                                        <div class="col-sm-10">  
                                            <input type="text" class="form-control" id="article-author" placeholder="Author" name="author">  
                                        </div>  
                                    </div>  
  
                                    <div class="form-group">  
                                        <label for="article-des" class="col-sm-2 control-label">简介</label>  
                                        <div class="col-sm-10">  
                                            <textarea name="description" id="article-des" cols="30" rows="5" class="form-control"></textarea>  
                                        </div>  
                                    </div>  
  
                                    <div class="form-group">  
                                        <label for="article-content" class="col-sm-2 control-label">内容</label>  
                                        <div class="col-sm-10">  
                                            <textarea name="content" id="article-content" cols="30" rows="15" class="form-control"></textarea>  
                                        </div>  
                                    </div>  
  
                                    <div class="form-group">  
                                        <div class="col-sm-offset-2 col-sm-10">  
                                            <button type="submit" class="btn btn-default">提交</button>  
                                        </div>  
                                    </div>  
                                </form>  
                            </div>  
                        </div>  
                    </div>  
                </div>  
            </div>  
        </div>  
    </div>  
  
    <footer class="copyright">  
        Copyright &copyright; 1995-2016, DreamBoy.NET, All Rights Reserved  
    </footer>  
  </body>
 
  <script src="js/jquery-1.7.2.min.js"></script>
   <script src="js/bootstrap.js"></script>
</html>
