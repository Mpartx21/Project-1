package dao;

import models.Manager;

public interface ManagerDAO {
	Manager getManagerWithEmailPassword(String email,String password);

}
