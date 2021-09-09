package servlets;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import dao.TicketDAO;
import dao.TicketDAOFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Ticket;

public class UpdateTicketServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
		
		TicketDAO dao = TicketDAOFactory.getTicketDAO();
		
		response.setContentType("text/html");
		
		request.getRequestDispatcher("UpdateTicket.html").include(request, response);
		
		int mang_id = Integer.parseInt(request.getParameter("id"));
//		
		String ticket_status = request.getParameter("status");
		
		String tick_reason = request.getParameter("reason");
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		
		Date date = new Date(System.currentTimeMillis());
		
		//Add hidden form for ticket_id
		
		Ticket ticket = new Ticket();
		
		
		//ticket.setId(ticket_id);
		ticket.setReason(tick_reason);
		ticket.setResponded(date);
		ticket.setStatus(ticket_status);
		ticket.setMang_id(mang_id);
		
		dao.updateTicket(ticket);
	}
}