<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="en">

<body>
<jsp:include page="Header.jsp"/>

<br/><br/>
<br/><br/>
<br/>

<div align="center">
    <h1>Make Reservation</h1>

    <table>
        <tr>
            <th>First Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Number Of Guest</th>
            <th>Date</th>
            <th>Time</th>
        </tr>


        <c:forEach var="reservation" items="${listReservations}">
            <tr>
                <td>${reservation.firstname}</td>
                <td>${reservation.email}</td>
                <td>${reservation.phone}</td>
                <td>${reservation.numguest}</td>
                <td>${reservation.date}</td>
                <td>${reservation.time}</td>
            </tr>
        </c:forEach>

    </table>


</div>

</body>
</html>