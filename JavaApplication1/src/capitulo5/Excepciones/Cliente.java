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
public class Cliente {
    private String email;
    private int edad;


    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
        
    }

    public Cliente() {
    }

    /**
     * Este metodo nos regresa el email que ya previamente
     * Se debio haber proporcionado por el metodo set correspondiente
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Este metodo necesita que porporciones
     * un string que ser el email que le va asignar al cliente
     * @param email aqui debes de poner el String correspondiente al email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) throws ValorNoNegativoException, MenorDeEdadExeption {
        
        ValidarEdad.ChecarEdadNegativa(edad);
        ValidarEdad.ChecarMenorEdad(edad);
            
        
        this.edad = edad;
    }
    
}
