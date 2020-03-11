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
public abstract class Persona {
  private String nombre;
  private String email;
  
  public Persona (String nombre, String correo) {
    this.nombre = nombre;
    this.email = correo;
  }
  
  @Override
  public String toString() {
    String resultado;
    resultado = "Nombre:"+this.nombre+"\n";
    resultado += "Correo electrónico:"+this.email;
    return resultado;
  }
  
}
