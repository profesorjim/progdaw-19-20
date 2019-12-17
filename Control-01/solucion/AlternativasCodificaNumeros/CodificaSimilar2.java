public class CodificaSimilar2 {
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
                resultado = resultado + "0";
                break;
              case 1:
                resultado = resultado + "l";
                break;
              case 2:
                resultado = resultado + "Z";
                break;
              case 3:
                resultado = resultado + "E";
                break;
              case 4:
                resultado = resultado + "A";
                break;
              case 5:
                resultado = resultado + "S";
                break;
              case 6:
                resultado = resultado + "b";
                break;
              case 7:
                resultado = resultado + "J";
                break;
              case 8:
                resultado = resultado + "B";
                break;
              case 9:
                resultado = resultado + "g";
                break;
              default:
            }
          }
          System.out.println(resultado);
      }      
    } while (numero != 0);
    
  }
}
