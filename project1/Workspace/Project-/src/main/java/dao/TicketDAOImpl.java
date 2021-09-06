package dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import models.Ticket;
import utils.HibernateUtil;

public class TicketDAOImpl implements TicketDAO{
	
	SessionFactory connection = null;
	PreparedStatement stmt = null;

	@Override
	public void addTicket(Ticket ticket) {
		connection = HibernateUtil.getSessionFactory();
		
		Session session = connection.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(ticket);
		
		transaction.commit();
		
		session.close();
		
	}

	@Override
	public void updateTicket(Ticket ticekt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ticket> getTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> getEmployeesTickets(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}