package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import dao.EmployeeDAOFactory;
import dao.ManagerDAOFactory;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Employee;
import models.Manager;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet{
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {

		Employee emp ;
		Manager mang;
		
		HttpSession sesh = request.getSession();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String employeeOrManager = request.getParameter("employeeOrMangager");
		
		if(employeeOrManager == "employee") {
			emp = EmployeeDAOFactory.getEmployeeDAO().getEmployeeWithEmailPassword(email, password);
			sesh.setAttribute("employee", employeeOrManager);
			
			
		}else if(employeeOrManager == "manager") {
			mang = ManagerDAOFactory.getManagerDAO().getManagerWithEmailPassword(email, password);
			
		}
		
		
		
	}
}