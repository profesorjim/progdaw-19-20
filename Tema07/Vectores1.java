public class Vectores1 {
  public static void main (String[] args) {
    /*
    int x;
    //int[] y = new int[10]; 
    int[] y;
    y = new int[x];
    
    int x = 4;
    
    int[] y = {6,7,8,9};
    */
    
    /* - Pedir al usuario cantidad de datos (enteros)
     * - Reservar array con esta cantidad de datos
     * - Pedir al usuario cada uno de los datos enteros
     * - Presentar por pantalla todos los datos introducidos
     */
    
    int tamanio;
    int[] vector;
    
    System.out.print("Dime cantidad de datos: ");
    tamanio = Integer.parseInt(System.console().readLine());
    vector = new int[tamanio];
    
    
    for (int i=0; i<tamanio; i++) {
      System.out.print("Introduce el dato nº "+(i+1)+": ");
      vector[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.print("Los datos introducidos han sido: ");
    for (int i=0; i<tamanio; i++) {
      System.out.print("Valor nº "+(i+1)+": ");
      System.out.println(vector[i]);      
    }
  }
}
