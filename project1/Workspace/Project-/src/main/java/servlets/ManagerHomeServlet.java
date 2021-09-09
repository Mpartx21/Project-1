package servlets;

import java.io.IOException;
import java.util.List;

import dao.TicketDAOFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Ticket;

public class ManagerHomeServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
	
		
		
		
		List<Ticket> tickets = TicketDAOFactory.getTicketDAO().getTickets();
		
		request.getSession().setAttribute("tickets", tickets);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ManagerHome.jsp");
				
		rd.forward(request, response);
				
				
	}
}