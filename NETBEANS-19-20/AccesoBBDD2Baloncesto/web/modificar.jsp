<%-- 
    Document   : modificar.jsp
    Created on : Mar 31, 2020, 10:01:34 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Actulización de socio</title>
  </head>
  <body>
    <h1>Actualización de socio</h1>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/clases_baloncesto","root", "");
      Statement s = conexion.createStatement();
      
      ResultSet tuplas = s.executeQuery("Select * from socio where socioID='"+request.getParameter("codigo") +"'");
      tuplas.next();
    %>
    <form method="POST" action="ejecutarModificar.jsp">
      Nº de socio: <input type="text" readonly="readonly" name="socioID" value="<%=tuplas.getString("socioID")%>"><br>
      Nombre: <input type="text" name="nombre" value="<%=tuplas.getString("nombre")%>"><br>
      <input type="submit" value="Grabar">
    </form>
    <%
      conexion.close();
    %>
    
  </body>
</html>
