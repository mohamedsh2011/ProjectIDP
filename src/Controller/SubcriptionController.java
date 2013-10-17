package Controller;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;
import java.io.*;

import Model.*;
import Model.*;
public class SubcriptionController extends HttpServlet {

	
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException,IOException{
		
		
		
		
		String[] checks = request.getParameterValues("checkbox");
		String user = request.getParameter("user");
		
		
		if(checks == null)
		{
			SubcriptionManager.removeSub(user);
			System.out.print("Remove subs");
			
		}
		
		else
		{
			ArrayList<String> placeholder = new ArrayList<String>();
			for(String s : checks){
				s = s.trim();
				placeholder.add(s);
				System.out.print(s);
			}
			SubcriptionManager.updateSubcriptionManager(user, placeholder);
		}
			
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request,response);
		return;
	}
	
	
	
	
	
	
	

	public static Subcription getUserSubcriptions(String user){
		return SubcriptionManager.getSub(user);
	
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