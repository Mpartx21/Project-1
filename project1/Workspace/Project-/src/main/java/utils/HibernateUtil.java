package utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import models.Employee;
import models.Manager;
import models.Ticket;


public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {
				Configuration config = new Configuration();
				//wakeboard004317 && password
				
				
				//Hibernate settings
				Properties settings = new Properties();
				
				settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://project-1.c6d84h8hnvqa.us-east-1.rds.amazonaws.com:6969/");
				settings.put(Environment.USER, "bob");
				settings.put(Environment.PASS, "password");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				settings.put(Environment.SHOW_SQL, "true");
				
				//Hibernate configuration mapping 
				config.setProperties(settings);
				config.addAnnotatedClass(Employee.class);
				config.addAnnotatedClass(Manager.class);
				config.addAnnotatedClass(Ticket.class);
				
				//ServiceRegistry //
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(config.getProperties()).build();
				
				sessionFactory = config.buildSessionFactory(serviceRegistry);
				
				
			}catch (Exception e) {
			// TODO: handle exception
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
