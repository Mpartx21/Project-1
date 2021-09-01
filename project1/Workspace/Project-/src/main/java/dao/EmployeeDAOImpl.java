package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import models.Employee;
import utils.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
	private Transaction transaction;

	@Override
	public Employee getEmployeeWithEmailPassword(String email, String password) {
		// this will be the login in database query 
		Employee employee = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			String hql = "FROM employee E WHERE E.employee_email = :email "
					+ "AND E.employee_password = :password";
			
			employee =(Employee) session.createQuery(hql)
					.setParameter("email", email).setParameter("password", password)
					.uniqueResult();
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return employee;
	}

}
