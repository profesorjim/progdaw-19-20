package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Listado de socios</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>Listado de socios</h1>\n");
      out.write("    ");

      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/clases_baloncesto","root", "");
      Statement s = conexion.createStatement();

      ResultSet tuplas = s.executeQuery("Select * from socio");
      
      out.println("<table border=1>");
      out.println("<tr><td>Nº de socio</td><td>Nombre del socio</td></tr>");
      while (tuplas.next()) {
        out.print("<tr>");
        out.print("<td align=center>"+tuplas.getString("socioID") + "</td><td>" + tuplas.getString("nombre") + "</td>");
        
      out.write("\n");
      out.write("        <td>\n");
      out.write("        <form method=\"POST\" action=\"modificar.jsp\">\n");
      out.write("          <input type=\"hidden\" name=\"codigo\" value=\"");
      out.print(tuplas.getString("socioID"));
      out.write("\">\n");
      out.write("          <input type=\"submit\" value=\"Modificar\">\n");
      out.write("        </form>\n");
      out.write("        </td>\n");
      out.write("        ");

        out.println("</tr>"); 

      }
      out.println("</table>");
      
      conexion.close();


    
      out.write("\n");
      out.write("  </body>\n");
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
