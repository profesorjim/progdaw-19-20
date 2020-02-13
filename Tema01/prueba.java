public class prueba {
  
  public static void main (String[] args) {
    float numero1;
    float numero2;
    
    numero1 = (float)2.5888;
    numero2 = (float)5.677;
    int a=100;
    int b=50;
    int c=2090;
    
    float resultado;
    
    resultado = numero1 - numero2;
    
    //System.out.println("El resultado de la resta de "+numero1+ " y "+numero2+" es:");
    System.out.printf("El resultado de la resta de %-6.2f y %.2f es:\n",numero1,numero2);
    //System.out.println(resultado);
    System.out.printf("%.2f\n\n",resultado);
    
    System.out.printf("%4d\n",a);
    System.out.printf("%4d\n",b);
    System.out.printf("%4d\n",c);
  }
  
}
