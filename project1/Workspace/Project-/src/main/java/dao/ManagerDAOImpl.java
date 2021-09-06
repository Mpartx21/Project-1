package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import models.Manager;
import utils.HibernateUtil;

public class ManagerDAOImpl implements ManagerDAO{
	Session session = null;
	Transaction transaction = null;

	@Override
	public Manager getManagerWithEmailPassword(String email, String password) {
		//You do not need the transactions when grabbing data but you do
		//need it when you are inserting or updating 
		// this will be the login in database query 
//		Manager manager = null;
//		try {
//			session = HibernateUtil.getSessionFactory().openSession();
//
//			String hql = "FROM employee E WHERE E.employee_email = :email "
//					+ "AND E.employee_password = :password";
//			
//			manager =(Manager) session.createQuery(hql)
//					.setParameter("email", email).setParameter("password", password)
//					.uniqueResult();
//			
//	
//		}catch(Exception e ) {
//			e.printStackTrace();
//		}
//		return manager;		
		return (Manager) HibernateUtil
				.getSessionFactory()
				.openSession()
				.createQuery("FROM manager WHERE manager_email = :email "
				+ "AND manager_password = :password")
				.setParameter("email", email)
				.setParameter("password", password).uniqueResult();
	}

}
