package dao;

import models.Employee;

public interface EmployeeDAO {
	Employee getEmployeeWithEmailPassword(String email,String password);
	
}