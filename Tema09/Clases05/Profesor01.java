package Clases05;

public class Profesor01 extends Persona01 implements Tareas {
  
  int numModulos;
  
  public Profesor01 () {
    super();
  }
  
  public Profesor01 (String nombre, String DNI, int edad, Religion confesion) {
    super(nombre,DNI,edad,confesion);
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
  
  @Override
  public void trabajarMas () {
    this.numModulos++;
  }
  
  @Override
  public void trabajarMenos () {
    this.numModulos = this.numModulos>0?this.numModulos-1:0;
  }
  
}
