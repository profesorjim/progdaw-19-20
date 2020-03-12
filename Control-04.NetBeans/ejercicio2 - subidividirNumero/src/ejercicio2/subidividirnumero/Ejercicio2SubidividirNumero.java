/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.subidividirnumero;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class Ejercicio2SubidividirNumero {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner s = new Scanner (System.in);
    String entrada;
    long entradaNumero;
    long divisor;
    String resultado = "";
    
    int longitud;
    int tamanio;
    
    System.out.print("Introduzca un número: ");
    entrada = s.next();
    s.nextLine();
    System.out.print("Introduzca el tamaño de los trocitos: ");
    tamanio = s.nextInt();
    s.nextLine();
    
    longitud = entrada.length();
    
    if ((longitud % tamanio) != 0) {
      System.out.println("Lo siento. El número introducido tiene una longitud tal que no se puede partir en trocitos del tamaño que ha indicado.");
      return;
    }
    
    entradaNumero = Integer.parseInt(entrada);
    divisor = 1;
    for (int i=0; i<tamanio; i++) {
      divisor = divisor*10;
    }
    
    while (entradaNumero>0) {
      resultado = (entradaNumero % divisor) + "\n" + resultado;
      entradaNumero = entradaNumero / divisor;
    }
    
    System.out.println("Los trocitos del número son los siguientes:\n");
    System.out.println(resultado);
    
           
  }
  
}
