/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.eliminaposarray;

/**
 *
 * @author tux
 */
public class Ejercicio4EliminaPosArrayPoo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int[] arrayCualquiera = {1,2,3,4,5,6,7,8,9,10,11,12};
    VectorDeDoce miVector = new VectorDeDoce(arrayCualquiera);
    
    System.out.println(miVector);
    miVector.EliminarElementoArray(8);
    System.out.println(miVector);
  }
  
  
  
  
  
}
