public class Gusano {
  public static void main (String[] args) {
    
    int pos=0;
    char opcion;
    
    System.out.println("Este programa dibuja un gusano en la pantalla.");
    System.out.println("Controles: j=abajo-izquierda // k=abajo // l=abajo-derecha (seguido de ENTER)");
    System.out.println("Para salir, pulse 's'");
    System.out.println();
    
    do {
      // pinto huecos hasta la posición
      for (int i=0; i<pos; i++) {
        System.out.print(" ");
      }
      // pinto gusano
      System.out.print("*");
      
      // pinto huecos para poner info al usuario
      for (int i=pos; i<20; i++) {
        System.out.print(" ");
      }
      // pongo mensaje
      System.out.print("¿j,k,l,s?: ");
      opcion = System.console().readLine().charAt(0);
      
      // procesamos orden: calculamos nueva posición para la línea siguiente
      switch (opcion) {
        case 'j':
          pos = pos>0?pos-1:pos;
          break;
        case 'l':
          pos = pos<10?pos+1:pos;
          break;
        default:
      }
      // a la vuelta del bucle, si no hemos pulsado 's' se pintará la nueva posición del gusano
    } while (opcion != 's');l
    
  }
}
