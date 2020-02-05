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
    
    IFuncionLambda f1 = (n,m) -> n+m;
    IFuncionLambda f2 = (n,m) -> n-m;
    
    
    System.out.println("El resultado de "+a+" + "+b+" es: "+f1.Operar(a,b));
    System.out.println("El resultado de "+a+" - "+b+" es: "+f2.Operar(a,b));
    
    System.out.println("El resultado de "+a+" + "+b+" es: "+Operando(a,b,(c,d) -> c+d));
    System.out.println("El resultado de "+a+" - "+b+" es: "+Operando(a,b,(c,d) -> c-d));
    
    System.out.println("El resultado de "+a+" + "+b+" es: "+Operando(a,b,f1));
    System.out.println("El resultado de "+a+" - "+b+" es: "+Operando(a,b,f2));
    
    
  }
  
  public static int Suma (int a, int b) {
    return a+b;
  }
  
  public static int Resta (int a, int b) {
    return a-b;
  }
  
  public static int Operando (int a, int b, IFuncionLambda patata) {
    return patata.Operar(a,b);
  }
  
 
}
