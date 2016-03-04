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
public class ValidarOpciones extends Opciones {
    
    public  ValidarOpciones (){
         ValidarOpciones op[]= new ValidarOpciones[4];
         
      op[0]=new ValidarOpciones();
      op[0].setTitulo("ISC");
      op[1].setTitulo("LIA");
      op[2].setTitulo("CONTA");
      op[3].setTitulo("MERCA");
      
      op[0]=new ValidarOpciones();
      op[0].setEstatus_pregunta(1);
      op[1].setEstatus_pregunta(2);
      op[2].setEstatus_pregunta(3);
      op[3].setEstatus_pregunta(4);
      
      
     op[0]=new ValidarOpciones();
      op[0].setTrue_correcta("t");
      op[1].setTrue_correcta("t");
      op[2].setTrue_correcta("t");
      op[3].setTrue_correcta("t");
      
      
      op[0]=new ValidarOpciones();
      op[0].setFalse_incorrecta("f");
      op[1].setFalse_incorrecta("f");
      op[2].setFalse_incorrecta("f");
      op[3].setFalse_incorrecta("f");
   
      
        
        
    }
    
}
