<jsp:include page="header.jsp"/>

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
                <td>Sent Day</td>
                <td>Employee</td>
                <td>Amount</td>
                <td>Approved By</td>
                <td>Status</td>
            </tr>
        </thead>
    <tbody>
       <c:forEach var="ticket" items="${ticket}">
            <tr>
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
