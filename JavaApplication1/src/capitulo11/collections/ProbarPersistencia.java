/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

/**
 *
 * @author T-101
 */
public class ProbarPersistencia {
    public static void main(String[] args)throws Exception{
        //primero creamos un usuario con su login y su password
        Usuario u1=new Usuario();
        u1.setLogin("tu");
        u1.setPasword("5678");
        //ahora usaremos la clase usuarios para persistir(guardar) a este usuario
        
        PersistenciaUsiario p=new PersistenciaUsiario();
        p.guardar(u1);
        System.out.println("Usuario guardado con exiito");
        
    }
}
