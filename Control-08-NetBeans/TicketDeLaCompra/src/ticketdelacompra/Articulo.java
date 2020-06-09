/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketdelacompra;

/**
 *
 * @author tux
 */
public class Articulo {
  private String descripcion;
  private int cantidad;
  private double precioPorUnidad;
  private int tipoIVA;
  
  public Articulo (String d, int c, double pvp, int tipo) {
    this.cantidad = c;
    this.descripcion = d;
    this.precioPorUnidad = pvp;
    this.tipoIVA = tipo;
  }
  
  public String lineaTicket () {
    String resultado="";
    resultado = String.format("%8d %-33s %6.2f %7.2f\n",this.cantidad, this.descripcion,this.precioPorUnidad,this.subtotal());
    return resultado;
  }
  
  public double subtotal() {
    return this.cantidad*this.precioPorUnidad;
  }
  
  public double subtotalSinIVA() {
    return (this.subtotal()/(1+this.tipoIVA/100.0));
  }
  
  public int dimeTipoIVA() {
    return this.tipoIVA;
  }
  
}
