<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<h1 class="text-center text-primary">Register</h1>
<c:if test="${errMsg != null}">
    <div class="alert alert-danger">
        ${errMsg}
    </div>
</c:if>

<c:url var="action" value="/register" />

<form:form method="post" action="${action}" modelAttribute="user">
    <div class="form-group">
        <label for="firstName">First Name</label>
        <form:input type="text" class="form-control" id="firstName" path="firstName" placeholder="FirstName" />
    </div>
    <div class="form-group">
        <label for="lastName">Last Name</label>
        <form:input type="text" class="form-control" id="lastName" path="lastName" placeholder="LastName" />
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <form:input type="email" class="form-control" id="email" path="email" placeholder="Email" />
    </div>
    <div class="form-group">
        <label for="username">Username</label>
        <form:input type="text" class="form-control" id="username" path="username" placeholder="Username" />
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <form:input type="password" class="form-control" id="password" path="password" placeholder="Password" />
    </div>
    <div class="form-group">
        <label for="confirm-password">Confirm Password</label>
        <form:input type="password" class="form-control" id="confirm-password" path="confirmPassword" placeholder="ConfirmPassword" />
    </div>
    <div class="form-group">
        <input class="btn bth-danger" type="submit" value="Register">
    </div>
</form:form>