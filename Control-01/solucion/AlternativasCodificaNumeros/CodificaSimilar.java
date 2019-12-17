public class CodificaSimilar {
  public static void main (String[] args) {
    int numero;
    
    System.out.println("Este programa codifica números en \"letras similares\".");
    
    
    do {
      System.out.print("Introduzca un número entero (0 para salir): ");
      numero = Integer.parseInt(System.console().readLine());
      if (numero != 0) {
          System.out.print("El valor codificado es: ");
          
          int potenciaDiez = 1;
          int digito;
          int numeroAux;
          numeroAux = numero;
          while (numeroAux / potenciaDiez>=10) {
            potenciaDiez = potenciaDiez*10;
            //potenciaDiez *=10;
          }
          
          while (numeroAux != 0) {
            digito = numeroAux / potenciaDiez;
            numeroAux = numeroAux % potenciaDiez;
            potenciaDiez = potenciaDiez / 10;
            switch (digito) {
              case 0:
                System.out.print("O");
                break;
              case 1:
                System.out.print("l");
                break;
              case 2:
                System.out.print("Z");
                break;
              case 3:
                System.out.print("E");
                break;
              case 4:
                System.out.print("A");
                break;
              case 5:
                System.out.print("S");
                break;
              case 6:
                System.out.print("b");
                break;
              case 7:
                System.out.print("J");
                break;
              case 8:
                System.out.print("B");
                break;
              case 9:
                System.out.print("g");
                break;
              default:
            }
          }
          System.out.println();
      }      
    } while (numero != 0);
    
  }
}
