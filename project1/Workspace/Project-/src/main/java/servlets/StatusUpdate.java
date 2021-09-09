package servlets;

import java.io.IOException;

import dao.TicketDAOFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Employee;
import models.Ticket;

public class StatusUpdate extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		int ticketId=0;
		String status = request.getParameter("status");
		String st = request.getParameter("ticketId");
		System.out.println(st);
		if(st==null) {
			try {
				System.out.println(st.trim());
				ticketId = Integer.parseInt(st.trim());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(status);
		System.out.println(ticketId);
//		int ticketid = Integer.parseInt(request.getParameter("ticketId"));
//		System.out.println(ticketid);
		
		Ticket ticket = TicketDAOFactory.getTicketDAO().getTicketByTicketId(ticketId);
		ticket.setStatus(status);
		
		TicketDAOFactory.getTicketDAO().updateTicket(ticket);

		RequestDispatcher rd = request.getRequestDispatcher("/ManagerHome.jsp");
		
		rd.forward(request, response);
	}
}
