public class OrdenarTresNumerosPermutando {

  public static void main (String[] args) {
    int a, b, c;
    
    System.out.println("Este programa ordena 3 números de menor a mayor.");
    System.out.print("Introduzca el primer número: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el segundo número: ");
    b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el tercer número: ");
    c = Integer.parseInt(System.console().readLine());
    
    /* el programa va a intercambiar los valores de a,b,c, de manera que el más pequeño quede almacenado en
     * a y el más grande en c
     */
    int aux;
    if (b<a) {
      aux = a;
      a = b;
      b = aux;
    }
    if (c<b) {
      aux = c;
      c = b;
      b= aux;
    }    
    if (b<a) {
      aux = a;
      a = b;
      b = aux;
    }
    
    System.out.print("Los números, ordenados de menor a mayor, son: "+a+", "+b+", "+c);
  }

}
