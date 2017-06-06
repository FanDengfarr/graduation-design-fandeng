<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<html>
  
<head>

<meta charset="UTF-8">
<style type="text/css">
<!--

fieldset.search {
    padding: 4px;
    border: none;
    width: 255px;
    background:#e0e0e0;
}
 
fieldset.search:hover {
    background: #a8a8a8;
}
.search input, .search button {
    border: none;
    float: left;
}
.search input.box {
    height: 28px;
    width: 200;
    margin-right: 0px;
    padding-right: 0px;
    background: #e0e0e0;
    margin: 1px;
}
.search input.box:focus {
    background: #e8e8e8 ;
    outline: none;
}
.search button.btn {
    border: none;
    width: 28px;
    height: 28px;
    margin: 0px auto;
    margin: 1px;
    background: url(http://sandbox.runjs.cn/uploads/rs/339/livk7pl5/search_blue.png) no-repeat top right;
}
.search button.btn:hover {
    background: url(http://sandbox.runjs.cn/uploads/rs/339/livk7pl5/search_black.png) no-repeat bottom right;
}
 
/* 文章样式 */
.article {
 
}
-->
</style>
</head>
<body>
<div>
<form method="post" id="searchform" action="Search!search">
    <fieldset class="search">
         <input type="text" class="box" name="title" id="s" class="inputText" placeholder="输入关键字" x-webkit-speech>
          <button class="btn" title="SEARCH"> </button>
    </fieldset>
</form>
</div>
<article class="article">
</article>
</body>
</html>


