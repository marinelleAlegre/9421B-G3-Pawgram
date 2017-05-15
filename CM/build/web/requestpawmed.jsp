<%-- 
    Document   : index.jsp
    Created on : 05 8, 17, 4:13:44 PM
    Author     : s326lab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Request</title>
        <link rel="stylesheet" href="styles/style.css">
        <link rel="stylesheet" href="styles/navigation.css" type="text/css"/>
        <Link rel="icon" href="styles/images/icon.png">
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="HandheldFriendly" content="true">
    </head>
    
    <body class="pawgroom-request">
        
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
        
        <div class="request">
        <form>
        <h2>Services</h2>
        <input type="checkbox" name="service" value="Dentistry"/>Dentistry<br>
            <input type="checkbox" name="service" value="Dentistry"/>Consultation<br>
            <input type="checkbox" name="service" value="Haircut"/>Medication<br>
            <input type="checkbox" name="service" value="Deworming"/>Deworming<br>
            <input type="checkbox" name="service" value="Vaccination"/>Vaccination<br>
            <input type="checkbox" name="service" value="Senior Pet Care"/>Senior Pet Care<br>
            <input type="checkbox" name="service" value="Health Certificate"/>Health Certificates<br>
            <input type="checkbox" name="service" value="Confinements"/>Confinements<br>
        </form>   
        
        <form>
        <h2>Choose Service Provider</h2>
              <input type="radio" name="serviceprovider" value="Luke Hemmings"/>Luke Hemmings<br>
            <input type="radio" name="serviceprovider" value="Michael Clifford"/>Michael Clifford<br>
            <input type="radio" name="serviceprovider" value="Ashton Irwin"/>Ashton Irwin<br>
            <input type="radio" name="serviceprovider" value="Calum Hood"/>Calum Hood<br>
        </form>   
        
        <form>
        <h2>Time and Date of Appointment</h2>
            <input type="datetime-local" name="appointment">
        </form><br>
            
        <form class=" request-service" method="post" action="request.jsp"/>
            <input type="submit" name="service" placeholder="Type service/s here..."/>
        </form>
    
        </div>
   
    </body>
   
    
</html>

