/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

/**
 *
 * @author tux
 */
public interface ConjuntoDeFichas {
  public boolean aniadeFicha (Ficha x);
  @Override
  public String toString();
  public String toHTML();  
}
