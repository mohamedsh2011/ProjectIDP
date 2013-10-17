package Controller;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;
import java.io.*;

import Model.*;
import Model.*;
public class LoginServlet extends HttpServlet {

	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException,IOException{

		
		//1 Checks the availability of the user Sessions.
		
				
		PrintWriter out = response.getWriter();
		
		String nameInput = request.getParameter("login");
		String passwordInput = request.getParameter("password");
			
		// System.out.println("User is  " + nameInput);
		
		
		
		if( nameInput == null || passwordInput == null || nameInput.equals("")|| passwordInput.equals("")){
			// checks if the fields are empty - redirect user
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			request.setAttribute("errorMsg","In order to log in, you must enter both fields  !");
			dispatcher.forward(request,response);
			return;
		}

		
		
		
		
		// For normal users:
		UserManager uList = new UserManager();// create instance of usermanager to active static
		User user = UserManager.retrieveUser(nameInput)	;
				
		if (user==null || !user.getPassword().equals(passwordInput)){ // user wrote invalid
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			request.setAttribute("errorMsg","Invalid Username or Password !");
			dispatcher.forward(request,response);
		}
		
		
		else{
			HttpSession session = request.getSession();
			session.setAttribute("authentication",user.getUsername());
			SubcriptionManager sM= new SubcriptionManager();
			AdsManager aM = new AdsManager();
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request,response);
			
			
		}
		

	}
	
	
	
	
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    	
    	
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }    		
}