<%-- 
    Document   : index
    Created on : Mar 11, 2020, 8:32:50 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cartas.Baraja"%>
        
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Baraja de Poker</title>
  </head>
  <body>
    <h1>Baraja de Poker</h1>
    <table border="1">
    <tr>
    <%
      Baraja b = new Baraja();
      
      for (int i=0; i<b.tamanio(); i++) {
        if ((i>0) && (i%13 == 0)) {
          //out.print("</tr>\n<tr>");
        %>
          <tr>
          </tr>
        <%
        }
        %>
        <td><img src="cards/<%out.print(b.miraCarta(i).dameNombreFichImg());%>"></td>
        <%
      }


    %>
    </tr>
    </table>
    <br><p><br>
    <h1>Barajamos ...</h1>
    <table border="1">
    <tr>
    <%
      b.barajar();
      
      for (int i=0; i<b.tamanio(); i++) {
        if ((i>0) && (i%13 == 0)) {
          //out.print("</tr>\n<tr>");
        %>
          <tr>
          </tr>
        <%
        }
        %>
        <td><img src="cards/<%out.print(b.miraCarta(i).dameNombreFichImg());%>"></td>
        <%
      }


    %>
    
    
  </body>
</html>
