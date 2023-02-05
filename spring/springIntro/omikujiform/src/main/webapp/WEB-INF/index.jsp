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
        <form action='/show' method='GET'>
            <div class="form-control">
                <label>Pick any number from 5 to 25</label>
                <input type="number" name='number' min="5">
            </div>
            <div class="form-control">
                <label>Enter the name of any city</label>
                <input type="text" name='city'>
            </div>
            <div class="form-control">
                <label>Enter the name of a person</label>
                <input type="text" name='person'>
            </div>

                <input class="btn btn-primary" type='submit' value='send'>
            </form>
    </div>
</body>
</html>