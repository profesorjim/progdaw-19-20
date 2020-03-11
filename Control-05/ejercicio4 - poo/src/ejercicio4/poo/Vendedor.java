/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.poo;
import java.util.ArrayList;
/**
 *
 * @author tux
 */
public class Vendedor extends Persona {
  private String cargo;
  private ArrayList<Articulo> listaArticulos;
  
  public Vendedor (String nombre, String correo, String cargo) {
    super(nombre,correo);
    this.cargo = cargo;
    this.listaArticulos = new ArrayList<Articulo>();
  }
  
  public void anotarVenta (Articulo a) {
    boolean encontrado = false;
    for (int i=0; i<this.listaArticulos.size() && !encontrado; i++) {
      if (this.listaArticulos.get(i).getNombre().equals(a.getNombre())) {
        int cantidadPrevia = this.listaArticulos.get(i).getCantidad();
        int incremento = a.getCantidad();
        this.listaArticulos.get(i).setCantidad(cantidadPrevia+incremento);
        encontrado = true;
      } 
    }
    if (!encontrado) {
      this.listaArticulos.add(a);
    }   
    
  }
  
  @Override
  public String toString() {
    String resultado = super.toString();
    resultado += "\nCargo:"+this.cargo+"\n";
    resultado +="Ventas realizadas\n=================\n";
    for (Articulo a: this.listaArticulos) {
      resultado += a.getNombre()+", "+a.getCantidad()+" unid.\n";
    }
            
    return resultado;
  }
  
}
