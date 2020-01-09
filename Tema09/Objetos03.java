import Clases03.Alumno01;
import Clases03.Profesor01;
import Clases03.Persona01;



public class Objetos03 {
  public static void main (String[] args) {
    
    Alumno01 yo;
    Profesor01 tu;
    Persona01 el;
    yo = new Alumno01("Juan","1",20);
    tu = new Profesor01("Antonio","2",30);
    el = new Persona01("Pepito","3",40);
    
  

    
    
    yo.setEdad(8);
    
    //System.out.println(yo.getNombre());
    //System.out.println(tu.getNombre());
    
    System.out.println(yo);
    System.out.println();
    System.out.println(tu);    
    System.out.println();
    System.out.println(el);    

    
  }
}
