package dao;

import java.sql.SQLException;
import java.util.List;

import models.Ticket;

public interface TicketDAO {
	List<Ticket> getTickets()throws SQLException;
	List<Ticket> getEmployeesTickets(String email,String password)throws SQLException;
	}
