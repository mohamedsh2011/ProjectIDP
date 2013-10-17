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
<h2> <center> Take a look at some of our popular items :)!</center></h2>
	<table border = '3' align = 'center'cellpadding='10'>
		<center>
		<td>1</td>
		<td align="center"><img src="/Ads/trending/trend1.jpg" alt="some_text"></td>
		<td><button type="button">Save this ad!</button></td>
		</tr>
		
		<td>2</td>
		<td align="center"><img src="/Ads/trending/trend2.jpg" alt="some_text"></td>
		<td><button type="button">Save this ad!</button></td>
		</tr>
		
		<td>3</td>
		<td align="center"><img src="/Ads/trending/trend3.jpg" alt="some_text"></td>
		<td><button type="button">Save this ad!</button></td>
		</tr>
		
		<td>4</td>
		<td align="center"><img src="/Ads/trending/trend4.jpg" alt="some_text"></td>
		<td><button type="button">Save this ad!</button></td>
		</tr>
		
		<td>5</td>
		<td align="center"><img src="/Ads/trending/trend5.jpg" alt="some_text"></td>
		<td><button type="button">Save this ad!</button></td>
		</tr>
		
		<td>6</td>
		<td align="center"><img src="/Ads/trending/trend6.jpg" alt="some_text"></td>
		<td><button type="button">Save this ad!</button></td>
		</tr>
		
		<td>7</td>
		<td align="center"><img src="/Ads/trending/trend7.jpg" alt="some_text"></td>
		<td><button type="button">Save this ad!</button></td>
		</tr>
		
		<td>8</td>
		<td align="center"><img src="/Ads/trending/trend8.jpg" alt="some_text"></td>
		<td><button type="button">Save this ad!</button></td>
		</tr>
		
		<td>9</td>
		<td align="center"><img src="/Ads/trending/trend9.jpg" alt="some_text"></td>
		<td><button type="button">Save this ad!</button></td>
		</tr>
		
		<td>10</td>
		<td align="center"><img src="/Ads/trending/trend10.jpg" alt="some_text"></td>
		<td><button type="button">Save this ad!</button></td>
		</tr>
		
	</table>