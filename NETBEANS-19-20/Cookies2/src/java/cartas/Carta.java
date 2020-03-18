/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartas;

/**
 *
 * @author tux
 */
public class Carta {
  private String palo;
  private String valor;
  
  public Carta (String palo, String valor) {
    this.palo = palo;
    this.valor = valor;
  }
  
  @Override
  public String toString() {
    return "["+this.palo+","+this.valor+"]";
  }
  
  public String dameValor() {
    return this.valor;
  }
  
  public String damePalo() {
    return this.palo;
  }
  
  public String dameNombreFichImg() {
    return "Poker-sm-"+this.palo+this.valor+".png";
  }
}
