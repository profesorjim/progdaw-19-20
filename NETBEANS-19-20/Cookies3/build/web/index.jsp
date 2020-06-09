<%-- 
    Document   : index
    Created on : Mar 18, 2020, 9:11:10 AM
    Author     : tux
--%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
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
          if (k.getName().equals("variable1")) {
            // reconvierto el string de baraja a objeto baraja
            Baraja barajaRecuperada;
            ObjectMapper reconversor = new ObjectMapper();
            barajaRecuperada = reconversor.readValue(k.getValue(), Baraja.class);
            out.println("La baraja en modo texto se representa así:<br>");
            out.println(barajaRecuperada+"<br>");

          }
        }
      } else {
        Baraja b = new Baraja(1);
        // transformación a string del objeto complejo
        ObjectMapper conversor = new ObjectMapper();
        String barajaComoString = conversor.writeValueAsString(b);
        response.addCookie(new Cookie("variable1",barajaComoString));
        out.println("Se ha almacenado una cookie");
      }
    %>
  </body>
</html>
