package LibreriaPalotes;

public class OperacionesPalotes {
  
  public static String SumaPalotes (String a, String b) {
    int x, y;
    int parcial;
    String resultado;
    x = AuxiliaresPalotes.PalotesAEntero(a);
    y = AuxiliaresPalotes.PalotesAEntero(b);
    parcial = x + y;
    resultado = AuxiliaresPalotes.EnteroAPalotes(parcial);
    return resultado;
  }
  
  public static String RestaPalotes (String a, String b) {
    int x, y;
    int parcial;
    String resultado;
    x = AuxiliaresPalotes.PalotesAEntero(a);
    y = AuxiliaresPalotes.PalotesAEntero(b);
    parcial = x - y;
    parcial=(parcial<0)?-parcial:parcial;
    resultado = AuxiliaresPalotes.EnteroAPalotes(parcial);
    return resultado;
  }
  
  public static String MultiplicaPalotes (String a, String b) {
    int x, y;
    int parcial;
    String resultado;
    x = AuxiliaresPalotes.PalotesAEntero(a);
    y = AuxiliaresPalotes.PalotesAEntero(b);
    parcial = x * y;
    resultado = AuxiliaresPalotes.EnteroAPalotes(parcial);
    return resultado;
  }
  
  public static String CocientePalotes (String a, String b) {
    int x, y;
    int parcial;
    String resultado;
    x = AuxiliaresPalotes.PalotesAEntero(a);
    y = AuxiliaresPalotes.PalotesAEntero(b);
    parcial = x / y;
    resultado = AuxiliaresPalotes.EnteroAPalotes(parcial);
    return resultado;
  }
  
  public static String RestoPalotes (String a, String b) {
    int x, y;
    int parcial;
    String resultado;
    x = AuxiliaresPalotes.PalotesAEntero(a);
    y = AuxiliaresPalotes.PalotesAEntero(b);
    parcial = x % y;
    resultado = AuxiliaresPalotes.EnteroAPalotes(parcial);
    return resultado;
  }
  
}
