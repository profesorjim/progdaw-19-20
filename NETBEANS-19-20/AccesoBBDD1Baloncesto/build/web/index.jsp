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
    <title>Listado de socios</title>
  </head>
  <body>
    <h1>Listado de socios</h1>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto","root", "rootmysql");
      Statement s = conexion.createStatement();

      ResultSet tuplas = s.executeQuery("Select * from socio");
      
      out.println("<table border=1>");
      out.println("<tr><td>Nº de socio</td><td>Nombre del socio</td></tr>");
      while (tuplas.next()) {
        out.print("<tr>");
        out.print("<td align=center>"+tuplas.getString("socioID") + "</td><td>" + tuplas.getString("nombre") + "</td>");
        out.println("</tr>"); 

      }
      out.println("</table>");
      
      conexion.close();


    %>
  </body>
</html>
