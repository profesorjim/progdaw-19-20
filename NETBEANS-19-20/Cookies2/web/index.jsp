<%-- 
    Document   : index
    Created on : Mar 18, 2020, 9:11:10 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cartas.Baraja"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Envio de una cookie</title>
  </head>
  <body>
    <h1>Envio de una cookie</h1>
    <%
      Cookie[] todasLasCookies = request.getCookies();
      if (todasLasCookies != null) {
        for (Cookie k: todasLasCookies) {
          out.println(k.getName()+"-"+k.getValue()+"<br>");
        }
      } else {
        response.addCookie(new Cookie("baraja1","patata"));
        out.println("Se ha almacenado una cookie");
      }
    %>
  </body>
</html>
