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
            <c:forEach var="ticket" items="tickets">
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </c:forEach>
        </tbody>

        <div class="container">
        <form class="login-input" method="get" action="Add Ticket">
            <button class="btn btn-dark" type="submit"><h4>Add new Reimbursement</h4></button>
        </form></div>


<jsp:include page="footer.jsp">
