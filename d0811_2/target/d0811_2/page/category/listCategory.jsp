<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2022/8/11
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="../include/header.jsp"/>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    分类管理界面 <small>除了CRUD还有其他目录</small>
                </h1>
            </div>

            <table class="table table-bordered table-hover">
                <thead>
                <tr>
                    <th>
                        编号
                    </th>
                    <th>
                        分类名称
                    </th>
                    <th>
                        编辑
                    </th>
                    <th>
                        删除
                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${categories}" var="category" varStatus="st">
                    <tr>
                        <td>${category.id}</td>
                        <td ><a href="listProduct?id=${category.id}" >${category.name}</a></td>
                        <td><a href="editCategory?id=${category.id}">
                            <button type="button"  class="btn btn-default btn-primary">编辑</button>
                        </a></td>
                        <td><a href="deleteCategory?id=${category.id}">
                            <button type="button"  class="btn btn-default btn-danger">删除</button>
                        </a></td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
            <form role="form" action="addCategory">
                <div class="form-group">
                    <label for="name">分类名称</label>
                    <input type="text" class="form-control" id="name" name="name"/>
                </div>
                <button type="submit" class="btn btn-default">增加</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
