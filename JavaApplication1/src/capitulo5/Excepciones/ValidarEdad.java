/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.Excepciones;

/**
 *
 * @author T-101
 */
public class ValidarEdad {
    public static void  ChecarEdadNegativa(int edad)throws ValorNoNegativoException{
        if(edad<0)throw new ValorNoNegativoException();
        
        
    }
    public static void ChecarMenorEdad(int edad)throws MenorDeEdadExeption{
      if(edad<18)throw new MenorDeEdadExeption();
    }
}
