public class ArrayBidimensionalForEach {
  public static void main (String[] args) {
    
    int[][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
    
    
    for (int[] x : matriz) {
      for (int y: x) {
        System.out.print(y+"-");
        y++;
      }
      System.out.println();
    }
    
    for (int[] x : matriz) {
      for (int y: x) {
        System.out.print(y+"-");
        
      }
      System.out.println();
    }
  }
}
