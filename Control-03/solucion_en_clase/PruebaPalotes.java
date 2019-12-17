import LibreriaPalotes.OperacionesPalotes;
import LibreriaPalotes.AuxiliaresPalotes;

public class PruebaPalotes {
  public static void main (String[] args) {
    String a,b;
    
    System.out.println("Prueba de libreria palotes.");
    System.out.print("Introduce valor1 en formato palotes: ");
    a = System.console().readLine();
    
    System.out.print("Introduce valor2 en formato palotes: ");
    b = System.console().readLine();
    
    System.out.println(a + "=" +AuxiliaresPalotes.PalotesAEntero(a));
    System.out.println(b + "=" +AuxiliaresPalotes.PalotesAEntero(b));
    
    System.out.println("La suma es: "+OperacionesPalotes.SumaPalotes(a,b));
    System.out.println("La resta es: "+OperacionesPalotes.RestaPalotes(a,b));
    System.out.println("La multi es: "+OperacionesPalotes.MultiplicaPalotes(a,b));
    System.out.println("El cociente entero es: "+OperacionesPalotes.CocientePalotes(a,b));
    System.out.println("El resto es: "+OperacionesPalotes.RestoPalotes(a,b));
    
  }
}
