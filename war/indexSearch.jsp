<%@ page import="Controller.*,Model.* , java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="SelfMade.css">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Search Results</title>
</head>

<body>
<%
String UsernameSession = (String) session.getAttribute("authentication");
if(UsernameSession == null || UsernameSession.isEmpty()){
%>	
	<%@include file="Navigation/NotLoggedSearch.html" %>
<%
}
else{
	System.out.print("Authenticate name pass..");
%>
	<%@include file="Navigation/LoggedIn.html" %>
<%
	}
%>


<%
String error = (String) request.getAttribute("errorMsg");
if(error!=null){
	out.print("<font color ='red'><p align='right'>" + error + "</p></font color>");
}
%>


<%
ArrayList<Ads> queryResult = (ArrayList<Ads>)request.getAttribute("searchResult");
System.out.println(queryResult);

if(queryResult.size()==0){
	out.print("<h2> <center><font face='Helvetica'> Your search query yielded no results :( <br> Why not try 'Ice-Cream' or 'Telecom'? </font> </center></h2>");	
}else{
	out.print("Hi, your search is successful and here are the results!");
	
	ArrayList<Ads> searchResult = (ArrayList<Ads>)request.getAttribute("searchResult");
	String value = null;
	System.out.println(searchResult);
	
	out.print( "<table border = '3' align = 'center'> ");
	out.print("<tr>");
	int counter = 0;
	
	for(Ads a: searchResult){
		
		
		out.print(" <td> <img src='"+a.getImage()+"' width='250' height='250'> ");
		out.print("<table>");
		out.print("<tr><td>");
		out.print(" <br>" +a.getName());
		out.print("</td></tr> <tr> <td>");
		out.print(" <br>" +a.getDescription());
		out.print("</td></tr> <tr> <td>");
		out.print(" <br>" +a.getCat() +"");
		out.print("</td></tr> <tr> <td>");
		out.print(" <br> valid from " +a.getStartDate() + " to " + a.getEndDate() +"</td>");
		if(UsernameSession == null || UsernameSession.isEmpty()){		
		}else {
			out.print("</td></tr> <tr> <td>");	
			value = AdsController.isSaved(a);
			if(value.equals("yes")){
			out.print("<br> <form method='get' action='MyAdsServlet.do'>"
					+ "<input type='hidden' name='removeAd' value='" + a.getName() + "'/>"
					+ "<input type='hidden' name='page' value='home.jsp'/>"
					+ "<input type='submit' name='button' id='button' value='Remove from Saved Ad'/>"
					+ "</form>");
			} else{
			out.print("<br> <form method='get' action='MyAdsServlet.do'>"
					+ "<input type='hidden' name='addAd' value='" + a.getName() + "'/>"
					+ "<input type='hidden' name='page' value='home.jsp'/>"
					+ "<input type='submit' name='button' id='button' value='Save this Ad!'/>"
					+ "</form>");
			}
		}
		out.print("</td></tr> </table>");

		counter++;
		
		if(counter == 3){
			out.print("</tr><tr>");
			counter = 0;
		}
		
		System.out.print(a.getImage());
		
	}
	out.print("</tr>");
	out.print("</table>");

}




%>



</body>
</html>
