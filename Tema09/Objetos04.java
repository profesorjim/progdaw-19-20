import Clases04.Alumno01;
import Clases04.Profesor01;
import Clases04.Persona01;
import Clases04.Tareas;
import Clases04.Religion;



public class Objetos04 {
  public static void main (String[] args) {
    
    /*
    Alumno01 yo;
    Profesor01 tu;
    */
    Persona01 el;
    
    
    Tareas yo,tu;
    
    yo = new Alumno01("Juan","1",20,Religion.JUDIA);
    tu = new Profesor01("Antonio","2",30,Religion.CATOLICA);
    el = new Persona01("Pepito","3",40,Religion.PROTESTANTE);
    
  
    yo.trabajarMas();
    tu.trabajarMas();
    yo.trabajarMas();
    
    
    ((Alumno01)yo).setEdad(8);
    
    //System.out.println(yo.getNombre());
    //System.out.println(tu.getNombre());
    
    System.out.println(yo);
    System.out.println();
    System.out.println(tu);    
    System.out.println();
    System.out.println(el);    

    
  }
}
