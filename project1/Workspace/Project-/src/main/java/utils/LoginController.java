//package utils;
//
//import java.io.IOException;
//
//import dao.EmployeeDAOFactory;
//import dao.EmployeeDAOImpl;
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@WebServlet("/login")
//public class LoginController extends HttpServlet {
//	private EmployeeDAOImpl loginDao;
//	
//	public void init() {
//		loginDao = new EmployeeDAOImpl();
//	}
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.sendRedirect("login.jsp");
//	}
//	
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//			authenticate(request, response);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	private void authenticate(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String email = request.getParameter("email");
//		String password = request.getParameter("password");
//		
//		if(EmployeeDAOFactory.getEmployeeDAO().getEmployeeWithEmailPassword(email, password)) {
//			RequestDispatcher dispatcher = request.getRequestDispatcher("login-success.jsp");
//			dispatcher.forward(request, response);
//		} else {
//			throw new Exception("Login not successful...");
//		}
//	}
//}
