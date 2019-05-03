<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 4/24/2019
  Time: 11:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>
<body>
<jsp:include page="navbar.jsp"/>
<h2 class="text-center">My Library</h2>

<c:if test="${gameInLibrary == false}">

    <div class="text-center">
        <p>Currently No games in Library... use search to add games to your library</p>

        <form role="form" class="col-md-offset-4 col-md-4" action="search">
            <div class="form-group">
                <input type="text" name="search" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default">Search</button>
        </form>
    </div>

</c:if>
<c:if test="${gameInLibrary == true}">
    <c:forEach var="game" items="${games}">
        <div class="panel panel-default col-md-6">
            <h2 class="centerTxt" style="text-align:center;"><a href="game?id=${game.id}">${game.name}</a></h2>
            <div class="panel-heading centerTxt" style="text-align:center;">
                <a href="game?id=${game.id}"><img src="${empty game.cover.url ? 'https://via.placeholder.com/90': game.cover.url}" alt="${game.name} image"/></a>
            </div>
        </div>
    </c:forEach>

    <c:if test="${noOfPages > 1}">
        <div aria-label="Page-navigation" class="col-md-12 text-center">
            <ul class="pagination justify-content-center">
                <c:if test="${currPage -1 < 1}">
                    <li class="page-item disabled">
                        <span class="page-link" tabindex="-1">Previous</span>
                    </li>
                </c:if>
                <c:if test="${currPage -1 >= 1}">
                    <li class="page-item">
                        <a class="page-link" href="myLibrary?page=${currPage-1}">Previous</a>
                    </li>
                </c:if>
                <c:forEach var="i" begin="1" end="${noOfPages}">
                    <c:if test="${i != -1 }">
                        <li class="page-item ${currPage == i ? 'active' : ''}">
                            <a href="myLibrary?page=${i}" class="nav-item">${i}</a>
                        </li>
                    </c:if>
                    <c:if test="${i == -1 }">
                        <span class="nav-item"> ... </span>
                    </c:if>
                </c:forEach>
                <c:if test="${currPage == noOfPages}">
                    <li class="page-item disabled">
                        <span class="page-link">Next</span>
                    </li>
                </c:if>
                <c:if test="${currPage < noOfPages}">
                    <li class="page-item">
                        <a class="page-link" href="myLibrary?page=${currPage+1}">Next</a>
                    </li>
                </c:if>
            </ul>
        </div>
    </c:if>
</c:if>
<jsp:include page="footer.jsp"/>
</body>
</html>
