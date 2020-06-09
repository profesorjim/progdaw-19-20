package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Memorizador de palabras</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>Pagina \"con memoria\" ...</h1>\n");
      out.write("    ");

      request.setCharacterEncoding("UTF-8");
      String dato = request.getParameter("palabra");
      String resetear = request.getParameter("reset");
      String memoriaPrevia;
      if ((resetear!= null) && resetear.equals("reset")){
        //session.removeAttribute("memorizado");
        session.invalidate();
        session = request.getSession();
        
        memoriaPrevia = (String)session.getAttribute("memorizado");
        dato=null;        
      }        
      String memoria= "";
      memoriaPrevia = null;
      String salto="";
      if (dato != null) {
        memoriaPrevia = (String)session.getAttribute("memorizado");
        if (memoriaPrevia == null) {
          memoriaPrevia = "";          
        } else {
          salto = "<br>"; 
        }
        memoria = memoriaPrevia + salto + dato;
        session.setAttribute("memorizado", memoria);
      }
    
      out.write("\n");
      out.write("    Id de sesión: ");
 out.print(session.getId());
      out.write("\n");
      out.write("    <form action=\"index2.jsp\" method=\"post\">\n");
      out.write("      Introduzca palabra/frase a memorizar: <input type=\"text\" name=\"palabra\"><br>\n");
      out.write("      <input type=\"hidden\" name=\"reset\" value=\"\">\n");
      out.write("      <input type=\"submit\" value=\"Memoriza\"> <input type=\"reset\" value=\"Reset\" onclick=\"this.form.reset.value='reset'; submit()\">\n");
      out.write("    </form>\n");
      out.write("    ");

      if (dato != null) {
        out.print (memoria);
      }
    
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
