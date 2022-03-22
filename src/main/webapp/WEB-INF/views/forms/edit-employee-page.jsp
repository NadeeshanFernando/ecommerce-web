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
                        <h2>Edit Employee</h2>
                    </div>
                    <div class="col-sm-7">
                        <a href="addemployee" class="btn btn-secondary"><i class="material-icons">&#xE147;</i> <span>Add New Employee</span></a>
                        <%--<a href="excel" class="btn btn-secondary"><i class="material-icons">&#xE24D;</i> <span>Export to Excel</span></a>--%>
                        <form action="listemployee">
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
                    <th>User name</th>
                    <th>Last Name</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${employees}" var="employee">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.username}</td>
                        <td>${employee.lastname}</td>
                        <td>${employee.phone}</td>
                        <td>${employee.email}</td>

                        <td>
                            <a href="/deleteemployee?id=${employee.id}" class="delete" title="Delete"
                               data-toggle="tooltip"><i class="material-icons">&#xE5C9;</i></a>
                            <a href="/updateemployee?id=${employee.id}" class="settings" title="Settings"
                               data-toggle="tooltip"><i class="material-icons">&#xE8B8;</i></a>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>

            <!-- <div class="clearfix">
                <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>
                <ul class="pagination">
                    <li class="page-item disabled"><a href="#">Previous</a></li>
                    <li class="page-item"><a href="#" class="page-link">1</a></li>
                    <li class="page-item"><a href="#" class="page-link">2</a></li>
                    <li class="page-item active"><a href="#" class="page-link">3</a></li>
                    <li class="page-item"><a href="#" class="page-link">4</a></li>
                    <li class="page-item"><a href="#" class="page-link">5</a></li>
                    <li class="page-item"><a href="#" class="page-link">Next</a></li>
                </ul>
            </div> -->
        </div>
    </div>
</div>

<jsp:include page="../common/customer/footer.jsp"/>
<script>
    type="text/javascript"
    function clearSearch() {
        window.location = "listemployee";
    }
</script>
</body>
</html>