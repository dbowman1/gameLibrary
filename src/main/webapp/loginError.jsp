<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 3/7/2019
  Time: 10:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>

<body>
<jsp:include page="navbar.jsp"/>
<div class="alert alert-danger" role="alert">
    Login failed... please try again.
    <br/><br/>
    <a href="/gameLibrary/">Home</a>
</div>
</body>
<jsp:include page="footer.jsp"/>
</html>
