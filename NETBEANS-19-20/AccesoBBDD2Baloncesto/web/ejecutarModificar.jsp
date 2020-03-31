<%-- 
    Document   : ejecutarModificar.jsp
    Created on : Mar 31, 2020, 10:15:45 AM
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
    <title>Grabar actualizacion</title>
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto","root", "rootmysql");
      Statement s = conexion.createStatement();
      
      request.setCharacterEncoding("UTF-8");
      
      s.execute("Update socio set nombre='"+request.getParameter("nombre")+"' where socioID="+request.getParameter("socioID"));
      

      conexion.close();
      
      response.sendRedirect("index.jsp");

    %>
  </body>
</html>
