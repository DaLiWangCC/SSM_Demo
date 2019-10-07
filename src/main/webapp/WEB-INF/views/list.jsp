<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rememberthelesson
  Date: 2019/10/2
  Time: 9:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookList</title>
</head>
<body>
书籍列表：
<table>
    <tr>
        <th>编号</th>
        <th>书名</th>
        <th>数量</th>

    </tr>
    <tbody>
    <c:forEach items="${book}" var="books">
        <tr>
            <td>${books.bookid}</td>
            <td>${books.name}</td>
            <td>${books.cnt}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
