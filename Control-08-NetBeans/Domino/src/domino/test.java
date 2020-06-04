/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

/**
 *
 * @author tux
 */
public class test {
  public static void main (String[] args) {
    Monton miMonton1 = new Monton();
    Monton miMonton2 = new Monton();
    
    miMonton1.inicializaMonton();
    System.out.println("Montón 1 recién creado: ");
    System.out.println(miMonton1);
    for (int i=0; i<10; i++) {
      miMonton2.aniadeFicha(miMonton1.sacaFichaAlAzar());
    }
    
    System.out.println("Montón 1 después de sacar 10 fichas al azar: ");
    System.out.println(miMonton1);
    System.out.println("Montón 2 con las fichas que faltan en el montón 1: ");
    System.out.println(miMonton2);
  }
}
