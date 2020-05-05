/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoficherostexto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author tux
 */
public class AccesoFicherosTexto1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    try {
      BufferedReader file1 = new BufferedReader(new FileReader("/home/tux/patata.txt"));
 
      String miLinea= "";
      
      do {
        miLinea = file1.readLine();
        if (miLinea != null) {
          System.out.println(miLinea);
        }        
      } while (miLinea != null);
      file1.close();
      
    } catch (FileNotFoundException e1) {
      System.out.println("Fichero no existe.");
    } catch (IOException e2) {
      System.out.println("No se puede leer.");
    }
    
    
  }
  
}
