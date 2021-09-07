<jsp:include page="header.jsp"/>
<jsp:include page="all_css_js.jsp"/>

<!-- JSTL includes -->
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
            </tr>
        </thead>
    <tbody>
       <c:forEach var="ticket" items="${ticket}">
       <!-- Here will put all of the data
        but will just make hidden fields to make the 
        process of querying a little easier
         -->
       
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </c:forEach>
    </tbody>
    </table>


    <jsp:include page="footer.jsp"/>

    
        <script>
            doThis = () => {alert("You touched it")}
        </script>
