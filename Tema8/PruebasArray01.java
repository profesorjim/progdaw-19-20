public class PruebasArray01 {
  public static void main (String[] args) {
    final int[] vector1 = {1,2,3,4,5};
    final int x = 3;
    
    //los arrays no se pueden entender como constantes (sus valores)
    
    for (int i=0; i<vector1.length; i++) {
      vector1[i]++;
      System.out.print(vector1[i]+", ");
    }
    
  }
}
