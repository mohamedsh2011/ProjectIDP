<%@ page import="Controller.*,Model.* , java.util.ArrayList" %>

<%@include file="Authentication/Aunthenticate.jsp" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="SelfMade.css">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Find Me An Ad | My Ads</title>
</head>

<%@include file="Navigation/LoggedIn.html" %>

<body>

<%
Subcription userSubs = SubcriptionController.getUserSubcriptions(UsernameSession);
ArrayList<Ads> ads = new ArrayList<Ads>();
ads = MyAdsController.retrieveMyAds(userSubs);

if(ads == null){

	out.print("Sorry, you have not saved any Ads yet");	
}
else{
	out.print("Here are your saved Ads!");
	
	
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
		out.print(" <br> valid from " +a.getStartDate() + " to " + a.getEndDate() + "</td>");
		out.print("</td></tr> <tr> <td>");
		out.print(" </br> Saved Ad: " +a.getSavedAd() + "</td>");
		out.print("</td></tr> </table>");
		//out.print(" <br>" +a.getImage()); // other details , use ads.model class
		//out.print(" <br>" +a.getImage());
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