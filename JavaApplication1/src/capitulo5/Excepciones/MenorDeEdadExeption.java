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
public class MenorDeEdadExeption extends Exception{
    //solucion a la tarea!
    public MenorDeEdadExeption(){
        super("No puedo dar de alta a un menor de 18 años");
    }
}
