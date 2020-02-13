public class PruebaAmbito {
  
  public static void main (String[] args) {
    int x;
    
    
    System.out.print("Dame un numero: ");
    x = Integer.parseInt(System.console().readLine());
    
    System.out.println("El número introducido es: "+x);
    
    otraCaptura(x);
    
    System.out.println("El número introducido al ppo: "+x);
    
     
  }  
  
  public static void otraCaptura (int x) {
    
    System.out.println("El número recibido es: "+x);
    
    System.out.print("Dame un numero: ");
    x = Integer.parseInt(System.console().readLine());
    
    System.out.println("El número introducido es: "+x);
  }
  
  public static int potenciaDiez(int n) {
    // resultado = Math.pow(10,n);
    int resultado = 1;
    for (int i=0; i<n; i++) {
      resultado = resultado * 10;
    }
    return resultado;
  }
}
