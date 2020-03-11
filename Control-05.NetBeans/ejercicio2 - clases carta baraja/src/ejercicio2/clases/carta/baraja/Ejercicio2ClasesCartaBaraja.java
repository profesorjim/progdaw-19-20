/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.clases.carta.baraja;
import cartas.Baraja;
/**
 *
 * @author tux
 */
public class Ejercicio2ClasesCartaBaraja {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Baraja b = new Baraja();
    
    System.out.println("Baraja nueva:");
    System.out.println(b);
    b.barajar();
    System.out.println("Tras haber barajado:");
    System.out.println(b);
    
    
  }
  
}
