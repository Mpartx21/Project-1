package dao;

import java.util.List;

import models.Ticket;

public interface TicketDAO {
	List<Ticket> getTickets();
	List<Ticket> getEmployeesTickets(String email,String password);
	}
