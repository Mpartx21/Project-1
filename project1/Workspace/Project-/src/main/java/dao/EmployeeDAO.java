package dao;

import models.Employee;
import models.Ticket;

public interface EmployeeDAO {
	Employee getEmployeeWithEmailPassword(String email,String password);
	void addTicket(Employee employee);
	
}