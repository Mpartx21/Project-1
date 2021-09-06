import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import models.Employee;
import utils.HibernateUtil2;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(9999);
		emp.setName("Fake Name");
		emp.setEmail("email.com");
		emp.setPassword("password");
		
		SessionFactory seshs = HibernateUtil2.getSessionFactory();
		
		Session sesh = seshs.openSession();
		
		Transaction transaction = sesh.beginTransaction();
		
		sesh.save(emp);
		
		transaction.commit();
		sesh.close();
	}

}
