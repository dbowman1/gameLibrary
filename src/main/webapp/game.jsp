<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 4/20/2019
  Time: 7:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>
<body>
<jsp:include page="navbar.jsp"/>
<c:choose>
    <c:when test="${empty games}">
        <h1>No Game data found...</h1>
    </c:when>
    <c:when test="${msg != null}">
        <h1>${msg}</h1>
    </c:when>
    <c:otherwise>
                <div class="gameTitle text-center">
                    <h2>${games[0].name}</h2>
                    <h2>${releaseDate}</h2>
                </div>

                <div class="gameCover col-md-3 text-center">
                    <img src="//images.igdb.com/igdb/image/upload/t_cover_big/${games[0].cover.imageId}.jpg">
                    <% if (request.isUserInRole("user")) {%>
                    <c:if test="${userHasGame == true}"><form action="/gameLibrary/removeGame" method="post"></c:if>
                    <c:if test="${userHasGame == false}"><form action="/gameLibrary/addGame" method="post"></c:if>
                        <input id="gameId" type="hidden" name="gameId" value="${games[0].id}" />
                        <input id="gameName" type="hidden" name="gameName" value="${games[0].name}" />
                        <c:if test="${userHasGame == true}"><button type="submit" class="btn btn-danger col-md-12 removeButton">Remove from Library</button></c:if>
                        <c:if test="${userHasGame == false}"><button type="submit" class="btn btn-success col-md-12 addButton">Add To Library</button></c:if>
                    </form>
                            <% } %>
                </div>

                <div class="col-md-5">
                    <h3>Summary:</h3>
                    <p>${games[0].summary}</p>
                </div>

                <div class="col-md-4">
                    <iframe width="420" height="270" src="https://www.youtube.com/embed/${games[0].videos[0].videoId}?controls=0"></iframe>
                </div>


            <c:if test="${games[0].screenshots.size() > 0}">
            <div id="screenShots" class="carousel slide col-md-12" data-ride="carousel">
                    <%--<!-- Indicators -->--%>
                    <ol class="carousel-indicators">
                    <c:forEach begin="0" end="${games[0].screenshots.size()-1}" varStatus="loop">
                        <li data-target="#screenShots" data-slide-to="${loop.index}" ${loop.first ? 'class="active"' : ''}></li>
                    </c:forEach>
                    </ol>
                    <%--<!-- Wrapper for slides -->--%>

                <div class="carousel-inner screenShotsCarousel">
                    <c:forEach items="${games[0].screenshots}" var="screenshot" varStatus="status">
                        <div class="item ${status.first ? 'active' : ''}">
                            <img class="img-responsive center-block gameScreenShots"
                                 src="//images.igdb.com/igdb/image/upload/t_original/${screenshot.imageId}.jpg"
                                 alt="${games[0].name} screenshot">
                        </div>
                    </c:forEach>
                </div>

                    <%--<!-- Left and right controls -->--%>
                <a class="left carousel-control" href="#screenShots" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#screenShots" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
            </c:if>

    </c:otherwise>
</c:choose>

<jsp:include page="footer.jsp"/>

</body>
</html>
