import org.hibernate.Session;
import org.hibernate.Transaction;

import models.Employee;
import utils.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(9999);
		emp.setName("Fake Name");
		emp.setEmail("email.com");
		emp.setPassword("password");
		
		Session sesh = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = sesh.beginTransaction();
		
		sesh.save(emp);
		
		transaction.commit();
		sesh.close();
	}

}
