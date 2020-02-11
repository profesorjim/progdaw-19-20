import java.util.Scanner;

public class ecoScanner {
  
  public static void main (String[] args) {
    Scanner x = new Scanner(System.in);
    String captura;
    
    System.out.println("Este programa repite como un loro la primera palabra. Introduzca texto: ");
    captura = x.next();
    System.out.println(captura);
    x.nextLine();
    
    System.out.println("Este programa repite como un loro la frase entera. Introduzca texto: ");
    captura = x.nextLine();
    System.out.println(captura);
  
  }

}
