<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="en">

<body>
<jsp:include page="../common/admin/admin-header.jsp"/>


<!-- Start slides -->
<div id="slides" class="cover-slides">
    <ul class="slides-container">
        <li class="text-left">
            <img src="../../img/slider-01.jpg" alt="">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="m-b-20"><strong>Welcome To <br> Live Dinner Restaurant</strong></h1>
                        <p class="m-b-40">See how your users experience your website in realtime or view <br>
                            trends to see any changes in performance over time.</p>
                        <p><a class="btn btn-lg btn-circle btn-outline-new-white" href="reservation">Reservation</a></p>
                    </div>
                </div>
            </div>
        </li>
        <li class="text-left">
            <img src="../../img/slider-02.jpg" alt="">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="m-b-20"><strong>Welcome To <br> Live Dinner Restaurant</strong></h1>
                        <p class="m-b-40">See how your users experience your website in realtime or view <br>
                            trends to see any changes in performance over time.</p>
                        <p><a class="btn btn-lg btn-circle btn-outline-new-white" href="reservation">Reservation</a></p>
                    </div>
                </div>
            </div>
        </li>
        <li class="text-left">
            <img src="../../img/slider-03.jpg" alt="">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="m-b-20"><strong>Welcome To <br> Live Dinner Restaurant</strong></h1>
                        <p class="m-b-40">See how your users experience your website in realtime or view <br>
                            trends to see any changes in performance over time.</p>
                        <p><a class="btn btn-lg btn-circle btn-outline-new-white" href="reservation">Reservation</a></p>
                    </div>
                </div>
            </div>
        </li>
    </ul>
    <div class="slides-navigation">
        <a href="#" class="next"><i class="fa fa-angle-right" aria-hidden="true"></i></a>
        <a href="#" class="prev"><i class="fa fa-angle-left" aria-hidden="true"></i></a>
    </div>
</div>
<!-- End slides -->

<jsp:include page="../common/admin/admin-footer.jsp"/>
</body>
</html>