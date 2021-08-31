package dao;

import java.sql.SQLException;

import models.Employee;

public interface EmployeeDAO {
	Employee getEmployeeWithEmailPassword(String email,String password)throws SQLException;
	
}
