package Controller;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;
import java.io.*;

import Model.*;
import Model.*;
public class SearchController extends HttpServlet {


	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException,IOException{
		
		String searchQuery = request.getParameter("searchQuery");
		System.out.println("Search Query Received: "+ searchQuery);
		ArrayList<Ads> searchResult = AdsManager.retrieveAds(searchQuery);
		System.out.println("Search Controller:" + searchResult);
		for(Ads ads :searchResult){
			System.out.println(ads.getDescription());
			
			
		}
		request.setAttribute("searchResult", searchResult);
		RequestDispatcher dispatcher = request.getRequestDispatcher("indexSearch.jsp");
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