public class RotacionesMatrices {
  public static void main (String[] args) {
    int[] vector = {1,2,3,4};
    int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    
    
    PresentarMatriz(vector);
    System.out.println();
    PresentarMatriz(matriz);
    System.out.println();
    
    
    PresentarMatriz(RotarColumnaALaIzquierda(vector));
    System.out.println();
    PresentarMatriz(RotarColumnaALaIzquierda(matriz));
    System.out.println();
    
    PresentarMatriz(vector);
    System.out.println();
    PresentarMatriz(matriz);
    System.out.println();
    
  }
  
  public static int[] RotarColumnaALaIzquierda (int [] vector) {
    int [] resultado;
    
    resultado = new int[vector.length];
    
    for (int i=1; i<vector.length; i++) {
      resultado[i-1] = vector[i];
    }
    resultado[resultado.length-1]=vector[0];
    
    return resultado;
  }
  
  
  public static int[][] RotarColumnaALaIzquierda (int[][] matriz){
    int[][] resultado = new int[matriz.length][matriz[0].length];
    //int[][] resultado = new int[matriz.length][];
    for (int i=0; i<matriz.length; i++) {
      resultado[i] = RotarColumnaALaIzquierda(matriz[i]);
    }
    return resultado;
  }
  
  public static void PresentarMatriz (int[] v) {
    for (int i=0; i<v.length; i++){
      System.out.printf("%2d ",v[i]);
    }
    System.out.println();
  }
  
  public static void PresentarMatriz (int[][] m) {
    for (int i=0; i<m.length; i++) {
      PresentarMatriz(m[i]);
    }
  }
}
