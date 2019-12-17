public class AdivinaLaPalabra {
  public static void main (String[] args) {
    String[] palabras = {"hola","dificil","tremendo","adivinanza","programacion"};
    String elegida = palabras[(int)(Math.random()*palabras.length)];
    String desordenada = DesordenaPalabra(elegida);
    
    int intentos=5;
    String captura;    
    
    System.out.println("Juego de \"Adivina la palabra\"");
    System.out.println("La palabra desordenada es: "+desordenada);
    do {
      System.out.println("Te quedan "+intentos+" intentos. Di qué palabra es: ");
      captura = System.console().readLine();
      if (elegida.equals(captura)) {
        System.out.println("ENHORABUENA. Has acertado la palabra: "+elegida);
        intentos = -1;
      } else {
        System.out.print("Palabra incorrecta. ");
        intentos--;
      }
    } while (intentos >0);
    if (intentos == 0) {
      System.out.println("Lo siento, has agotado todos los intentos.\nLa palabra era: "+elegida);
    }
    

  }
  
  public static String DesordenaPalabra (String palabra) {
    String resultado="";
    int[] posicionesYaElegidas = new int[palabra.length()];
    int posicionCandidata;
    boolean encontrado;
    for (int i=0; i<palabra.length(); i++) {
      do {
        posicionCandidata=(int)(Math.random()*palabra.length());
        encontrado = false;
        for (int j=0; j<i && !encontrado; j++) {
          if (posicionCandidata == posicionesYaElegidas[j]) {
            encontrado=true;
          }
        }
      } while (encontrado);
      if (!encontrado) {
        resultado = resultado + palabra.charAt(posicionCandidata);
        posicionesYaElegidas[i] = posicionCandidata;
      }      
    }
    
    return resultado;
  }
}
