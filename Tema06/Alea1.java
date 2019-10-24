public class Alea1 {
  public static void main (String[] args) {
    int dado;
    int valorEnRango;
    dado = (int)(Math.random()*6)+1;

    //genera numeros aleatorios enteros entre 101 y 150, ambos incluidos
    valorEnRango = (int)(Math.random()*(150-101+1))+101;
    
  }
}
