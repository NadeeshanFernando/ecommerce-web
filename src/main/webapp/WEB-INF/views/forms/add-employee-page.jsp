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
                <h1>Add Employee</h1>
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
                    <h2>Add-Employee</h2>

                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-12 col-sm-12 col-xs-12">
                <div class="contact-block">
                    <%--@elvariable id="employee" type=""--%>
                    <form:form action="addemployeeform" method="post" modelAttribute="employee">
                        <form:hidden path="id"/>
                        <form:hidden path="enabled" value="1"/>

                        <div class="row">

                            <div class="col-md-6">

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="username" class="form-control"
                                                    placeholder="User name" required="Please enter User name"/>
                                        <form:errors path="username"></form:errors>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="lastname" class="form-control"
                                                    placeholder="Last Name" required="Please enter Last Name"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="phone" class="form-control"
                                                    placeholder="Phone Number" required="Please enter Phone Number"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>
                                
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="email" class="form-control"
                                                    placeholder="Email" required="Please enter Email"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>
                                
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <form:input path="password" class="form-control"
                                                    placeholder="Password" required="Please enter Password"/>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>

									<div class="form-group ${status.error ? 'has-error' : ''}">
                                        <label>Role</label>
					                    <select class="form-control">
					                 	<c:forEach items="${role}" var="role">
				            			<option value="${role.id}">${role.name}</option>
				                		</c:forEach>
			                    		</select>
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