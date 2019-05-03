<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dbow_
  Date: 3/26/2019
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="head.jsp"/>
<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#usersTable').DataTable();
    } );
</script>
<body>
<jsp:include page="navbar.jsp"/>
<h2 class="text-center">Users</h2>
<c:if test="${not empty msg}">
    <h3 class="alert alert-danger text-center" role="alert">${msg}</h3>
</c:if>
<table id="usersTable">
    <thead>
    <tr>
    <th>User</th>
    <th>Email</th>
    <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.userName}</td>
            <td>${user.email}</td>
            <td>
                <a href="deleteUser?id=${user.id}"><i class="fas fa-trash-alt"></i></a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<jsp:include page="footer.jsp"/>
</body>
</html>
