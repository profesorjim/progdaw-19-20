<%-- 
    Document   : conversor
    Created on : Feb 13, 2020, 9:52:13 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultado de la conversión</title>
  </head>
  <body>
    <%
        double valor=0;
        double resultado=0;
        double factor=166.386;
        String cadena1,cadena2,cadenaResultado;
        request.setCharacterEncoding("UTF-8");
        if (request.getParameter("cantidad").equals("")) {
          valor = 0;
        } else {
          valor = Double.parseDouble(request.getParameter("cantidad"));
        }
        if (request.getParameter("tipoConversion").equals("p")) {
          resultado = valor*factor;
          cadena1 = "€";
          cadena2 = "PESETAS";
          cadenaResultado = String.format("%.0f",resultado);
        } else {
          resultado = valor / factor;
          cadena1 = "PESETAS";
          cadena2 = "€";
          cadenaResultado = String.format("%.2f",resultado);
        }
    %>
    <h1>Convirtiendo de <% out.print(cadena1); %> a <% out.print(cadena2); %></h1>
    <% out.print(valor); %> <% out.print(cadena1); %> = <% out.print(cadenaResultado); %> <% out.print(cadena2); %>
  </body>
</html>
