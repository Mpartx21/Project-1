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
		int emp_id = Integer.parseInt(request.getParameter("id"));
//		String ticket_status = request.getParameter("status");
		int amount = Integer.parseInt(request.getParameter("amount"));
		String type = request.getParameter("type");
		String tick_desc = request.getParameter("desc");
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		
		Ticket ticket = new Ticket();
		ticket.setEmployee_id(emp_id);
		ticket.setStatus("pending");
		ticket.setAmount(amount);
		ticket.setDescription(tick_desc);
		ticket.setSubmitted(date);
		ticket.setType(type);
		ticket.setMang_id(54);
		dao.addTicket(ticket);
		
//		throws an error about accessing private field mang_id for int 
		
	}

}

