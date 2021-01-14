<%--
  Created by IntelliJ IDEA.
  User: QZZ
  Date: 2021/1/13
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class=""row clearfix">
    <div class="col-md-12 colunm">
        <div class="page-header">
            <h1>
                <small>新增书籍</small>
            </h1>
        </div>
    </div>
</div>

<!--点击添加按钮时会提交到controller的/book/addBook-->
<form action="${pageContext.request.contextPath}/book/addBook" method="post">
    <div class="form-group">
        <label >书籍名称</label>
        <input type="text"  name="bookName" class="form-control" required="required"> <!--required 表示表单必须写完才能提交-->

    </div>
    <div class="form-group">
        <label >书籍数量</label>
        <input type="text" name="bookCounts" class="form-control"  required="required">

    </div>
    <div class="form-group">
        <label >书籍描述</label>
        <input type="text" name="detail" class="form-control" required="required">

    </div>
    <div style="text-align: center" class="form-group">

        <input class="btn btn-primary" type="submit" class="form-control" value="添加">

    </div>

</form>

</body>
</html>

