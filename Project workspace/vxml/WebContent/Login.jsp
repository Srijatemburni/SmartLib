<?xml version="1.0" encoding="UTF-8"?>
<%@page import="java.sql.Connection"%>
<%@page import="com.test.util.ConnectionUtil"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<vxml version="2.1">
<form>
<block>
<%
    String message = (String)request.getAttribute("message");
    if(message!=null){
    %>
        <prompt><%=message%></prompt>
<%
    }else{
    %>
    <prompt>Welcome to Central Library </prompt><%System.out.println("In login .jsp pase after prompt tag"); %>
<%
    } 
    %>
</block>
<field name="u_num" type="digits">
<log expr="'**********accnum field*************'"/>
    <prompt>please enter your phone number</prompt>
    <noinput>
        <prompt>You did not enter your phone number</prompt>
    </noinput>    
    
</field>

<field name="u_password" type="digits">
<log expr="'**********password field*************'"/>
    <prompt>please enter password</prompt>
    <noinput>
        <prompt>You did not enter password</prompt>
    </noinput>
   
</field>


<block>
    <submit next="LogServlet?action=login" method="post"  />
</block>

</form>
</vxml>
