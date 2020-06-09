<%-- 
    Document   : salir.jsp
    Created on : Mar 3, 2020, 11:05:52 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Salir</title>
  </head>
  <body>
    <h1>Ha salido.</h1>
    <%
      session.removeAttribute("usuario");
    %>
    <a href="index.jsp">Ir al ppo</a>
  </body>
</html>
