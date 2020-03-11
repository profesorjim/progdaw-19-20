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
public class Usuario extends Persona implements Cliente {
  private String telefono;
  
  public Usuario (String nombre, String correo, String telefono) {
    super(nombre,correo);
    this.telefono = telefono;
  }
  
  public void compra (Vendedor v, Articulo a) {
    v.anotarVenta(a);
  }
  
}
