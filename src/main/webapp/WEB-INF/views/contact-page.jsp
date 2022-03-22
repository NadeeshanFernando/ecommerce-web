<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="en">

<body>
<jsp:include page="common/customer/header.jsp"/>


<!-- Start All Pages -->
<div class="all-page-title page-breadcrumb">
    <div class="container text-center">
        <div class="row">
            <div class="col-lg-12">
                <h1>Contact</h1>
            </div>
        </div>
    </div>
</div>
<!-- End All Pages -->

<!-- Start Contact -->

<div class="contact-box">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="heading-title text-center">
                    <h2>Contact</h2>
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <form id="contactForm">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <input type="text" class="form-control" id="name" name="name" placeholder="Your Name"
                                       required data-error="Please enter your name">
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <input type="text" placeholder="Your Email" id="email" class="form-control" name="name"
                                       required data-error="Please enter your email">
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <select class="custom-select d-block form-control" id="guest" required
                                        data-error="Please Select Person">
                                    <option disabled selected>Please Select Person*</option>
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                </select>
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <textarea class="form-control" id="message" placeholder="Your Message" rows="4"
                                          data-error="Write your message" required></textarea>
                                <div class="help-block with-errors"></div>
                            </div>
                            <div class="submit-button text-center">
                                <button class="btn btn-common" id="submit" type="submit">Send Message</button>
                                <div id="msgSubmit" class="h3 text-center hidden"></div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- End Contact -->

<jsp:include page="common/customer/footer.jsp"/>
</body>
</html>