package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StatusUpdate extends HttpSeverlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		String status = request.getParameter("status");
		int ticketid = Integer.parseInt(request.getParameter("ticketId"));
	}
}
