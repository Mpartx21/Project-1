package servlets;

import java.io.IOException;
import java.util.List;

import dao.TicketDAOFactory;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Ticket;
@WebServlet(name = "/employeehome")
public class EmployeeHomeServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		List<Ticket> tickets = TicketDAOFactory.getTicketDAO().getEmployeesTicketsByID(0)
				
				
	}

}
