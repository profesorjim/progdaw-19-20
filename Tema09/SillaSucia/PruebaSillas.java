public class PruebaSillas {
  public static void main (String[] args) {
    Silla sillaAlumno1;
    Silla sillaAlumno2;
    
    sillaAlumno1 = new Silla();
    sillaAlumno2 = new Silla();
    
    System.out.println(sillaAlumno1);
    System.out.println(sillaAlumno2);
    
    sillaAlumno1.ManchaSilla(17);
    sillaAlumno2.ManchaSilla(24);
    
    System.out.println(sillaAlumno1);
    System.out.println(sillaAlumno2);
    
    sillaAlumno1.LimpiarSilla();
    sillaAlumno2.LimpiarSilla();
    
    System.out.println(sillaAlumno1);
    System.out.println(sillaAlumno2);
    
    
  }
}
