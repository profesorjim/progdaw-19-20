/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.poo;

/**
 *
 * @author tux
 */
public class Ejercicio4Poo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Usuario pepe = new Usuario("Pepe", "pepe@yahoo.com", "555 123456");
    Usuario pablo = new Usuario("Pablo", "pablo@gmail.com", "555 112233");
    Empresa ofiMalaga = new Empresa("B123456", "Ofi Málaga", "555 654321");
    Vendedor juan = new Vendedor("Juan", "juan@hotmail.com", "jefe de ventas");
    Vendedor luis = new Vendedor("Luis", "luis@gmail.com", "coordinador de ventas");
    pepe.compra(juan, new Articulo("Impresora Láser", 1));
    ofiMalaga.compra(juan, new Articulo("Impresora Láser", 2));
    pepe.compra(juan, new Articulo("Paquete de folios", 10));
    pablo.compra(luis, new Articulo("Clasificador anillas", 12));
    pepe.compra(luis, new Articulo("Paquete de folios", 50));
    pablo.compra(luis, new Articulo("Mesa escritorio", 6));
    pepe.compra(juan, new Articulo("Paquete de folios", 5));
    System.out.println(juan);
    System.out.println(luis);
    }
  
}
