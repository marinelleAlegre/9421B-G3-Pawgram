<%-- 
    Document   : index.jsp
    Created on : 05 8, 17, 4:13:44 PM
    Author     : s326lab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Home</title>
        <link rel="stylesheet" href="styles/style.css">
        <Link rel="icon" href="styles/images/icon.png">
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="HandheldFriendly" content="true">
    </head>
    
    <body>
        <% 
            String getService = request.getParameter("search");
            
            try {
                if (getService.contains("cleaning")
                    |getService.contains("nail trimming")
                    | getService.contains("sanitary trim")
                    | getService.contains("teeth brushing")
                    | getService.contains("haircut")
                    | getService.contains("blowdry")
                    | getService.contains("shampoo")
                    | getService.contains("bath")
                    | getService.contains("pedicure")
                    | getService.contains("ear cleaning")) {
                            
                    response.sendRedirect("pawgroom.jsp");
                }
                
                if (getService.contains("grooming")
                    | getService.contains("Dentistry")
                    | getService.contains("surgeries")
                    | getService.contains("prescription")
                    | getService.contains("medication")
                    | getService.contains("diets")
                    | getService.contains("deworming")
                    | getService.contains("health certificates")
                    | getService.contains("vaccination")
                    | getService.contains("consultations")
                    | getService.contains("senior pet health")
                    | getService.contains("confinements")) {
                    
                    response.sendRedirect("pawmed.jsp");
                }
                
            } catch (Exception ex) {
                ex.getMessage();
            }
        %>
    </body>
   
    
</html>
