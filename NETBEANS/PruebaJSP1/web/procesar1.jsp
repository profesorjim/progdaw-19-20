<%-- 
    Document   : procesar1.jsp
    Created on : Feb 11, 2020, 11:06:26 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Procesamiento información recibida</h1>
    <% request.setCharacterEncoding("UTF-8"); %>
    La frase introducida anteriormente (tengo buena memoria) es: <% out.print(request.getParameter("frase2")); %><br><p>
    <a href="formulario1.jsp">Volver</a>
  </body>
</html>
