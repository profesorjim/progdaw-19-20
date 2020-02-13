public class BarajaFrancesa {
  public static void main(String[] args) {
    int paloNum;
    String palo="";
    int cartaNum;
    String carta="";
    
    paloNum = (int)(Math.random()*4) + 1;
    cartaNum = (int)(Math.random()*13) + 1;
    
    switch (paloNum) {
      case 1:
        palo = "picas";
        break;
      case 2:
        palo = "corazones";
        break;
      case 3:
        palo = "diamantes";
        break;
      case 4:
        palo = "tréboles";
        break;
      default:
    }
    
    switch (cartaNum) {
      case 1:
        carta = "A";
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
        //carta = String.valueOf(cartaNum);
        carta = "" + cartaNum;
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
    }
    
    System.out.println("Carta elegida: " + palo + " - " + carta);
    
  }
}
