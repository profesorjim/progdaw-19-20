public class CentrosNumericos {
  public static void main (String[] args) {
    long n;
    long sumaInf;
    long sumaSup;
    boolean centroNumericoEncontrado=false;
    
    System.out.println("Este programa calcula CENTROS NUMÉRICOS.");
    do {
      System.out.print("Indique hasta qué numero desea procesar (>1): ");
      n = Long.parseLong(System.console().readLine());
      if (n<=1) {
        System.out.print("Incorrecto. ");
      }
    } while (n<=1);
    
    
    // en cada pasada, procesamos un número entre 2 y n
    sumaInf=0;
    sumaSup=2;
    long k=3;
    for (long i=2; i<=n; i++) {
      /*
      if (i%1000 ==0)
        System.out.println("Probando "+i+" ...");
      */

      // vamos a ir calculando la suma inferior para esta pasada
      sumaInf += i-1;
      
      // calculamos suma superior para esta pasada
      sumaSup -= i;
      while (sumaSup<sumaInf) {
        sumaSup += k;
        k++;
      }
      if (sumaInf==sumaSup) {
        System.out.print("Centro numérico: "+i+". ");
        System.out.print("Grupos: (1-"+(i-1)+") ");
        System.out.print("("+(i+1)+"-"+(k-1)+"). ");
        System.out.println("Suma: "+sumaInf);
        centroNumericoEncontrado=true;
      }
      
    }
    if (!centroNumericoEncontrado) {
      System.out.println("No se han encontrado centros numéricos entre 1 y "+n);
    }
  }
}
