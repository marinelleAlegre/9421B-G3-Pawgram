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
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://db_ip:3306/pawgram","root", "");
                PreparedStatement stmt = con.prepareStatement("select services from servicecategory where (services like '?';)");
                stmt.setString(1, getService+'%');
                ResultSet Rs = stmt.executeQuery();
                
                while (Rs.next()) {
                    out.println(Rs.getString(1));
                    out.println("<br/>");
                }
                
            } catch(Exception ex){
                ex.getMessage();
            }
            
        %>
        
         <div id= "nav">
        <nav>
            <ul class="nav nav-right nav fixed">
            <li class="search">
                     <form method="post" action="index.jsp">
                        <input type=text" name="Search" placeholder="Search service..." />
                        <input type="submit" value="search" name="submit"/>
                     </form>
            </li>
            <li><a href="store.html">STORE</a></li>
                <li><a href="contact.html">CONTACT</a></li>
                <li><a href="about.html">OUR TEAM</a></li>
                
                <li class="dropdown">
                <a href="#" class="dropbtn">SERVICES</a>
                <div class="dropdown-content">
                    <a href="healthypaws.html">HealthyPaws</a>
                    <a href="pawgroom.html">PawGroom</a>
                    <a href="pawmed.html">PawMed</a>
                    <a href="petvacay.html">PetVacay</a>
                    <a href="pettyshoot.html">PettyShoot</a>
                </div>
                </li>
               
                <li><a href="index.html">HOME</a></li>
               
            </ul>
        </nav>
        </div>
        
       
        
 


    </body>
</html>
