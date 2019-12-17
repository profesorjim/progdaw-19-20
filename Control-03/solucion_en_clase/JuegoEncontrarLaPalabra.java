public class JuegoEncontrarLaPalabra {
  public static void main (String[] args) {
    String[] pool = {"hola","alumno","lechuga","teclado"};
    int intentos=5;
    String candidata;
    
    String elegida = pool[(int)(Math.random()*pool.length)];
    String desordenada = DesordenaPalabra (elegida);
    
    System.out.println("DESCUBRE LA PALABRA");
    //System.out.println(elegida);
    System.out.println(desordenada);
    
    do {
      System.out.println("Tienes "+intentos+" intentos.");
      System.out.print("Palabra?: ");
      candidata = System.console().readLine();
      if (candidata.equals(elegida) == false) {
        System.out.print("Incorrecto. ");
        intentos--;
      }
    } while ((intentos > 0) && (candidata.equals(elegida) == false));
    
    if (candidata.equals(elegida)) {
      System.out.println("Has ganado. Palabra="+elegida);
    } else {
      System.out.println("Has perdido. Palabra="+elegida);
    }
    
  }
  
  public static String DesordenaPalabra (String palabra) {
    String resultado="";
    int[] posicionesYaElegidas = new int[palabra.length()];
    int cantidadPosiciones = 0;    
    int posicionCandidata;
    boolean posicionYaElegida;
    
    while (cantidadPosiciones<palabra.length()) {
      posicionCandidata = (int)(Math.random()*palabra.length());
      posicionYaElegida = false;
      for (int i=0; i<cantidadPosiciones; i++) {
        if (posicionCandidata == posicionesYaElegidas[i]) {
          posicionYaElegida = true;
        }
      }
      if (posicionYaElegida == false) {
        posicionesYaElegidas[cantidadPosiciones] = posicionCandidata;
        cantidadPosiciones ++;
        resultado = resultado + palabra.charAt(posicionCandidata);
      }
      
    }
        
    return resultado;
  }
}
