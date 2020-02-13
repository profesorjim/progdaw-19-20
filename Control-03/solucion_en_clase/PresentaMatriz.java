public class PresentaMatriz {
  public static void main (String[] args) {
    int [][] m;
    
    m = ReservaMemoriaMatriz();
    RellenaMatriz(m);
    PresentaMatrizConLineas(m);
    
  }
  
  public static void PresentaMatrizConLineas (int[][] a) {
    System.out.print("┌");
    for (int i=0; i<a[0].length-1; i++) {
      System.out.print("──┬");
    }
    System.out.println("──┐");
    
    
    for (int i=0; i<a.length; i++) {
      System.out.print("│");
      for (int j=0; j<a[0].length; j++) {
        System.out.printf("%2d│",a[i][j]);
      }
      System.out.println();
      
      if (i<a.length-1) {
        System.out.print("├");
        for (int k=0; k<a[0].length-1; k++) {
          System.out.print("──┼");
        }
        System.out.println("──┤");
      }
    }
    System.out.print("└");
    for (int i=0; i<a[0].length-1; i++) {
      System.out.print("──┴");
    }
    System.out.println("──┘");
    
  }
  
  public static int[][] ReservaMemoriaMatriz() {
    int [][] resultado;
    
    resultado = new int[EnteroAleatorio(1,8)][EnteroAleatorio(1,8)];
    return resultado;
  }
  
  public static void RellenaMatriz (int [][] m) {
    for (int i=0; i<m.length; i++) {
      for (int j=0; j<m[0].length; j++) {
        m[i][j] = EnteroAleatorio(1,99);
      }
    }
  }
  
  public static int EnteroAleatorio (int a, int b) {
    int resultado;
    if (a > b) {
      int aux = a;
      a = b;
      b = aux;
    }
    resultado = (int)(Math.random()*(b-a+1))+a;
    
    return resultado;
  }
  
}
