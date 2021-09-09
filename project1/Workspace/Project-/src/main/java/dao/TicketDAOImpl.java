package dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
//import org.hibernate.query.Query;

import models.Employee;
import models.Ticket;
import utils.HibernateUtil;
import utils.HibernateUtil2;

public class TicketDAOImpl implements TicketDAO{
	
	Session session = null;
	//Query<Ticket> query = null;

	@Override
	public void addTicket(Ticket ticket) {
		
		session = HibernateUtil2.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery(
				"INSERT into Ticket (amount, description, status, submitted, type) select ?0, ?1, ?2, ?3, ?4"
				).setParameter(0, ticket.getAmount()).setParameter(1, ticket.getDescription())
				.setParameter(2, ticket.getStatus()).setParameter(3, ticket.getSubmitted()).setParameter(4, ticket.getType());
			query.executeUpdate();
		
//		session.emit(ticket);
		
		transaction.commit();
		
	//	session.close();
		
		
//		session = HibernateUtil2.getSessionFactory().openSession();       
//		
//		Transaction transaction = session.beginTransaction();                  
//		
//		Employee emp = (Employee)session.get(Employee.class, ticket.getEmployee_id().getId());                 
//		
//		ticket.setEmployee_id(emp);                          
//		
//		session.save(ticket);                           
//		
//		transaction.commit();                  
//		
//		session.close();
		
	}


	@Override
	public void updateTicket(Ticket ticket) throws SQLException {
		
		session = HibernateUtil2.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		      
		session.update(ticket);
		
//		session.save();
		System.out.println(ticket);
		transaction.commit();
		
		session.close();
		System.out.println(ticket);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ticket> getTickets() {
		
		return (List<Ticket>)HibernateUtil2
				.getSessionFactory()
				.openSession()
				.createQuery("FROM "
						+ "Ticket").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ticket> getEmployeesTicketsByID(int id) {
		
		return (List<Ticket>)HibernateUtil2
				.getSessionFactory()
				.openSession()
				.createQuery("FROM Ticket WHERE employee_id = :id")
				.setParameter("id", id).list(); 

	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Ticket> getTicketsByStatus(String status ) {
		return (List<Ticket>)HibernateUtil2
				.getSessionFactory()
				.openSession()
				.createQuery("FROM Ticket WHERE status = :status")
				.setParameter("status", status).list(); 
	}


	@Override
	public Ticket getTicketByTicketId(int ticketId) {
		return (Ticket)HibernateUtil2.getSessionFactory()
				.openSession().createQuery("FROM Ticket WHERE ticket_id = :id")
				.setParameter("id", ticketId).getSingleResult();
	}

}