/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.poo;

/**
 *
 * @author tux
 */
public class Articulo {
  private String nombre;
  private int cantidad;
  
  public Articulo (String nombre, int cantidad) {
    this.nombre = nombre;
    this.cantidad = cantidad;
  }
  
  public String getNombre () {
    return this.nombre;
  }
  
  public int getCantidad() {
    return this.cantidad;
  }
  
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
          
  
}
