
<jsp:include page="all_css_js.jsp"/>
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

    <label for="filter">Filter by: </label>

    <select name="filter" id="filter">
        <option value="pending">Pending</option>
        <option value="approved">Approved</option>
        <option value="rejected">Rejected</option>
    </select>
    <button onclick="doThis()" value="Refresh" ></button>
    <table class="table table-responsive">
        <thead>
            <tr>
            <!-- 	<td>Ticket ID</td> -->
                <td>Employee ID</td>
             <!--    <td>Description</td> -->
                <td>Status</td>
                <td>Amount</td>
                <td>Submit</td>
                <td>Respond</td>
                <td>Reason</td>
                <td>Type</td>
            </tr>
        </thead>
    <tbody>
       <c:forEach var="ticket" items="${tickets}">
       <!-- Here will put all of the data
        but will just make hidden fields to make the 
        process of querying a little easier
         -->
       
            <tr>
             <%--    <td><c:out value="${ticket.ticket_id }" /></td> --%>
                <td><c:out value="${ticket.employee_id }" /></td>
              <%--   <td><c:out value="${ticket.desc }" /></td> --%>
                <td><c:out value="${ticket.status }" /></td>
                <td><c:out value="${ticket.amount }" /></td>
                <td><c:out value="${ticket.responded }" /></td>
                <td><c:out value="${ticket.reason }" /></td>
                <td><c:out value="${ticket.type }" /></td>
            </tr>
        </c:forEach>
    </tbody>
    </table>



  <footer class="text-center">

    </footer>   
<!--Bootstrap javascript -->



    
</body>
</html>
