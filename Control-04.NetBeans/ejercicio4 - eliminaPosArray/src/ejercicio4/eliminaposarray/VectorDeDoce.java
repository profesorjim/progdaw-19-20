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
public class VectorDeDoce {
  private int[] vectorDeEnteros;
  
  public VectorDeDoce (int[] vector) {
    this.vectorDeEnteros = vector;
  }
  
  @Override
  public String toString () {
    int[] x = this.vectorDeEnteros;
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
  
  public void EliminarElementoArray (int pos) {
    int[] x = this.vectorDeEnteros;
    if (pos>=0 && pos <x.length) {
      for (int i=pos; i<(x.length-1); i++) {
        x[i] = x[i+1];
      }
      x[x.length-1] = -1;
    }
  }
  
}
