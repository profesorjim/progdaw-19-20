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
public class Zoologico {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    AnimalComoCadena animal1 = new Mamifero("mono","pepito",13.5,1);
    AnimalComoCadena animal2 = new Ave("rapaz","aguila",9.0,2,"gris",300);
    AnimalComoCadena animal3 = new Insecto("gusano","manolito",0.05,3,false);
    
    animal1.MuestrateComoCadena();
    System.out.println();
    animal2.MuestrateComoCadena();
    System.out.println();
    animal3.MuestrateComoCadena();
    
  }
  
}
