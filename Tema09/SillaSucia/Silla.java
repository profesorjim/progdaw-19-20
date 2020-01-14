public class Silla {
  int suciedad;  // porcentaje de suciedad de la silla
  
  public Silla() {
    this.suciedad = 0;
  }
  
  public void ManchaSilla(int porcentaje) {
    this.suciedad = (this.suciedad + porcentaje > 100)? 100: this.suciedad+porcentaje;
  }
  
  public void LimpiarSilla () {
    // limpia la silla un 20%
    this.suciedad = (this.suciedad >= 20)? this.suciedad - 20: 0;
  }
  
  public String toString() {
    if (this.suciedad == 0) {
      return "La silla está limpia";
    } else {
      return "La silla está manchada un "+ this.suciedad +"%";
    }
  }
  
}
