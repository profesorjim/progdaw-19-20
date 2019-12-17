public class PresentaMatriz2 {
  public static void main (String[] args) {
    int [][] m;
    String ContieneUnaMatrizConLineas = "";
    
    m = ReservaMemoriaMatriz();
    RellenaMatriz(m);
    PresentaMatrizConLineas(m);
    
    ContieneUnaMatrizConLineas = PresentaMatrizConLineas(m);
    
    System.out.println(ContieneUnaMatrizConLineas);
    
  }
  
  public static String PresentaMatrizConLineas (int[][] a) {
    String resultado = "";
    
    resultado = resultado +"┌";
    for (int i=0; i<a[0].length-1; i++) {
      resultado = resultado +"──┬";
    }
    resultado = resultado + "──┐\n";
    
    
    for (int i=0; i<a.length; i++) {
      resultado = resultado +"│";
      for (int j=0; j<a[0].length; j++) {
        resultado = resultado + String.format("%2d│",a[i][j]);
      }
      resultado = resultado +"\n";
      
      if (i<a.length-1) {
        resultado = resultado + "├";
        for (int k=0; k<a[0].length-1; k++) {
          resultado = resultado + "──┼";
        }
        resultado = resultado +"──┤\n";
      }
    }
    resultado = resultado +"└";
    for (int i=0; i<a[0].length-1; i++) {
      resultado = resultado + "──┴";
    }
    resultado = resultado +"──┘\n";
    
    return resultado;
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
