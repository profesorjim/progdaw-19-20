public class CaracteresEspeciales {
  public static void main (String[] args) {
    String figurasAjedrez = "♔♕♖♗♘♙♚♛♜♝♞♟";
    
    System.out.println(figurasAjedrez);
  
    for (int i=0; i<8; i++) {
      System.out.print((char)((int)'a'+i)+" ");
    }
  
  }
}
