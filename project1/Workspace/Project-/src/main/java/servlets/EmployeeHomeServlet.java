package servlets;

import java.io.IOException;
import java.util.List;

import dao.TicketDAOFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Employee;
import models.Ticket;

public class EmployeeHomeServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
	
		
		Employee emp = (Employee) request.getSession().getAttribute("employee");
		System.out.print(emp.getId());
		
		List<Ticket> tickets = TicketDAOFactory.getTicketDAO().getEmployeesTicketsByID(emp.getId());
		
		request.getSession().setAttribute("tickets", tickets);
		
		RequestDispatcher rd = request.getRequestDispatcher("/EmployeeHome.jsp");
				
		rd.forward(request, response);
				
				
	}

}
