<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>

    <h1>Save Travels</h1>
   

    <h2>Edit a Travel Expense</h2>

    <form:form action="/travels/${travel.id}" method="post" modelAttribute="travel">
        <input type="hidden" name="_method" value="put">
    <div class="form-control">
        <form:label path="name">name</form:label>
        <from:errors path="name"/>
        <form:input path="name"></form:input>
    </div>
    <div class="form-control">
        <form:label path="vendor">vendor</form:label>
        <from:errors path="vendor"/>
        <form:input path="vendor"></form:input>
    </div>
    <div class="form-control">
        <form:label path="amount">amount</form:label>
        <from:errors path="amount"/>
        <form:input path="amount"></form:input>
    </div>
    <div class="form-control">
        <form:label path="description">description</form:label>
        <from:errors path="description"/>
        <form:input path="description"></form:input>
    </div>

    <input type="submit" value="submit">


    </form:form>
</body>
</html>

