<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 4/4/2019
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container-fluid">
<nav class="navbar navbar-inverse">
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
            <form action="https://www.paypal.com/cgi-bin/webscr" class="navbar-form navbar-right" method="post" target="_top">
                <input type="hidden" name="cmd" value="_s-xclick" />
                <input type="hidden" name="hosted_button_id" value="U26JKCPJYQWEC" />
                <input type="image" src="https://www.paypalobjects.com/en_US/i/btn/btn_donate_SM.gif" border="0" name="submit" title="PayPal - The safer, easier way to pay online!" alt="Donate with PayPal button" />
                <img alt="" border="0" src="https://www.paypal.com/en_US/i/scr/pixel.gif" width="1" height="1" />
            </form>

            <form class="navbar-form navbar-right" action="search">
                <div class="form-group">
                    <input type="text" name="search" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">Search</button>
            </form>
            
            <% if (request.isUserInRole("user")) {%>
            <ul class="nav navbar-nav navbar-left">
                        <li><a href="myLibrary">My Library</a><li>

                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <% if (request.isUserInRole("admin")) { %>
                        <li><a href = "admin.jsp">Admin</a></li>
                        <% } %>
                        <li><a href="account.jsp">Account</a> </li>
                        <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span> Log Out (<%=request.getRemoteUser()%>)</a></li>
                    </ul>
            <% } else { %>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="userSignUp.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="signInConfirmation.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </ul>
            <% } %>

        </div>
</nav>