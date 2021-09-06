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
		// this will be the login in database query 
		Manager manager = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			String hql = "FROM employee E WHERE E.employee_email = :email "
					+ "AND E.employee_password = :password";
			
			manager =(Manager) session.createQuery(hql)
					.setParameter("email", email).setParameter("password", password)
					.uniqueResult();
			
			transaction.commit();
			session.close();
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return manager;		
	}

}
