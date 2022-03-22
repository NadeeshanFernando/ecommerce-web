<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<jsp:include page="../common/customer/header.jsp"/>

<!-- Start All Pages -->
<div class="all-page-title page-breadcrumb">
    <div class="container text-center">
        <div class="row">
            <div class="col-lg-12">
                <h1>Add Food</h1>
            </div>
        </div>
    </div>
</div>
<!-- End All Pages -->

<!-- Start Reservation -->
<div class="reservation-box">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="heading-title text-center">
                    <h2>Add Food</h2>

                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-12 col-sm-12 col-xs-12">
                <div class="contact-block">
                    <%--@elvariable id="food" type=""--%>
                    <form:form action="addfoodform" method="post" modelAttribute="food">
                        <form:hidden path="id"/>

                        <div class="row">

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="name" class="form-control"
                                                    placeholder="Food Name"/>
                                        <form:errors path="name" />
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="description" class="form-control"
                                                    placeholder="Description" required="Please enter description"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:select path="type"
                                                     class="custom-select d-block form-control"
                                                     required="Please select Type">
                                            <form:option value="0" disabled="disabled">Select type*</form:option>
                                            <form:option value="drinks">Drinks</form:option>
                                            <form:option value="breakfast">Breakfast</form:option>
                                            <form:option value="lunch">Lunch</form:option>
                                            <form:option value="dinner">Dinner</form:option>
                                        </form:select>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="price" class="form-control"
                                                    placeholder="Price" required="Please enter price"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:select path="status"
                                                     class="custom-select d-block form-control"
                                                     required="Please select Status">
                                            <form:option value="0" disabled="disabled">Select status*</form:option>
                                            <form:option value="available">Available</form:option>
                                            <form:option value="soldout">Sold out</form:option>
                                        </form:select>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                            </div>

                            <div class="col-md-12">
                                <div class="submit-button text-center">
                                    <form:button class="btn btn-info col-2"> Save </form:button>
                                    <div id="msgSubmit" class="h3 text-center hidden"></div>
                                    <div class="clearfix"></div>
                                </div>
                            </div>

                        </div>
                    </form:form>
                </div>
            </div>
        </div>


    </div>
</div>
<!-- End Reservation -->

<jsp:include page="../common/customer/footer.jsp"/>
</body>
</html>