/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionariodesinonimos;

/**
 *
 * @author tux
 */
public class PruebaDiccionario {
 
  public static void main(String[] args) {
    DiccionarioSinonimos dicci1;
    dicci1 = new DiccionarioSinonimos("Primer diccionario");
    dicci1.aniadeSinonimo("grande", "enorme");
    dicci1.aniadeSinonimo("grande", "inmenso");
    dicci1.aniadeSinonimo("pequeño", "diminuto");
    System.out.print(dicci1);
    System.out.println("Sinonimos de grande: " + dicci1.dameSinonimos("grande"));
    if (dicci1.esSinonimo("grande", "enorme")) {
      System.out.println("'grande' y 'enorme' son sinonimos.");
    } else {
      System.out.println("'grande' y 'enorme' NO son sinonimos.");
    }
  }
}