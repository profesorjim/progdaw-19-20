                   package LibreriaPalotes;

public class AuxiliaresPalotes {
  
  public static String EnteroAPalotes (int x) {
    int digito;
    String resultado = "";
    while (x>0) {
      digito=x%10;
      x=x/10;
      resultado = PintaDigitoEnPalotes(digito) + resultado;
      if (x>0) {
        resultado =  "-" + resultado;
      }
      
    }
    return resultado;
  }
  
  public static String PintaDigitoEnPalotes (int d) {
    String resultado = "";
    for (int i=0; i<d; i++) {
      resultado += "|";
    }
    return resultado;
  }
  
  public static int PalotesAEntero (String num) {
    int resultado = 0;
    int parcial=0;
    for (int i=0; i<num.length(); i++) {
      if (num.charAt(i) == '|') {
        parcial++;
      } else { //deberá ser un guión
        resultado = resultado*10+parcial;
        parcial = 0;
      }
      
      //System.out.println(num.charAt(i)+"   parcial:"+parcial+"   result:"+resultado);
    }
    // System.out.println();
    //if (!guion > 0) {
      resultado = resultado*10+parcial;
    //}
    return resultado;
  }
  
}
