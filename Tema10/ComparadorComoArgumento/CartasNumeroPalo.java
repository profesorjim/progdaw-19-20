import java.util.Comparator;

public class CartasNumeroPalo implements Comparator <Carta> {
  @Override
  public int compare (Carta c1, Carta c2) {
    if (c1.getNumero()==c2.getNumero()) {
      return c1.getPalo().compareTo(c2.getPalo());
    } else {
      return c1.getNumero().compareTo(c2.getNumero());
    }  
  }
}
