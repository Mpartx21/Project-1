<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">
</head>
<body>
<div class="container col-md-8 col-md-offset-3" style="overflow: auto">
  <h1>Login Form</h1>
  <form action="<%=request.getContextPath()%>/loginservlet" method="post">
   <div class="form-group">
    <label for="uname">Email</label> <input type="text"
     class="form-control" id="username" placeholder="Email"
     name="email" required>
   </div>
   <div class="form-group">
    <label for="uname">Password:</label> <input type="password"
     class="form-control" id="password" placeholder="Password"
     name="password" required>
   </div>
    <div class="form-check">
            <label for="uname">Employee</label>
            <input type="radio" name="employeeOrManager" value="employee">
            <label>Manager</label>
            <input type="radio" name="employeeOrManager" value="manager">
        </div>
   <button type="submit" class="btn btn-primary">Submit</button>
  </form>
 </div>
 <script src="scripts.js">
 	
 </script>

</body>
</html>