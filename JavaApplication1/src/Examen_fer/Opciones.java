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
public class Opciones {

    public Opciones() {
        
        
    }

    public Opciones(String titulo, int estatus_pregunta, String true_correcta, String false_incorrecta) {
        this.titulo = titulo;
        this.estatus_pregunta = estatus_pregunta;
        this.true_correcta = true_correcta;
        this.false_incorrecta = false_incorrecta;
    }
    
   private String titulo;
       private int estatus_pregunta;
      private String true_correcta;
        private String false_incorrecta;
        

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEstatus_pregunta() {
        return estatus_pregunta;
    }

    public void setEstatus_pregunta(int estatus_pregunta) {
        this.estatus_pregunta = estatus_pregunta;
    }

    public String getTrue_correcta() {
        return true_correcta;
    }

    public void setTrue_correcta(String true_correcta) {
        this.true_correcta = true_correcta;
    }

    public String getFalse_incorrecta() {
        return false_incorrecta;
    }

    public void setFalse_incorrecta(String false_incorrecta) {
        this.false_incorrecta = false_incorrecta;
    }
    
    
    
    
  
}
