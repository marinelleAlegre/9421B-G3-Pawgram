package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/style.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/navigation.css\" type=\"text/css\"/>\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div id= \"nav\">\n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"nav nav-right nav fixed\">\n");
      out.write("            \n");
      out.write("            <li> <form class=\"search\" method=\"post\" action=\"search.jsp\">\n");
      out.write("                    <input type=\"text\" name=\"search\" placeholder=\"Search..\"/>\n");
      out.write("            </form></li>\n");
      out.write("            <li><a href=\"store.html\">STORE</a></li>\n");
      out.write("                <li><a href=\"contact.html\">CONTACT</a></li>\n");
      out.write("                <li><a href=\"about.html\">OUR TEAM</a></li>\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropbtn\">SERVICES</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"pawgroom.html\">PawGroom</a>\n");
      out.write("                    <a href=\"pawmed.html\">PawMed</a>\n");
      out.write("                </div>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"index.html\">HOME</a></li>\n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <section class=\"banner\">\n");
      out.write("            <div class=\"inner-par\">\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <section class=\"home\">\n");
      out.write("            <div class=\"services\">\n");
      out.write("                <h1>Services</h1>\n");
      out.write("                \n");
      out.write("                <h2><a href=\"pawgroom.jsp\">PawGroom</a></h2>\n");
      out.write("                <p>For your grooming needs</p>\n");
      out.write("                <h2><a href=\"pawmed.jsp\">PawMed</a></h2>\n");
      out.write("                <p>Best health care for your pet</p>\n");
      out.write("                <h2><a href=\"store.jsp\">Pet Store</a></h2>\n");
      out.write("                <p>Providing your pet with the right stuff.</p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <section class=\"home aboutus\">\n");
      out.write("            <div class=\"inner-par\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
