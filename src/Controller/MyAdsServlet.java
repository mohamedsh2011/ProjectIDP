package Controller;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;
import java.io.*;

import Model.*;
import Model.*;
public class MyAdsServlet extends HttpServlet {

	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException,IOException{
			
		String addAd = request.getParameter("addAd");
		System.out.println("Added: " + addAd);
		ArrayList<Ads> addedList = AdsController.addAd(addAd);
		System.out.println("Servlet:" + addedList.size());
		
		String removeAd = (String)request.getParameter("removeAd");	
		System.out.println("Added: " + addAd);		
		AdsController.removeAd(removeAd);
		
		String page = request.getParameter("page");
		
		response.setIntHeader("Refresh", 5);
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request,response);
		return;	
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
