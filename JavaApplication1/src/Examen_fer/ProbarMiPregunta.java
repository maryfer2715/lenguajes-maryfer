/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen_fer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMiPregunta {
 
    public static void main(String[] args)  {
        
       try {   
           
       Opciones c=new Opciones();
    
       c.setEstatus_pregunta(5);
            
        }catch(SolaUnaCorrectaException ex ){
            System.out.println(ex.getMessage());
        
        
        }
    
                } 
}
