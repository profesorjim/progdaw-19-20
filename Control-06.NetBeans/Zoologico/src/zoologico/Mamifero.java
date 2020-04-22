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
public class Mamifero extends Animal {
  
  public Mamifero (String especie, String nombre, double peso, int numJaula) {
    super(especie,nombre,peso,numJaula);
  }
  
  public void MuestrateComoCadena() {
    System.out.println(this.toString());
  }
  
  @Override
  public String toString() {
    String resultado= "";
    
    resultado += "Soy un mamífero.\n";
    resultado += super.toString();
    
    return resultado;
  }
}
