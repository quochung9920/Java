<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1 class="text-center">Login</h1>

<c:if test="${param.error != null}">
    <div class="alert alert-danger">
        Da co loi xay ra khi dang nhap!
    </div>
</c:if>
<c:url var="action" value="/login" />

<form method="post" action="${action}">
    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" class="form-control" id="username" name="username" placeholder="Username">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="text" class="form-control" id="password" name="password" placeholder="Password">
    </div>
    <div class="form-group">
        <input class="btn bth-danger" type="submit" value="Login">
    </div>
</form>