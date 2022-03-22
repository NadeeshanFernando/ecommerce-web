<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="../../../css/table.css"/>
</head>
<body>

<jsp:include page="../common/customer/header.jsp"/>
<br/><br/><br/><br/>
<br/>


<!-- Start All Pages -->
<!-- <div class="all-page-title page-breadcrumb">
    <div class="container text-center">
        <div class="row">
            <div class="col-lg-12">
                <h1>Edit Menu</h1>
            </div>
        </div>
    </div>
</div> -->
<!-- End All Pages -->

<div class="container-xl">
    <div class="table-responsive">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-5">
                        <h2>Manage Reservation</h2>
                    </div>
                    <div class="col-sm-7">
                        <a href="#" class="btn btn-secondary"><i class="material-icons">&#xE147;</i> <span>Add New Employee</span></a>

                        <form action="listreservation">
                            <input type="text" name="keyword" id="keyword" size="25" value="${keyword}" required />
                            <input type="submit" value="Search" />
                            <input type="button" value="Clear" id="btnClear" onclick="clearSearch()" />
                        </form>
                    </div>
                </div>
            </div>
            <table class="table table-striped table-hover">
                <thead>
                <tr>
                    <th>#</th>
                    <th>First Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Persons</th>
                    <th>Date</th>
                    <th>Time</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${reservations}" var="reservation">
                    <tr>
                        <td>${reservation.id}</td>
                        <td>${reservation.firstname}</td>
                        <td>${reservation.email}</td>
                        <td>${reservation.phone}</td>
                        <td>${reservation.numguest}</td>
                        <td>${reservation.date}</td>
                        <td>${reservation.time}</td>

                        <td>
                                <%-- <a href="/updatefood?id=${food.id}" class="settings" title="Settings" data-toggle="tooltip"><i class="material-icons">&#xE8B8;</i></a> --%>
                            <a href="/rejectreservation?id=${reservation.id}" class="delete" title="Reject"
                               data-toggle="tooltip"><i class="material-icons">&#xE5C9;</i></a>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>


        </div>
    </div>
</div>

<jsp:include page="../common/customer/footer.jsp"/>

<script>
    type="text/javascript"
    function clearSearch() {
        window.location = "listreservation";
    }
</script>
</body>
</html>