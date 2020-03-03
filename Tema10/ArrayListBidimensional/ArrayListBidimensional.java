import java.util.ArrayList;


public class ArrayListBidimensional {
  public static void main (String[] args) {
    ArrayList<Integer> miArrayUnidimensional = new ArrayList<Integer>();
    
    ArrayList<ArrayList<Integer>> miArrayBidimensional = new ArrayList<ArrayList<Integer>>();
    
    for (int i=0; i<4; i++) {
      miArrayBidimensional.add(new ArrayList<Integer>());
      for (int j=0; j<3; j++) {
        miArrayBidimensional.get(i).add(i*3+j);
      }
    }
    
    for (ArrayList<Integer> x: miArrayBidimensional) {
      for(int y: x) {
        System.out.print(y+", ");
      }
      System.out.println();
    }
  }
}
