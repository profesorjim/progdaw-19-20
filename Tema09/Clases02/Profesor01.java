package Clases02;

public class Profesor01 extends Persona01 {
  
  int numModulos;
  
  public Profesor01 () {
    super();
  }
  
  public Profesor01 (String nombre, String DNI, int edad) {
    super(nombre,DNI,edad);
  }
  
  public void setNumModulos(int x) {
    this.numModulos = x;
  }
  
  
  @Override
  public String toString() {
    String resultado = super.toString();
    resultado = resultado + "Módulos en los que da clase: " + this.numModulos +"\n";
    return resultado;
  }
  
}
