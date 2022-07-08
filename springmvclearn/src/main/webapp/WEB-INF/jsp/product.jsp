<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<h1 class="text-center text-danger">QUAN LY SAN PHAM</h1>

<c:url var="action" value="/admin/products" />
<form:form method="post" action="${action}" modelAttribute="product" 
        enctype="multipart/form-data">
    <form:errors path="*" cssClass="alert alert-danger" element="div" />
    <div class="form-group">
        <label for="name">Ten</label>
        <form:input type="text" id="name" path="name" cssClass="form-control" />
        <form:errors path="name" cssClass="alert alert-danger" element="div" />
    </div>

    <div class="form-group">
        <label for="description">Mo ta</label>
        <form:textarea id="description" path="description" cssClass="form-control" />
     </div>

    <div class="form-group">
        <label for="price">Gia</label>
        <form:input type="text" id="price" path="price" cssClass="form-control" />
        <form:errors path="price" cssClass="alert alert-danger" element="div" />
    </div>

    <div class="form-group">
        <label for="file">Anh san pham</label>
        <form:input type="file" id="file" path="file" cssClass="form-control" />
    </div>

    <div class="form-group">
        <input type="submit" value="Upload" class="btn btn-primary" />
    </div>
    
</form:form>