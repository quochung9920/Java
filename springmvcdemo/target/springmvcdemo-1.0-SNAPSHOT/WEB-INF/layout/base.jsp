<%-- 
    Document   : base
    Created on : 4 Jul 2022, 23:59:59
    Author     : quoch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <tiles:insertAttribute name="title" />
        </title>
    </head>
    <body>
        <!-- <HEADER -->
        <tiles:insertAttribute name="header" />
        <!-- CONTENT -->
        <tiles:insertAttribute name="content" />
        <!-- FOOTER -->
        <tiles:insertAttribute name="footer" />
    </body>
</html>