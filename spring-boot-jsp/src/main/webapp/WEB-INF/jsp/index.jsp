<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>新标题: ${title}</title>
</head>
<body style="background-image: none;">
<div class="body_wrap">
    <div class="container">
        <div class="alert alert-success text-center">
            <table class="table table-striped table-bordered">
                <tr>
                    <td>编号</td>
                    <td>名称</td>
                    <td>民族</td>
                </tr>
                <c:forEach var="person" items="${list}">
                    <tr class="text-info">
                        <td>${person.id}</td>
                        <td>${person.name}</td>
                        <td>${person.nation}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>

</body>
</html>