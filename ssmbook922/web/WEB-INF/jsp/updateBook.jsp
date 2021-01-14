<%--
  Created by IntelliJ IDEA.
  User: QZZ
  Date: 2021/1/13
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class=""row clearfix">
    <div class="col-md-12 colunm">
        <div class="page-header">
            <h1>
                <small>修改信息</small>
            </h1>
        </div>
    </div>
</div>

<form action="${pageContext.request.contextPath}/book/updateBook" method="post">
    <%--前端传递隐藏域--%>
    <input type="hidden" name="bookID" value="${book.bookID}"/>
    <div class="form-group">
        <label >书籍名称</label>
        <input type="text"  name="bookName" class="form-control" value="${book.bookName}"> <!--value 自带查询-->

    </div>
    <div class="form-group">
        <label >书籍数量</label>
        <input type="text" name="bookCounts" class="form-control"  value="${book.bookCounts}">

    </div>
    <div class="form-group">
        <label >书籍描述</label>
        <input type="text" name="detail" class="form-control" value="${book.detail}">

    </div>
    <div style="text-align: center" class="form-group">

        <input class="btn btn-primary" type="submit" class="form-control" value="修改">

    </div>
</form>
</div>

</body>
</html>

