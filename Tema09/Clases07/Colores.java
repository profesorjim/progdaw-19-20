public enum Colores {
  NEGRO (0,0,0),
  ROJO (255,0,0),
  VERDE (0,255,0),
  AZUL (0,0,255),
  AMARILLO (255,255,0),
  MAGENTA (255,0,255); 
  
  private final int rojo;
  private final int verde;
  private final int azul;
  
  Colores (int r, int v, int a) {
    this.rojo = r;
    this.verde = v;
    this.azul = a;
  }
  
  public int getRojo() {
    return this.rojo;
  }
  
  public int getVerde() {
    return this.verde;
  }
  
  public int getAzul() {
    return this.azul;
  }
  
  public String toString() {
    return this.name()+" [R="+this.getRojo()+" + V="+this.getVerde()+" + A="+this.getAzul()+"]";
  }
  
  
}
