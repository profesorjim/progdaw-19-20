<%-- 
    Document   : index
    Created on : Mar 10, 2020, 9:45:06 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ADIVINA EL NUMERO</title>
  </head>
  <%
    request.setCharacterEncoding("UTF-8");
    String propuesta = request.getParameter("propuesta");
    int elegido;
    int rangoInf;
    int rangoSup;
    boolean adivinado = false;
    if (propuesta ==  null) {
      elegido = (int)(Math.random()*201);
      rangoInf=0;
      rangoSup=200;
    } else {
      if (propuesta.equals("")) {
        propuesta = "0";
      }
      int propuestaEntero = Integer.parseInt(propuesta);
      elegido = Integer.parseInt(request.getParameter("elegido"));
      rangoInf = Integer.parseInt(request.getParameter("rangoInf"));
      rangoSup = Integer.parseInt(request.getParameter("rangoSup"));
      if (elegido == propuestaEntero) {
        // el número ha sido adivinado
        rangoInf = elegido;
        rangoSup = elegido;
        adivinado = true;
      } else if ((propuestaEntero>rangoInf) && (propuestaEntero < elegido)) {
        rangoInf = propuestaEntero;
      } else if ((propuestaEntero<rangoSup) && (propuestaEntero > elegido)) {
        rangoSup = propuestaEntero;
      }
      

    }
  %>
  <body>
    <h1>ADIVINA EL NUMERO</h1>
    <table border="1">
      <tr><td>El numero es mayor o igual que:</td><td>Indique el número</td><td>El número es menor o igual que:</td></tr>
      <tr>
        <td><center><%out.print(rangoInf);%></center></td>
         <td>   
           <% if (!adivinado) { %>
             
            <form method="post" action="index.jsp">
              <input type="number" name="propuesta" min="<% out.print(rangoInf); %>" max="<% out.print(rangoSup); %>">
              <input type="hidden" name="elegido" value="<% out.print(elegido); %>">
              <input type="hidden" name="rangoInf" value="<% out.print(rangoInf); %>">
              <input type="hidden" name="rangoSup" value="<% out.print(rangoSup); %>">
              <input type="submit" value="Enviar">
            </form>
           <% } else { %>
            HAS ADIVINADO EL NUMERO:<% out.print(elegido); %>    
           
           <% } %>
         </td>
         <td><center><%out.print(rangoSup);%></center></td>
         </td>
      </tr>
    </table>
  </body>
</html>
