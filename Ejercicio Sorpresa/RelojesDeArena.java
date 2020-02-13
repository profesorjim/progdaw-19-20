public class RelojesDeArena {
  public static void main(String[] args) {
    int alturaInicial;
    String caracter;
    int incrementoAltura;
    int numVeces;
    
    int hParte1;
    int hParte2;
    
    do {
      System.out.print("Introduzca la altura inicial: ");
      alturaInicial = Integer.parseInt(System.console().readLine());
      if (!((alturaInicial >= 3) && (alturaInicial % 2 == 1))) {
        System.out.print("No es válido; debe ser impar y mayor o igual a 3. ");
      }
    } while (!((alturaInicial >= 3) && (alturaInicial % 2 == 1)));
    
    System.out.print("Introduzca el carácter para dibujar: ");
    caracter = System.console().readLine();
    
    do {
      System.out.print("Introduzca el incremento en la altura: ");
      incrementoAltura = Integer.parseInt(System.console().readLine());
      if (!(incrementoAltura % 2 == 0)) {
        System.out.print("No es válido; debe ser par y mayor o igual a 2. ");
      }
    } while (!(incrementoAltura % 2 == 0));
    //while (alturaInicial % 2 == 1)
  
    System.out.print("Introduzca el número de veces que desea dibujar el reloj: ");
    numVeces = Integer.parseInt(System.console().readLine());
    
    for (int k=0; k<numVeces; k++) {
      System.out.println();
      
      // dibujo de la piramide invertida hacia abajo 
      hParte1 = (alturaInicial+1) / 2;
      
      //for (int i=1; i<=hParte1; i++) {
      int anchuraLinea = hParte1*2-1;
      for (int i=0; i<hParte1; i++) {
        // pinto espacios en blanco
        for (int j=0; j<i; j++) {
          System.out.print(" ");
        }
        // pinto relleno
        for (int j=0; j<anchuraLinea; j++) {
          System.out.print(caracter);
        }
        System.out.println();
        anchuraLinea -= 2;      
      }
      
      
      // dibujo de la piramide invertida hacia arriba
      hParte2 = hParte1 - 1;
      anchuraLinea = 3;
      for (int i=hParte2-1; i>=0; i--) {
        // pinto espacios en blanco
        for (int j=0; j<i; j++) {
          System.out.print(" ");
        }
        // pinto relleno
        for (int j=0; j<anchuraLinea; j++) {
          System.out.print(caracter);
        }
        System.out.println();
        anchuraLinea += 2;      
      }
      
      alturaInicial += incrementoAltura;
    }  
    
  }

}
