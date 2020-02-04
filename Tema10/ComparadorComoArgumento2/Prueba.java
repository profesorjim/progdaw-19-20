import java.util.ArrayList;
import java.util.Collections;

public class Prueba {
  public static void main(String[] args) {
    ArrayList<Carta> a = new ArrayList<Carta>();

    int tam = (int)(Math.random()*11)+10;
    
    Carta aux;

    for (int i=0; i<tam; i++) {
      do {
        aux = new Carta();
      } while (a.contains(aux));
      a.add(aux);
    }

/*
    Collections.sort(a);

    for (Carta i : a) {
      System.out.println(i);
    }    
*/
    a.sort(new CartasNumeroPalo());
    for (Carta i : a) {
      System.out.println(i);
    } 
    
    System.out.println();
    
    a.sort(new CartasPaloNumero());
    for (Carta i : a) {
      System.out.println(i);
    } 
  }
}
