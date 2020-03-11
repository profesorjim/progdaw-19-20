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
public class Empresa implements Cliente {
  private String CIF;
  private String nombre;
  private String telefono;
  
  public Empresa (String CIF, String nombre, String telefono) {
    this.CIF = CIF;
    this.nombre = nombre;
    this.telefono = telefono;
  }
  
  public void compra (Vendedor v, Articulo a) {
    v.anotarVenta(a);
  }
}
