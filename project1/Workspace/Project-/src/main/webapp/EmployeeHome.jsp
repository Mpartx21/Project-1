
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:include page="all_css_js.jsp"/>

<html>
<head>
    <%@ page session="true"%>

<title></title>

<!-- JSTL includes -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>


<!-- CSS - jQuery DataTables -->
<link href="https://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />

<!-- CSS - Bootstrap -->


<!-- CSS - Custom -->

</head>
<body>

	




    <h1>Employee Reimbursement Tickets</h1>

    <table class="table table-responsive">
        <thead>
            <tr>
                <td>Sent Day</td>
                <td>Type</td>
                <td>Amount</td>
             <!--    <td>Approved By</td> -->
                <td>Status</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="ticket" items="${tickets}">
            <tr>
                <td><c:out value="${ticket.submitted}"/></td>
                <td><c:out value="${ticket.type}"/></td>
                <td><c:out value="${ticket.amount}"/></td>
               <%--  <td><c:out value="${ticket.approved_by}"/></td> --%>
                <td><c:out value="${ticket.status}"/></td>
            </tr>
        </c:forEach>
        </tbody>
        </table>

        <div class="container">
            <form method="get" action="AddTicket.html">
                <button type="submit" class="btn btn-dark">
                    <h5>Add New Ticket</h5>
                </button>
            </form>
        </div>
        


  <footer class="text-center">

    </footer>   
<!--Bootstrap javascript -->



    
</body>
</html>

