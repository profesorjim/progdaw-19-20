package Clases03;

public class Alumno01 extends Persona01 implements Tareas {
  
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
  
  @Override
  public void trabajarMas () {
    this.notaMedia = this.notaMedia<10?this.notaMedia+1:10;
  }
  
  @Override
  public void trabajarMenos () {
    this.notaMedia = this.notaMedia>0?this.notaMedia-1:0;
  }
}
