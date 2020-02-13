<%-- 
    Document   : calcular
    Created on : Feb 12, 2020, 9:00:06 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultado</title>
  </head>
  <body>
    <h1>Resultado</h1>
    <% request.setCharacterEncoding("UTF-8"); %>
    <% 
      int valor1;
      if (request.getParameter("dato1").equals(""))
      {
        valor1 = 0;
      } else {
        valor1= Integer.parseInt(request.getParameter("dato1"));
      }
      int valor2 = request.getParameter("dato2").equals("") ? 0: Integer.parseInt(request.getParameter("dato2"));
      char op;
      int resultado=0;
      boolean divisionPorCero=false;
      String operacion = request.getParameter("operacion");
      if (operacion.equals("suma")) {
        op ='+';
        resultado = valor1 + valor2;
      } else if (operacion.equals("resta")) {
        op ='-';
        resultado = valor1 - valor2;
      } else if (operacion.equals("multiplic")) {
        op ='*';
        resultado = valor1 * valor2;
      } else if (operacion.equals("division")) {
        op = '/';
        if (valor2 != 0) {
          resultado = valor1/valor2;
        } else {
          divisionPorCero= true;
        }          
        
      } else {
        resultado=0;
        op='?';
      }
      if (!divisionPorCero) {
        out.print(valor1 +" "+op+" "+valor2+" = "+resultado);      
      } else {
        //out.print("Ha indicado una división entre 0 - no se puede realizar");      
        %>
        Ha indicado una division entre 0 - no se puede realizar.
        <%
      }
      
    %>
    <br>
    <a href="calculadoraInput2.jsp">Volver</a>
 
    
  </body>
</html>
