public class PiramideDoble {
  public static void main (String[] args) {
    int h1, h2;
    int anchura1, anchura2;
    int espacios1, espacios2;
    
    int hmax;
    
    System.out.print("Introduzca altura pirámide izquierda: ");
    h1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca altura pirámide derecha: ");
    h2 = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    
    if (h1>h2) {
      anchura1 = 1;
      anchura2 = 1-(h1-h2)*2;
      hmax = h1;
    } else {
      anchura2 = 1;
      anchura1 = 1-(h2-h1)*2;
      hmax = h2;
    }
    
    
    espacios1 = h1 - 1;
    espacios2 = h2 - 1;
    for (int i=0; i<hmax; i++) {
      //espacios en blanco previos primera piramide
      for (int j=0; j<espacios1; j++) {
        System.out.print("-");
      }
      // relleno primera piramide
      for (int j=0; j<anchura1; j++) {
        System.out.print("*");
      }
      
      if (anchura1<0) {
        System.out.print(" ");
      }
      
      //espacios en blanco posteriores primera piramide
      for (int j=0; j<espacios1; j++) {
        System.out.print("=");
      }
      System.out.print(" ");
      
      //espacios en blanco previos segunda piramide
      for (int j=0; j<espacios2; j++) {
        System.out.print(".");
      }
      // relleno segunda piramide
      for (int j=0; j<anchura2; j++) {
        System.out.print("*");
      }
      
      
      System.out.println();
      
      if (anchura1 >0) {
        espacios1--;
      }
      if (anchura2 >0) {
        espacios2--;
      }
      anchura1+=2;
      anchura2+=2;
      
    }
    
    
    
  }
}
