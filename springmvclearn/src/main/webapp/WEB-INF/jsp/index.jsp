<%-- 
    Document   : index
    Created on : 6 Jul 2022, 00:33:33
    Author     : quoch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link href="<c:url value="/css/style.css" />" rel="stylesheet">
    </head>
    <body>
        <ul>
            <c:forEach var="cate" items="${categories}">
                <li>${cate.id} - ${cate.name}</li>
            </c:forEach>
        </ul>
    </body>
</html>
