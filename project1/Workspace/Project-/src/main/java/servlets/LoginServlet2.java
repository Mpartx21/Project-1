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
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession sesh = request.getSession();
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		
	

		
		String email = request.getParameter("email");
		
		String password = request.getParameter("password");
		String employeeOrManager = request.getParameter("employeeOrManager");
		
		System.out.print("hi"+email+password+employeeOrManager);
		

		
		if(employeeOrManager.equals("employee")) {
			emp = EmployeeDAOFactory.getEmployeeDAO().getEmployeeWithEmailPassword(email, password);
			System.out.print("h2i"+email+password+employeeOrManager);
			if(emp == null) {
				System.out.print("h3i"+email+password+employeeOrManager);
				rd.forward(request, response);
			}
			
			sesh.setAttribute("employee", emp);
			System.out.print("hi4 to employee"+email+password+employeeOrManager);
			
			response.sendRedirect("employeehome");
			
		}else if(employeeOrManager.equals("manager")) {
			mang = ManagerDAOFactory.getManagerDAO().getManagerWithEmailPassword(email, password);
			if(mang == null) {
				rd.forward(request, response);
			}
			sesh.setAttribute("manager", mang);
			response.sendRedirect("managerhome");
		}
		System.out.print("hi going to login"+email+password+employeeOrManager);
		response.sendRedirect("Login.jsp");
		
	}
}