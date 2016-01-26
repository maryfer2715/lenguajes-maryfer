/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *clase modelo imc encapsulada
 * y dos constructores
 * 
 * Encapsulamiento--metodos get y set
 *             REGLAS
 * 1. agregar a los atributos modificador de acceso private
 * 2. por cada atributo implementar un metodo get(getters)
 * 3. por cada atributo implementar un metodo set (setters)
 * 
 * clases modelos: clases de la aplicacion
 * 
 * 
 * miembros o clase:atributos
 * 
 * @author T-101
 */
public class Imc {
    
    private float peso;
    private float altura;
    
   
    public String calcular(){
        float imc=peso/(altura*altura);
    return "Tu imc es:  "+imc;
    
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
