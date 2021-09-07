package dao;

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
		
		session.saveOrUpdate(ticket);
		
		transaction.commit();
		
		session.close();
		
		
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
	public void updateTicket(Ticket ticket) {
		
		session = HibernateUtil2.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		query = session
//				.createQuery("UPDATE Ticket SET "
//						+ "approved_by = :manager_id,responded = :date"
//						+ ",status = :status"
//						+ "WHERE ticket_id = :ticketid")
//				.setParameter(0, ticket.getApproved_by())
//				.setParameter(1, ticket.getResponded())
//				.setParameter(2,ticket.getStatus())
//				.setParameter(3, ticket.getId());
//		
//		query.executeUpdate();
		session.saveOrUpdate(ticket);
		
		transaction.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ticket> getTickets() {
		
		return (List<Ticket>)HibernateUtil
				.getSessionFactory()
				.openSession()
				.createQuery("FROM tickets").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ticket> getEmployeesTicketsByID(int id) {
		
		return (List<Ticket>)HibernateUtil
				.getSessionFactory()
				.openSession()
				.createQuery("FROM tickets WHERE employee_id = :id")
				.setParameter("id", id).list();

	}

}