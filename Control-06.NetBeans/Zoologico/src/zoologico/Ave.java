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
public class Ave extends Animal {
  private String colorPlumaje;
  private double alturaMaxVuelo;
  
  public Ave (String especie, String nombre, double peso, int numJaula, String colorPlumas, double altura) {
    super(especie,nombre,peso,numJaula);
    this.colorPlumaje = colorPlumas;
    this.alturaMaxVuelo = altura;
  }
  
  public void MuestrateComoCadena() {
    System.out.println(this.toString());
  }
  
  @Override
  public String toString() {
    String resultado= "";
    
    resultado += "Soy un ave.\n";
    resultado += super.toString();
    resultado += "Mi color de plumas es: "+this.colorPlumaje+"\n";
    resultado += "Mi altura máxima de vuelo es: "+this.alturaMaxVuelo+"\n";
    
    return resultado;
  }
}
