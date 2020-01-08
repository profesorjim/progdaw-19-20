import Clases01.Persona01;

public class Objetos01 {
  public static void main (String[] args) {
    
    Persona01 yo,tu;
    yo = new Persona01("Juan","1",20);
    tu = new Persona01("Antonio","2",30);
    
    yo.setEdad(8);
    
    System.out.println(yo.getNombre());
    System.out.println(tu.getNombre());
    
    System.out.println(yo);
    

    
  }
}
