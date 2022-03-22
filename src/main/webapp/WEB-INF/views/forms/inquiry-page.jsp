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
                <h1>Inquiry</h1>
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
                    <h2>Inquiry</h2>

                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-12 col-sm-12 col-xs-12">
                <div class="contact-block">
                    <form:form action="addinquiry" method="post" modelAttribute="inquiry">
                        <form:hidden path="id"/>

                        <div class="row">

                            <div class="col-md-6">

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="firstname" class="form-control"
                                                    placeholder="First Name" required="Please enter Name"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="email" class="form-control"
                                                    placeholder="Email" required="Please enter email"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="phone" class="form-control"
                                                    placeholder="Phone" required="Please enter phone"/>
                                        <div class="help-block with-errors"></div>
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
                                            <form:option value="inquiry">Inquiry</form:option>
                                            <form:option value="feedback">Feedback</form:option>
                                        </form:select>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                            </div>

                            <div class="col-md-12">
                                <div class="submit-button text-center">
                                    <form:button class="btn btn-info col-2"> Submit </form:button>
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