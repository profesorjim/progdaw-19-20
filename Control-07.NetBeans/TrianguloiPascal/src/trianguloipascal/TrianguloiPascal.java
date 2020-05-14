/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloipascal;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class TrianguloiPascal {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int tamanio;
    int [][] triangulo;
    
    int valor;
    
    Scanner s = new Scanner (System.in);
    
    System.out.print("Indique el nº de filas del triángulo: ");
    tamanio = s.nextInt();
    s.nextLine();
    
    triangulo =  new int [tamanio][tamanio];
    
    triangulo[0][0] = 1;
    
    for (int i=1; i<tamanio; i++) {
      for (int j=0; j<=i; j++) {
        valor = 0;
        if (j!=i) {
          valor += triangulo[i-1][j];
        }
        if (j!=0) {
          valor += triangulo[i-1][j-1];
        }
        triangulo[i][j] = valor;
      }
    }
    
    for (int i=0; i<tamanio; i++) {
      for (int j=0; j<=i; j++) {
        System.out.printf("%3d ",triangulo[i][j]);
      }
      System.out.println();
    }    
    
    System.out.println();
    
    for (int i=0; i<tamanio; i++) {
      for (int j=1; j<=tamanio-1-i; j++) {
        System.out.print("    ");
      }
      for (int j=0; j<=i; j++) {
        System.out.printf("%6d  ",triangulo[i][j]);
      }
      System.out.println();
    } 
  }
  
}
