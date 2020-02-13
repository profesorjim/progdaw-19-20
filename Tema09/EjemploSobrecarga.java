public class EjemploSobrecarga {
  public static void main (String[] args) {
    
    System.out.println(suma(1, 2.2));
    System.out.println(suma(1, 2, 3));
    
  }
  
  public static int suma (int a, int b) {
    return a+b;
  }
  
  public static double suma (int a, double b) {
    return a+b;
  }
  
  public static int suma (int a, int b, int c) {
    return a+b+c;
  }
}
