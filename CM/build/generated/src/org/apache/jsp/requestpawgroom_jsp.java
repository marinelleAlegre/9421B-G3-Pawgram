package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public final class requestpawgroom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Request</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/style.css\">\n");
      out.write("        <Link rel=\"icon\" href=\"styles/images/icon.png\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <meta name=\"HandheldFriendly\" content=\"true\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"request\">\n");
      out.write("        <form>\n");
      out.write("        <h2>Services</h2>\n");
      out.write("            <input type=\"checkbox\" name=\"service\" value=\"Nail Trim\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"service\" value=\"Teeth brushing\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"service\" value=\"Haircut\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"service\" value=\"Blowdry\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"service\" value=\"Shampoo\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"service\" value=\"Bath\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"service\" value=\"Pedicure\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"service\" value=\"Ear cleaning\"/>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        <h2>Choose Service Provider</h2>\n");
      out.write("             <input type=\"checkbox\" name=\"serviceprovider\" value=\"Juan dela Cruz\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"serviceprovider\" value=\"Bradley Simpson\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"serviceprovider\" value=\"James Mcvey\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"serviceprovider\" value=\"Tristan Evans\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"serviceprovider\" value=\"Connor Ball\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"serviceprovider\" value=\"Luke Hemmings\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"serviceprovider\" value=\"Michael Clifford\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"serviceprovider\" value=\"Ashton Irwin\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"serviceprovider\" value=\"Calum Hood\"/>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        <h2>Time and Date of Appointment</h2>\n");
      out.write("            <input type=\"text\" name=\"date\" placeholder=\"Type date here\"/>\n");
      out.write("        </form><br>\n");
      out.write("            \n");
      out.write("        <form class=\" request-service\" method=\"post\" action=\"request.jsp\"/>\n");
      out.write("            <input type=\"submit\" name=\"service\" placeholder=\"Type service/s here...\"/>\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("        ");
 
         
            
            try {
                
            Connection connection = null;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            connection = DriverManager.getConnection("jdbc:data", "YourName", "password");

            Statement statement = connection.createStatement();

            String command = "INSERT INTO Employees (ID, Name) VALUES (1, 'Tom')";
            statement.executeUpdate(command);

            command = "INSERT INTO Employees (ID, Name) VALUES (2, 'Peter')";
            statement.executeUpdate(command);

            ResultSet resultset = statement.executeQuery("select * from Employees");
            
                
            } catch (Exception ex) {
                ex.getMessage();
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
