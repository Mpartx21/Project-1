package dao;

import java.util.List;

import models.Ticket;

public interface TicketDAO {
	void addTicket(Ticket ticket);
	void updateTicket(Ticket ticekt);
	List<Ticket> getTickets();
	List<Ticket> getEmployeesTicketsByID(int id);
	}
