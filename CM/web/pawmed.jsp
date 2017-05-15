<%-- 
    Document   : search
    Created on : 05 8, 17, 4:52:45 PM
    Author     : s326lab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/style.css" type="text/css"/>
        <link rel="stylesheet" href="styles/navigation.css" type="text/css"/>
        <title>PawMed</title>
    </head>
    <body>
        <div id= "nav">
        <nav>
            <ul class="nav nav-right nav fixed">
            
            <li> <form class="search" method="post" action="search.jsp">
                    <input type="text" name="search" placeholder="Search.."/>
            </form></li>
            <li><a href="store.html">STORE</a></li>
                <li><a href="contact.html">CONTACT</a></li>
                <li><a href="about.html">OUR TEAM</a></li>
                
                <li class="dropdown">
                <a href="#" class="dropbtn">SERVICES</a>
                <div class="dropdown-content">
                    <a href="pawgroom.jsp">PawGroom</a>
                    <a href="pawmed.jsp">PawMed</a>
                </div>
                </li>
                <li><a href="index.jsp">HOME</a></li>
               
            </ul>
        </nav>
        </div>
        
        <section class="pawmed">
            <div>
                <form class="request" method="post" action="response.sendRedirect("requestpawmed.jsp")"/>
                    <input type="button" name="request" value="Book Appointment" class="button">
                    <%
                        response.sendRedirect("requestpawmed.jsp");
                    %>
                </form>
            </div>
        </section>
        
      
        
    </body>
</html>

