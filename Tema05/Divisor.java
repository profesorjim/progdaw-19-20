
// alternativas para la determinación de si un número es o no primo

public class Divisor {
  public static void main (String[] args) {
    int numero=123;
    
    boolean esPrimo=true;
    for (int i=2; (i<numero)&&(esPrimo==true); i++) {
      if (numero % i == 0) {
        esPrimo=false;
      }
    }
    
    
  
    int cont=2;
    while ((esPrimo==true)&&(cont<numero)) {
      if (numero % cont == 0) {
        esPrimo=false;
      }
      cont++;
    }


    while (cont<numero) {
      if (numero % cont == 0) {
        esPrimo=false;
        cont=numero;
      }
      cont++;
    }    
    
    
  }
}
  

