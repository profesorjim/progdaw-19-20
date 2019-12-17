public class CodificaNumeros {
  public static void main (String[] args) {
    int numero;
    String respuesta="";
    do {
      System.out.println("Este programa codifica números en \"letras similares\".");
      System.out.print("Introduzca un número entero (0 para salir): ");
      numero = Integer.parseInt(System.console().readLine());
      if (numero!=0) {
        // procesamos el número por dígitos de drcha a izqda, que es más fácil,
        // y construimos la respuesta en un string que presentaremos al final
        respuesta = "";
        while (numero > 0) {
            int digito = numero % 10;
            numero = numero / 10;
            char sustituto=' ';
            switch (digito) {
              case 0:
                sustituto ='O';
                break;
              case 1:
                sustituto ='l';
                break;
              case 2:
                sustituto ='Z';
                break;
              case 3:
                sustituto ='E';
                break;
              case 4:
                sustituto ='A';
                break;
              case 5:
                sustituto ='S';
                break;
              case 6:
                sustituto ='b';
                break;
              case 7:
                sustituto ='J';
                break;
              case 8:
                sustituto ='B';
                break;
              case 9:
                sustituto ='g';
                break;
              default:
            }
            respuesta = sustituto + respuesta;
        }
        System.out.println("El valor codificado es: "+respuesta);
      }
    } while (numero!=0);
    
  }
}
