<%-- 
    Document   : controlAcceso.jsp
    Created on : Mar 3, 2020, 10:52:26 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
  </head>
  <body>
    <h1>Datos:</h1>
    <form action="comprobarAcceso.jsp" method="post">
      Usuario: <input type="text" name="user"><br>
      Contraseña: <input type="password" name="contrasenia"><br>
      <input type="submit" value="Login">
    </form>
  </body>
</html>
