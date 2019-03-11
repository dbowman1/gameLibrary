<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 3/10/2019
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>

<body>
<%--#TODO fancy up success page--%>
<c:choose>
    <c:when test="${errorMessage == null}">
        <div class="alert alert-success" role="alert">
            <strong>New User Registration -- Success</strong>
        </div><br/><br/>
        <a href="index.jsp">Home</a>
    </c:when>
    <c:otherwise>
        <div class="alert alert-danger" role="alert">
            <strong>New User Registration -- Failed</strong><br />
            ${errorMessage}<br /><br />
            <a href="userSignUp.jsp"><button type="button" class="btn btn-primary">
                Retry</button></a>
        </div>
    </c:otherwise>

</c:choose>

</body>
<jsp:include page="footer.jsp"/>
</html>
