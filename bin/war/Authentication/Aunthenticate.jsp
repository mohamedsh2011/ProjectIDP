<%

String UsernameSession = (String) session.getAttribute("authentication");
if(UsernameSession == null || UsernameSession.isEmpty()){
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		request.setAttribute("errorMsg","Please log in !");
		dispatcher.forward(request,response);
		return;
	
}
else{
	System.out.print("Authenticate name pass..");
	}


%>