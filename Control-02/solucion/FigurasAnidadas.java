public class FigurasAnidadas {
  public static void main (String[] args) {
    int altura;
    int margen;
    
    System.out.println("Este programa dibuja un triángulo dentro de otro.");
    do {
      System.out.print("Indica altura (>=3): ");
      altura = Integer.parseInt(System.console().readLine());
      if (altura<3) {
        System.out.print("Incorrecto. ");
      }
    } while (altura <3);
    
    do {
      System.out.print("Indica margen (>=1): ");
      margen = Integer.parseInt(System.console().readLine());
      if (margen <1) {
        System.out.print("Incorrecto. ");
      }
    } while (margen <1);
    
    System.out.println();
    System.out.println();
    
    for (int i=0; i<altura; i++) {
      for (int j=0; j<(altura-i-1); j++) {
        System.out.print(" ");
      }
      for (int j=0; j<=(i*2); j++) {
        if ((i<(altura-margen))&&(j>=margen) && (j<=((i*2)-margen))) {
          System.out.print(" ");
        } else  {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
