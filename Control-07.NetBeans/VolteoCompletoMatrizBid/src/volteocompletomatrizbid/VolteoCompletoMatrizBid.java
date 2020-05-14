/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volteocompletomatrizbid;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class VolteoCompletoMatrizBid {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int fil, col;
    int min, max;
    int [][] matrizA, matrizB;
    
    Scanner s = new Scanner (System.in);
    
    System.out.print("Indique nº de filas: ");
    fil = s.nextInt();
    s.nextLine();
    System.out.print("Indique nº de columnas: ");
    col = s.nextInt();
    s.nextLine();
    System.out.print("Indique extremo inferior rango alatorio: ");
    min = s.nextInt();
    s.nextLine();
    System.out.print("Indique extremo superior rango alatorio: ");
    max = s.nextInt();
    s.nextLine();
    
    matrizA = new int[fil][col];
    
    RellenaMatrizBidAleatoria(matrizA,min,max);
    
    System.out.println();
    System.out.println(MatrizBidComoCadena(matrizA));
    
    matrizB = VolteoCompletoMatrizBid(matrizA);
    
    System.out.println();
    System.out.println(MatrizBidComoCadena(matrizB));
    
  }
  
  public static int GeneradorAleatorio (int minimo, int maximo) {
    int resultado;
    resultado = (int)(Math.random()*(maximo-minimo+1))+minimo;
    return resultado;
  }
  
  public static void RellenaMatrizBidAleatoria(int[][] m, int minimo, int maximo) {
    for (int i=0; i<m.length; i++) {
      for (int j=0; j<m[0].length; j++) {
        m[i][j] = GeneradorAleatorio (minimo,maximo);
      }
    }
  }
  
  public static String MatrizBidComoCadena (int[][] m) {
    String resultado ="";
    for (int i=0; i<m.length; i++) {
      for (int j=0; j<m[0].length; j++) {
        resultado += String.format("%3d ",m[i][j]);
      }
      resultado +="\n";
    }
    return resultado;
  }
  
  public static int[][] VolteoCompletoMatrizBid (int[][] m) {
    int[][] resultado;
    
    resultado = new int[m[0].length][m.length];
    
    for (int i=0; i<resultado.length; i++) {
      for (int j=0; j<resultado[0].length; j++) {
        resultado[i][j] = m[resultado[0].length-1-j][resultado.length-1-i];
      }    
    }   
    
    return resultado;
  }
}
