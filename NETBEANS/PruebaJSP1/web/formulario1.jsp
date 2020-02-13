<%-- 
    Document   : formulario1.jsp
    Created on : Feb 11, 2020, 11:02:07 AM
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
    <h1>Formulario de prueba</h1>
    <form method="post" action="procesar1.jsp">
      Introduzca una frase: <input type="text" name="frase1"><br>
      <input type="submit" value="Procesar datos ...">
    </form>
  </body>
</html>
