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
import java.io.*;
import java.util.ArrayList;

public class PersistenciaUsiario {
ArrayList<Usuario> usuarios;

    public PersistenciaUsiario() {
        usuarios=new ArrayList<>();
    }


    //metodo de buscar todos
    
    ArrayList<Usuario>buscarTodos()throws Exception{
        //paso 1: 
        //leemos el archivo donde estan guardadoel arraylist
        File f=new File("archivaldo.raton");
        
       //leemos el contenido
        
        FileInputStream fis=new FileInputStream(f);
        //descomprimimos el contenido 
        ObjectInputStream ois=new ObjectInputStream(fis);
usuarios=(ArrayList<Usuario>) ois.readObject();
        return usuarios;
      
    }
    
    public void guardar(Usuario u)throws Exception{
        File f=new File("archivaldo.raton");
        if(f.exists())usuarios=buscarTodos();//ver si existe o no
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
    }
    
}
