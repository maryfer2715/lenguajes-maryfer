/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.Treads;

/**
 *
 * @author T-101
 * creacion de un thread heredando la clase thread
 */
public class MiPrimerThread extends Thread{

    @Override             //sobreescriiendo el run que tiene el papa
    public void run() {
        System.out.println("soy un thread y me llamo "+this.getName());  
    }
 
    
}
