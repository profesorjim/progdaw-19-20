package Clases04;


public  class Persona01 {
  private String nombre;
  private String DNI;
  private int edad;
  private Religion confesionReligiosa;
  
  public Persona01 () {
    
  }
  
  public Persona01 (String nombre, String DNI, int edad, Religion confesion) {
    this.nombre = nombre;
    this.DNI = DNI;
    this.edad = edad;
    this.confesionReligiosa = confesion;
  }

  public void setEdad(int x) {
    this.edad = x;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public String toString() {
    String resultado = "";
    resultado = resultado + "Nombre: " + this.nombre +"\n";
    resultado = resultado + "DNI: " + this.DNI +"\n";
    resultado = resultado + "Edad: " + this.edad +"\n";
    resultado = resultado + "Religión: " + this.confesionReligiosa +"\n";
    return resultado;
  }
  
}
