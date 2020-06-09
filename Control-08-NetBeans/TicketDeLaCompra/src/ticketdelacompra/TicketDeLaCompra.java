/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketdelacompra;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class TicketDeLaCompra {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Ticket miTicket = new Ticket();
    
    String descripcion="";
    int cantidad;
    double pvp;
    int tipoIVA;
    
    Scanner s = new Scanner(System.in);
    
    for (int i=0; (i<10) && (!descripcion.equals("fin")); i++) {
      System.out.print("Introduzca nombre artículo (\"fin\" para salir): "); 
      descripcion = s.nextLine();
      if (!descripcion.equals("fin")) {
        System.out.print("Introduzca la cantidad: ");
        cantidad = Integer.parseInt(s.next());
        s.nextLine();
        System.out.print("Introduzca el precio por unidad: ");
        pvp = Double.parseDouble(s.next());
        s.nextLine();
        do {
          System.out.print("Introduzca el tipo de IVA (4, 10 o 21 %): ");
          tipoIVA = Integer.parseInt(s.next());
          s.nextLine();
          if (!(tipoIVA==4 || tipoIVA==10 || tipoIVA==21)) {
            System.out.print("Incorrecto. ");
          }
        } while (!(tipoIVA==4 || tipoIVA==10 || tipoIVA==21));
        miTicket.aniadeArticulo(new Articulo(descripcion,cantidad,pvp,tipoIVA));
      }
      
    }
    System.out.println(miTicket.generaTicket());
    
  }
  
}
