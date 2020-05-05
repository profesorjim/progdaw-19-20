/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoficherostexto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author tux
 */
public class AccesoFicherosTexto2 {
  public static void main (String[] args) {
    try {
      BufferedWriter file2 = new BufferedWriter (new FileWriter("/home/tux/patata.txt"));
      
      for (int i=1; i<=10;i++) {
        file2.write(i+"\n");
      }
      
      file2.close();
      
    } catch (IOException e1) {
      System.out.println("No veo el fichero");
    }
  }
}
