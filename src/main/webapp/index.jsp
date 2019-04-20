<%@ page import="com.dustinbowman.persistence.ClientService" %>
<%@ page import="java.util.Collection" %>
<%@ page import="com.igdb.api.GameResults" %>
<%@ page import="java.util.Properties" %>
<%@ page import="java.util.Iterator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<jsp:include page="head.jsp"/>
<body>
<jsp:include page="navbar.jsp"/>

<%

    String[][] data = {
            {"Game 1", "Sunny", "32", "26"},
            {"Game 2", "Sunny", "32", "26"},
            {"Game 3", "Sunny", "32", "26"},
            {"Game 4", "Partly Cloudy", "32", "26"},
            {"Game 5", "Isolated T-Storms", "32", "26"}
    };
//    request.setAttribute("games", data);
%>
<div class="container-fluid">
    <h1 class="centerTxt">New Releases</h1>



    <%--<c:forEach var="game" items="${games}">--%>
        <%--<div class="panel panel-default col-md-4">--%>
            <%--<h2 class="centerTxt" style="text-align:center;">${game.name}</h2>--%>
            <%--<div class="panel-heading centerTxt" style="text-align:center;"><img src="placeholder.png"/>${game.screenshots}</div>--%>
            <%--<div class="panel-body centerTxt" style="text-align:center;">Description${game.summary}</div>--%>
            <%--<div class="panel-footer centerTxt" style="text-align:center;"><button type="button" name="button">View Game</button></div>--%>
        <%--</div>--%>
    <%--</c:forEach>--%>

</div>



</body>
<jsp:include page="footer.jsp"/>
</html>
