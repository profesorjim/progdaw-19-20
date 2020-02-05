//https://www.ecodeup.com/entendiendo-paso-a-paso-las-expresiones-lambda-en-java/

//INCOMPLETO; EN ELABORACION

public class Ejemplo1 {
  public static void main (String[] args) {
    int a, b;
    System.out.print("Introduce valor a: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce valor b: ");
    b = Integer.parseInt(System.console().readLine());
    System.out.println("El resultado de "+a+" + "+b+" es: "+Suma(a,b));
    System.out.println("El resultado de "+a+" - "+b+" es: "+Resta(a,b));
    
    System.out.println("El resultado de "+a+" + "+b+" es: "+Operar((int x, int y) -> x+y));
    System.out.println("El resultado de "+a+" - "+b+" es: "+Operar((int x, int y) -> x-y));
    
    
  }
  
  public static int Suma (int a, int b) {
    return a+b;
  }
  
  public static int Resta (int a, int b) {
    return a-b;
  }
  
  public static int Operar (Function f) {
    return f.apply();
  }
}
