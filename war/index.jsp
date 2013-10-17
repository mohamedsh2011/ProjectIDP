
<%@ page import="Controller.*,Model.* , java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="SelfMade.css">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
<%@include file="Navigation/NotLogged.html" %>

<%
	String error = (String) request.getAttribute("errorMsg");
if(error!=null){
	out.print("<font color ='red'><p align='right'>" + error + "</p></font color>");
}


%>


<%AdsManager adsManager = new AdsManager();%>


<form action="SearchServlet.do" method="get" class ="middlePage">
<img src="Images/findmeanAdLogo.jpg" width="113" height="40" />
<input name="searchQuery" type="text" id = "textboxid"/>
<input type="submit" class="searchButton" value ="" />
</form>


</body>
</html>
