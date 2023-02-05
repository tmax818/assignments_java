<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>



<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.io.*,java.util.*"%>

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
        <title>Forms</title>
    </head>
<body>
    <div class="container-sm">
        <h1>Your Gold: <span><c:out value="${gold}"></c:out></span></h1>
        <div class="row">
            <div class="col border border-3 p-2 m-2">
                <h2>Farm</h2>
                <form action="/gold" method="post">
                    <input type="hidden" name="place" value="farm">
                    <input type="submit" value="Find Gold!">
                </form>
            </div>
            <div class="col border border-3 p-2 m-2">
                <h2>Cave</h2>
                <form action="/gold" method="post">
                    <input type="hidden" name="place" value="cave">
                    <input type="submit" value="Find Gold!">
                </form>
            </div>
            <div class="col border border-3 p-2 m-2">
                <h2>House</h2>
                <form action="/gold" method="post">
                    <input type="hidden" name="place" value="house">
                    <input type="submit" value="Find Gold!">
                </form>
            </div>
            <div class="col border border-3 p-2 m-2">
                <h2>Quest</h2>
                <form action="/gold" method="post">
                    <input type="hidden" name="place" value="quest">
                    <input type="submit" value="Find Gold!">
                </form>
            </div>

            <div class="container">
                <p>
                    <c:out value="${log}"></c:out><br>
                </p>
            </div>
        </div>

    </div>
</body>
</html>