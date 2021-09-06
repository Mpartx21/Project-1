package dao;

public class ManagerDAOFactory {
	
private static ManagerDAO dao;
	
	private ManagerDAOFactory() {}
	
	public static ManagerDAO getManagerDAO() {
		if(dao == null)
			dao = new ManagerDAOImpl();
		return dao;
	}


}
