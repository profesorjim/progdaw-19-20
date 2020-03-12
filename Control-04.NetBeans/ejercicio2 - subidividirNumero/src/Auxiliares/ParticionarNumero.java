/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliares;

/**
 *
 * @author tux
 */
public class ParticionarNumero {
  
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
  
  public static int NumeroPorciones (long numero, int tamanio) {
    int result = 0;
    while (numero>0) {
      numero= RecortaCifras(numero,tamanio);
      result++;
    }
    return result;
  }
  
  public static long[] TrocearNumero (long numero, int tamanio) {
    long[] porciones = new long[NumeroPorciones(numero,tamanio)];
    int i=NumeroPorciones(numero,tamanio)-1;
    while (numero>0) {
      porciones[i] = UltimasCifras(numero,tamanio);
      numero= RecortaCifras(numero,tamanio);
      i--;
    }
    return porciones;
  }
  
}
