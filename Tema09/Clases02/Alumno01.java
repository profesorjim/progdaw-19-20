package Clases02;

public class Alumno01 extends Persona01 {
  
  int notaMedia;
  
  public Alumno01 () {
    super();
  }
  
  public Alumno01 (String nombre, String DNI, int edad) {
    super(nombre,DNI,edad);
  }
  
  public void setNotaMedia(int x) {
    this.notaMedia = x;
  }
  
  public String toString() {
    String resultado = super.toString();
    resultado = resultado + "Nota media: " + this.notaMedia +"\n";
    return resultado;
  }
}
