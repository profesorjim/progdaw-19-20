package LibreriaPalotes;

public class AuxiliaresPalotes {
  public static int PalotesAEntero (String a) {
    int resultado=0;
    int digito;
    
    digito=0;
    for (int i=0; i < a.length(); i++) {
      if (a.charAt(i)== '|') {
        digito++;
      } else if (a.charAt(i)== '-') {
        resultado = resultado*10;
        resultado = resultado + digito;
        digito = 0;
      }      
    }
    if ((digito > 0) || (a.charAt(a.length()-1))=='-') {
      resultado = resultado*10;
      resultado = resultado + digito;
    }
    
    return resultado;
  }
  
  public static String EnteroAPalotes (int a) {
    String resultado = "";
    int digito;
    a = (a>0)?a:-a;
    while (a>0) {
      digito = a % 10;
      a = a /10;
      for (int i=0; i<digito; i++) {
        resultado = "|" + resultado;
      }
      if (a > 0) {
        resultado = "-" + resultado;
      }
    }   
    return resultado;
  }
  
}
