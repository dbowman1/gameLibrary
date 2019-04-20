<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 4/13/2019
  Time: 3:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>
<body>
<jsp:include page="navbar.jsp"/>
<p> HI</p>



    <c:forEach var="game" items="${games}">
        <div class="panel panel-default col-md-6">
        <h2 class="centerTxt" style="text-align:center;">${game.name}</h2>
        <div class="panel-heading centerTxt" style="text-align:center;"><img src="${game.cover.url}"/></div>
        <div class="panel-body centerTxt" style="text-align:center;">${game.summary}</div>
        <div class="panel-footer centerTxt" style="text-align:center;"><button type="button" name="button">View Game</button></div>
        </div>
    </c:forEach>

<jsp:include page="footer.jsp"/>
</body>
</html>
