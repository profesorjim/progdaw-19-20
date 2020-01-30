public class Persona implements Comparable<Persona> {
  private String nombre;
  private int DNI;
  private int edad;
  
  public Persona (int DNI, String Nombre) {
    this.DNI = DNI; 
    this.nombre = Nombre;
    this.edad=0;
  }
  
  public void Envejecer() {
    this.edad++;
  }
  
  public String toString() {
    return "DNI: "+this.DNI+"\nNombre: "+this.nombre+"\nEdad: "+this.edad;
  }
  
  @Override
  public int compareTo (Persona p) {
    if (this.nombre.equals(p.nombre)) {
      if (this.DNI==p.DNI) {
        return 0;
      } else if (this.DNI<p.DNI) {
        return -1;
      } else {
        return 1;
      }
    } else {
      return this.nombre.compareTo(p.nombre);
    }
  }
  
  @Override
  public boolean equals (Object p) {
    if (this.compareTo((Persona)p) == 0) {
      return true;
    }
    return false;
  }
}
