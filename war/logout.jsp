<%@ page import="Controller.*,Model.* , java.util.ArrayList" %>
<%
session.invalidate(); 
AdsManager.clearArray();
response.sendRedirect("index.jsp");


%>