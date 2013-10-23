<%@ page import="Controller.*,Model.* , java.util.ArrayList" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="SelfMade.css">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Trending Page</title>
</head>

<body>
<%
String UsernameSession = (String) session.getAttribute("authentication");
if(UsernameSession == null || UsernameSession.isEmpty()){
%>	
	<%@include file="Navigation/NotLogged.html" %>
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
	out.print("<h1><center>Take a look at some of our popular items :)!</center></h1>");
	ArrayList<Ads>  ads= new ArrayList<Ads>();
	ads = AdsController.retrieveAllAds();
	System.out.println("Total Ads: " + ads.size());
	String value = null;
	
	out.print( "<table border = '3' align = 'center'cellpadding='10'> ");
	out.print( "<center>");
	int counter = 1;
	
	for(Ads a: ads){
		System.out.println("Each ad:" + a.getName());
		if(a.trend().equals("yes")){
			System.out.println("Each trend: " + a.trend());
			out.print(" <td> " + counter + "</td>");
			counter++;
			out.print(" <td> <img src='"+a.getImage()+"' width='250' height='250'></td> ");
			if(UsernameSession == null || UsernameSession.isEmpty()){
			
			}else {
				out.print(" <td>");
				value = AdsController.isSaved(a);
				if(value.equals("yes")){
				out.print("<form method='get' action='MyAdsServlet.do'>"
					+ "<input type='hidden' name='removeAd' value='" + a.getName() + "'/>"
					+ "<input type='hidden' name='page' value='trend.jsp'/>"
					+ "<input type='submit' name='button' id='button' value='Remove from Saved Ad'/>"
					+ "</form>");
				} else{
				out.print("<form method='get' action='MyAdsServlet.do'>"
					+ "<input type='hidden' name='addAd' value='" + a.getName() + "'/>"
					+ "<input type='hidden' name='page' value='trend.jsp'/>"
					+ "<input type='submit' name='button' id='button' value='Save this Ad!'/>"
					+ "</form>");
				}
				out.print("</td>");
			}
		}
		out.print("</tr>");
	}
	
	out.print("</table>");
	out.print("</center>");

%>
