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
public class ProbarMisThreads implements Runnable{
    public static void main(String[] args) {
         //ciclo de vida de threadas sin contar pausa
        //1. creado
        
        MiPrimerThread t1=new MiPrimerThread();
        
        //otro thread.
        Runnable r= new ProbarMisThreads();
        Thread t2= new Thread(r);
        
        Thread t3=new Thread(r);
        
        /*el thread t2 tiene que hacer que se
        impriman del uno al diez con espacio
        5 segundos entre impresion
        */        
        
        
        /*el thread t3 tiene que hacer que se imprima la frase 
          TODOS VAMOS A MORIR HASTA EL FINAL DE LOS TIEMPOS
          CADA SEGUNDO
         */
                
                
        
        //opcionalmente lo bautizamos
        
        t1.setName("Rafa");
        t2.setName("Alisson");
        t3.setName("Alberto");
        
        //2. inicializado
        
        t1.start();
        t2.start();
        t3.start();
        //3. en ejecucion cuando corras este programa
        //estara en estado de ejecucion y se active 
        //su metodo run!
        
        //5. muerte cuanod complete la tarea que tiene 
        //el codigo del metodo Run
        
        
    }

    @Override
    public void run() {
        //primero preguntamos si es el thread t2 y si es 
        //que imprima del 1-10
        
        if(Thread.currentThread().getName().equals("Alisson")){
           int x=0;
           for(int i=0;i<=30;i++){
               System.out.println(x++);
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
               }
                     
               
            
        }
        }if(Thread.currentThread().getName().equals("Alberto")){
            while(true){
                try {
                    System.out.println("Todos Vamos a Morir Hasta el final de los Tiempos");
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
}
