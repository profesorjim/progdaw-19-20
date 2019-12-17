public class PiramideVariada {
  public static void main (String[] args) {
    int altura;
    String orientacion;
    char car1, car2;
    
    System.out.println("Este programa pinta piramides.");
    
    // capturamos altura ente 1 y 10
    do {
      System.out.print("Introduzca la altura (1-10): ");
      altura = Integer.parseInt(System.console().readLine());
      if (!((altura>=1) && (altura <=10))) {
        System.out.print("Incorrecto. ");
      }
    } while (!((altura>=1) && (altura <=10)));
    
    // capturamos la orientación
    do {
      System.out.print("Introduzca la orientación (izquierda, derecha, arriba, abajo): ");
      orientacion = System.console().readLine();
      if (!(orientacion.equals("izquierda")|| orientacion.equals("derecha")||orientacion.equals("arriba")||orientacion.equals("abajo"))) {
        System.out.print("Incorrecto. ");
      }
    } while (!(orientacion.equals("izquierda")|| orientacion.equals("derecha")||orientacion.equals("arriba")||orientacion.equals("abajo")));
    
    // capturamos primer carácter
    System.out.print("Introduzca el primer carácter: ");
    car1 = System.console().readLine().charAt(0);
    
    // capturamos segundo carácter
    System.out.print("Introduzca el segundo carácter: ");
    car2 = System.console().readLine().charAt(0);
    
    System.out.println();
    
    switch (orientacion) {
      case "arriba":
        for (int i=0; i<altura; i++) {
          // pintamos huecos antes de la punta
          for (int j=0; j<altura-i-1; j++) {
            System.out.print(" ");
          }
          // pintamos cuerpo
          for (int j=0; j<i*2+1; j++) {
            if (j%2==0) {
              System.out.print(car1);
            } else {
              System.out.print(car2);
            }
          }
          System.out.println();
        }
        break;
        
      case "abajo":
        for (int i=0; i<altura; i++) {
          // pintamos huecos antes de la punta
          for (int j=0; j<i; j++) {
            System.out.print(" ");
          }
          // pintamos cuerpo
          for (int j=0; j<(altura-i-1)*2+1; j++) {
            if (j%2==0) {
              System.out.print(car1);
            } else {
              System.out.print(car2);
            }
          }
          System.out.println();
        }
        break;
        
      case "izquierda":
      // primera parte de la pirámide
        for (int i=0; i<altura; i++) {
          // pintar espacios en blanco
          for (int j=0; j<altura-i-1; j++){
            System.out.print(" ");
          }
          // pintar cuerpo
          for (int j=0; j<=i; j++) {
            if ((j)%2==0) {
              System.out.print(car1);
            } else {
              System.out.print(car2);
            }
          }
          System.out.println();          
        }        
        // segunda parte de la pirámide
        for (int i=altura-2; i>=0; i--) {
          for (int j=0; j<altura-i-1; j++){
            System.out.print(" ");
          }
          // pintar cuerpo
          for (int j=0; j<=i; j++) {
            if ((j)%2==0) {
              System.out.print(car1);
            } else {
              System.out.print(car2);
            }
          }
          System.out.println();          
        }            
        break;
        
      case "derecha":
        // primera parte de la pirámide
        for (int i=0; i<altura; i++) {
          for (int j=0; j<=i; j++) {
            if ((j+i)%2==0) {
              System.out.print(car1);
            } else {
              System.out.print(car2);
            }
          }
          System.out.println();          
        }        
        // segunda parte de la pirámide
        for (int i=altura-2; i>=0; i--) {
          for (int j=0; j<=i; j++) {
            if ((j+i)%2==0) {
              System.out.print(car1);
            } else {
              System.out.print(car2);
            }
          }
          System.out.println();          
        }    
        break;
    }
  }
}
