<%-- 
    Document   : index
    Created on : Mar 18, 2020, 9:11:10 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
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
          // extracción y procesamiento del objeto complejo
          ObjectMapper objetoComplejo = new ObjectMapper();     
          Baraja baraja2 = objetoComplejo.readValue(k.getValue(),Baraja.class) ;
          // ya tenemos el objeto; podemos volcarlo por pantalla ...
          out.println("La baraja es:<br>");
          out.println(baraja2);
        }
      } else {
        Baraja baraja1 = new Baraja(1);
        
        // conversion a JSON
        ObjectMapper mapper = new ObjectMapper();
        String baraja1comoString = mapper.writeValueAsString(baraja1);
        
        Cookie cookie = new Cookie("baraja1",baraja1comoString);
        cookie.setPath("/");
        response.addCookie(cookie);
        out.println("Se ha almacenado una cookie");
      }
    %>
  </body>
</html>
