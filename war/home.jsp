<%@ page import="Controller.*,Model.* , java.util.ArrayList" %>

<%@include file="Authentication/Aunthenticate.jsp" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="SelfMade.css">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home</title>
</head>

<body>




<%@include file="Navigation/LoggedIn.html" %>
























<%

Subcription userSubs = SubcriptionController.getUserSubcriptions(UsernameSession);
if(userSubs == null){
	out.print("<h2> <center> You have no subcriptions of any advertisement :( <br> Here are some of our featured ads !  </center></h2>");
	%>
	
	<table border = '3' align = 'center'>
		<center>
		<td><img src="/Ads/featured/default.jpg" alt="some_text"><br></br></td>
		<td><img src="/Ads/featured/default1.jpg" alt="some_text"><br></br></td>
		<td><img src="/Ads/featured/default2.jpg" alt="some_text"><br></br></td>
		
		</tr>
		<tr>
		<td><img src="/Ads/featured/default3.jpg" alt="some_text"><br></br></td>
		<td><img src="/Ads/featured/default4.jpg" alt="some_text"><br></br></td>
		<td><img src="/Ads/featured/default5.jpg" alt="some_text"><br></br></td>
		
		</tr>
		<tr>
		<td><img src="/Ads/featured/default6.jpg" alt="some_text"><br></br></td>
		<td><img src="/Ads/featured/default7.jpg" alt="some_text"><br></br></td>
		<td><img src="/Ads/featured/default8.jpg" alt="some_text"><br></br></td>
		 </center>
		<tr>
		</tr>		
	</table>
	
	<%
	
	
}
else{
	out.print("Hi, here are you subcriptions !! :D");
	ArrayList<Ads>  ads= new ArrayList<Ads>();
	ads = AdsController.retrieveAds(userSubs);
	String value = null;
	
	out.print( "<table border = '3' align = 'center'> ");
	out.print("<tr>");
	int counter = 0;
	
	for(Ads a: ads){
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
		out.print(" <br> valid from " +a.getStartDate() + " to " + a.getEndDate() +"</td>");
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
