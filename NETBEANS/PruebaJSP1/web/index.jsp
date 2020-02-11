<%-- 
    Document   : index
    Created on : Feb 11, 2020, 9:00:14 AM
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
        <h1>Hello World!</h1>
        <% 
          int tope = (int)(Math.random()*10 +5);
          for (int i=0 ; i<tope ;  i++) {
            out.println ("Esto es una prueba "+i+"<br>");
          }
        
        %>
        <p>
        <table border="1">
          <tr>
            <td>columna1</td><td>columna2</td><td>columna3</td>
          </tr>
          <tr>
            <td align="right"><% out.print((int)(Math.random()*30)); %></td><td align="right"><% out.print((int)(Math.random()*30)); %></td><td align="right"><% out.print((int)(Math.random()*30)); %></td>
          </tr>
          <tr>
            <td align="right"><% out.print((int)(Math.random()*30)); %></td><td align="right"><% out.print((int)(Math.random()*30)); %></td><td align="right"><% out.print((int)(Math.random()*30)); %></td>
          </tr>
        </table>
    </body>
</html>
