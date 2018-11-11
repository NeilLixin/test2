<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/28
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <h3>黑马幼儿园开班!!!!!</h3>

        <c:forEach items="${list}" var="account">
            ${account.name}
        </c:forEach>

</body>
</html>
