/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

/**
 *
 * @author tux
 */
public class Ficha {
  private int valorIzq;
  private int valorDer;
  
  public Ficha (int v1, int v2) {
    if (v1<0) {
      v1 = 0;
    } else if (v1>6) {
      v1 = 6;
    }
    if (v2<0) {
      v2 = 0;
    } else if (v2>6) {
      v2 = 6;
    }
    this.valorIzq = v1;
    this.valorDer = v2;
  }
  
  public int valorIzquierda (){
    return this.valorIzq;
  }
  
  public int valorDerecha () {
    return this.valorDer;
  }
  
  public void cambiarOrientacion () {
    int aux;
    aux = this.valorDer;
    this.valorDer = this.valorIzq;
    this.valorIzq = aux;
  }
  
  @Override
  public String toString() {
    String resultado;
    resultado = "["+(this.valorIzq==0?" ":this.valorIzq)+"|"+(this.valorDer==0?" ":this.valorDer)+"]";
    return resultado;
  }
  
  public String toHTML() {
    String resultado;
    resultado ="<TABLE BORDER=1><tr>";
    resultado +="<td><img src=\"fichas\\"+this.valorIzq+".png\" witdh=90 height=90></td>";
    resultado +="<td><img src=\"fichas\\"+this.valorDer+".png\" witdh=90 height=90></td>";
    resultado += "</tr></TABLE>";
    return resultado;  
  }
  
  
}
