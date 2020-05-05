<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%!  
public static Statement conekta() {
  Statement s=null;
  try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/clases_prueba","root", "");
      s = conexion.createStatement();
  } catch (ClassNotFoundException e) {
      System.out.println();
  } catch (SQLException e2) {
      System.out.println();
  }
  return s;
}
%>