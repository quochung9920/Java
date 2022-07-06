<%-- 
    Document   : index
    Created on : 6 Jul 2022, 00:33:33
    Author     : quoch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Hello ${name}!</h1>

        <ul>
            <c:forEach var="i" begin="1" end="10">
                <c:choose>
                    <c:when test="${i%2 == 0}">
                        <li>${i} is even</li>
                    </c:when>
                    <c:otherwise>
                        <li>${i} is odd</li>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </ul>
        <ol>
            <c:forEach var="u" items="${users}">
                <li>${u.firstName} ${u.lastName}</li>
            </c:forEach>
        </ol>

        <ul>
            <c:forTokens items="Apple, Banana, Lemon" delims="," var="fruit">
                <li>${fruit}</li>
            </c:forTokens>
        </ul>

        <c:if test="${ fullName != null }">
            <h1>${fullName}</h1>
        </c:if>

        <c:url value="/hello-post" var="action" />
        <form:form method="post" action="${action}" modelAttribute="user">
            <form:input path="firstName" />
            <form:input path="lastName" />
            <input type="submit" value="Send" />
        </form:form>
    </body>
</html>
