public class ConversorMorse {
  public static void main (String[] args) {
    int valorIntroducido;
    int potenciaDiez;
    int copiaValorIntroducido;
    
    System.out.println("Este programa codifica números enteros en MORSE.");
    do {
      System.out.print("Introduzca un valor entero a codificar (>=0): ");
      valorIntroducido = Integer.parseInt(System.console().readLine());
      if (valorIntroducido >=0) {
        //determinar la longitud del valor
        potenciaDiez=1;
        while (valorIntroducido / potenciaDiez > 9) {
            potenciaDiez *=10;
        }
        // vamos sacando dígitos más significativos
        copiaValorIntroducido = valorIntroducido;
        while (potenciaDiez >=1) {
          int digito = valorIntroducido /potenciaDiez;
          valorIntroducido = valorIntroducido % potenciaDiez;
          potenciaDiez /=10;
          if ((digito >=1) && (digito <=5)) {
            //empezamos por puntos y acabamos por rayas
            for (int i=1; i<=digito; i++) {
              System.out.print(".");
            }
            for (int i=digito+1; i<=5; i++) {
              System.out.print("-");
            }
          } else {
            //empezamos por puntos y acabamos por rayas
            digito = digito == 0? 10: digito;
            digito -=5;
            for (int i=1; i<=digito; i++) {
              System.out.print("-");
            }
            for (int i=digito+1; i<=5; i++) {
              System.out.print(".");
            }
          }
          System.out.print(" ");
        }
        System.out.println();
      }
    } while ( valorIntroducido >= 0);
    
  }
}
