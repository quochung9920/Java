<%-- 
    Document   : index
    Created on : 2 Jul 2022, 12:59:18
    Author     : quoch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <c:if test= "${ fullName != null }">
            <h1>Hello ${fullName}</h1>
        </c:if>
        <ul>
            <c:forEach var="i" begin="1" end="10">
                <c:choose>
                    <c:when test="${ i%2 == 0 }">
                        <li style="color: red;">${i}</li>
                    </c:when>
                    <c:when test="${ i%2 != 0 }">
                        <li style="color: blue;">${i}</li>
                    </c:when>
                </c:choose>
            </c:forEach>
        </ul>
        <ol>
            <c:forEach var="u" items="${users}">
                <li>${u.firstName} ${u.lastName}</li>
            </c:forEach>
        </ol>
        <ul>
            <c:forTokens var="f" delims="," items="Apple, Lemon, Orange, Grapefruit">
                <li>${f}</li>
            </c:forTokens>
        </ul>

        <c:url value="/hello-post" var="action" />
        <form:form method="post" action="${action}" modelAttribute="user">
            <form:input path="firstName" />
            <form:input path="lastName" />
            <input type="submit" value="Send" />
        </form:form>
    </body>
</html>
