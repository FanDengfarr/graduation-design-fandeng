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
                        <s:iterator value="listNews">  
                            <div class="panel-heading">  
                                <h4><s:property value="title" />的图片管理</h4>  
                            </div>  
                            </s:iterator>
    <div class="panel-body">  
   							<form action="Photoupload!upload?nid=<s:property value="%{nid}" />" enctype="multipart/form-data" method="post" > 
   										<table>
   										<tr>
   										<td><input type="file" name="file1">  </td>
                                        <td><input type="submit" value="确定上传"/></td>
                                        </tr>
                                        </table>
                                        </form> 
                                <table class="table table-hover"> 
                                  
                                    <tr>  
                                        <th>图片名</th>  
                                        <th>路径</th>                                        
                                        <th>图片操作</th> 
                                       
                                    </tr> 
                                    <s:iterator value="listphoto"> 
                                    <tbody>  
                                       
                                                    <tr>
                                                        <td><s:property value="pname" /></td>  
                                                        <td><s:property value="purl" /></td>                                       
                                                        <td><a href="Newsdelete!delete?nid=<s:property value="%{nid}" />">删除</a>  
                                                             <a href="Newsshowone!showone?nid=<s:property value="%{nid}" />">修改</a>  
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
