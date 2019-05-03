<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 3/7/2019
  Time: 10:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>


<body>
<jsp:include page="navbar.jsp"/>

<h4 class="text-center">Admin</h4>
<br/>
<div class="text-center">
    <a href="viewUsers"><button type="button" class="btn btn-default">All Users</button></a>
</div>

<jsp:include page="footer.jsp"/>
</body>
</html>
