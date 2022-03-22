<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Au Register Forms by Colorlib</title>

    <!-- Icons font CSS-->
    <link
            href="../../vendor2/mdi-font/css/material-design-iconic-font.min.css"
            rel="stylesheet" media="all">
    <link href="../../vendor2/font-awesome-4.7/css/font-awesome.min.css"
          rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link
            href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i"
            rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendor2/select2/select2.min.css" rel="stylesheet"
          media="all">
    <link href="../../vendor2/datepicker/daterangepicker.css"
          rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="../../css3/main.css" rel="stylesheet" media="all">
</head>

<body>
<div class="page-wrapper bg-red p-t-180 p-b-100 font-robo">
    <div class="wrapper wrapper--w960">
        <div class="card card-2">
            <div class="card-heading"></div>
            <div class="card-body">

                <h2 class="title">Update Employee</h2>

                <%--@elvariable id="employee" type=""--%>
                <form:form action="addemployeeform" method="post" modelAttribute="employee">
                    <form:hidden path="id"/>

                    <div class="input-group">
                        <label class="input--style-2">Email</label>
                        <form:input class="input--style-2" type="text" field="*{email}" path="email"/>
                    </div>


                        <form:hidden path="password"/>


                    <div class="row row-space">

                        <!-- <div class="col-2">
                        <div class="input-group">
                        <input class="input--style-2 js-datepicker" type="text"
                        placeholder="Birthdate" name="birthday"> <i
                        class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                        </div>
                        </div> -->

                        <div class="input-group">
                            <label class="input--style-2">User name</label>
                            <form:input class="input--style-2" type="text" field="*{username}" path="username"/>
                        </div>

                        <div class="input-group">
                            <label class="input--style-2">Last name</label>
                            <form:input class="input--style-2" type="text" field="*{lastname}" path="lastname"/>
                        </div>

                        <div class="input-group">
                            <label class="input--style-2">Phone</label>
                            <form:input class="input--style-2" type="text" field="*{phone}" path="phone"/>
                        </div>

                        

                    </div>


                    <!-- <div class="input-group">
                    <div class="rs-select2 js-select-simple select--no-search">
                    <select name="class">
                    <option disabled="disabled" selected="selected">Class</option>
                    <option>Class 1</option>
                    <option>Class 2</option>
                    <option>Class 3</option>
                    </select>
                    <div class="select-dropdown"></div>
                    </div>
                    </div>

                    <div class="row row-space">
                    <div class="col-2">
                    <div class="input-group">
                    <input class="input--style-2" type="text"
                    placeholder="Registration Code" name="res_code">
                    </div>
                    </div>
                    </div> -->

                    <div class="p-t-30">
                        <button class="btn btn--radius btn--green" type="submit">Update</button>
                    </div>

                </form:form>

            </div>
        </div>
    </div>
</div>

<!-- Jquery JS-->
<script src="../../vendor2/jquery/jquery.min.js"></script>
<!-- Vendor JS-->
<script src="../../vendor2/select2/select2.min.js"></script>
<script src="../../vendor2/datepicker/moment.min.js"></script>
<script src="../../vendor2/datepicker/daterangepicker.js"></script>

<!-- Main JS-->
<script src="../../js2/global.js"></script>

</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->