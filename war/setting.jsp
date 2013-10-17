
<%@ page import="Controller.*,Model.*,java.util.*" %>

<%@include file="Authentication/Aunthenticate.jsp" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="SelfMade.css">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
<%@include file="Navigation/LoggedIn.html" %>




<%
ArrayList<String> subList = null;
Subcription sub = SubcriptionController.getUserSubcriptions(UsernameSession);
if(sub != null){
subList = sub.getSub();
System.out.print(subList + " Are what the user subscribed!");
}
else{
	
	System.out.print("user had no subscription to begin with!");
}


ArrayList<String> content = new ArrayList<String>();
content.add("Airplanes");
content.add("Boats");
content.add("Cars");
content.add("Dress");
content.add("Environmental");
content.add("Fun");
content.add("Gatherings");
content.add("Hiking");
content.add("Ice-cream");
content.add("Jogging");
content.add("K-pop");
content.add("Lazing ard");
content.add("New items");
content.add("Ornaments");
content.add("Telecom");

%>



















<form action="SubServlet.do" method="get" >

<table width="43%" border="5" align="center" >
  <tr>
    <td width="24%" height="36" scope="col">Username</td>
    <td width="76%" scope="col"><p>
      <label for="textfield"></label>
      <input type="text" name="username" id="textfield" value = <%=UsernameSession %>  disabled/>
    </p></td>
  </tr>
  <tr>
    <td height="35" scope="col">Password</td>
    <td scope="col"><label for="textfield2"></label>
    <input type="text" name="password" id="textfield2" value = "<%= UserManager.retrieveUser(UsernameSession).getPassword() %>   " disabled/></td>
  </tr>
  <tr>
    <td height="35" scope="col">Subcriptions</td>
    <td scope="col">

    <table width="100%" border="0">
      <tr>       
      
        <%
    	int counter = 0;
    	int subsize = 0;
       	 for(int i = 0; i<content.size(); i++){
        	
        
        	counter ++;
        	out.print("<td width='20%' scope='col'>"+content.get(i) + "</td>");
        	if(sub==null || subList==null ){
        		System.out.print("sub and list is null");
        		out.print("<td width='10%' scope='col'> <input type='checkbox' name='checkbox' value='" + content.get(i) +" '  />");
        	}
    
        	
        	else{
        		boolean match = false;
        		subsize = subList.size();
        		for(int j = 0; j<subList.size();j++){
					System.out.println(" Now comparing :" +content.get(i) + " with " + subList.get(j));
       				if(content.get(i).equals(subList.get(j))){
       				out.print("<td width='10%' scope='col'> <input type='checkbox' name='checkbox' value='" + content.get(i) +" 'checked  />");
       				subList.remove(j);
       				match = true;
       				System.out.println("content = sub, list remove ,match true break");
       				break;		
        			} 
        		}
        		
        		if(match == false){
        			out.print("<td width='10%' scope='col'> <input type='checkbox' name='checkbox' value='" + content.get(i) +" '  />");
        			System.out.println("no Match false, print normally.-- "+ content.get(i));
        		}
        		
        		
        	}
        	
        	
        	
        	
       		if(counter ==3){
       			counter = 0;
       			out.print("</tr> <tr>");
          	}
        			
        	
        	
      }
        
        %>
        
        
        
    </table></td>
  </tr>
  <tr>
    <td height="35" scope="col">Save </td>
    <input type = "hidden" name = "user" value = "<%=UsernameSession %>" />
    
    <td scope="col"><input type="submit" name="button" id="button" value="Submit" /></td>
  </tr>
</table>
</form>
<p>&nbsp;</p>
<p>&nbsp;</p>
