public class TerminaCuandoEsImparWhile {
  
  public static void main(String[] args) {
    int numero;
    /*
    do {
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      if (numero % 2 == 0) {// comprueba si el número introducido es par
        System.out.println("Qué bonito es el " + numero);
      } else {
        System.out.println("No me gustan los números impares, adiós.");
      }
    } while (numero % 2 == 0);
    */
    
    /*
    do {
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      if (numero % 2 == 0) {// comprueba si el número introducido es par
        System.out.println("Qué bonito es el " + numero);
      }
    } while (numero % 2 == 0);
    System.out.println("No me gustan los números impares, adiós.");
    */
    
    System.out.print("Dime un número: ");
    numero = Integer.parseInt(System.console().readLine());
    while (numero % 2 == 0) {
      System.out.println("Qué bonito es el " + numero);
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
    }
    System.out.println("No me gustan los números impares, adiós.");
  }
  
}
