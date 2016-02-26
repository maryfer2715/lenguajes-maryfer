/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.Treads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarThreadsLaMejor {
    
    //esta es la forma numero 3 LA MEJOR
    
    public static void main(String[] args) {
        
        //clase interna anonima se agrega donde se requiere una referencia
        //dentro de un construcctor o metodo
        
        Thread t2=new Thread(new Runnable(){

            @Override
            public void run() {
                 int x=0;
           for(int i=0;i<=10;i++){
               System.out.println(x++);
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
               }
                     
               
            
        }
            }
            
        });
        t2.start();
        
        
        
        
             Thread t3=new Thread(new Runnable(){

            @Override
            public void run() {
                while(true){
                try {
                    System.out.println("Todos Vamos a Morir Hasta el final de los Tiempos");
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
            }
            
        });
        t3.start();
        
        
    }
    
    
}
