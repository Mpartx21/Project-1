package utils;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil2 {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if(sessionFactory == null){
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
			sessionFactory = cfg.buildSessionFactory();	
			return sessionFactory;
		}
		return sessionFactory;
	}
}
