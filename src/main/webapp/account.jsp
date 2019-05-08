<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 5/1/2019
  Time: 6:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>
<body>
<jsp:include page="navbar.jsp"/>
<h2 class="text-center">Account Settings</h2>

<div class = "container col-md-offset-3">
    <form id="formValid" role="form" data-toggle="validator" class="form-horizontal"
          action="userAccount"
          method="post">

        <div class="form-group">
            <label  class="control-label col-sm-2" for="originalPass">Current Password</label>
            <div class="col-sm-4">
                <input type="password" class="form-control" id="originalPass"
                       name="originalPass"
                       data-error="Please enter your current password." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="newPassword">New Password
            </label>
            <div class="col-sm-4">
                <input type="password" class="form-control"
                       id="newPassword"
                       name="newPassword" data-error="Please provide a password."
                       required>
                <div class="help-block with-errors"></div>
            </div>

        </div>
        <div class="form-group">
            <label class="control-label col-sm-2"
                   for="confirmPassword">Confirm New
                Password</label>
            <div class="col-sm-4">
                <input type="password" class="form-control"
                       id="confirmPassword"
                       name="confirmPassword"
                       data-match="#newPassword"
                       data-match-error="Password does not match"
                       required data-error="Please retype your password.">
                <div class="help-block with-errors"></div>
            </div>
        </div>

        <button type="submit" class="btn btn-default col-md-offset-2"
                >Update Account
        </button>
        <br/><br/>
        <div class="col-md-offset-2">
            <a href="removeAllGames"><button type="button" class="btn btn-danger">Remove All Games</button></a>
        </div>
    </form>
</div>

<c:if test="${msg != null || errorMessage != null}">
    <c:choose>
        <c:when test="${errorMessage == null}">
            <h3 class="text-center">${msg}</h3>
        </c:when>
        <c:otherwise>
            <h3 class="text-center">${errorMessage}</h3>
        </c:otherwise>
    </c:choose>
</c:if>


<jsp:include page="footer.jsp"/>
</body>
</html>
