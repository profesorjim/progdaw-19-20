public class Carta implements Comparable<Carta> {
  private static Integer[] nu = { 1,2,3,4,5,6,7,8,9,10,11,12 };
  private static String[] pa = {"basto", "copa", "espada", "oro"};

  private Integer numero;
  private String palo;

  public Carta() {
    numero = nu[(int)(Math.random()*12)];
    palo = pa[(int)(Math.random()*4)];
  }

  public Integer getNumero() {
    return numero;
  }

  public String getPalo() {
    return palo;
  }

  public String toString() {
    return ""+numero+" de "+palo;
  }
  
  public boolean equals(Object o) {     //equals es llamado por contains
    if (this.compareTo((Carta)o)==0)
      return true;
    else
      return false;
  }

/*
  @Override
  public int compareTo(Carta c) {       //1º variante: ordena por numeros
    if (numero==c.numero) {
      return palo.compareTo(c.getPalo());
    } else {
      return numero.compareTo(c.getNumero());
    }    
  }
  * */


  @Override
  public int compareTo(Carta c) {       //2º variante: ordena por palos
    if (palo.equals(c.getPalo())) {
      return numero.compareTo(c.getNumero());
    } else {
      return palo.compareTo(c.getPalo());
    }
  }
  
}
