public class RotacionesAIzquierda {
  public static void main (String[] args) {
    int[][] matriz = new int[5][6];
    int[] vector = new int[7];
    
    int[][] matrizRes;
    int[] vectorRes;
    
    System.out.println("Rotaciones de 1 columna a la izquierda.");
    System.out.println("Array 1 dimensión antes de la rotación: ");
    
    for (int i=0; i<vector.length; i++) {
      vector[i] = (int)(Math.random()*100);
      System.out.printf("%2d ",vector[i]);
    }
    System.out.println();
    System.out.println("Array bidimensional antes de la rotación: ");
    
    for (int i=0; i<matriz.length; i++) {
      for (int j=0; j<matriz[0].length; j++) {
        matriz[i][j] = (int)(Math.random()*100);
        System.out.printf("%2d ",matriz[i][j]);
      }
      System.out.println();
    }
    
    vectorRes = RotarColumnaALaIzquierda(vector);
    matrizRes = RotarColumnaALaIzquierda(matriz);
    
    System.out.println();
    System.out.println();
    System.out.println("Array 1 dimensión después de la rotación: ");
    for (int i=0; i<vectorRes.length; i++) {
      System.out.printf("%2d ",vectorRes[i]);
    }
    System.out.println();
    System.out.println("Array bidimensional después de la rotación: ");
    
    for (int i=0; i<matrizRes.length; i++) {
      for (int j=0; j<matrizRes[0].length; j++) {
        System.out.printf("%2d ",matrizRes[i][j]);
      }
      System.out.println();
    }
    
  }
  
  public static int[] RotarColumnaALaIzquierda (int[] vector) {
    int[] aux =  null;
    if (vector.length>0) {
      aux = new int[vector.length];
      for (int i=1; i< vector.length; i++) {
        aux[i-1] = vector[i];
      }
      aux[aux.length-1]=vector[0];
    }
    return aux;
  }
  
  public static int[][] RotarColumnaALaIzquierda (int[][] matriz) {
    int[][] aux = null;
    if (matriz.length>0) {
      aux = new int[matriz.length][];
      for (int i=0; i<matriz.length; i++) {
        aux[i] = RotarColumnaALaIzquierda(matriz[i]);
      }
    }
    return aux;
  }
}
