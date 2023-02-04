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
        <title>Fruity Loops</title>
    </head>
<body>
    <div class="container-sm border border-5 border-danger">
        <table class="table table-sm table-bordered">
            <thead>
                <th class="col-sm-1">Name</th>
                <th class="col-sm-1">Price</th>
            </thead>
            <tbody>
                <c:forEach var="fruit" items="${fruits}">
                    <tr>
                        <td><c:out value="${fruit.name}"/></td>
                        <td><c:out value="${fruit.price}"/></td>
                    </c:forEach>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>