/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitul.ete;

/**crear una nueva clase que se llame generar clientes,
 * que contenga un metodo que se llame obtener cliente,cuyo
 * tipo de retorno sea un arreglo de la Clase Cliente!
 *
 * @author T-101
 */
public class GenerarClientes extends Clientes {
    
    public static Clientes [] GenerarClientes(){
        
        /*
        dentro del cuerpo del metodo anterior crear
        un arreglo de clientes con los datos anteriores
        */
        
       /* Clientes clientes[]=new Clientes [3];
      clientes[0]=new Clientes();
      clientes[0].setNomnbre("Ana");
      clientes[1].setNomnbre("Pedro");
      clientes[2].setNomnbre("laura");
      
        
       
      clientes[0]=new Clientes();
      clientes [0].setApaterno("Lopez");
      clientes [1].setApaterno("Martinez");
      clientes [2].setApaterno("Gomez");
      
      
      
      clientes[0]=new Clientes();
      clientes [0].setEdad(20);
      clientes [1].setEdad(45);
      clientes [2].setEdad(30);
      
      
      clientes[0]=new Clientes();
      clientes [0].setSueldo(22000);
      clientes [1].setSueldo(14000);
      clientes [2].setSueldo(70000);
      
      
 
       Direccion dir[]=new Direccion [3];
       dir[0]=new Direccion();
       dir [0].setCalle("sirio");
       dir [1].setCalle("mexico");
       dir [2].setCalle("R-1");
      
       dir[0]=new Direccion();
       dir [0].setNumero(20);
       dir [1].setNumero(122);
       dir [2].setNumero(43);
      
       dir[0]=new Direccion();
       dir [0].setMunicipio("Ecateppec");
       dir [1].setMunicipio("neza");
       dir [2].setMunicipio("coacalco");
       
       
       clientes[0].setDireccion(dir[0]); 
       
      
      
      
      
      
       
        return clientes;//arreglo
        
        */
        
        
        //**********************************************************************
        //**********************************************************************
        

//mas compacta!
        
     Clientes clientes[]=new Clientes [3];
     
      clientes[0]=new Clientes("Ana,","lopez",20, 20000,new Direccion("sur11", 20, "Ecatepunk" ));
      
        return clientes;
    
    }
    

   
}
