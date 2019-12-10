package BibliotecaManejoCadenas;

public class PresentacionCadenas {
  
  public static void PrintChulo (String x) {
    System.out.print("┌");
    for (int i=0; i<x.length(); i++) {
      System.out.print("─");
    }
    System.out.println("┐");
    System.out.println("│"+x+"│");
    System.out.print("└");
    for (int i=0; i<x.length(); i++) {
      System.out.print("─");
    }
    System.out.println("┘");
  }
  
 
}
