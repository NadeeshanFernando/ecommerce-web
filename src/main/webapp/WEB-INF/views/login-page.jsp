<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>

<head>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="../../../css3/login.css"/>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body>





<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <br/>
    <div class="fadeIn first">
      <img src="../../../img/logo.png" id="icon" alt="User Icon" />
    </div>
    <br/>

    <!-- Login Form -->
    <form method="POST" action="${contextPath}/login">
      
      <input type="text" id="login" class="fadeIn second" name="username" placeholder="username">
      <br/><br/>
      <input type="text" id="login" class="fadeIn third" name="password" placeholder="password">
      <br/><br/> 
      
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      <button class="fadeIn fourth" type="submit">Log In</button>
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
<%--      <a class="underlineHover" href="#">Create Account</a>--%>
    </div>

  </div>
</div>

</body>
</html>