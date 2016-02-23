/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.Treads;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads {
    public static void main(String[] args) {
         //ciclo de vida de threadas sin contar pausa
        //1. creado
        
        MiPrimerThread t1=new MiPrimerThread();
        //opcionalmente lo bautizamos
        
        t1.setName("Rafa");
        
        //2. inicializado
        
        t1.start();
        
        //3. en ejecucion cuando corras este programa
        //estara en estado de ejecucion y se active 
        //su metodo run!
        
        //5. muerte cuanod complete la tarea que tiene 
        //el codigo del metodo Run
        
        
    }
    
}
