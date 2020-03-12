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
public class PruebaLetraM {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int altura;
    LetraM miM;
    
    System.out.print("Introduzca la altura de la M: ");
    altura = s.nextInt();
    s.nextLine();
    System.out.println();
    
    miM = new LetraM(altura);
    
    System.out.println(miM);
  }
}
