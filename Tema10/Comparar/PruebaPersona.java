import java.util.ArrayList;
import java.util.Collections;

public class PruebaPersona {
  public static void main(String[] args) {
    
      ArrayList<Persona> miLista = new ArrayList<Persona>();
      
     
      
      miLista.add(new Persona(3,"Pepito3"));
      miLista.add(new Persona(2,"Pepito2"));
      miLista.add(new Persona(4,"Pepito4"));
      miLista.add(new Persona(1,"Pepito"));
      
      miLista.remove(new Persona(3,"Pepito3"));
      
      Collections.sort(miLista);
      
      for (Persona p: miLista) {
        System.out.println(p);
        System.out.println();
      }
    
    
  }
}
