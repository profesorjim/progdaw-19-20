public class Rotaciones {
  public static void main (String[] args) {
    int numero;
    String opcion;
    int desplazamiento;
    
    System.out.println("Este programa \"da vueltas\" a un número.");
    System.out.print("Introduzca un número: ");
    numero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el tipo de desplazamiento (izquierda, derecha; salir): ");
    opcion = System.console().readLine();
    
    // determino longitud del número
    int longitud=1;
    int factor=10;
    while (numero/factor>0) {
      longitud++;
      factor*=10;
    }
    factor/=10;
    
    while(!opcion.equals("salir")) {
      
      
      System.out.print("Introduzca la cantidad de cifras que desea desplazar: ");
      desplazamiento = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
        case "izquierda":
          // rotar a la izquierda tantas veces como indique desplazamiento
          for (int i=0; i<desplazamiento; i++) {
            int digito = numero / factor;
            numero = numero % factor;
            numero = numero*10+digito;
          }
          break;
          
        case "derecha":
          // rotar a la izquierda tantas veces como indique desplazamiento
          for (int i=0; i<desplazamiento; i++) {
            int digito = numero % 10;
            numero = numero / 10;
            numero = digito*factor+numero;
          }
          break;
          
        default: // se ignora
      }
      System.out.println("El número resultante es: "+numero);
      System.out.print("Introduzca el tipo de desplazamiento (izquierda, derecha; salir): ");
      opcion = System.console().readLine();
    } 
    
  }
}
