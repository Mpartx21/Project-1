package dao;

import java.sql.SQLException;

import models.Manager;

public interface ManagerDAO {
	Manager getManagerWithEmailPassword(String email,String password)throws SQLException;

}
