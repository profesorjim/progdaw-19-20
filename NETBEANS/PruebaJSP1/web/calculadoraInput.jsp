<%-- 
    Document   : calculadoraInput
    Created on : Feb 12, 2020, 8:50:59 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calculadora</title>
  </head>
  <body>
    <h1>Indique datos y seleccione operación:</h1>
    <form method="get" action="calcular.jsp">
      Dato 1: <input type="number" name="dato1"><br>
      Dato 2: <input type="number" name="dato2"><br>
      Operación: 
        <select name="operacion">
          <option value="suma">Suma</option>
          <option value="resta">Resta</option>
          <option value="multiplic" selected>Multiplicación</option>
          <option value="division">División</option>
        <select>
        <br>
        <input type="submit" value="Calcular">          
    </form>
    
  </body>
</html>
