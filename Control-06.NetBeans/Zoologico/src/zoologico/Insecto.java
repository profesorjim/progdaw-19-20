/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author tux
 */
public class Insecto extends Animal{
  private boolean vuela;
  
  public Insecto (String especie, String nombre, double peso, int numJaula, boolean vuela) {
    super(especie,nombre,peso,numJaula);
    this.vuela = vuela;
  }
  
  public void MuestrateComoCadena() {
    System.out.println(this.toString());
  }
  
  @Override
  public String toString() {
    String resultado= "";
    
    resultado += "Soy un insecto.\n";
    resultado += super.toString();
    resultado += "Soy un insecto "+(this.vuela?"":"NO ")+"volador";
    
    return resultado;
  }
}
