package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/style.css\">\n");
      out.write("        <Link rel=\"icon\" href=\"styles/images/icon.png\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <meta name=\"HandheldFriendly\" content=\"true\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");

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
            
        
      out.write("\n");
      out.write("        \n");
      out.write("         <div id= \"nav\">\n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"nav nav-right nav fixed\">\n");
      out.write("            <li class=\"search\">\n");
      out.write("                     <form method=\"post\" action=\"index.jsp\">\n");
      out.write("                        <input type=text\" name=\"Search\" placeholder=\"Search service...\" />\n");
      out.write("                        <input type=\"submit\" value=\"search\" name=\"submit\"/>\n");
      out.write("                     </form>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"store.html\">STORE</a></li>\n");
      out.write("                <li><a href=\"contact.html\">CONTACT</a></li>\n");
      out.write("                <li><a href=\"about.html\">OUR TEAM</a></li>\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropbtn\">SERVICES</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"healthypaws.html\">HealthyPaws</a>\n");
      out.write("                    <a href=\"pawgroom.html\">PawGroom</a>\n");
      out.write("                    <a href=\"pawmed.html\">PawMed</a>\n");
      out.write("                    <a href=\"petvacay.html\">PetVacay</a>\n");
      out.write("                    <a href=\"pettyshoot.html\">PettyShoot</a>\n");
      out.write("                </div>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("                <li><a href=\"index.html\">HOME</a></li>\n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
