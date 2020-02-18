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
     
  int diaSemana = DiaDeLaSemana(dia,mes,anio);
  
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

<%!
  // BATERÍA DE FUNCIONES AUXILIARES
  
  public static int CoeficienteSiglo(int anio) {
    // coeficiente siglo
    int coeficSiglo;

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
    return coeficSiglo;
  }

  public static int CoeficienteAnio (int anio) {
  //coeficiente año
    int coeficAnio;
    coeficAnio = anio % 100;
    coeficAnio += coeficAnio/4;
    return coeficAnio;
  }
  
  public static int CoeficienteBisiesto (int anio, int mes) {
    //coeficiente bisiesto  
    int coeficBisiesto;
    if ((((anio % 4 == 0) && (anio % 100 !=0)) || (anio % 400 == 0)) && (mes>=1) && (mes<=2)){
      coeficBisiesto = -1;
    } else {
      coeficBisiesto = 0;
    }
    return coeficBisiesto;
  }

  public static int CoeficienteMes (int mes) {
    int coeficMes=-1000;
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
    return coeficMes;
  }

  public static int DiaDeLaSemana (int dia, int mes, int anio) {
    // 0: domingo 1: lunes 2: martes ... 
    int coeficSiglo;
    int coeficAnio;
    int coeficBisiesto;
    int coeficMes;
    int coeficDia;
    int coeficGlobal;

      
    coeficSiglo = CoeficienteSiglo(anio);    
    coeficAnio = CoeficienteAnio(anio);
    coeficBisiesto = CoeficienteBisiesto(anio,mes);
    coeficMes = CoeficienteMes(mes);
    // valor coeficiente día
    coeficDia = dia;
    // sumamos y hacemos resto div. 7   
    
    coeficGlobal = coeficSiglo + coeficAnio + coeficBisiesto + coeficMes + coeficDia;
    coeficGlobal %= 7;
    coeficGlobal = (coeficGlobal + 7 -1) %7;
    return coeficGlobal;
  }

%>