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

public class AddTicketServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		TicketDAO dao = TicketDAOFactory.getTicketDAO();
		
		response.setContentType("text/html");
		
		
		request.getRequestDispatcher("AddTicket.html").include(request, response);
		
		//int emp = Integer.parseInt(request.getParameter("id"));
//		
		String ticket_status = request.getParameter("status");
		
		int amount = Integer.parseInt(request.getParameter("amount"));
		
		String type = request.getParameter("type");
		
		String tick_desc = request.getParameter("desc");
		
		java.util.Date date = new java.util.Date();

		
		
		System.out.print(amount + " " + tick_desc);
		
		
		
		Ticket ticket = new Ticket();
		ticket.setDescription(tick_desc);
		ticket.setStatus("pending");
		//ticket.setId(4);
		ticket.setSubmitted(date);
		ticket.setType(type);
		ticket.setAmount(amount);
		
		
		dao.addTicket(ticket);
		
//		throws an error about accessing private field mang_id for int 
		
	}

}

