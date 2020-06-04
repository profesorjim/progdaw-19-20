/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;
import java.util.ArrayList;
/**
 *
 * @author tux
 */
public class Tablero implements ConjuntoDeFichas {
  private ArrayList<Ficha> tableroDeJuego;
  
  public Tablero () {
    this.tableroDeJuego = new ArrayList<Ficha>();
  }
  
  public boolean aniadeFicha (Ficha f) {
    if (this.tableroDeJuego.size()==0) {
      this.tableroDeJuego.add(f);
      return true;
    }
    
    int valorIzqTablero;
    int valorDerTablero;
    
    valorIzqTablero = this.tableroDeJuego.get(0).valorIzquierda();
    valorDerTablero = this.tableroDeJuego.get(this.tableroDeJuego.size()-1).valorDerecha();
    
    boolean porLaIzq=false;
    boolean porLaDer=false;
    
    if ((valorIzqTablero == f.valorIzquierda()) || valorIzqTablero == f.valorDerecha()) {
      porLaIzq = true;
    }
    if ((valorDerTablero == f.valorIzquierda()) || valorDerTablero == f.valorDerecha()) {
      porLaDer = true;
    }
    
    if (porLaIzq && porLaDer) {
      int eleccion = (int)(Math.random()*2);
      if (eleccion ==0) {
        if (f.valorDerecha()!=valorIzqTablero) {
          f.cambiarOrientacion();
        }
        this.tableroDeJuego.add(0,f);
      } else {
        if (f.valorIzquierda()!=valorDerTablero) {
          f.cambiarOrientacion();
        }
        this.tableroDeJuego.add(f);
      }
      return true;
    }
    
    if (porLaIzq) {
      if (f.valorDerecha()!=valorIzqTablero) {
          f.cambiarOrientacion();
      }
      this.tableroDeJuego.add(0,f);
      return true;
    }
    
    
    if (porLaDer) {
      if (f.valorIzquierda()!=valorDerTablero) {
          f.cambiarOrientacion();
      }
      this.tableroDeJuego.add(f);
      return true;
    }
    
    return false;    
    
  }
          
  @Override
  public String toString() {
    String resultado = "";
    for (int i=0; i<this.tableroDeJuego.size(); i++) {
      resultado += this.tableroDeJuego.get(i).toString();
      if ((i+1)%10 ==0) {
        resultado +="\n";
      }
    }    
    return resultado;
  }
  
  public String toHTML() {
    String resultado ="";
    resultado = "<TABLE BORDER=0><tr>";
    for (int i=0; i<this.tableroDeJuego.size(); i++) {
      resultado += "<td>";
      resultado += this.tableroDeJuego.get(i).toHTML();
      resultado += "</td>";
      if ((i+1)%10 ==0) {
        resultado +="</tr>\n<tr>";
      }
    }
    resultado += "</tr></TABLE>";
    return resultado;
  }
  
  
}
