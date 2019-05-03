<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 3/26/2019
  Time: 11:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>
<body>
<jsp:include page="navbar.jsp"/>
<c:choose>
    <c:when test="${errorMsg == null}">
        <%
            response.sendRedirect("/gameLibrary");
        %>
    </c:when>
    <c:otherwise>
        <div class="alert alert-danger" role="alert">
            Login Failed -- ${errorMsg}<br/>
            <a href="signInConfirmation.jsp"><button type="button" class="btn btn-primary">Sign in</button></a>
            <a href="userSignUp.jsp"><button type="button" class="btn btn-primary">Sign Up</button></a>
        </div>
    </c:otherwise>
</c:choose>

<jsp:include page="footer.jsp"/>
</body>
</html>
