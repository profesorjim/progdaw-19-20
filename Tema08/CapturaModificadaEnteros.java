public class CapturaModificadaEnteros {
  public static void main (String[] args) {
    int x;
    
    System.out.print("Dime un numero: ");
    x = MiCapturaEntero (System.console().readLine());
    System.out.println("El numero introducido fue: "+x);
  }
  
  public static int MiCapturaEntero (String s) {
    String aux = "";
    
    for (int i=0; i<s.length(); i++) {
      if ((s.charAt(i)>='0') && (s.charAt(i)<='9')) {
        aux = aux + s.charAt(i);
      }
    }
    if (aux.length() == 0)
      return 0;
    return Integer.parseInt(aux);
  }
}
