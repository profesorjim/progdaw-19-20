/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketdelacompra;
import java.util.ArrayList;
/**
 *
 * @author tux
 */
public class Ticket {
  private ArrayList<Articulo> articulos;
  
  public Ticket () {
    this.articulos = new ArrayList<Articulo>();
  }
  
  public void aniadeArticulo(Articulo a){
    this.articulos.add(a);
  }
  
  public String generaTicket() {
    String resultado="";
    double total = 0;
    resultado =  "Cantidad Descripción                       Precio Importe\n";
    resultado += "-------- --------------------------------- ------ -------\n";
    for (Articulo a:this.articulos) {
      resultado += a.lineaTicket();
      total += a.subtotal();
    }
    resultado += "-------- --------------------------------- ------ -------\n";
    resultado += "                                            TOTAL ";
    resultado += String.format("%7.2f\n",total);
    
    double [] baseImponible = {0.0, 0.0, 0.0};
    double [] cuota = {0.0, 0.0, 0.0};
    int i;
    double totalBaseImponible=0.0;
    double totalCuota=0.0;
    
    for (Articulo a:this.articulos) {
      switch (a.dimeTipoIVA()) {
        case 4:
          i = 0;
          break;
        case 10:
          i = 1;
          break;
        default:
          i = 2;    
      }
      baseImponible[i] += a.subtotalSinIVA();
      cuota[i] += a.subtotal()-a.subtotalSinIVA();
      totalBaseImponible += a.subtotalSinIVA();
      totalCuota += a.subtotal()-a.subtotalSinIVA();
    }
    
    
    
    resultado += "IVA        BASE IMPONIBLE           CUOTA\n";
    for (int j=0; j<3; j++) {
      switch (j) {
        case 0:
          resultado +="4%         ";
          break;
        case 1:
          resultado +="10%        ";
          break;
        default:
          resultado +="21%        ";
      }
      resultado += String.format("%14.2f%16.2f\n",baseImponible[j],cuota[j]);
    }
    resultado += "TOTAL      ";    
    resultado += String.format("%14.2f%16.2f\n",totalBaseImponible,totalCuota);
    
    return resultado;
  }
  
}
