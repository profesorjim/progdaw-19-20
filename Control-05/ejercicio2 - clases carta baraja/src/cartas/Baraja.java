/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartas;
import java.util.ArrayList;
/**
 *
 * @author tux
 */
public class Baraja {
  private ArrayList<Carta> cartasBaraja;
  
  
  public Baraja () {
    this.cartasBaraja = new ArrayList<Carta>();
    
    for (int i=0; i<4; i++) {
      String palo="";
      switch (i) {
        case 0:
            palo = "C";
            break;
        case 1:
            palo = "P";
            break;
        case 2:
            palo = "T";
            break;
        case 3:
            palo = "D";
            break;
        default:
      }
      for (int j=1; j<=13; j++) {
        String valor = "";
        switch (j) {
          case 1:
            valor = "A";
            break;
          case 11:
            valor = "J";
            break;
          case 12:
            valor = "Q";
            break;
          case 13:
            valor = "K";
            break;
          default:
            valor = ""+j;
        }
        
        this.cartasBaraja.add(new Carta(palo,valor));
        
      }
    }
    
    
  }
    
  @Override
  public String toString (){
    String resultado="";
    int contador=0;
    for (Carta c: this.cartasBaraja) {
      if (contador == 13) {
        resultado +="\n";
        contador = 0;
      }
      resultado = resultado + c.toString();
      contador ++;
    }
  
    return resultado;
  }
  
  public void barajar () {
    ArrayList<Carta> auxiliar = new ArrayList<Carta>();
    
    int posAleat;
    
    while (this.cartasBaraja.size()>0) {
      posAleat = (int)(Math.random()*this.cartasBaraja.size());
      auxiliar.add(this.cartasBaraja.remove(posAleat));
    }
    this.cartasBaraja = auxiliar;    
  }
  
  public Carta dameCarta () {
    if (this.cartasBaraja.size() > 0) {
      return (this.cartasBaraja.remove(0));
    }
    return null;
  }
  
  public int tamanio () {
    return this.cartasBaraja.size();
  }
  
  public Carta miraCarta (int pos) {
    if ((this.cartasBaraja.size() > 0) && (pos < this.cartasBaraja.size()) && (pos>=0)){
      return (this.cartasBaraja.get(pos));
    }
    return null;
  }
  
}
