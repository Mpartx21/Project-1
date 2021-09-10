package servlets;

import java.io.IOException;
import java.sql.SQLException;

import org.hibernate.Session;

import dao.TicketDAOFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Employee;
import models.Ticket;
@WebServlet("/StatusUpdate")
public class StatusUpdate extends HttpServlet {
<<<<<<< HEAD
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
    	
    	Session session = null;
    	
    	
    	

    	
    	

        String status = request.getParameter("status");

        int ticketId = Integer.parseInt(request.getParameter("ticketid"));
        Ticket t1 =  TicketDAOFactory.getTicketDAO().getTicketByTicketId(ticketId);
        System.out.println(status);
        System.out.println(ticketId);
        t1.setStatus(status);
		
		System.out.println(status);
=======
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		int ticketId=0;
		String status = request.getParameter("status");
		int st =Integer.parseInt( request.getParameter("ticketId"));
//		System.out.println(st);
//		if(st==null) {
//			try {
//				System.out.println(st.trim());
//				ticketId = Integer.parseInt(st.trim());
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		System.out.println(status);
		System.out.println(st);
//		int ticketid = Integer.parseInt(request.getParameter("ticketId"));
//		System.out.println(ticketid);
>>>>>>> refs/remotes/origin/final-final
		
		
		try {
			TicketDAOFactory.getTicketDAO().updateTicket(t1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		RequestDispatcher rd = request.getRequestDispatcher("/ManagerHome.jsp");
		
		rd.forward(request, response);
	}
}
