/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.Collections;

/**
 *
 * @author T-101
 */
import java.util.*;

public class GeneradorPregunta {
    
    public static ArrayList<Pregunta>obtenerTodasPreguntas(){
     //vamos a crear una sola pregunta con 3 opciones
        Opcion o1= new Opcion("Moscu", true);
        Opcion o2= new Opcion("Florencia", false);
        Opcion o3= new Opcion("Paris", false);
        
        ArrayList<Opcion> opciones=new ArrayList<Opcion>();
        opciones.add(o1);
        opciones.add(o2);
        opciones.add(o3);
        Pregunta p1=new Pregunta("Capital de Rusia",opciones);
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        
        return preguntas;
        
    }
    
}
