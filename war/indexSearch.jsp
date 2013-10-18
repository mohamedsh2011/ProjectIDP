
<%@ page import="Controller.*,Model.* , java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="SelfMade.css">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
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
	%>
	<!-- 
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
	-->
	<%
	
	
}
else{
	out.print("<h2><center><font face='Helvetica'>Hi, your search is successful and here are the results!</font></center></h2>");
	
	ArrayList<Ads> searchResult = (ArrayList<Ads>)request.getAttribute("searchResult");
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
