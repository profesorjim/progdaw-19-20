public class ejercicio08 {
  
  public static void main (String[] args) {
    char var1 = 'A';
    char var2 = 'B';
    char var3 = 'C';
    String todoJunto;
    
    todoJunto = "" + (var1 + var2 + var3);
    
    System.out.println((int)var1);
    System.out.println((int)var2);
    System.out.println((int)var3);
    System.out.println("Concatenando todo resulta: " + todoJunto);
    
    var3++;
    System.out.println(var3);
    
  }

}
