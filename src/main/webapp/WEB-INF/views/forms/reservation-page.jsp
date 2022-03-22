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
                <h1>Reservation</h1>
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
                    <h2>Reservation</h2>
                    <p>Lorem Ipsum is simply dummy text of the printing and
                        typesetting</p>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-12 col-sm-12 col-xs-12">
                <div class="contact-block">
                    <form:form action="addreservationform" method="post" modelAttribute="reservation">
                        <form:hidden path="id"/>

                        <div class="row">

                            <div class="col-md-6">
                                <h3>Book a table</h3>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="date" class="datepicker picker__input form-control"
                                                    placeholder="Date" required="Please enter Date"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="time" class="datepicker picker__input form-control"
                                                    placeholder="Time" required="Please enter Time"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:select path="numguest"
                                                     class="custom-select d-block form-control"
                                                     required="Please select Person">
                                            <form:option value="0" disabled="disabled">Select Person*</form:option>
                                            <form:option value="1">1</form:option>
                                            <form:option value="2">2</form:option>
                                            <form:option value="3">3</form:option>
                                            <form:option value="4">4</form:option>
                                            <form:option value="5">5</form:option>
                                            <form:option value="6">6</form:option>
                                            <form:option value="7">7</form:option>
                                        </form:select>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                            </div>

                            <div class="col-md-6">
                                <h3>Contact Details</h3>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="firstname" class="form-control"
                                                    placeholder="Your Name" required="Please enter name"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="email" class="form-control"
                                                    placeholder="Your Email" required="Please enter email"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="phone" class="form-control"
                                                    placeholder="Phone Number" required="Please enter phone number"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                            </div>

                            <div class="col-md-12">
                                <div class="submit-button text-center">
                                    <form:button class="btn btn-info col-2"> Submit Reservation</form:button>
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

<!-- Start Customer Reviews -->
<div class="customer-reviews-box">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="heading-title text-center">
                    <h2>Customer Reviews</h2>
                    <p>Lorem Ipsum is simply dummy text of the printing and
                        typesetting</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-8 mr-auto ml-auto text-center">
                <div id="reviews" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner mt-4">
                        <div class="carousel-item text-center active">
                            <div class="img-box p-1 border rounded-circle m-auto">
                                <img class="d-block w-100 rounded-circle"
                                     src="../../../img/quotations-button.png" alt="">
                            </div>
                            <h5 class="mt-4 mb-0">
                                <strong class="text-warning text-uppercase">Paul
                                    Mitchel</strong>
                            </h5>
                            <h6 class="text-dark m-0">Web Developer</h6>
                            <p class="m-0 pt-3">Lorem ipsum dolor sit amet, consectetur
                                adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui.
                                Mauris magna metus, dapibus nec turpis vel, semper malesuada
                                ante. Idac bibendum scelerisque non non purus. Suspendisse
                                varius nibh non aliquet.</p>
                        </div>
                        <div class="carousel-item text-center">
                            <div class="img-box p-1 border rounded-circle m-auto">
                                <img class="d-block w-100 rounded-circle"
                                     src="../../../img/quotations-button.png" alt="">
                            </div>
                            <h5 class="mt-4 mb-0">
                                <strong class="text-warning text-uppercase">Steve
                                    Fonsi</strong>
                            </h5>
                            <h6 class="text-dark m-0">Web Designer</h6>
                            <p class="m-0 pt-3">Lorem ipsum dolor sit amet, consectetur
                                adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui.
                                Mauris magna metus, dapibus nec turpis vel, semper malesuada
                                ante. Idac bibendum scelerisque non non purus. Suspendisse
                                varius nibh non aliquet.</p>
                        </div>
                        <div class="carousel-item text-center">
                            <div class="img-box p-1 border rounded-circle m-auto">
                                <img class="d-block w-100 rounded-circle"
                                     src="../../../img/quotations-button.png" alt="">
                            </div>
                            <h5 class="mt-4 mb-0">
                                <strong class="text-warning text-uppercase">Daniel
                                    vebar</strong>
                            </h5>
                            <h6 class="text-dark m-0">Seo Analyst</h6>
                            <p class="m-0 pt-3">Lorem ipsum dolor sit amet, consectetur
                                adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui.
                                Mauris magna metus, dapibus nec turpis vel, semper malesuada
                                ante. Idac bibendum scelerisque non non purus. Suspendisse
                                varius nibh non aliquet.</p>
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#reviews" role="button"
                       data-slide="prev"> <i class="fa fa-angle-left"
                                             aria-hidden="true"></i> <span class="sr-only">Previous</span>
                    </a> <a class="carousel-control-next" href="#reviews" role="button"
                            data-slide="next"> <i class="fa fa-angle-right"
                                                  aria-hidden="true"></i> <span class="sr-only">Next</span>
                </a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Customer Reviews -->

<jsp:include page="../common/customer/footer.jsp"/>
</body>
</html>