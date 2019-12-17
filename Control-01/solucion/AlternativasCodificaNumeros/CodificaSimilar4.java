public class CodificaSimilar4 {
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
          String resultado = "";
          numeroAux = numero;
          
          
          /*
          int volteado = 0;
          while (numeroAux > 0) {
            volteado = (volteado * 10) + (numeroAux % 10);
            numeroAux /= 10;
          } // while
          
          numeroAux = volteado;
          */
          
          while (numeroAux != 0) {
            digito = numeroAux % 10;
            numeroAux = numeroAux / 10;
            
            switch (digito) {
              case 0:
                resultado = "0" + resultado;
                break;
              case 1:
                resultado = "l" + resultado;
                break;
              case 2:
                resultado = "Z" + resultado;
                break;
              case 3:
                resultado = "E" + resultado;
                break;
              case 4:
                resultado = "A" + resultado;
                break;
              case 5:
                resultado = "S" + resultado;
                break;
              case 6:
                resultado = "6" + resultado;
                break;
              case 7:
                resultado = "J" + resultado;
                break;
              case 8:
                resultado = "B" + resultado;
                break;
              case 9:
                resultado = "g" + resultado;
                break;
              default:
            }
          }
          System.out.println(resultado);
      }      
    } while (numero != 0);
    
  }
}
