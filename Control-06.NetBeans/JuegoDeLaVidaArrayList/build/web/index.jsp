<%-- 
    Document   : index
    Created on : Apr 21, 2020, 9:09:24 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Juego de la Vida</title>
  </head>
  <body>
    <h1>Juego de la Vida</h1>
    
    <form action="index.jsp" method="POST">
      <input type="submit" value="Poner en blanco">
    </form>
    
    <form action="index.jsp" method="POST">
      <input type="submit" value="Enviar">
      <table border="0" cellpadding="0" cellspacing="0">
      <%
        final int tamanio = 21;
        
        // recoger estado enviado
        
        ArrayList<ArrayList<Integer>> estadoPrevio = new ArrayList<ArrayList<Integer>>();
        
        for (int i=0; i<tamanio; i++) {
          estadoPrevio.add(new ArrayList<Integer>()); // añade el arraylist de esta fila
          for (int j=0; j<tamanio; j++) {
            if (request.getParameter("casilla"+(i*tamanio+j))==null) {
              estadoPrevio.get(i).add(0);
            } else {
              estadoPrevio.get(i).add(1);
            }
          }
        }
        
              
        // calcular siguiente estado
        // esta funcion  va a calcular (modificar) sobre estadoPrevio el estadoActual
        
        EvolucionarSiguienteEstado(estadoPrevio);
        
        
        
        for (int i=0; i<tamanio; i++) {
          out.println("<tr>");
          for (int j=0; j<tamanio; j++){
            %>
            <td><input type="checkbox" name="casilla<%=i*tamanio+j%>" value="1"<%=estadoPrevio.get(i).get(j)==1?" checked":""%>></td>
            <%
          }
          out.println("</tr>");
        }
      
      %>
      </table>
    </form>
    
  </body>
</html>
<%!
  public static void EvolucionarSiguienteEstado (ArrayList<ArrayList<Integer>> estado) {
    int tama = estado.size();    
    ArrayList<ArrayList<Integer>> resultado = new ArrayList<ArrayList<Integer>>();
        
    
    for (int i=0; i<tama; i++) {
      resultado.add(new ArrayList<Integer>());
      for (int j=0; j<tama; j++) {
        int celulasVivas=0;
        for (int k=i-1; k<=i+1; k++) {
          for (int l=j-1;l<=j+1; l++) {
            if ((k>=0) && (k<tama) && (l>=0) && (l<tama) && !((i==k)&&(j==l)) ) {
              celulasVivas += estado.get(k).get(l);
            }
          }
        }
        resultado.get(i).add(0);
        if ((estado.get(i).get(j)==0) && (celulasVivas==3)) {
          resultado.get(i).set(j,1);
        }
        if (estado.get(i).get(j)==1 && celulasVivas>=2 && celulasVivas<=3) {
          resultado.get(i).set(j,1);
        }
      }
    }
    for (int i=0; i<tama; i++) {
      for (int j=0; j<tama; j++) {
        estado.get(i).set(j,resultado.get(i).get(j));
      }
    }
    
  }
%>
