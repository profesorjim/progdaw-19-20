/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.eleccionaleatarray;

/**
 *
 * @author tux
 */
public class Ejercicio3EleccionAleatArray {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int[] notas = {1,2,3,4,5,6,7,8,9,10};
    
    for (int i=0; i<6; i++) {
      System.out.println("Nota asignatura "+(i+1)+": "+aleatorio(notas));
    }
    
    
  }
  
  public static int aleatorio (int[] valores) {
    int elegido = (int)(Math.random()*valores.length);
    return (valores[elegido]);
  }
  
}
