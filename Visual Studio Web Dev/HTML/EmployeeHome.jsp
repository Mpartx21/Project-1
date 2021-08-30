<jsp:include page="header.jsp">

    <h1>Employee Reimbursement Tickets</h1>

    <table class="table table-responsive">
        <thead>
            <tr>
                <td>Sent Day</td>
                <td>Amount</td>
                <td>Approved By</td>
                <td>Status</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="tickets" items="ticket">
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </c:forEach>
        </tbody>


<jsp:include page="footer.jsp">
