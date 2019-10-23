public class Equis {
  public static void main (String[] args){
    int altura;
    int huecosMedios;
    
    System.out.print("Introduzca la altura de la \"X\": ");
    altura = Integer.parseInt(System.console().readLine());
    
    // pinta parte superior X
    huecosMedios = altura-2;
    for (int i=0; i<altura/2; i++) {
      //pintar espacios en blanco
      for (int j=0; j<i; j++) {
        System.out.print(" ");
      }
      //pintar *
      System.out.print("*");
      //pintar espacios en blanco
      for (int j=0; j<huecosMedios; j++) {
        System.out.print(" ");
      }
      huecosMedios-=2;
      //pintar *
      System.out.println("*");
    }
    
    //pintar centro X
    //pinto blancos previos
    for (int i=0; i<altura/2; i++) {
      System.out.print(" ");
    }
    //pintar *
    System.out.println("*");
    
    // pinta parte inferior X
    huecosMedios = 1;
    for (int i=altura/2-1; i>=0; i--) {
      //pintar espacios en blanco
      for (int j=0; j<i; j++) {
        System.out.print(" ");
      }
      //pintar *
      System.out.print("*");
      //pintar espacios en blanco
      for (int j=0; j<huecosMedios; j++) {
        System.out.print(" ");
      }
      huecosMedios+=2;
      //pintar *
      System.out.println("*");
    }
  }
}
