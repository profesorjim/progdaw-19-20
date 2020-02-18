<%-- 
    Document   : calendario.jsp
    Created on : Feb 18, 2020, 9:35:04 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  request.setCharacterEncoding("UTF-8");
  int dia = Integer.parseInt(request.getParameter("dia"));
  int mes = Integer.parseInt(request.getParameter("mes"));
  int anio = Integer.parseInt(request.getParameter("anio"));
  
  //dia = 1;
  
  int coeficSiglo;
  int coeficAnio;
  int coeficBisiesto;
  int coeficMes;
  int coeficDia;
  int resultado;
  
  
  // coeficiente siglo
    if (anio < 1800) {
      coeficSiglo = 5;
    } else if (anio < 1900) {
      coeficSiglo = 3;
    } else if (anio < 2000) {
      coeficSiglo = 1;
    } else if (anio < 2100) {
      coeficSiglo = 0;
    } else if (anio < 2200) {
      coeficSiglo = -2;
    } else {
      coeficSiglo = -4;
    }
    
    //coeficiente año
    coeficAnio = anio % 100;
    coeficAnio += coeficAnio/4;
    
    //coeficiente bisiesto
    if ((((anio % 4 == 0) && (anio % 100 !=0)) || (anio % 400 == 0)) && (mes>=1) && (mes<=2)){
      coeficBisiesto = -1;
    } else {
      coeficBisiesto = 0;
    }

    
    
    coeficMes=-1000;
    //coeficiente mes
    switch (mes) {
      case 1:
      case 10:
        coeficMes = 6;
        break;
      case 2:
      case 3:
      case 11:
        coeficMes = 2;
        break;
      case 4:
      case 7:
        coeficMes = 5;
        break;
      case 5:
        coeficMes = 0;
        break;
      case 6:
        coeficMes = 3;
        break;
      case 8:
        coeficMes = 1;
        break;
      case 9:
      case 12:
        coeficMes = 4;
        break;
      default:
    }
    
    // valor coeficiente día
    coeficDia = dia;
    
    // sumamos y hacemos resto div. 7
    
    resultado = coeficSiglo + coeficAnio + coeficBisiesto + coeficMes + coeficDia;
    resultado %= 7;
    
    resultado = (resultado + 7 -1) %7;
    
    
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
    <title>Calendario del mes <% out.print(mes);%></title>
  </head>
  <body>
    <h1>Calendario del mes <% out.print(mes);%></h1>
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
        int dia0 = 1-resultado;
        int posSemana=0;
        out.print("<tr>");
        for (int i = dia0; i<=totalDiasMes; i++) {
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
