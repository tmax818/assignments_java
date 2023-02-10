<!-- Here we have to import the Date class. -->
<!-- You will put the import in the first line of the jsp tag. Use the import attribute -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <!-- for Bootstrap CSS -->
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <!-- YOUR own local CSS -->
        <link rel="stylesheet" href="/css/main.css"/>
        <!-- For any Bootstrap that uses JS or jQuery-->
        <script src="/webjars/jquery/jquery.min.js"></script>
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        <meta charset="UTF-8">
        <title>Hopper's Reciept</title>
    </head>
<body>
    <div class="container">
        <img src="/images/grace.jpeg" alt="">
        <h1><c:out value="${name}"/></h1>
        <p>Item name: <c:out value="${itemName}"/></p>
        <p>Price: $<c:out value="${price}"/></p>
        <p>Description: <c:out value="${description}"/></p>
        <p>Vendor: <c:out value="${vendor}"></c:out></p>
    </div>
</body>
</html>