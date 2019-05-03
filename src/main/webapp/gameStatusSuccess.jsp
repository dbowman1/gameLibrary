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
<jsp:include page="navbar.jsp"/>

<c:choose>
    <c:when test="${errorMessage == null}">
        <div class="alert alert-success" role="alert">
            <strong>${msg}</strong>
            <br/><br/>
            <a href="/gameLibrary/game?id=${gameID}"><button type="button" class="btn btn-primary">
                Go Back</button></a>
        </div><br/><br/>

    </c:when>
    <c:otherwise>
        <div class="alert alert-danger" role="alert">
            <strong>${errorMessage}</strong><br />
            <br /><br/>
            <a href="/gameLibrary/game?id=${gameID}"><button type="button" class="btn btn-primary">
                Go Back</button></a>
        </div><br/><br/>
    </c:otherwise>

</c:choose>

<jsp:include page="footer.jsp"/>
</body>
</html>
