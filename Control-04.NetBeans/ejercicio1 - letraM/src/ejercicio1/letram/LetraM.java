/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.letram;

/**
 *
 * @author tux
 */
public class LetraM {
  private final String letra;
  
  public LetraM (int x) {
    String resultado = "";
    if (x<3) {
      x = 3;
    } else if (x>12) {
      x = 12;
    }
    int hueco = (x-1)*2-1-2;
    for (int i=0; i<x; i++){
      resultado +="*";
      if (i>0 && i<(x-1)) {
        for (int j=0; j<i-1; j++) {
          resultado += " ";
        }
        resultado += "*";
      }
      for (int j=0; j<hueco; j++) {
        resultado += " ";
      }
      if (i>0 && i<(x-1)) {
        if (hueco > 0) {
          resultado += "*";
        } else {
          hueco = (x-1)*2-1;
        }
        for (int j=0; j<i-1; j++) {
          resultado += " ";
        }        
      }
      resultado += "*\n";
      hueco = hueco -2;
    }
    this.letra = resultado;
     
  }
  
  public String toString() {
    return this.letra;
    
  }
}
