import LibreriaPalotes.OperacionesPalotes;

public class PruebaPalotes {
  public static void main (String [] args) {
    String a;
    String b;
    
    System.out.println("Prueba de las funciones para operar en el formato \"palotes\".");
    System.out.print("Introduzca valor1 en formato palotes: ");
    a = System.console().readLine();
    System.out.print("Introduzca valor2 en formato palotes: ");
    b = System.console().readLine();
    
    /*
    System.out.println(LibreriaPalotes.AuxiliaresPalotes.PalotesAEntero(a));
    System.out.println(LibreriaPalotes.AuxiliaresPalotes.PalotesAEntero(b));
    */
    System.out.println("La suma vale: "+LibreriaPalotes.OperacionesPalotes.SumaPalotes(a,b));
    System.out.println("La resta vale: "+LibreriaPalotes.OperacionesPalotes.RestaPalotes(a,b));
    System.out.println("La multiplicación vale: "+LibreriaPalotes.OperacionesPalotes.MultiplicaPalotes(a,b));
    System.out.println("El cociente entero vale: "+LibreriaPalotes.OperacionesPalotes.CocientePalotes(a,b));
    System.out.println("El resto entero vale: "+LibreriaPalotes.OperacionesPalotes.RestoPalotes(a,b));
    
  }
  
}
