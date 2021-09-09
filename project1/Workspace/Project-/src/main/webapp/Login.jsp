<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    
<!--   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous"> -->
<jsp:include page="all_css_js.jsp"/>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<!-- 
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></scri<!--  
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
-->
</head>
<body>

    <form class="form-horizontal" action="login2" method="POST">
    	
        <div class="form-group">
            <label>Email </label>   
            <input type="text" placeholder="Enter Email" id="email" name="email" required>  
        </div>
        <div class="form-group">  
            <label>Password </label>   
            <input type="password" placeholder="Enter Password" id="password" name="password" required>  
        </div>
        <div class="form-check">
            <label>Employee</label>
            <input type="radio" name="employeeOrManager" value="employee">
            <label>Manager</label>
            <input type="radio" name="employeeOrManager" value="manager">
        </div>
        <div class="form-group">    
            <input class="btn btn-dark" id="submit" value="Login" type="submit"/>   
        </div>
        <div id="error">
        </div>
    </form>
</body>
<script >
$(document).ready(function(){
	$("#submit").click(function(event){
		
		var email = $("#email").val();
	    var password = $("#password").val();
	    var employeeOrManager = $('input[name*="employeeOrManager"]').val();

	  
	    $.post("/login2",{email:email,password:password,employeeOrManager:employeeOrManager},function(text){
		$('#error').text(text);
		});
	});
});

</script>
    
</html>