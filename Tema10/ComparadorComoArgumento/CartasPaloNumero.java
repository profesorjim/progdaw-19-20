import java.util.Comparator;

public class CartasPaloNumero implements Comparator <Carta> {
  @Override
  public int compare (Carta c1, Carta c2) {
    if (c1.getPalo().equals(c2.getPalo())) {
      return c1.getNumero().compareTo(c2.getNumero());
    } else {
      return c1.getPalo().compareTo(c2.getPalo());
    }  
  }
}
