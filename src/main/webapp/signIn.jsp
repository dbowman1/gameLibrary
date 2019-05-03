<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 3/26/2019
  Time: 10:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>

<body>
<jsp:include page="navbar.jsp"/>
        <h2 class="text-center">Sign In</h2>
        <form class="col-md-4 col-md-offset-4" role="form" action="j_security_check" method="post">
            <div class="form-group">
                <label class="control-label" for="j_username">User name</label>
                <input type="text" class="form-control" id="j_username" name="j_username" data-error="Please enter your username." placeholder="Username" required="">
            </div>
            <div class="form-group">
                <label for="j_password">Password</label>
                <input type="password" class="form-control" name="j_password" id="j_password" placeholder="Password" data-error="Please Enter your password" required="">
            </div>
            <button type="submit" class="btn btn-primary col-md-offset-5">Log In</button>
        </form>
    </div>

<jsp:include page="footer.jsp"/>
</body>
</html>
