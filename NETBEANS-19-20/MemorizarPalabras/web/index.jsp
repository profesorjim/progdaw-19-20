<%-- 
    Document   : index
    Created on : Feb 20, 2020, 9:19:12 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Memorizador de palabras</title>
  </head>
  <body>
    <h1>Pagina "con memoria" ...</h1>
    <%
      request.setCharacterEncoding("UTF-8");
      String dato = request.getParameter("palabra");
      String memoriaPrevia = request.getParameter("memorizado");
      String memoria= "";
      if (dato != null) {
        memoria = memoriaPrevia + "<br>"
                + "" + dato;
      }
    %>
    <form action="index.jsp" method="post">
      Introduzca palabra/frase a memorizar: <input type="text" name="palabra"><br>
      <input type="submit" value="Memoriza">
      <input type="hidden" name="memorizado" value="<% out.print(memoria); %>">
    </form>
    <%
      if (dato != null) {
        out.print (memoria);
      }
    %>
  </body>
</html>
