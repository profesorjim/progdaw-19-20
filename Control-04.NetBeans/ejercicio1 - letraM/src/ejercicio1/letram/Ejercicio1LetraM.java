/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.letram;
import java.util.Scanner;

/**
 *
 * @author tux
 */
public class Ejercicio1LetraM {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner s = new Scanner(System.in);
    int altura;
    String dibujoDeLaM;
    
    System.out.print("Introduzca la altura de la M: ");
    altura = s.nextInt();
    s.nextLine();
    System.out.println();
    
    dibujoDeLaM = GenerarDibujoDeLaM(altura);
    
    System.out.println(dibujoDeLaM);
    
  }
  
  public static String GenerarDibujoDeLaM(int x) {
    String resultado = "";
    if (!(x>=3 && x<=12)) {
      return ("La altura debe ser un número mayor o igual que 3 y menor o igual que 12.");
    }
    int hueco = (x-1)*2-1-2;
    for (int i=0; i<x; i++){
      resultado +="*";
      if (i>0 && i<(x-1)) {
        for (int j=0; j<i-1; j++) {
          resultado += " ";
        }
        resultado += "*";
      }
      for (int j=0; j<hueco; j++) {
        resultado += " ";
      }
      if (i>0 && i<(x-1)) {
        if (hueco > 0) {
          resultado += "*";
        } else {
          hueco = (x-1)*2-1;
        }
        for (int j=0; j<i-1; j++) {
          resultado += " ";
        }        
      }
      resultado += "*\n";
      hueco = hueco -2;
    }
    
    return resultado;
  }
     
  
}
