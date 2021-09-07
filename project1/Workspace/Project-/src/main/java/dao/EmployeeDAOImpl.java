package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import models.Employee;
import models.Ticket;
import utils.HibernateUtil;
import utils.HibernateUtil2;

public class EmployeeDAOImpl implements EmployeeDAO {
	Session session = null;

	@Override
	public Employee getEmployeeWithEmailPassword(String email, String password) {
		//You do not need the transactions when grabbing data but you do
				//need it when you are inserting or updating 
				// this will be the login in database query 
		// this will be the login in database query 
//		Employee employee = null;
//		try {
//			session = HibernateUtil.getSessionFactory().openSession();
//			Transaction transaction = session.beginTransaction();
//			String hql = "FROM employee E WHERE E.employee_email = :email "
//					+ "AND E.employee_password = :password";
//			
//			employee =(Employee) session.createQuery(hql)
//					.setParameter("email", email).setParameter("password", password)
//					.uniqueResult();
//			
//			transaction.commit();
//			session.close();
//		}catch(Exception e ) {
//			e.printStackTrace();
//		}
//		return employee;
		return (Employee) HibernateUtil
				.getSessionFactory()
				.openSession()
				.createQuery( "FROM employee  WHERE employee_email = :email "
						+ "AND employee_password = :password")
				.setParameter("email", email)
				.setParameter("password", password).uniqueResult();
	}

	@Override
	public void addTicket(Employee employee) {
	session = HibernateUtil2.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.saveOrUpdate(employee);
		
		transaction.commit();
		
		session.close();
		
	}

}
