<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="all_css_js.jsp"/>

  <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- JSTL includes -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<script src="http://code.jquery.com/jquery-latest.js"></script>



<!-- CSS - jQuery DataTables 
<link href="https://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />
-->
<link href="https://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />


</head>
<body>

    <h1>Employee Reimbursement Tickets</h1>

    <label for="filter">Filter by: </label>
	<form method="post" action="filter" >
    <select name="filter" id="filter">
        <option value="pending">Pending</option>
        <option value="approved">Approved</option>
        <option value="rejected">Rejected</option>
        <option value="all">All</option>
    </select>
    <input type="submit" id="submit" value="Refresh" />
    </form>
    
    <table class="table table-responsive">
        <thead>
            <tr>
           		<td>Ticket ID</td> 
                <td>Employee ID</td>
             <!--    <td>Description</td> -->
                <td>Status</td>
                <td>Amount</td>
                <td>Submit</td>
                <td>Respond</td>
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
             <td><c:out value="${ticket.id }" /></td>
                <td><c:out value="${ticket.employee_id }" /></td>
              <%--   <td><c:out value="${ticket.desc }" /></td> --%>
                <td><c:out value="${ticket.status }" /></td>
                <td><c:out value="${ticket.amount }" /></td>
                <td><c:out value="${ticket.submitted }" /></td>
                <td><c:out value="${ticket.type }" /></td>
        
            </tr>
        </c:forEach>
    </tbody>
    </table>

       	
<<<<<<< HEAD
            <form method="post" action="StatusUpdate">
             <label>Ticket ID</label>
         <input placeholder="Enter Ticket id" id="ticketId" name="ticketid">
   <select name="status" id="filter">
       <option value="approved">Approved</option>
       <option value="rejected">Rejected</option>
   </select>
   <input type="submit" id="submitstatus" value="Update" >
   </form>
=======
	     <form method="POST" action="updatestatus" >
	     <div>
	          <label>Ticket ID</label>   
	         <input type="text" placeholder="Enter Ticket id" id="ticketid" name="ticketid" required>
	     </div>
	     <div>
		   <select name="status" id="filter">
		       <option value="approved">Approved</option>
		       <option value="rejected">Rejected</option>
		   </select>
	   </div>
	   <div>
	   		<input type="submit" id="status" value="Update" >
	   </div>
	   </form>
>>>>>>> refs/remotes/origin/final-final
  		



  <footer class="text-center">

    </footer>   
<!--Bootstrap javascript -->



    <script>
    $(document).ready(function(){
    	$("#submit").click(function(event){
    		
    	    var filter = $('input[name*="status"]').val();

    	    $.post("/filter",{filter:filter},);
    	});
    });

<<<<<<< HEAD
   /*  $(document).ready(function(){
    	$("#submitstatus").click(function(event){
    		var ticketId = $('input[name*="ticketId"]').val();
    	    var status = $('input[name*="status"]').val();

    	    $.post("/updatestatus",{status:status,ticketId:ticketId},);
=======
    $(document).ready(function(){
    	$("#status").click(function(event){
    
    		var ticketid = $("#ticketid").val();
    		if(ticketid== null){
				ticketid = 2;
        		}
    	    var status = $('input[name*="status"]').val();

    	    $.post("updatestatus",{status:status,ticketid:ticketid},function(text){
    			$('#error').text(text);
    		});
>>>>>>> refs/remotes/origin/final-final
    	});
    }); */
    </script>
</body>
</html>
