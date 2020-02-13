public class Ejercicio18SinArraysAux {
  public static void main (String[] args) {
    int[] v = new int[10];
    int aux;
    int pos;
    
    for (int i=0; i<v.length; i++) {
      v[i] = (int)(Math.random()*201);
    }
    
    for (int i=0; i<v.length; i++) {
      System.out.print(v[i] + "-");
    }
    
    System.out.println();
    
    for (int i=0; i<v.length; i++) {
      //posiciones pares; deben menores que 100; si hay
      pos = i;
      if ((i % 2 == 0) && (v[i]>100)) {
        for (int j=i+1; (j<v.length) && (pos == i); j++) {
          if (v[j]<100) {
            pos = j;
          }
        } 
      } else if ((i % 2 == 1) && (v[i]<100)) {
        
        for (int j=i+1; (j<v.length) && (pos == i); j++) {
          if (v[j]>100) {
            pos = j;
          }
        }
      }
      if (pos != i) { //he encontrado un valor mayor o menor
        // hacer la rotación interna
        aux = v[pos];
        for (int j=pos; j>i ; j--){
          v[j] = v[j-1];
        }
        v[i] = aux;
      }
    }
    
    for (int i=0; i<v.length; i++) {
        System.out.print(v[i] + "-");
    }
    
  }
}
