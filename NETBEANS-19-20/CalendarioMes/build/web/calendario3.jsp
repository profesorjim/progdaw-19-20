<%-- 
    Document   : calendario.jsp
    Created on : Feb 18, 2020, 9:35:04 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Auxiliares.Varias" %>
<!DOCTYPE html>



<%
  request.setCharacterEncoding("UTF-8");
  int dia = Integer.parseInt(request.getParameter("dia"));
  int mes = Integer.parseInt(request.getParameter("mes"));
  int anio = Integer.parseInt(request.getParameter("anio"));
     
  int diaSemana = Auxiliares.Varias.DiaDeLaSemana(1,mes,anio);
  
    int totalDiasMes;
    boolean esBisiesto = (((anio % 4 == 0) && (anio % 100 !=0)) || (anio % 400 == 0))?true:false;
    
    
    switch (mes) {
      case 4:
      case 6:
      case 9:
      case 11:
        totalDiasMes=30;
        break;
      case 2:
        if (esBisiesto)
          totalDiasMes=29;
        else
          totalDiasMes=28;
        break;
      default:
        totalDiasMes=31;
    }

  
%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calendario Mejorado del mes <% out.print(mes);%></title>
  </head>
  <body>
    <h1>Calendario mejorado del mes <% out.print(mes);%></h1>
    <table border="1>">
      <tr>
        <td>Lunes</td>
        <td>Martes</td>
        <td>Miércoles</td>
        <td>Jueves</td>
        <td>Viernes</td>
        <td>Sábado</td>
        <td>Domingo</td>
      </tr>
      <%
        
        int posSemana=diaSemana;
        out.print("<tr>");
        if (diaSemana > 0) {
          out.print("<td colspan="+diaSemana+"></td>");      
        }
        
        for (int i = 1; i<=totalDiasMes; i++) {
          if(posSemana == 7) {
            out.println("</tr>");
            out.print("<tr>");
            posSemana = 0;
          }
          out.print("<td>");
          if (i>=1) {
            out.print(i);
          }
          out.print("</td>");
          posSemana++;
        }
        out.print("<tr>");
        
      %>
      
    </table>
  </body>
</html>

