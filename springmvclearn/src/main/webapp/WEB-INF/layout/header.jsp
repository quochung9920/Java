<%-- 
    Document   : header
    Created on : 6 Jul 2022, 14:32:14
    Author     : quoch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/">Trang chủ</a>
      </li>
      <c:forEach var="cate" items="${categories}">
        <li class="nav-item">
            <a class="nav-link" href="#">${cate.name}</a>
        </li>
      </c:forEach>

      <li class="nav-item">
        <a class="nav-link" href="<c:url value="/cart" />">Gio hang</a>
      </li>

      <c:if test="${pageContext.request.userPrincipal.name == null}">
        <li class="nav-item active">
          <a class="nav-link text-danger" href="<c:url value="/login" />">Login</a>
        </li>
      </c:if>
      <c:if test="${pageContext.request.userPrincipal.name != null}">
        <li class="nav-item active">
          <a class="nav-link text-danger" href="<c:url value="/" />">${pageContext.request.userPrincipal.name}</a>
        </li>
      </c:if>
    </ul>
</nav>