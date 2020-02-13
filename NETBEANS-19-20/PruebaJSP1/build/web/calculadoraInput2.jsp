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
    <form method="get" action="calcular2.jsp">
      Dato 1: <input type="number" name="dato1"><br>
      Dato 2: <input type="number" name="dato2"><br>
      <!--<input type ="hidden" name="operacion" value="multiplic">-->
      <input type ="hidden" name="operacion">
      Operación: 
      <input type="button"value="Suma" onclick="this.form.operacion.value='suma';submit()">
      <input type="button"value="Resta" onclick="this.form.operacion.value='resta';submit()">
      <input type="button"value="Multiplicación" onclick="this.form.operacion.value='multiplic';submit()">
      <input type="button"value="División" onclick="this.form.operacion.value='division';submit()">
      <br>
      <!--<input type="submit" value="Calcular"> -->
      <input type="submit" value="Sumabis" onclick="this.form.operacion.value='suma'">
      <input type="submit" value="Restabis"onclick="this.form.operacion.value='resta'">
    </form>
    
  </body>
</html>
