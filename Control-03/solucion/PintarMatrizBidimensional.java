public class PintarMatrizBidimensional {
  public static void main (String[] args) {
    int [][] m = new int [GeneraAleatorio(1,8)][GeneraAleatorio(1,8)];
    
    RellenaMatrizConAleatorios(m,1,99);
    
    PresentaMatrizConLineas(m);
    
  }
  
  public static int GeneraAleatorio(int min, int max) {
    int resultado;
    
    resultado = (int)(Math.random()*(max-min))+min;
    
    return resultado;
  }
  
  public static void RellenaMatrizConAleatorios(int[][] m, int min, int max) {
    for (int i=0; i<m.length; i++) {
      for (int j=0; j<m[0].length; j++) {
        m[i][j] = GeneraAleatorio (min,max);
      }
    }
  }
  
  public static void PresentaMatrizConLineas(int[][] m) {
    int filas = m.length;
    int columnas = m[0].length;
    String linea= "";
    
    // supondremos 2 caracteres máximo para los números
    
    // línea tope superior
    linea = "┌";
    for (int i=0; i<columnas-1; i++) {
      linea = linea + "──┬";
    }
    linea = linea + "──┐";
    System.out.println(linea);
    // linea de datos, linea inferior intermedia, o linea top inferior
    for (int i=0; i<filas; i++) {
      linea = "│";
      for (int j=0; j<columnas; j++) {
        linea = linea + String.format("%2s",m[i][j]) + "│";
      }
      System.out.println(linea);
      if (i<filas-1) {
        // linea intermedia
        linea = "├";
        for (int j=0; j<columnas-1; j++) {
          linea = linea + "──┼";
        }
        linea = linea + "──┤";
      } else {
        // linea final
        linea = "└";
        for (int j=0; j<columnas-1; j++) {
          linea = linea + "──┴";
        }
        linea = linea + "──┘";
      }
      System.out.println(linea);
    }
  }
}
