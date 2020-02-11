import java.util.ArrayList;

public class EliminacionCondicional{
  
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>();
    
    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");
    
    System.out.println("Contenido de la lista: ");
    System.out.println(a);
    //a.removeIf(palabra -> palabra.contains("a"));
    
    for (int i=0; i<a.size();) {
      if ((a.get(i).contains("a"))) {
        a.remove(i);
      } else {
        i++;
      }
    }
    
    System.out.println("Contenido de la lista después de borrar las palabras que contienen la " +
    "letra \"a\": ");
    System.out.println(a);
  }
  
}
