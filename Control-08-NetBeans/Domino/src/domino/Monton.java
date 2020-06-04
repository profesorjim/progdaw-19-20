/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;
import java.util.ArrayList;
/**
 *
 * @author tux
 */
public class Monton implements ConjuntoDeFichas {
  private ArrayList<Ficha> montonDeFichas;
  
  public Monton () {
    this.montonDeFichas = new ArrayList<Ficha>();
  }
  
  public boolean aniadeFicha (Ficha x) {
    this.montonDeFichas.add(x);
    return true;
  }
  
  @Override
  public String toString() {
    String resultado = "";
    for (int i=0; i<this.montonDeFichas.size(); i++) {
      resultado += this.montonDeFichas.get(i).toString()+ "  ";
      if ((i+1)%10 ==0) {
        resultado +="\n";
      }
    }    
    return resultado;
  }
  
  public String toHTML() {
    String resultado ="";
    resultado = "<TABLE BORDER=0><tr>";
    for (int i=0; i<this.montonDeFichas.size(); i++) {
      resultado += "<td>";
      resultado += this.montonDeFichas.get(i).toHTML()+ "&nbsp; &snbsp;";
      resultado += "</td>";
      if ((i+1)%10 ==0) {
        resultado +="</tr>\n<tr>";
      }
    }
    resultado += "</tr></TABLE>";
    return resultado;
  }
  
  public Ficha sacaFichaAlAzar () {
    Ficha resultado = null;
    if (this.montonDeFichas.size()>0) {
      int eleccion = (int)(Math.random()*this.montonDeFichas.size());
      resultado = this.montonDeFichas.remove(eleccion);
    }    
    return resultado;
  }
  
  public void juntaMontones (Monton m) {
    Ficha f;
    do {
      f = m.sacaFichaAlAzar();
      if (f != null) {
        this.aniadeFicha(f);
      }
    } while (f != null);
  }
  
  public void inicializaMonton() {
    for (int i=0; i<=6; i++) {
      for (int j=i; j<=6; j++) {
        this.aniadeFicha(new Ficha(i,j));
      }
    }
  }
  
}
