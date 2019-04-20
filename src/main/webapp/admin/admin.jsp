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
<jsp:include page="../head.jsp"/>


<body>
<jsp:include page="../navbar.jsp"/>
<%--#TODO DELETE or edit this jsp LATER only for a test--%>
<h4>This is a admin only page.</h4>
<br/>
<a href="viewUsers">All Users</a>
</body>
<jsp:include page="../footer.jsp"/>
</html>
