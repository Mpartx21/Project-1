import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import models.Employee;
import utils.HibernateUtil2;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.setName("Fake Name");
		emp1.setEmail("email.com");
		emp1.setPassword("password");
		
		SessionFactory seshs = HibernateUtil2.getSessionFactory();
		
		Session sesh = seshs.openSession();
		
		Transaction transaction = sesh.beginTransaction();
		
		sesh.save(emp1);
		
		transaction.commit();
		
		sesh.close();
	}

}
