/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketcompra;
import java.util.Scanner;

/**
 *
 * @author tux
 */
public class TicketCompra {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    final int max=10;
    int tope=0; //contar el nº de lineas introducido
    int [] cantidad = new int[max];
    String [] producto = new String[max];
    float [] precio = new float[max];
    int [] tipoIVA = new int[max];
    
    Scanner s = new Scanner(System.in);
    
    boolean salir=false;
    
    for (int i =0; i<max && !salir; i++) {    
      System.out.print("Introduzca nombre artículo (\"fin\" para salir): ");
      producto[i] = s.nextLine();
      if (producto[i].equals("fin")) {
        salir = true;
      } else {
        tope++;
        System.out.print("Introduzca la cantidad: ");
        cantidad[i] = s.nextInt();
        s.nextLine();
        System.out.print("Introduzca el precio por unidad: ");
        precio[i] = s.nextFloat();
        s.nextLine();
        do {
          System.out.print("Introduzca el tipo de IVA (4, 10 o 21 %): ");
          tipoIVA[i] = s.nextInt();
          s.nextLine();
          if (!(tipoIVA[i]==4 || tipoIVA[i]==10 || tipoIVA[i]==21)) {
            System.out.print("Incorrecto. ");
          }
        } while (!(tipoIVA[i]==4 || tipoIVA[i]==10 || tipoIVA[i]==21));
        
      }
      System.out.println();
      
    }
    System.out.print(GeneraTicket(cantidad,producto,precio,tope));
    System.out.print(GeneraDetalleTicket(cantidad,precio,tipoIVA,tope));
  }
  

  public static String GeneraTicket(int[] cantidad, String[] producto, float[] precioUnidad, int tope) {
    String resultado = "";
    float total=0;
    
    resultado  = "Cantidad Descripción                       Precio Importe\n";
    resultado += "-------- --------------------------------- ------ -------\n";
    
    for (int i=0; i<tope; i++) {
      resultado += String.format("%8d %-33s %6.2f %7.2f\n",
        cantidad[i],producto[i],precioUnidad[i],cantidad[i]*precioUnidad[i]);
      total += cantidad[i]*precioUnidad[i];
    }
    resultado += "---------------------------------------------------------\n";
    resultado += "                                            TOTAL ";
    resultado += String.format("%7.2f\n",total);
    
    return resultado;      
  }
  
  public static String GeneraDetalleTicket(int[] cantidad, float[] precioUnidad, int[] tipoIVA, int tope) {
    String resultado ="";
    float[] baseImponible ={0,0,0}; //4,10,21 %
    float[] impuesto ={0,0,0};
    float totalBaseImponible=0;
    float totalImpuesto=0;
    
    for (int i=0; i<tope; i++) {
      float baseImponibleProducto = PrecioDescontandoIVA(cantidad[i]*precioUnidad[i],tipoIVA[i]);
      float impuestoProducto = cantidad[i]*precioUnidad[i]-baseImponibleProducto;
      totalBaseImponible += baseImponibleProducto;
      totalImpuesto += impuestoProducto;
      switch (tipoIVA[i]) {
        case 4:
          baseImponible[0] += baseImponibleProducto;
          impuesto[0] += impuestoProducto;
          break;
        case 10:
          baseImponible[1] += baseImponibleProducto;
          impuesto[1] += impuestoProducto;
          break;
        default:
          baseImponible[2] += baseImponibleProducto;
          impuesto[2] += impuestoProducto;
      }
    } 
    
    resultado = "IVA        BASE IMPONIBLE           CUOTA\n";
    
    for (int i=0; i<3; i++) {
      switch (i) {
        case 0:
          resultado += String.format("%-13s","4%");
          break;
        case 1:
          resultado += String.format("%-13s","10%");
          break;
        default:
          resultado += String.format("%-13s","21%");
      }
      resultado += String.format("%14.2f %15.2f\n",baseImponible[i],impuesto[i]);
    }
    resultado += String.format("%-13s","TOTAL");
    resultado += String.format("%14.2f %15.2f\n",totalBaseImponible,totalImpuesto);
    
    return resultado;
  }
    
    
  public static float PrecioDescontandoIVA(float precioConIVA,int tipoIVA) {
    float resultado;     

    resultado = precioConIVA/(1+(float)tipoIVA/100);

    return resultado;
  }
   
 
}
