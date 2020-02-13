<%-- 
    Document   : index
    Created on : Feb 13, 2020, 9:48:04 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Conversor € <---> ptas</title>
  </head>
  <body>
    <h1>Conversor € <---> PESETAS</h1>
    <p>
    Indique la cantidad que desea convertir: 
    <form method="post" action="conversor.jsp">
      <input type="number" size="5" step="0.01" name="cantidad">
      <input type="hidden" name="tipoConversion" value="">
      <input type="submit" value="€ -> PTAS" onclick="this.form.tipoConversion.value='p'">
      <input type="submit" value="PTAS -> €" onclick="this.form.tipoConversion.value='e'">
    </form>
    </p>
  </body>
</html>
