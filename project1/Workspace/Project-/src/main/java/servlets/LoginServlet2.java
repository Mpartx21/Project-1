package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import dao.EmployeeDAOFactory;
import dao.ManagerDAOFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Employee;
import models.Manager;


public class LoginServlet2 extends HttpServlet{
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

		Employee emp ;
		Manager mang;
		
		HttpSession sesh = request.getSession();
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		
		response.setContentType("text/html");

		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String employeeOrManager = request.getParameter("employeeOrMangager");
		
		if(employeeOrManager == "employee") {
			emp = EmployeeDAOFactory.getEmployeeDAO().getEmployeeWithEmailPassword(email, password);
			if(emp == null) {
				rd.forward(request, response);
			}
			
			sesh.setAttribute("employee", emp);
			response.sendRedirect("/employeehome");
			
		}else if(employeeOrManager == "manager") {
			mang = ManagerDAOFactory.getManagerDAO().getManagerWithEmailPassword(email, password);
			if(mang == null) {
				rd.forward(request, response);
			}
			sesh.setAttribute("manager", mang);
			response.sendRedirect("/managerhome");
		}
		
		
		
	}
}