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
public class Solitario {
  public static void main (String[] args) {
    Monton M = new Monton();
    Monton A = new Monton();
    Tablero T = new Tablero();
    Ficha f;
    
    M.inicializaMonton();
    
    do {
      f = M.sacaFichaAlAzar();
      if (f!= null) {
        boolean colocada;
        colocada =T.aniadeFicha(f);
        if (!colocada) {
          A.aniadeFicha(f);
        } else {
          M.juntaMontones(A);
        }
      }
    } while (f!= null);
    
   System.out.println("Solitario generado:");
   System.out.println(T);
   System.out.println("Fichas que no han podido colocarse:");
   System.out.println(A); 
   System.out.println("Fichas que quedan boca abajo:");
   System.out.println(M); 
            
  }
}
