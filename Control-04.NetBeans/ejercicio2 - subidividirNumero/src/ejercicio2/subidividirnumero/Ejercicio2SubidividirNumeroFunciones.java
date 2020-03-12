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
public class Ejercicio2SubidividirNumeroFunciones {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner s = new Scanner (System.in);
    String entrada;
    long entradaNumero;
  
    
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
     
    System.out.println("Los trocitos del número son los siguientes:\n");
    System.out.println(TrocearNumero(entradaNumero,tamanio));
    
           
  }
  
  public static long Divisor (int x) {
    long divisor = 1;
    for (int i=0; i<x; i++) {
      divisor = divisor*10;
    }            
    return divisor;
  }
  
  public static long UltimasCifras (long numero, int tamanio) {
    long resultado;
    resultado = numero % Divisor(tamanio);
    return resultado;
  }
  
  public static long RecortaCifras (long numero, int tamanio) {
    long resultado;
    resultado = numero / Divisor(tamanio);
    return resultado;
  }
  
  public static String TrocearNumero (long numero, int tamanio) {
    String resultado = ""; 
    while (numero>0) {
      resultado = UltimasCifras(numero,tamanio) + "\n" + resultado;
      numero= RecortaCifras(numero,tamanio);
    }
    return resultado;
  }
  
}
