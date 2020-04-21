/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionariodesinonimos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tux
 */
public class DiccionarioSinonimos {
  private String nombre;
  private HashMap <String,ArrayList<String>> entrada;
  
  public DiccionarioSinonimos (String nombre) {
    this.nombre = nombre;
    entrada = new HashMap <String,ArrayList<String>>();
  }
  
  public String toString() {
    String resultado = "";
    resultado += this.nombre;
    resultado += "\n======================";
    for (Map.Entry x : this.entrada.entrySet()) {
      resultado += "\n" + x.getKey() +":\n";
      resultado += "\t"+this.dameSinonimos((String)x.getKey());
    }
    resultado += "\n======================\n";
    return resultado;
  }
  
  public boolean aniadeSinonimo (String palabra, String sinonimo) {
    boolean resultado = false;
    
    if (this.entrada.get(palabra)!= null) { 
      // la clave ya está en el hashmap
      if (!this.entrada.get(palabra).contains(sinonimo)) {
        // el sinonimo no está en la lista de sinonimos
        this.entrada.get(palabra).add(sinonimo);
        resultado = true;
      }
    } else {
      // la clave no está en le hashmap
      this.entrada.put(palabra, new ArrayList<String>());
      this.entrada.get(palabra).add(sinonimo);
      resultado = true;    
    }
    return resultado;
  }
  
  public String dameSinonimos (String palabra) {
    String resultado = "";
    if (this.entrada.get(palabra)!= null) {
      for (String sinonimo: this.entrada.get(palabra)) {
        resultado += " | " + sinonimo;
      }
      
    } else {
      resultado = "NO HAY";
    }
    
    return resultado;
  }
  
  public void eliminaSinonimo (String palabra, String sinonimo) {
    if (this.entrada.get(palabra)!=null) {
      this.entrada.get(palabra).remove(sinonimo);
      if (this.entrada.get(palabra).size()==0) {
        this.entrada.remove(palabra);
      }
    }
  }
  
  public boolean esSinonimo (String palabra, String sinonimo) {
    boolean resultado = false;
    if (this.entrada.get(palabra)!= null) {
      if (this.entrada.get(palabra).contains(sinonimo)) {
        resultado = true;
      }
    }
    
    return resultado;
  }
  
}
