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
                                <h4>文章列表</h4>  
                            </div>  
    <div class="panel-body">  
    
                                <table class="table table-hover">  
                                    <tr>  
                                        <th>标题</th>  
                                        <th>发布时间</th>                                       
                                        <th>审核通过</th> 
                                        <th>文章操作</th>  
                                    </tr> 
                                    <s:iterator value="listNews"> 
                                    <tbody>  
                                       
                                                    <tr>
                                                        <td><s:property value="title" /></td>  
                                                        <td><s:property value="createtime" /></td>
                                                        <td><s:property value="vip " /></td> 
                                                        <td><a href="Newsdelete!delete?nid=<s:property value="%{nid}" />">删除</a>  
                                                             <a href="Newsshowone!showone?nid=<s:property value="%{nid}" />">修改</a>
                                                             <a href="Photoshow!show?nid=<s:property value="%{nid}" />">图片管理</a>  
                                                        </td>  
                                                    </tr>                                 
                                    </tbody>  
                                    </s:iterator> 
                                </table> 
                                
                            </div>  
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
