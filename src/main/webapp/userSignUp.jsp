<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 3/10/2019
  Time: 7:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>

<body>
<jsp:include page="navbar.jsp"/>
<%--#TODO Fancy up sign up page--%>
<div class = "container">
    <form id="signUpForm" role="form" data-toggle="validator" class="form-horizontal"
          action="userSignUp"
          method="post">

        <div class="form-group">
            <label  class="control-label col-sm-2" for="emailAddress">Email
                Address</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="emailAddress"
                       name="emailAddress"
                       data-error="Please enter your email address." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label  class="control-label col-sm-2" for="userName">Username</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="userName"
                       name="userName"
                       data-error="Please enter your userName." required>
            </div>
            <div class="help-block with-errors"></div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="password">Password
            </label>
            <div class="col-sm-4">
                <input type="password" class="form-control" id="password"
                       name="password" data-error="Please provide a password."
                       required>
                <div class="help-block with-errors"></div>
            </div>

        </div>
        <div class="form-group">
            <label class="control-label col-sm-2"
                   for="confirmPassword">Retype
                Password</label>
            <div class="col-sm-4">
                <input type="password" class="form-control" id="confirmPassword"
                       name="confirmPassword" equalTo="#password"
                       data-match="#password"
                       data-match-error="Confirmation password does not match"
                       required data-error="Please retype your password.">
                <div class="help-block with-errors"></div>
            </div>
        </div>

        <button type="submit" class="btn btn-default col-sm-offset-3"
                data-disable="true">Sign up
        </button>
        <button type="reset" class="btn btn-default">Clear</button>
    </form>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
