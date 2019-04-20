<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 4/4/2019
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/gameLibrary/">Game Library</a>
        </div>
        <div class="collapse navbar-collapse" id="navbar">
            <form class="navbar-form navbar-right" action="/gameLibrary/search">
                <div class="form-group">
                    <input type="text" name="search" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">Search</button>
            </form>
            
            <% if (request.isUserInRole("user")) {%>
            <ul class="nav navbar-nav navbar-left">
                        <li><a href="#">My Library</a><li>

                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <% if (request.isUserInRole("admin")) { %>
                        <li><a href = "/gameLibrary/admin/admin.jsp">Admin</a></li>
                        <% } %>
                        <li><a href="/gameLibrary/newReleases">New Games</a><li>
                        <li><a href="/gameLibrary/logout.jsp"><span class="glyphicon glyphicon-log-out"></span> Log Out (<%=request.getRemoteUser()%>)</a></li>
                    </ul>
            <% } else { %>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/gameLibrary/userSignUp.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="/gameLibrary/signInConfirmation.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    <li><a href="/gameLibrary/newReleases">New Games</a><li>
                </ul>
            <% } %>

        </div>
    </div>
</nav>