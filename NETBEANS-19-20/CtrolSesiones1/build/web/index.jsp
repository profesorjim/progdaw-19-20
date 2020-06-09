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
      String resetear = request.getParameter("reset");
      if ((resetear!= null) && resetear.equals("reset")){
        session.removeAttribute("memorizado");
        dato=null;        
      }        
      String memoria= "";
      String memoriaPrevia = null;
      String salto="";
      if (dato != null) {
        memoriaPrevia = (String)session.getAttribute("memorizado");
        if (memoriaPrevia == null) {
          memoriaPrevia = "";          
        } else {
          salto = "<br>"; 
        }
        memoria = memoriaPrevia + salto + dato;
        session.setAttribute("memorizado", memoria);
      }
    %>
    <form action="index.jsp" method="post">
      Introduzca palabra/frase a memorizar: <input type="text" name="palabra"><br>
      <input type="hidden" name="reset" value="">
      <input type="submit" value="Memoriza"> <input type="reset" value="Reset" onclick="this.form.reset.value='reset'; submit()">
    </form>
    <%
      if (dato != null) {
        out.print (memoria);
      }
    %>
  </body>
</html>
