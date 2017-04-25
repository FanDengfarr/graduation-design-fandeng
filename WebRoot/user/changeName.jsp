<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String name = request.getParameter("name");//用request得到 
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
    <div class="container">  
        <div class="page-header ex-page-header">  
           <h1 class="title">${username }<small>的个人主页</small></h1>
        </div>  
        <div class="body-container">  
            <div class="row">  
                    <div class="col-md-2">  
                        <div class="panel panel-default">  
                            <div class="panel-heading">  
                                <span class="glyphicon glyphicon-th-large" aria-hidden="true"></span>  
                            </div>  
                            <!-- 导航栏 -->                             
                           <div class="list-group">  
                      <ul class="nav nav-pills nav-stacked" role="tablist">
                      <li class="dropdown">
                               <a href="user/user_index.jsp" class="glyphicon glyphicon-user" >
                               	我的主页 
                               </a>
                           
                           </li>
                            <li class="dropdown">
                               <a href="#" class="glyphicon glyphicon-th-list" data-toggle="dropdown">
                                                              文章管理 <b class="caret"></b>
                               </a>
                               <ul class="dropdown-menu">
                               <li><a href="user/addArticle.jsp">发布文章</a></li>
                               <li><a href="user/myArticleList.jsp">文章列表</a></li>
                               </ul>
                           </li>
                       <li class="dropdown">
                               <a href="#" class="glyphicon glyphicon-lock" data-toggle="dropdown">
                                                             账号管理 <b class="caret"></b>
                               </a>
                               <ul class="dropdown-menu">
                               <li><a href="user/myInfo.jsp">个人信息</a></li>
                               <li><a href="user/changePass.jsp">密码重置</a></li>
                               <li><a href="user/changeName.jsp">修改昵称</a></li>
                               </ul>
                      </li> 
                       <li class="dropdown">
                               <a href="index.jsp" class="glyphicon glyphicon-home" >
                                                              返回主页 
                               </a>
                           
                           </li>                        
   			         </ul>
                                </div>  
                        </div>  
                    </div>  
  <!-- 展示内容块 -->
                    <div class="col-md-10">  
                        <div class="panel panel-default">  
                            <div class="panel-heading">  
                                <h4>更换昵称</h4>  
                            </div>  
  
                            <div class="panel-body">  
                                <form method="post" action="User" class="form-horizontal">  
                                    <div class="form-group">  
                                        <label for="article-title" class="col-sm-2 control-label">原昵称</label>  
                                        <div class="col-sm-4">  
                                            <input type="text" class="form-control" id="article-title" value="${username }" name="username" readonly="readonly">  
                                        </div>  
                                    </div>  
  
                                    <div class="form-group">  
                                        <label for="article-author" class="col-sm-2 control-label">新昵称</label>  
                                        <div class="col-sm-4">  
                                            <input type="text" class="form-control" id="article-author" placeholder="请输入新昵称" name="name">  
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
  </body>
 
  <script src="js/jquery-1.7.2.min.js"></script>
   <script src="js/bootstrap.js"></script>
</html>
