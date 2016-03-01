/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitul.ete;

/**Encapsulamiento!
 *
 * @author T-101
 */
public class Clientes {
    
    private String nomnbre;
    private String apaterno;
    private int edad;
    private float sueldo;
    private Direccion direccion;

    public Clientes(String nomnbre, String apaterno, int edad, float sueldo, Direccion direccion) {
        this.nomnbre = nomnbre;
        this.apaterno = apaterno;
        this.edad = edad;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }
    

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

   
    
}
