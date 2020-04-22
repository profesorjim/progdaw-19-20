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
public abstract class Animal implements AnimalComoCadena {
  private String especie;
  private String nombre;
  private double peso;
  private int numeroJaula;
  
  public Animal (String especie, String nombre, double peso, int numJaula) {
    this.especie = especie;
    this.nombre = nombre;
    this.peso = peso;
    this.numeroJaula = numJaula;
  }
  
  @Override
  public String toString() {
    String resultado = "";
    
    resultado += "Me llamo: " + this.nombre +"\n";
    resultado += "Soy de la especie: "+this.especie+"\n";
    resultado += "Peso: "+this.peso+"\n";
    resultado += "Estoy en la jaula: "+this.numeroJaula+"\n";
    
    return resultado;
  }
  
}
