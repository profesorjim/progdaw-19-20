/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimoalrededor;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class MinimoAlrededor1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int [][] miMatriz = new int [6][8];
    int cf;
    int cc;
    
    Scanner s = new Scanner (System.in);
    // relleno con valores aleatorios entre 1 y 100
    for (int i=0; i<miMatriz.length; i++) {
      for (int j=0; j<miMatriz[0].length; j++) {
        miMatriz[i][j] = (int)(Math.random()*100)+1;
      }
    }
    
    for (int i=0; i<miMatriz.length; i++) {
      System.out.println();
      for (int j=0; j<miMatriz[0].length; j++) {
        System.out.printf("%3d ",miMatriz[i][j]);
      }
    }
    
    System.out.println();
    System.out.print("Indica fila: ");
    cf = s.nextInt();
    s.nextLine();
    System.out.print("Indica columna: ");
    cc = s.nextInt();
    s.nextLine();
    
    int cfmin=-1;
    int ccmin=-1;
    
    for (int i=cf-1; i<=cf+1; i++) {
      for (int j=cc-1; j<=cc+1; j++) {
        if (!(i==cf && j==cc)) {
          if ((i>=0) && (i<=miMatriz.length-1) && (j>=0) && (j<=miMatriz[0].length)) {
            if (cfmin == -1) {
              cfmin = i;
              ccmin = j;
            } else if (miMatriz[i][j]<miMatriz[cfmin][ccmin]) {
              cfmin = i;
              ccmin = j;
            }
          }
        }
      }
    }
    
    System.out.println();
    System.out.println("El valor mínimo es: "+miMatriz[cfmin][ccmin]);
    System.out.println("Las coordenadas son: fila="+cfmin+"; col="+ccmin);
  }
  
}
