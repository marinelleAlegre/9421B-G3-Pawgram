<%-- 
    Document   : request
    Created on : 05 15, 17, 9:16:58 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*, java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          
        try {
            String url = "jdbc:mysql://localhost:3306/pawgram";
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, "root", "root");
        } catch (Exception e) {
            e.getMessage();
        }  
        %>
    </body>
</html>
