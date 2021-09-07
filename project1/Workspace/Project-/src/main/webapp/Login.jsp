<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<jsp:include page="all_css_js.jsp"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <title>Login</title>
</head>
<body>

    <form class="form-horizontal" method="POST">
    	
        <div class="form-group">
            <label>Email </label>   
            <input type="text" placeholder="Enter Email" name="email" required>  
        </div>
        <div class="form-group">  
            <label>Password </label>   
            <input type="password" placeholder="Enter Password" name="password" required>  
        </div>
        <div class="form-check">
            <label>Employee</label>
            <input type="radio" name="employeeOrManager" value="employee">
            <label>Manager</label>
            <input type="radio" name="employeeOrManager" value="manager">
        </div>
        <div class="form-group">    
            <button class="btn btn-dark" id="submit" type="submit">Login</button>   
        </div>
        <div id="error">
        </div>
    </form>
</body>

</html>