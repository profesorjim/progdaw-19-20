package LibreriaPalotes;


public class OperacionesPalotes {
  
  public static String SumaPalotes (String a, String b) {
    int n1 = AuxiliaresPalotes.PalotesAEntero(a);
    int n2 = AuxiliaresPalotes.PalotesAEntero(b);
    int resultado = n1 + n2;
    return AuxiliaresPalotes.EnteroAPalotes(resultado);
  }
  
  public static String RestaPalotes (String a, String b) {
    int n1 = AuxiliaresPalotes.PalotesAEntero(a);
    int n2 = AuxiliaresPalotes.PalotesAEntero(b);
    int resultado = (n1>n2)?n1-n2:n2-n1;
    return AuxiliaresPalotes.EnteroAPalotes(resultado);
  }
  
  
  public static String MultiplicaPalotes (String a, String b) {
    int n1 = AuxiliaresPalotes.PalotesAEntero(a);
    int n2 = AuxiliaresPalotes.PalotesAEntero(b);
    int resultado = n1*n2;
    return AuxiliaresPalotes.EnteroAPalotes(resultado);
  }
  
  public static String CocientePalotes (String a, String b) {
    int n1 = AuxiliaresPalotes.PalotesAEntero(a);
    int n2 = AuxiliaresPalotes.PalotesAEntero(b);
    int resultado = n1/n2;
    return AuxiliaresPalotes.EnteroAPalotes(resultado);
  }
  
  public static String RestoPalotes (String a, String b) {
    int n1 = AuxiliaresPalotes.PalotesAEntero(a);
    int n2 = AuxiliaresPalotes.PalotesAEntero(b);
    int resultado = n1%n2;
    return AuxiliaresPalotes.EnteroAPalotes(resultado);
  }
  

  
}
