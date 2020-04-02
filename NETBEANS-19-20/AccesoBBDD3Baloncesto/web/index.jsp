<%-- 
    Document   : index.jsp
    Created on : Mar 25, 2020, 9:42:02 AM
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
    <title>Selector de socios</title>
  </head>
  <body>
    <h1>Selector de socios</h1>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto","root", "rootmysql");
      Statement s = conexion.createStatement();

      ResultSet tuplas = s.executeQuery("Select * from socio");
    %>  
    <form action="loquesea.jsp" method="POST">
      Elija Socio: 
      <select name="codigo">
        <%
          while (tuplas.next()) {
            out.println("<option value=\""+tuplas.getString("socioID")+"\">"+tuplas.getString("socioID")+"-"+tuplas.getString("nombre")+"</option>");
          }
        %>
      </select><br>
      <input type="submit" value="Enviar datos">        
    </form>
    <%  
      conexion.close();


    %>
  </body>
</html>
