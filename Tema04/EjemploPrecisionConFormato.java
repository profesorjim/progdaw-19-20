public class EjemploPrecisionConFormato {
  public static void main (String[] args) {
    long cantidad1;
    long cantidad2;
    long diferencia;
    
    double aux1;
    double aux2;
    
    System.out.print("Intruduzca cantidad1 en €: ");
    aux1 = Double.parseDouble(System.console().readLine());
    cantidad1 = (long)(aux1 * 100);
    System.out.print("Intruduzca cantidad2 en €: ");
    aux2 = Double.parseDouble(System.console().readLine());
    cantidad2 = (long)(aux2 * 100);
    
    diferencia = cantidad1 - cantidad2;
    
    System.out.println("La diferencia entre ambas cantidades es: "+diferencia/100.0);
    
    int decimales = 4;
    String patata = String.format("La diferencia entre ambas cantidades es: %%.%df\n",decimales);
    // "La diferencia entre ambas cantidades es: %.2f\n"
    
    System.out.printf(patata,diferencia/100.0);
    
    
  }
}
