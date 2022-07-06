<%-- 
    Document   : index
    Created on : 6 Jul 2022, 00:33:33
    Author     : quoch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1 class="text-center text-danger">Danh muc san pham</h1>

<form acction="">
    <div class="row">
        <div class="col-md-11">
            <input class="form-control" type="text" name="kw" placeholder="Nhap tu khoa can tim">
        </div>
        <div class="col-md-1">
            <input type="submit" value="Search" class="btn btn-danger" />
        </div>
    </div>
</form>


<div class="row">
    <c:forEach var="p" items="${products}">
        <div class="card col-md-4 bg-primary">
            <div class="card-body">
                <img class="img-fluid" src="<c:url value="/images/abc.jpg" />" alt="${p.name}" />
            </div>
            <div class="card-footer">
                <h3>${p.name}</h3>
                <p>${p.price} VND</p>
            </div>
        </div>
    </c:forEach>
</div>