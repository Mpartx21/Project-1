<jsp:include page="header.jsp"/>
<jsp:include page="all_css_js.jsp"/>

<!-- JSTL includes -->
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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
            <c:forEach var="ticket" items="${ticket}">
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </c:forEach>
        </tbody>
        </table>

        <div class="container">
            <form method="get" action="">
                <button type="submit" class="btn btn-dark">
                    <h5>Add New Ticket</h5>
                </button>
            </form>
        </div>
        


<jsp:include page="footer.jsp"/>
