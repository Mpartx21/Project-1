package dao;

public class TicketDAOFactory {
	
	private static TicketDAO dao;
	
	private TicketDAOFactory() {
		
	}
	
	public static TicketDAO getTicketDAO() {
		if(dao == null)
			dao = new TicketDAOImpl();
		return dao;
	}

}
