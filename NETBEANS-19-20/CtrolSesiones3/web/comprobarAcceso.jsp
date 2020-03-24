<%-- 
    Document   : comprobarAcceso.jsp
    Created on : Mar 3, 2020, 10:56:55 AM
    Author     : tux
--%>

<%@page import="javax.xml.bind.DatatypeConverter"%>
<%@page import="java.security.MessageDigest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Comprobando</title>
  </head>
  <body>
    
    <%
      request.setCharacterEncoding("UTF-8");
      String usuario = request.getParameter("user");
      String contrasenia = request.getParameter("contrasenia");

      if (usuario != null) {
        MessageDigest md1 = MessageDigest.getInstance("MD5");
        MessageDigest md2 = MessageDigest.getInstance("MD5");

        md1.update(usuario.getBytes());
        md2.update(contrasenia.getBytes());
        usuario = DatatypeConverter.printHexBinary(md1.digest());
        contrasenia = DatatypeConverter.printHexBinary(md2.digest());
      }
      
      //if ((usuario != null) && (contrasenia != null) && usuario.equals(contrasenia))
      if ((usuario != null) && (contrasenia != null) && MessageDigest.isEqual(usuario.getBytes(),contrasenia.getBytes())) {
        session.setAttribute("usuario",usuario);
        %>
        <h1>Acceso autorizado</h1>

        <%
      } else {
        %>
        <h1>Acceso denegado</h1>
        <%
      }
    %>
    <a href="index.jsp">Ir al ppo</a>
  </body>
</html>
