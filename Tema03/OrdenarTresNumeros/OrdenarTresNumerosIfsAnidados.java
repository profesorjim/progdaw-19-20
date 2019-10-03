public class OrdenarTresNumerosIfsAnidados {

  public static void main (String[] args) {
    int a, b, c;
    
    System.out.println("Este programa ordena 3 números de menor a mayor.");
    System.out.print("Introduzca el primer número: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el segundo número: ");
    b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el tercer número: ");
    c = Integer.parseInt(System.console().readLine());
    
    /* el programa va a determinar en qué orden debe ir impimiendo los números
     */
    System.out.print("Los números, ordenados de menor a mayor, son: ");
    
    if (a<b) {
      if (a<c) {
        /* en este caso, a es el más pequeño */
        System.out.print(a+", ");
        if (b<c) {
          /* b es menor que c, luego b es el mediano y c el mayor */
          System.out.print(b+", ");
          System.out.print(c);
        } else {
          /* c es menor o igual que b, luego c es el mediano y b el mayor */
          System.out.print(c+", ");
          System.out.print(b);
        }
      } else {
        /* en este caso, c es menor o igual que a, y a es menor que b, con lo que c es el más pequeño,
         * a es el mediano y b es el mayor */
        System.out.print(c+", ");
        System.out.print(a+", ");
        System.out.print(b);
      } 
    } else {
      /* a es mayor o igual que b, luego a no es el más pequeño */
      if (b<c) {
        /* b es menor o igual que a, y b es menor que c, luego b es el menor */
        System.out.print(b+", ");
        if (a<c) {
          /* el mediano será a, y el mayor c */
          System.out.print(a+", ");
          System.out.print(c);
        } else {
          /* el mediano será c, y el mayor a */
          System.out.print(c+", ");
          System.out.print(a);
        }
      } else {
        /* dado que a es mayor o igual que b, y b es mayor o igual que c, el orden de menor a mayor 
         * es c,b,a
         */
        System.out.print(c+", ");
        System.out.print(b+", ");
        System.out.print(a);
      }
    }
    
  }

}
