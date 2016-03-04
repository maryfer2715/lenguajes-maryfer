/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_fer;

/**
 *
 * @author T-101
 */
public class SolaUnaCorrectaException extends Exception {
    
  public SolaUnaCorrectaException (){
      
      super("Solo se puede asignar una opcion correcta");
  }
    
    
}
