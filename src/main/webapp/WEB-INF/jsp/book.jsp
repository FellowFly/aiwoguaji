<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/20
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--<%@ taglib prefix="bls" uri="http://www.critc.com/jsp/jstl/tags"%>--%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <form>
        <
    </form>
</head>
<body>
<form action="BookController.do?act=Deletes" method="post">
    <table border="1" width="100%" class="tab">
        <tr>
            <th><input type="checkbox" id="chbAll"></th>
            <th>编号</th>
            <th>书名</th>
            <th>价格</th>
            <th>出版日期</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${bookList}" var="book" >
            <tr>
                <th><input type="checkbox" name="ids" value="${book.id}"></th>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.price}</td>
                <td>${book.price}</td>
                <%--<td><fmt:formatDate value="${book.publishDate}" pattern="yyyy年MM月dd日"/></td>--%>
                <td>
                    <a href="BookController.do?act=Delete&id=${book.id}" class="abtn">删除</a>
                    <a href="BookController.do?act=EditBook&id=${book.id}" class="abtn">编辑</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <p style="color: red"></p>
    <p>
        <a href="BookController.do?act=AddBook" class="abtn">添加</a>
        <input type="submit"  value="删除选择项" class="btn"/>
    </p>
</form>
</body>
<script src="<c:url value="/js/jq/jquery-3.3.1.min.js"/>"></script>
<script>
    $(function () {
        console.info("12")
    })
</script>
</html>
