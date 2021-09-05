package servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.TicketDAO;
import dao.TicketDAOFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Ticket;

/**
 * Servlet implementation class AddTicketServlet
 */
@WebServlet("/AddTicketServlet")
public class AddTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddTicketServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
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
		dao.addTicket(ticket);
		
		
		
	}

}
