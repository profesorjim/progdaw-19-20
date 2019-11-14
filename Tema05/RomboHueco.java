public class RomboHueco {
  public static void main (String[] args) {
    int altura;
    
    int blancosAntes, blancosEnmedio;
    
    System.out.println("Dibujo rombos huecos.");
   
    
    do {
      System.out.print("Dime altura rombo (impar y >=3): ");
      altura = Integer.parseInt(System.console().readLine());
      if (!((altura % 2 == 1) && (altura >=3))) {
        System.out.print("Incorrecto. ");
      }
    } while (!((altura % 2 == 1) && (altura >=3)));
    
    // pintar parte superior rombo
    blancosAntes = altura/2;
    blancosEnmedio = -1;
    for (int i=0; i<(altura/2 +1); i++) {
      // blancos previos
      for (int j=0; j<blancosAntes; j++) {
        System.out.print(".");
      }
      //pinto carácter
      System.out.print("*");
      // blancos de enmedio
      for (int j=0; j<blancosEnmedio; j++) {
        System.out.print(".");
      }
      //pinto carácter si estoy en linea >0
      if (i>0) {
        System.out.print("*");
      }
      System.out.println();
      
      blancosAntes--;
      blancosEnmedio = blancosEnmedio + 2;
    }
    
    // pintar parte inferior rombo
    blancosAntes = 1;
    blancosEnmedio = altura-4;
    for (int i=(altura/2)-1; i>=0; i--) {
      // blancos previos
      for (int j=0; j<blancosAntes; j++) {
        System.out.print(".");
      }
      //pinto carácter
      System.out.print("*");
      // blancos de enmedio
      for (int j=0; j<blancosEnmedio; j++) {
        System.out.print(".");
      }
      //pinto carácter si estoy en linea >0
      if (i>0) {
        System.out.print("*");
      }
      System.out.println();
      
      blancosAntes++;
      blancosEnmedio = blancosEnmedio - 2;
    }
    
    
  }
}
