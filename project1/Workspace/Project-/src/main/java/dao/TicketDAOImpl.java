package dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import models.Ticket;
import utils.HibernateUtil;

public class TicketDAOImpl implements TicketDAO{
	
	Session session = null;
	PreparedStatement stmt = null;

	@Override
	public void addTicket(Ticket ticket) {
		
		session = HibernateUtil.getSessionFactory().openSession();
		
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
	public List<Ticket> getEmployeesTicketsByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}