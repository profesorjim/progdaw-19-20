/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.eliminaposarray;

/**
 *
 * @author tux
 */
public class Ejercicio4EliminaPosArray {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int[] arrayCualquiera = {1,2,3,4,5,6,7,8,9,10,11,12};
    System.out.println(MostrarArray(arrayCualquiera));
    EliminarElementoArray(arrayCualquiera,8);
    System.out.println(MostrarArray(arrayCualquiera));
  }
  
  public static String MostrarArray (int[] x) {
    String resultado = "";
    // primera linea
    resultado = "┌───────";
    for (int i=0; i<x.length; i++) {
      resultado += "┬────";
    }
    resultado +="┐\n";
    //segunda linea
    resultado += "│Índice ";
    for (int i=0; i<x.length; i++) {
      resultado += "│" + String.format("%3d",i) + " ";
    }
    resultado += "│\n";
    //tercera linea
    resultado += "├───────";
    for (int i=0; i<x.length; i++) {
      resultado += "┼────";
    }
    resultado +="┤\n";
    //cuarta linea
    resultado += "│Valor  ";
    for (int i=0; i<x.length; i++) {
      resultado += "│" + String.format("%3d",x[i]) + " ";
    }
    resultado += "│\n";
    // quinta linea
    resultado += "└───────";
    for (int i=0; i<x.length; i++) {
      resultado += "┴────";
    }
    resultado +="┘\n";
    
    return resultado;
  }
  
  public static void EliminarElementoArray (int[] x, int pos) {
    if (pos>=0 && pos <x.length) {
      for (int i=pos; i<(x.length-1); i++) {
        x[i] = x[i+1];
      }
      x[x.length-1] = -1;
    }
  }
  
  
  
}
