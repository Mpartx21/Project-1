<jsp:include page="header.jsp"/>

<!-- JSTL includes -->
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

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
            	<td>Ticket ID</td>
                <td>Employee ID</td>
                <td>Description</td>
                <td>Status</td>
                <td>Amount</td>
                <td>Submit</td>
                <td>Approved By</td>
                <td>Respond</td>
                <td>Reason</td>
                <td>Type</td>
            </tr>
        </thead>
    <tbody>
       <c:forEach var="ticket" items="${ticket}">
       <!-- Here will put all of the data
        but will just make hidden fields to make the 
        process of querying a little easier
         -->
       
            <tr>
                <td><c:out value="${ticket.ticket_id }" /></td>
                <td><c:out value="${ticket.employee_id }" /></td>
                <td><c:out value="${ticket.desc }" /></td>
                <td><c:out value="${ticket.status }" /></td>
                <td><c:out value="${ticket.amount }" /></td>
                <td><c:out value="${ticket.approved_by }" /></td>
                <td><c:out value="${ticket.responded }" /></td>
                <td><c:out value="${ticket.reason }" /></td>
                <td><c:out value="${ticket.type }" /></td>
            </tr>
        </c:forEach>
    </tbody>
    </table>


    <jsp:include page="footer.jsp"/>

    
        <script>
            doThis = () => {alert("You touched it")}
        </script>
