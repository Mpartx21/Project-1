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

public class FilterServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		List<Ticket> tickets = null;
		
		String status = request.getParameter("filter").toLowerCase();
		
		if(status.equals("all")) {
			tickets = TicketDAOFactory.getTicketDAO().getTickets();
		}else {
			tickets = TicketDAOFactory.getTicketDAO().getTicketsByStatus(status);
		}
		
		
	
		request.getSession().setAttribute("tickets", tickets);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ManagerHome.jsp");
		
		rd.forward(request, response);
	
	}
	
}
