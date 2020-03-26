<%-- 
    Document   : index
    Created on : Mar 26, 2020, 9:26:39 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Página multilingüe</title>
  </head>
  <body>
    <%
      String idioma = "";
      request.setCharacterEncoding("UTF-8");
      if (request.getParameter("idioma") != null) {
        idioma = request.getParameter("idioma");
      }
      
      if (idioma.equals("")) {
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
          for (Cookie k:cookies) {
            if (k.getName().equals("idioma")) {
              idioma = k.getValue();  
            }
          }
        }
      }
      
      if (idioma.equals("")) {
        idioma = "espaniol";
      }
      
      Cookie lenguaje = new Cookie("idioma",idioma);
      lenguaje.setMaxAge(60*60*24);
      response.addCookie(lenguaje);
      
      if (idioma.equals("espaniol")) {
          out.print("<h1>Esta página se está mostrando en español</h1>");
      } else if (idioma.equals("frances")) {
          out.print("<h1>Esta página está en francés</h1>");
      } else if (idioma.equals("ingles")) {
          out.print("<h1>Esta página está en inglés</h1>");
      }
    %> 
    
    <a href="index.jsp?idioma=espaniol">Español</a> 
    <a href="index.jsp?idioma=frances">Francés</a> 
    <a href="index.jsp?idioma=ingles">Inglés</a>
    
    
    
  </body>
</html>
